import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExploreDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "D:\\Selenium Chrome Driver\\MicrosoftWebDriver.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
}
