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

        WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
        from.sendKeys("DEL");
        Thread.sleep(2000);

        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
        destination.sendKeys("Thailand");
        Thread.sleep(2000);

        destination.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        destination.sendKeys(Keys.ENTER);
    }
}
