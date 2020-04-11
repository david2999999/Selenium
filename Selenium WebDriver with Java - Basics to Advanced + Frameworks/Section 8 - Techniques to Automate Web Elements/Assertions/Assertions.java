package com.selenium.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assertions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));

        Assert.assertFalse(checkBox.isSelected());

        checkBox.click();

        Assert.assertTrue(checkBox.isSelected());

        int numOfCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        Assert.assertEquals(numOfCheckBoxes, 6);

        WebElement numOfPassengers = driver.findElement(By.id("divpaxinfo"));
        numOfPassengers.click();
        Thread.sleep(2000);

        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        select.selectByValue("2");

        Assert.assertEquals(numOfPassengers.getText(), "2 Adult");
    }
}