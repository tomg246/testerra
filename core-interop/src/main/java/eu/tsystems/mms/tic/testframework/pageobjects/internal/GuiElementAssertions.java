package eu.tsystems.mms.tic.testframework.pageobjects.internal;

import eu.tsystems.mms.tic.testframework.pageobjects.Attribute;
import eu.tsystems.mms.tic.testframework.pageobjects.internal.asserts.BinaryAssertion;
import eu.tsystems.mms.tic.testframework.pageobjects.internal.asserts.StringAssertion;

/**
 * All tests that can be performed on a GuiElement
 * @author Mike Reiche
 */
public interface GuiElementAssertions extends BasicGuiElement {
    StringAssertion<String> text();
    default StringAssertion<String> value() {
        return value(Attribute.VALUE);
    }
    default StringAssertion<String> value(Attribute attribute) {
        return value(attribute.toString());
    }
    StringAssertion<String> value(String attribute);
    StringAssertion<String> css(String property);
    BinaryAssertion<Boolean> enabled();
    BinaryAssertion<Boolean> selected();
}
