import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fb.com/");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("XPath Email Test");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("XPath Password Test");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
