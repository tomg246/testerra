package eu.tsystems.mms.tic.testframework.execution.testng;

import eu.tsystems.mms.tic.testframework.internal.AssertionChecker;

public class DefaultNonFunctionalAssert extends DefaultAssert implements INonFunctionalAssert {
    @Override
    public void fail(String message, Throwable realCause) {
        AssertionError ae = new AssertionError(message);
        ae.initCause(realCause);

        AssertionChecker.storeNonFunctionalInfo(ae);
    }
}
