package com.test.basics;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;

public class DependsOnMethod {
	public WebDriver dvr ;
  @Test()
  public void f() {
	  dvr = new ChromeDriver();
	  dvr.get("https://www.google.com/");
	  System.out.println("Google opened");
  }
  @Test(dependsOnMethods = {"f"})
  public void f1(){
	  dvr.findElement(By.name("q")).sendKeys("TestNG dependsonmethod");
	  dvr.findElement(By.xpath("//input[@class=\"gNO89b\"]")).submit();
	  System.out.println("Search button clicked");
	  
  }
  @Test(dependsOnMethods = {"f1"})
  public void f2() {
	  System.out.println("Title : "+dvr.getTitle());
	  System.out.println("title got from web browser");
  }
  @Test(dependsOnMethods = {"f2"})
  public void f3() {
	  dvr.quit();
	  System.out.println("browser closed");
  }
  
}

