package com;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class it_department 
{
//  @BeforeTest
	@AfterTest
  public void before_test()
  {
	  System.out.println("It will be executed first");
  }
  @Test
  public void software_developers()
  {
	  System.out.println("SoftwareDevelopers");
  }
  @Test
  public void qa_analyst()
  {
	  System.out.println("QA Analyst");
  }
}
