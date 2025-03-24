package com.test.basics;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 0)
  public void a() {
	  System.out.println("1");
  }
  @Test()
  public void i() {
	  System.out.println("2");
  }
  @Ignore
  @Test()
  public void x() {
	  System.out.println("3");
  }
  @Test(priority = 3 , enabled= false)
  public void h() {
	  System.out.println("4");
  }
  @Test(priority = 2)
  public void z() {
	  System.out.println("5");
  }
  
}
