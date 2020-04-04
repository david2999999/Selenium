import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Username");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password");
        driver.findElement(By.cssSelector("input[id='Login']")).click();
    }
}
