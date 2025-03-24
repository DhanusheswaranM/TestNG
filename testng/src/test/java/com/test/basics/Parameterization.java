package com.test.basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
  @Test
  @Parameters({"val1" , "val2"}) 
  public void Sum(int v1 , int v2){
	  int sum = v1 + v2 ;
	  System.out.println("The final sum is "+sum);
  }
  @Test
  @Parameters({"val1" , "val2"}) 
  public void Sub(int v1 , int v2){
	  int sub = v1 - v2 ;
	  System.out.println("The final difference is "+sub);
  }
}
