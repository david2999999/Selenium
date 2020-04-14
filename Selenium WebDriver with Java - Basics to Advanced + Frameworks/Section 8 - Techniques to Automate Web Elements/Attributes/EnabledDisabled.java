package com.selenium.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));

        Assert.assertFalse(checkBox.isSelected());
        checkBox.click();
        Assert.assertTrue(checkBox.isSelected());

        WebElement radioButton = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
        WebElement returnDate = driver.findElement(By.id("Div1"));

        Assert.assertFalse(returnDate.getAttribute("style").contains("opacity: 1"));

        radioButton.click();

        Assert.assertTrue(returnDate.getAttribute("style").contains("opacity: 1"));
    }
}
