/*
 *  [2012] - [2017] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SayHelloTest  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SayHelloTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(SayHelloTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testSayHello()
    {
        SayHello sayHello = new SayHello();
        assertTrue("Hello, codenvy".equals(sayHello.sayHello("codenvy")));
    }
}
