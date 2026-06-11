package com;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuiteExample
{
   @BeforeSuite
   public void beforeSuite()
   {
	   System.out.println("BeforeSuite");
   }
   @BeforeTest
   public void beforeTest()
   {
	   System.out.println("BeforeTest");
   }
   @Test
   public void testMethod()
   {
	   System.out.println("Executing Test Method..");
   }
   @AfterTest
   public void afterTest()
   {
	   System.out.println("AfterTest");
   }
   @AfterSuite
   public void afterSuite()
   {
	   System.out.println("AfterSuite");
   }
}
