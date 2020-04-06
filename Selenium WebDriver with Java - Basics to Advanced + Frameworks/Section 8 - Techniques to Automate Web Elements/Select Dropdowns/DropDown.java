package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
        Thread.sleep(2000);

        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        select.selectByValue("2");
        select.selectByIndex(6);
        select.selectByVisibleText("3");
    }
}
