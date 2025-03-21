package com.test.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Test {
	public WebDriver dvr ;
  @Test
  public void verifyTitle() {
	  String expectedtitle = "Google";
	  String actualtitle = dvr.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title is not same");
  }
  @BeforeTest
  public void beforeTest() {
	dvr = new ChromeDriver();
	dvr.manage().window().maximize();
	dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	dvr.get("https://www.google.co.in/");
  }

  @AfterTest
  public void teardown() {
	  dvr.quit();
  }

}
