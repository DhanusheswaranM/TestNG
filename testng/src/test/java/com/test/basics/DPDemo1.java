package com.test.basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo1 {
	@DataProvider(name = "testData")
	public Object[][] dataprovfun1(){//it takes as object
		return new Object[][] {
			{"Automation tester","3-5 yrs"} , 
			{"Developer","6-9 yrs"} , 
			{"Performance tester","9+ yrs"}};
	}
}