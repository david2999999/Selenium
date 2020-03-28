import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fb.com/");

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("CSS Selectory Email");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("CSS Selectory Password");
        driver.findElement(By.cssSelector("[value='Log In']")).click();
    }
}
