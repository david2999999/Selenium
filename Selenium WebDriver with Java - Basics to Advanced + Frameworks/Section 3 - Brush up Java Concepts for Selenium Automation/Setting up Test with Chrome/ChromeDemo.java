import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// WebDriver is an interface
// The implementations of WebDriver provides the functionality of all kinds of browsers.
public class ChromeDemo {
    public static void main(String[] args) {
        // create driver object
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
}