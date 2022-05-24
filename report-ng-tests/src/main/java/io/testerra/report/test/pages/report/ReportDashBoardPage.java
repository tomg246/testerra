/*
 * Testerra
 *
 * (C) 2022, Clemens Große, T-Systems Multimedia Solutions GmbH, Deutsche Telekom AG
 *
 * Deutsche Telekom AG and all other contributors /
 * copyright owners license this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.testerra.report.test.pages.report;

import eu.tsystems.mms.tic.testframework.pageobjects.Check;
import eu.tsystems.mms.tic.testframework.pageobjects.GuiElement;
import eu.tsystems.mms.tic.testframework.pageobjects.factory.PageFactory;
import eu.tsystems.mms.tic.testframework.report.Status;
import io.testerra.report.test.helper.TestState;
import io.testerra.report.test.pages.AbstractReportPage;
import io.testerra.report.test.pages.ReportPageType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.text.*;
import java.util.*;
import java.util.stream.Collectors;

public class ReportDashBoardPage extends AbstractReportPage {

    @Check
    private final GuiElement testsElement = pageContent.getSubElement(By.xpath(".//mdc-card[./div[contains(text(), 'Tests')]]"));
    @Check
    private final GuiElement testDurationElement = pageContent.getSubElement(By.tagName("test-duration-card"));
    @Check
    private final GuiElement testResultElement = pageContent.getSubElement(By.tagName("test-results-card"));
    @Check
    private final GuiElement testClassesElement = pageContent.getSubElement(By.tagName("test-classes-card"));

    public ReportDashBoardPage(WebDriver driver) {
        super(driver);
    }

    public void assertPageIsShown() {
        verifyReportPage(ReportPageType.DASHBOARD);
    }

    /**
     * extract information of executed tests per Status from DashBoardPage Tests card
     *
     * @param testStatus
     * @return
     */
    public String getTestsPerStatus(final Status testStatus) {

        String testsPerStatus = "not_existing";

        final GuiElement testsStatusElement;
        switch (testStatus) {
            // retried status is within element of failed status
            case RETRIED:
                testsStatusElement = testsElement.getSubElement((getXpathToTestsPerStatus(Status.FAILED)));
                break;
            // repaired and recovered status are within element of passed status
            case REPAIRED:
            case RECOVERED:
                testsStatusElement = testsElement.getSubElement((getXpathToTestsPerStatus(Status.PASSED)));
                break;
            // remaining test status have dedicated elements
            default:
               testsStatusElement = testsElement.getSubElement((getXpathToTestsPerStatus(testStatus)));
               break;
        }

        final List<GuiElement> listOfAmountInformation = testsStatusElement.getSubElement(By.xpath("./mdc-list-item-primary-text/span")).getList();

        // for passed when repaired executions exist
        if (listOfAmountInformation.size() > 1) {
            final List<GuiElement> listOfStatusInformation = testsStatusElement.getSubElement(By.xpath("./mdc-list-item-secondary-text/span")).getList();
            for (int i = 0; i < listOfStatusInformation.size(); i++) {
                if (listOfStatusInformation.get(i).getText().contains(testStatus.title)) {
                    testsPerStatus = listOfAmountInformation.get(i).getText() + " " + listOfStatusInformation.get(i).getText();
                }
            }
        } else {
            testsPerStatus = testsStatusElement.getText().replace("\n", " ");
        }

        return testsPerStatus;
    }

    private By getXpathToTestsPerStatus(final Status testStatus) {
        final String xPathToTestsPerStatusTemplate = ".//mdc-list-item[.//mdc-icon[@title = '%s']]//span[contains(@class, 'mdc-list-item__content')]";
        return By.xpath(String.format(xPathToTestsPerStatusTemplate, testStatus.title));
    }

    public void assertPieChartContainsTestState(TestState status) {
        GuiElement pieChartPart = new GuiElement(getWebDriver(),
                By.xpath(String.format("//*[@class='apexcharts-series apexcharts-pie-series' and @seriesName='%s']", status.getStateNameWithReplacement())));
        pieChartPart.asserts().assertIsDisplayed();
    }

    public void clickPieChartPart(TestState status) {
        GuiElement pieChartPart = new GuiElement(getWebDriver(),
                By.xpath(String.format("//*[@class='apexcharts-series apexcharts-pie-series' and @seriesName='%s']", status.getStateNameWithReplacement())));
        pieChartPart.click();
    }

    public void clickNumberChartPart(TestState testState) {
        String xpath = "//mdc-layout-grid-cell//mdc-list//mdc-list-item";
        List<GuiElement> testClassesNumberChartList = new GuiElement(getWebDriver(), By.xpath(xpath)).getList();
        Objects.requireNonNull(testClassesNumberChartList.stream()
                .filter(guiElement -> guiElement.getSubElement(By.xpath("//mdc-icon")).getAttribute("title").equals(testState.getStateName()))
                .findFirst()
                .orElse(null)).click();
    }

    public void assertCorrectBarChartsAreDisplayed() {
        String xpath = "//*[contains(@class,'apexcharts-bar-series') and contains(@class,'apexcharts-plot-series')]";
        GuiElement barListRoot = new GuiElement(getWebDriver(), By.xpath(xpath));
        List<GuiElement> barList = barListRoot.getSubElement(By.xpath("//*[@class='apexcharts-series']")).getList();
        Assert.assertEquals(barList.size(), 1, "There should be just 1 entry!");

    }


    public void assertNumbersChartContainsTestState(TestState testState) {
        String xpath = String.format("//mdc-layout-grid-cell//mdc-list//mdc-list-item//mdc-icon[@title='%s']", testState.getStateName());
        GuiElement testClassesNumberChart = new GuiElement(getWebDriver(), By.xpath(xpath));
        testClassesNumberChart.asserts().assertIsDisplayed();
    }

    public void assertStartTimeIsDisplayed(){
        GuiElement startedText = testDurationElement.getSubElement(By.xpath("(//*[@class='mdc-custom-list-item'])[1]/span"));
        startedText.asserts().assertIsDisplayed();
        startedText.asserts().assertText("Started");
    }

    public void assertEndedTimeIsDisplayed(){
        GuiElement endedText = testDurationElement.getSubElement(By.xpath("(//*[@class='mdc-custom-list-item'])[2]/span"));
        endedText.asserts().assertIsDisplayed();
        endedText.asserts().assertText("Ended");
    }

    public void assertDurationIsDisplayedCorrect(){
        GuiElement durationGuiElement = testDurationElement.getSubElement(By.xpath( "//div[contains(@class,'card-content')]"));
        String duration = durationGuiElement.getText().split("\n")[1];
        if (duration.length() < 11) {
            checkStringForCorrectFormat(new SimpleDateFormat("s's' SSS'ms'"), duration);
        } else if (duration.length() < 18) {
            checkStringForCorrectFormat(new SimpleDateFormat("mm'mins' s's' SSS'ms'"), duration);
        } else {
            checkStringForCorrectFormat(new SimpleDateFormat("H'h' mm'mins' s's' SSS'ms'"), duration);
        }

    }
    private void checkStringForCorrectFormat(DateFormat expectedStringFormat, String currentString){

        try {
            expectedStringFormat.parse(currentString);
        } catch (Exception e) {
            Assert.fail("The string doesn't match with the expected format");
        }
    }

    public ReportTestsPage navigateToFilteredTestPageByClickingBarChartBar() {
        String xpath = "//*[contains(@class,'apexcharts-bar-series') and contains(@class,'apexcharts-plot-series')]//*[@class='apexcharts-series']//*";
        new GuiElement(getWebDriver(), By.xpath(xpath)).click();
        return PageFactory.create(ReportTestsPage.class, getWebDriver());
    }

    public void assertPieChartPercentages(int expectedAmount, TestState status){
        GuiElement pieChartPart = new GuiElement(getWebDriver(), By.xpath(String.format("(//*[@class='apexcharts-datalabels'])[%d]", status.ordinal()+1)));

        String path = "//mdc-drawer//mdc-list-item[.//span[contains(text(), 'Tests')]]";
        String amountOfTotalTestAsString = new GuiElement(getWebDriver(), By.xpath(path))
                .getText().split(" ")[1].replace("(", "").replace(")", "");
        String percentageString = getPercentagesFromReportByStates(expectedAmount, amountOfTotalTestAsString);
        pieChartPart.asserts().assertText(percentageString);
    }

    private String getPercentagesFromReportByStates(double amount, String total){
        DecimalFormat df = new DecimalFormat("##.# %", new DecimalFormatSymbols(Locale.ENGLISH));
        return df.format(amount / Double.parseDouble(total)).replace(" ", "");
    }

    public void assertPopupWhileHoveringWithCorrectContent(TestState testState) {
        String xpath = "//*[contains(@class,'apexcharts-bar-series') and contains(@class,'apexcharts-plot-series')]//*[@class='apexcharts-series']//*";
        GuiElement barList = new GuiElement(getWebDriver(), By.xpath(xpath));
        Actions action = new Actions(getWebDriver());
        for(GuiElement bar : barList.getList()){
            action.moveToElement(bar.getWebElement()).build().perform();
            String path = "//*[contains(@class,'apexcharts-canvas')]//div[contains(@class,'apexcharts-tooltip')]//span[@class='apexcharts-tooltip-text-label']";
            Optional<GuiElement> popUpTestState = new GuiElement(getWebDriver(), By.xpath(path)).getList().stream().filter(i -> i.getText().contains(testState.getStateName())).findFirst();
            Assert.assertTrue(popUpTestState.isPresent(), "Should find a text element, which contains the corresponding state description!");
        }
    }
}
