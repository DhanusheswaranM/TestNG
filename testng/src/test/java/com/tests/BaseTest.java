package com.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class BaseTest {

	public static WebDriver dvr ;
	LoginPage objlogin ;
	DashboardPage objdashboardpage ;
	
	@BeforeClass
	public void setup() {
		dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@AfterClass
	public void close() {
		dvr.quit();
	}
}
