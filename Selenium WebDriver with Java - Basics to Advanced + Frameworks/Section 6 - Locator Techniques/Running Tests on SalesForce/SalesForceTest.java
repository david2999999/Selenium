import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome Driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Email Address");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("rememberUn")).click();

		driver.findElement(By.xpath("//*[@id='Login']")).click();

		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}
}

// Compound class names are not allowed in Selenium
// If there are multiple elements selected, Selenium will select the first element