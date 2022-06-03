package io.testerra.report.test.pages.report;

import eu.tsystems.mms.tic.testframework.pageobjects.Check;
import eu.tsystems.mms.tic.testframework.pageobjects.GuiElement;
import eu.tsystems.mms.tic.testframework.utils.TimerUtils;
import io.testerra.report.test.pages.AbstractReportPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ReportThreadsPage extends AbstractReportPage {

    @Check
    private final GuiElement testMethodSearchbar = pageContent.getSubElement(By.xpath("//label[@label='Method']//input"));
    @Check
    private final GuiElement testMethodDropDownList = pageContent.getSubElement(By.xpath("//div[./label[@label='Method']]//mdc-lookup"));
    @Check
    private final GuiElement testThreadReport = pageContent.getSubElement(By.xpath("//div[@class='vis-foreground']/div"));

    /**
     * Constructor for existing sessions.
     *
     * @param driver .
     */
    public ReportThreadsPage(WebDriver driver) {
        super(driver);
    }

    public Set<String> getThreadMethods() {
        testMethodSearchbar.click();
        Set<String> set = testMethodDropDownList.getSubElement(By.xpath("//mdc-list-item")).getList()
                .stream()
                .map(GuiElement::getText)
                .collect(Collectors.toSet());
        Assert.assertTrue(set.size() > 0, "Should find some methods!");
        testMethodSearchbar.click();
        return set;
    }

    public void assertSearchForMethodWorksCorrect(Set<String> methods) {
        for (String method : methods) {
            selectMethod(method);
            assertMethodBoxIsSelected(method);
        }
    }

    private void selectMethod(String method) {
        testMethodSearchbar.click();
        testMethodSearchbar.type(method);
        TimerUtils.sleep(1000, "Necessary sleep gives page enough time to refresh target locators");
        Optional<GuiElement> optional = testMethodDropDownList.getSubElement(By.xpath("//mdc-list-item")).getList()
                .stream()
                .filter(i -> i.getText().contains(method))
                .findFirst();
        Assert.assertTrue(optional.isPresent());
        optional.get().click();
    }

    private void assertMethodBoxIsSelected(String method) {
        for (GuiElement guiElement : testThreadReport.getList()) {
            if (guiElement.getText().split("\n")[0].equals(method.trim())) {
                guiElement.getSubElement(By.xpath("/div"))
                        .asserts("Searched element should marked as selected")
                        .assertAttributeContains("class", "vis-selected");
            }
        }
    }
}
