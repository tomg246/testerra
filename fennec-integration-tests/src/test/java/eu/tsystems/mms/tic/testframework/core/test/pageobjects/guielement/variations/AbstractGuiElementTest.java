/*
 * (C) Copyright T-Systems Multimedia Solutions GmbH 2018, ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Peter Lehmann <p.lehmann@t-systems.com>
 *     pele <p.lehmann@t-systems.com>
 */
package eu.tsystems.mms.tic.testframework.core.test.pageobjects.guielement.variations;

import eu.tsystems.mms.tic.testframework.common.PropertyManager;
import eu.tsystems.mms.tic.testframework.constants.GuiElementType;
import eu.tsystems.mms.tic.testframework.constants.FennecProperties;
import eu.tsystems.mms.tic.testframework.core.test.pageobjects.TestPage;
import eu.tsystems.mms.tic.testframework.pageobjects.GuiElement;
import eu.tsystems.mms.tic.testframework.pageobjects.POConfig;
import eu.tsystems.mms.tic.testframework.webdrivermanager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

/**
 * Test of GuiElement methods
 *
 * @author rnhb
 */
public abstract class AbstractGuiElementTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    static {
        System.setProperty(FennecProperties.XETA_GUIELEMENT_TYPE, GuiElementType.sequence.name());
        POConfig.setUiElementTimeoutInSeconds(3);

        PropertyManager.getGlobalProperties().setProperty(FennecProperties.CLOSE_WINDOWS_AFTER_TEST_METHODS, "false");

    }

    @AfterTest(alwaysRun = true)
    public void resetWDCloseWindowsMode() {
        PropertyManager.getGlobalProperties().setProperty(FennecProperties.CLOSE_WINDOWS_AFTER_TEST_METHODS, "true");
    }

    /**
     * testpage of the website
     */
    protected TestPage testPage;

    /**
     * Initialize the WebDriver as local and with a testPage
     */
    @BeforeMethod(alwaysRun = true)
    protected void initDriverAndWebsite(Method method) {
        testPage = getTestPage();
        WebDriver driver = WebDriverManager.getWebDriver();
        driver.get(testPage.getUrl());
    }

    @AfterSuite(alwaysRun = true)
    private void closeBrowsers() {
        WebDriverManager.forceShutdownAllThreads();
    }

    /**
     * abstract methods to get specific GuiElement (e.g. FrameAwareInternalGuiElementDecorator) in a specific state
     * (e.g. present, not present)
     */
    public GuiElement getAnyElement() {
        return getAnyElementByXpath();
    }

    public GuiElement getNotExistingElement() {
        return getGuiElementBy(By.id("notExistingId"));
    }

    public GuiElement getAnyElementByXpath() {
        return getGuiElementBy(By.xpath("//*[@id='11']"));
    }

    public GuiElement getAnyElementByClassName() {
        return getGuiElementBy(By.className("className"));
    }

    public GuiElement getAnyElementByLinkText() {
        return getGuiElementBy(By.linkText("Open again"));
    }

    public GuiElement getAnyElementByPartialLinkText() {
        return getGuiElementBy(By.partialLinkText("Open"));
    }

    public GuiElement getAnyElementByName() {
        return getGuiElementBy(By.name("radioBtn"));
    }

    public GuiElement getDisplayedElement() {
        return getGuiElementBy(By.id("11"));
    }

    // TODO this is actually a not existing element. A not displayed element is not available on the test page.
    public GuiElement getNotDisplayedElement() {
        return getGuiElementBy(By.id("notDisplayedElement"));
    }

    public GuiElement getSelectableElement() {
        return getGuiElementBy(By.id("3"));
    }

    public GuiElement getNotSelectableElement() {
        return getGuiElementBy(By.id("11"));
    }

    public GuiElement getClickableElement() {
        return getGuiElementBy(By.xpath("//input[@type='submit']"));
    }

    public GuiElement getEnabledElement() {
        return getGuiElementBy(By.id("16"));
    }

    public GuiElement getElementWithText() {
        return getGuiElementBy(By.id("11"));
    }

    public GuiElement getElementWithAttribute() {
        return getGuiElementBy(By.id("6"));
    }

    public GuiElement getParent1() {
        return getGuiElementBy(By.xpath("//div[1]"));
    }

    public GuiElement getParent2() {
        return getGuiElementBy(By.xpath("//div[2]"));
    }

    public GuiElement getDisabledElement() {
        return getGuiElementBy(By.id("7"));
    }

    public GuiElement getTextBoxElement() {
        return getGuiElementBy(By.id("5"));
    }

    public GuiElement getLoggerTableElement() {
        return getGuiElementBy(By.id("99"));
    }

    public GuiElement getTableElement() {
        return getGuiElementBy(By.id("100"));
    }

    public GuiElement getMultiSelect() {
        return getGuiElementBy(By.xpath("//select[1]"));
    }

    public GuiElement getSingleSelect() {
        return getGuiElementBy(By.xpath("//select[2]"));
    }

    public GuiElement getTimeOutInput() {
        return getGuiElementBy(By.id("inputMillis"));
    }

    public GuiElement getShowWithTimeOutButton() {
        return getGuiElementBy(By.id("showText"));
    }

    public GuiElement getHideWithTimeOutButton() {
        return getGuiElementBy(By.id("hideText"));
    }

    public GuiElement getChangeTextByJSButton() {
        return getGuiElementBy(By.id("changeText"));
    }

    public GuiElement getInsertTextByJSButton() {
        return getGuiElementBy(By.id("insertText"));
    }

    public GuiElement getDynamicTextElement() {
        return getGuiElementBy(By.id("switch"));
    }

    public GuiElement getInsertedTextElement() {
        return getGuiElementBy(By.id("dynText"));
    }

    public GuiElement getEnableRDButton() {
        return getGuiElementBy(By.id("enableRdButton"));
    }

    public GuiElement getTimeOutDIV() {
        return getGuiElementBy(By.id("waiterDIV"));
    }

    public GuiElement getAddAttributeWithTimeOutButton() {
        return getGuiElementBy(By.id("addAttributeToRDButton"));
    }

    public GuiElement getDisableRDButton() {
        return getGuiElementBy(By.id("disableRDButton"));
    }

    public GuiElement getRadio() {
        return getGuiElementBy(By.id("enabledSwitchRDButton"));
    }

    public GuiElement getCheckBox() {
        return getGuiElementBy(By.id("9"));
    }

    public GuiElement getSelectRadioButtonMitVerzoegerungButton() {
        return getGuiElementBy(By.id("SelectRDButton"));
    }

    public GuiElement getDeselectRadioButtonMitVerzoegerungButton() {
        return getGuiElementBy(By.id("DeselectRDButton"));
    }

    public abstract GuiElement getGuiElementBy(By locator);

    protected abstract TestPage getTestPage();

}
