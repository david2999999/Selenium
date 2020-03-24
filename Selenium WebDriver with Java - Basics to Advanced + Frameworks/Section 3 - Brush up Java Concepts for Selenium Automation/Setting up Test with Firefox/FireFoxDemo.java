import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium Chrome Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
}
