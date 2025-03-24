package com.test.basics;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	  @Test(alwaysRun = true , groups= {"Regression test"})
	  public void f() {
		  System.out.println("Login");	  
	  }
	  
	  @Test(alwaysRun = true , groups= {"Regression test","smoke test"})
	  public void f1() {
		  System.out.println("Access");	  
	  }
	  
	  @Test(alwaysRun = true , groups= {"Regression test","smoke test","sanity test"})
	  public void f2() {
		  System.out.println("Logout");
	  }
	}
