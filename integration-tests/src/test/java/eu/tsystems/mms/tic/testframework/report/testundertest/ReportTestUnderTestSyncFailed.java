package eu.tsystems.mms.tic.testframework.report.testundertest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ReportTestUnderTestSyncFailed extends AbstractTest {

    @Test
    public void testPassed() {
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void syncErrorAfterPassedTest(ITestResult result) {
        //TODO check wether this is relevant for the free version
        //MethodAccessUtils.setTMSyncStatusForMethod(result, false);
    }
}
