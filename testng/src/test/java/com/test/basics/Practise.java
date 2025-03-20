package com.test.basics;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Practise {
  @Test
  public void testingAssertions() {
	  String str1 = new String("TestNG");
	  String str2 = new String("TestNG");
	  String str3 = null;
	  String str4 = "TestNG";
	  String str5 = "TestNG";
	  String str6 = new String ("Not_Test NG");
	  
	  int val1 = 5 , val2 = 6;
	  Assert.assertEquals(str1, str2);
	  System.out.println("Equals Assertion is successful");
	  
	  Assert.assertNotEquals(str1, str6);
	  System.out.println("Not Equals Assertion is successful");
	  
	  Assert.assertTrue(val1 < val2);
	  System.out.println("True Assertion is successful");
	  
	  Assert.assertFalse(val1 > val2);
	  System.out.println("False Assertion is successful");

	  Assert.assertNotNull(str4);
	  System.out.println("Not null Assertion is successful");
	  
	  Assert.assertNull(str3);
	  
	  Assert.assertSame(str4, str5);
	  System.out.println("Same Assertion is successful");
	  
	  Assert.assertNotSame(str2, str5);
	  System.out.println("Not Same Assertion is successful");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
