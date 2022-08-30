package com.gigya.cdp.common;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LoggerTest  extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LoggerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LoggerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        CdpLogger logger = new CdpLogger();
        logger.log("Test1");
        assertTrue( true );
    }
}
