/*
 * Testerra
 *
 * (C) 2020, Eric Kubenka, T-Systems Multimedia Solutions GmbH, Deutsche Telekom AG
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

package eu.tsystems.mms.tic.testframework.test.guielement.variations;

import eu.tsystems.mms.tic.testframework.core.testpage.TestPage;
import eu.tsystems.mms.tic.testframework.pageobjects.GuiElement;
import eu.tsystems.mms.tic.testframework.pageobjects.Locate;
import eu.tsystems.mms.tic.testframework.test.guielement.AbstractGuiElementNonFunctionalAssertionTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameAwareSubElementGuiElementTest extends AbstractGuiElementNonFunctionalAssertionTest {

    @Override
    public GuiElement getGuiElementBy(Locate locator) {
        WebDriver driver = getWebDriver();
        GuiElement frame = new GuiElement(driver, By.name("InputFrame1"));
        GuiElement parentElement = new GuiElement(driver, By.xpath("//body"), frame);
        return parentElement.getSubElement(locator);
    }

    @Override
    protected TestPage getTestPage() {
        return TestPage.FRAME_TEST_PAGE;
    }
}
