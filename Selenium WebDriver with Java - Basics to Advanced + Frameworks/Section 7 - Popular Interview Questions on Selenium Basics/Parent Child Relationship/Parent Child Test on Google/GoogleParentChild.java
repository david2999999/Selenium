import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleParentChild {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Github.com");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        System.out.println(driver.getTitle());
    }
}
