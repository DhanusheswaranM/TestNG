package com.test.basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo1 {
	public WebDriver dvr ;
  @Test
  public void f() {
	  dvr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Hard Drive"+Keys.ENTER);
	  dvr.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  dvr = new ChromeDriver();
	  dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dvr.manage().window().maximize();
	  dvr.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_8701n5vjln_e&adgrpid=150668182221&hvpone=&hvptwo=&hvadid=674893540028&hvpos=&hvnetw=g&hvrand=15938592277544700295&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-316976920040&hydadcr=5628_2359484&gad_source=1");
	  
  }

  @AfterTest
  public void afterTest() {
	  dvr.quit();
  }

}
