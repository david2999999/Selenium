package com.selenium.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXU']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        WebElement calendar = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"));
        calendar.click();

        WebElement checkBox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
        Assert.assertFalse(checkBox.isSelected());
        checkBox.click();
        Assert.assertTrue(checkBox.isSelected());

        WebElement returnDate = driver.findElement(By.id("Div1"));
        Assert.assertTrue(returnDate.getAttribute("style").contains("opacity: 0.5"));

        driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
        Thread.sleep(2000);
        Select numberOfAdults = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        numberOfAdults.selectByValue("4");

        Select select = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
        select.selectByVisibleText("USD");

        WebElement submitButton = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
        submitButton.click();
    }
}
