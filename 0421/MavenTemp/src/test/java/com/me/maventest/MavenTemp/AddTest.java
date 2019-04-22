package com.me.maventest.MavenTemp;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AddTest 
    extends TestCase
{
   
    public void testAdd1(){
    	
    	App test = new App();
    	Add add = new Add();
    	
    	add.setA(2);
    	add.setB(4);
    	System.out.println("Add1 :: "+add.toString());
    	
    	assertEquals(6,test.addition(add));
    	
    }    
    
  public void testSub1(){
    	
    	App test = new App();
    	Add add = new Add();
    	
    	add.setA(4);
    	add.setB(2);
    	System.out.println("Sub1 :: "+add.toString());
    	assertEquals(2,test.subtraction(add));
    	
    }
}
