package com.selenium.eCommerce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerce {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        List<String> itemsWanted = new ArrayList<>();
        itemsWanted.add("Brocolli");
        itemsWanted.add("Cauliflower");
        itemsWanted.add("Cucumber");
        itemsWanted.add("Brinjal");
        itemsWanted.add("Capsicum");

        List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

        for (int i = 0; i < productNames.size(); i++) {
            String[] productName = productNames.get(i).getText().split("-");

            if (itemsWanted.contains(productName[0].trim())) {
                System.out.println(productName[0].trim());
                addToCartButtons.get(i).click();
            }
        }
    }
}
