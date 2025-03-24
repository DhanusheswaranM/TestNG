package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DashboardPage {
	
  WebDriver dvr ;
  By dashboardtitle = By.xpath("//header[@class='oxd-topbar']/div/div/span/h6");
  
  public DashboardPage(WebDriver dvr) {
	  this.dvr = dvr ;
  }
  public String getHomePageText() {
      return dvr.findElement(dashboardtitle).getText();
      }
  
}
