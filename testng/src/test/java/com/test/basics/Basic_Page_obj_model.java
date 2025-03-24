package com.test.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic_Page_obj_model {
	@FindBy(xpath="//*[@name='q]")
	private WebElement searchbox ;
	@Test
	public void d() {
	WebDriver dvr;
	dvr = new ChromeDriver();
	dvr.manage().window().maximize();
	dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	dvr.get("https://www.google.com/");
	
	searchbox.sendKeys("java selenium");
	searchbox.submit();
	}
	
}
