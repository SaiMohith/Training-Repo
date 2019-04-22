package com.me.maventest.MavenTemp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void testAdd(){
    	
    	App test = new App();
    	Add add = new Add();
    	
    	add.setA(2);
    	add.setB(4);
    	System.out.println("Add :: "+add.toString());
    	
    	assertEquals(6,test.addition(add));
    	
    }    
    
  public void testSub(){
    	
    	App test = new App();
    	Add add = new Add();
    	
    	add.setA(4);
    	add.setB(2);
    	System.out.println("Sub :: "+add.toString());
    	assertEquals(2,test.subtraction(add));
    	
    }
}
