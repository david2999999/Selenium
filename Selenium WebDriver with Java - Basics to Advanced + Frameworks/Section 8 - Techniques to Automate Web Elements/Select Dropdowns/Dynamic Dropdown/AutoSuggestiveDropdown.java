package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("fromCity")).click();
        Thread.sleep(1000);

        WebElement fromDestination = driver.findElement(By.xpath("//input[@placeholder='From']"));
        fromDestination.sendKeys("DEL");
        Thread.sleep(2000);

        fromDestination.sendKeys(Keys.ARROW_DOWN);
        fromDestination.sendKeys(Keys.ENTER);
    }
}
