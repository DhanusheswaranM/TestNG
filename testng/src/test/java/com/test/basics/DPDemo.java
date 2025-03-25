package com.test.basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {
	@DataProvider(name = "testData" , parallel =true)
	public Object[][] dataprovfun(){//it takes as object
		return new Object[][] {{"selenium"} , {"Testng"} , {"Automation"}};
	}
									
}
