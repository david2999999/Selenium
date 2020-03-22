import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com/");
		driver.findElement(By.id("email")).sendKeys("Email Address");
		driver.findElement(By.id("pass")).sendKeys("Password");
		driver.findElement(By.linkText("Forgot account?")).click();;
	}
}
