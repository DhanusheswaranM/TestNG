package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver dvr ;
	
	By username = By.name("username");
	By password = By.name("password"); 
	By title = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
	By logbtn= By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	public LoginPage(WebDriver dvr) {
		this.dvr = dvr ;
	}
	
	public void setUsername(String strusername) {
		dvr.findElement(username).sendKeys(strusername);
	}
	
	public void setPassword(String strpassword) {
		dvr.findElement(password).sendKeys(strpassword);
	}
	
	public void logbtn() {
		dvr.findElement(logbtn).click();
	}
	
	public String getLoginTitle() {
		return dvr.findElement(title).getText();
	}
	
	public void login(String strusername , String strpassword) {
		this.setUsername(strusername);
		this.setPassword(strpassword);
		this.logbtn();
	}
}
