/*
 * Testerra
 *
 * (C) 2020, Peter Lehmann, T-Systems Multimedia Solutions GmbH, Deutsche Telekom AG
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
 *
 */
package eu.tsystems.mms.tic.testframework.webdrivermanager;

import eu.tsystems.mms.tic.testframework.common.Testerra;
import eu.tsystems.mms.tic.testframework.constants.JSMouseAction;
import eu.tsystems.mms.tic.testframework.internal.StopWatch;
import eu.tsystems.mms.tic.testframework.logging.Loggable;
import eu.tsystems.mms.tic.testframework.pageobjects.UiElement;
import eu.tsystems.mms.tic.testframework.pageobjects.UiElementHighlighter;
import eu.tsystems.mms.tic.testframework.utils.JSUtils;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.Color;

public final class DesktopWebDriverUtils implements Loggable {

    JSUtils utils = new JSUtils();

    public DesktopWebDriverUtils() {

    }

    public void clickAbsolute(UiElement guiElement) {
        log().debug("Absolute navigation and click on: " + guiElement.toString());
        WebDriver driver = guiElement.getWebDriver();
        guiElement.findWebElement(webElement -> {
//            utils.clickAbsolute(guiElement.getWebDriver(), webElement);
            // Start the StopWatch for measuring the loading time of a Page
            StopWatch.startPageLoad(driver);

            Point point = webElement.getLocation();

            Actions action = new Actions(driver);

            // goto 0,0
            action.moveToElement(webElement, 1 + -point.getX(), 1 + -point.getY());

            // move y, then x
            action.moveByOffset(0, point.getY()).moveByOffset(point.getX(), 0);

            // move to webElement
            action.moveToElement(webElement);
            action.moveByOffset(1, 1);
            action.click().perform();
        });
    }

    public void mouseOverAbsolute2Axis(UiElement guiElement) {
        WebDriver driver = guiElement.getWebDriver();
        guiElement.findWebElement(webElement -> {
//            utils.mouseOverAbsolute2Axis(guiElement.getWebDriver(), webElement);
            demoMouseOver(driver, webElement);
            Actions action = new Actions(driver);

            Point point = webElement.getLocation();

            // goto 0,0
            action.moveToElement(webElement, 1 + -point.getX(), 1 + -point.getY()).perform();

            // move y, then x
            action.moveByOffset(0, point.getY()).moveByOffset(point.getX(), 0).perform();

            // move to webElement
            action.moveToElement(webElement).perform();
        });
    }

    public void mouseOverJS(UiElement guiElement) {
        WebDriver driver = guiElement.getWebDriver();
        guiElement.findWebElement(webElement -> {
//            utils.mouseOver(guiElement.getWebDriver(), webElement);
            demoMouseOver(driver, webElement);

            final String script = "var fireOnThis = arguments[0];"
                    + "var evObj = document.createEvent('MouseEvents');"
                    + "evObj.initEvent( 'mouseover', true, true );"
                    + "fireOnThis.dispatchEvent(evObj);";
            JSUtils.executeScriptWOCatch(driver, script, webElement);
        });
    }

    public void clickJS(UiElement guiElement) {
        WebDriver driver = guiElement.getWebDriver();
        guiElement.findWebElement(webElement -> {
            JSUtils.executeScriptWOCatch(driver, "arguments[0].click();", webElement);
        });
    }

    public void rightClickJS(UiElement guiElement) {
        WebDriver driver = guiElement.getWebDriver();
        guiElement.findWebElement(webElement -> {
            final String script = "var element = arguments[0];" +
                    "var e = element.ownerDocument.createEvent('MouseEvents');" +
                    "e.initMouseEvent('contextmenu', true, true, element.ownerDocument.defaultView, 1, 0, 0, 0, 0, false,false, false, false,2, null);" +
                    "return !element.dispatchEvent(e);";
            JSUtils.executeScriptWOCatch(driver, script, webElement);
        });
    }

    public void doubleClickJS(UiElement guiElement) {
        guiElement.findWebElement(webElement -> {
            Point location = webElement.getLocation();
            JSUtils.executeJavaScriptMouseAction(guiElement.getWebDriver(), webElement, JSMouseAction.DOUBLE_CLICK, location.getX(), location.getY());
        });
    }

    private void demoMouseOver(final WebDriver webDriver, final WebElement webElement) {
        if (Testerra.Properties.DEMO_MODE.asBool()) {
            UiElementHighlighter elementHighlighter = Testerra.getInjector().getInstance(UiElementHighlighter.class);
            elementHighlighter.highlight(webDriver, webElement, new Color(255, 255, 0));
        }
    }
}
