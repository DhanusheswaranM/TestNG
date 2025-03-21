package com.test.basics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class tutorialsNinjas {
	public WebDriver dvr ;
  @Test
  public void navigate() {
	  dvr.findElement(By.xpath("//nav[@id='top']//div//div[2]//ul//li[2]//a//span[2]")).click();
	  dvr.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	  
	 
	   
  }
  @Test
  public void verify() {
	  SoftAssert soft = new SoftAssert();
	  String str1 = "Register Account";
	  String str2 = dvr.findElement(By.xpath("//h1[contains(text(),'Register Account')]")).getText();
//	  Assert.assertEquals(str1, str2);
	  soft.assertEquals(str2, str1, "Its wrong");
	  
	  dvr.findElement(By.xpath("//a[contains(text(),'Qafox.com')]")).click();
	  
	  String str3 = "Your Store";
	  String str4 = dvr.getTitle();
	  
	  Assert.assertEquals(str3 , str4);
	  soft.assertAll();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  dvr = new ChromeDriver();
	  dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dvr.manage().window().maximize();
	  dvr.get("https://tutorialsninja.com/demo/");
  }

  @AfterTest
  public void afterTest() {
	  dvr.quit();
	  }

}
