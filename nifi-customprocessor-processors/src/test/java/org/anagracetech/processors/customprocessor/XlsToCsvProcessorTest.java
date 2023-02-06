package org.anagracetech.processors.customprocessor;

import org.apache.nifi.util.TestRunner;
import org.apache.nifi.util.TestRunners;
import org.junit.Before;
import org.junit.Test;

public class XlsToCsvProcessorTest {

    private TestRunner testRunner;

    @Before
    public void init() {
        testRunner = TestRunners.newTestRunner(XlsToCsvProcessor.class);
    }

    @Test
    public void testProcessor() {

    }
}
