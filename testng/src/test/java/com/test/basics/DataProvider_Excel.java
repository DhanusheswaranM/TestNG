package com.test.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProvider_Excel {
	WebDriver dvr ;

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {
        System.out.println("Start test");
        dvr = new ChromeDriver();
        dvr.manage().window().maximize();
        dvr.get("https://www.google.com/");
    }

    @Test(dataProvider = "excelData" , dataProviderClass = DPExcel.class)
    public void search(String keyword1 , String keyword2) throws InterruptedException {
        WebElement txtBox= dvr.findElement(By.id("APjFqb"));
        txtBox.sendKeys(keyword1," ",keyword2);
        System.out.println("Keyword entered as :"+keyword1+" "+keyword2);
        txtBox.sendKeys(Keys.ENTER);
        System.out.println("Search result are displayed.");
        System.out.println("Result : "+dvr.getTitle());
        Thread.sleep(3000);
        Assert.assertTrue(dvr.getTitle().contains(keyword1),"search is not correct");
    }

    @AfterMethod
    public void afterMethod() {
            dvr.quit();
        }
    }
