package com.test.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
@Listeners(com.test.basics.ListenerDemo.class)
public class DemoOrangeHRM {
	public WebDriver dvr ;
 
  @BeforeTest
  @Parameters("browser")
  public void beforeMethod(String browser) {
	  if(browser.equalsIgnoreCase("firefox")) {
		  FirefoxOptions options = new FirefoxOptions();
		  options.addArguments("--headless");
		  dvr = new FirefoxDriver(options);
		  dvr.manage().window().maximize();
		  dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  dvr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  else if(browser.equalsIgnoreCase("chrome")) {
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless");
		  dvr = new ChromeDriver(options);
		  dvr.manage().window().maximize();
		  dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  dvr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
  }
  
  @Test()
  public void login() {
	  dvr.findElement(By.name("username")).sendKeys("Admin");
	  dvr.findElement(By.name("password")).sendKeys("admin123");
	  dvr.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  
  }
  @Test()
  public void verify() {
	  String str1 = "OrangeHRM";
	  String str2 = dvr.getTitle();
	  Assert.assertEquals(str1, str2, "The webPage is wrong");
	  dvr.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']//ul//li//span//i")).click();
	  
	  List<WebElement> list = dvr.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']/li"));
	  String str3 = "Logout";
	  for(WebElement li:list) {
		  if(li.getText().equals(str3)) {
			  li.click();
		  }
	  }
  }
  
  
  @AfterTest
  public void afterMethod() {
	  dvr.quit();
  }

}
