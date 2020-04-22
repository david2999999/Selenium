package com.selenium.eCommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ECommerce {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();

        List<String> itemsWanted = new ArrayList<>();
        itemsWanted.add("Brocolli");
        itemsWanted.add("Cauliflower");
        itemsWanted.add("Cucumber");
        itemsWanted.add("Brinjal");
        itemsWanted.add("Capsicum");

        addItemsToCart(itemsWanted);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));

        driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));

        System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
    }

    private static void addItemsToCart(List<String> itemsWanted) {
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
