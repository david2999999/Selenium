// This example emulate the double clicking of a WebElement
public class DoubleClickWebElement {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/DoubleClick.html");

        WebElement dblClick = driver.findElement(By.name("dblClick"));
        Actions builder = new Actions(driver);
        builder.doubleClick(dblClick).perform();
    }
}