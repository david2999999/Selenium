package com.selenium.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        String inputText = "David";
        driver.findElement(By.id("name")).sendKeys(inputText);
        //driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        driver.findElement(By.cssSelector("[id='confirmbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
    }
}
