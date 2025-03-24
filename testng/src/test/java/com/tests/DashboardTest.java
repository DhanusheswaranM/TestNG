package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest{
	LoginPage objLogin ;
	DashboardPage objDashboardPage ;
	@Test(priority = 0)
	public void DashboardTest() {
		objLogin = new LoginPage(dvr);
		objLogin.login("Admin" , "admin123");
		
		objDashboardPage = new DashboardPage(dvr);
		Assert.assertTrue(objDashboardPage.getHomePageText().contains("Dashboard"));
	}
 
}

