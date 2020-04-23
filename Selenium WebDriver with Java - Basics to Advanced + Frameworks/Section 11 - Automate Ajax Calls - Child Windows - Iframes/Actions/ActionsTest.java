package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement accountAndList = driver.findElement(By.id("nav-link-accountList"));

        Actions action = new Actions(driver);
        action.moveToElement(accountAndList).build().perform();;
    }
}
