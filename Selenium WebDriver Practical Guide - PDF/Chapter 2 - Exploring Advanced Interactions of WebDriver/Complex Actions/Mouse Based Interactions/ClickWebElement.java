// The click() method without a argument clicks a WebElement by calculating the offset to it
// This process may not be needed every time when the WebElement has its own identifier,
// such as a name or ID
// The overloaded version of click() method allows a click directly on the WebElement
public class ClickWebElement {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Selectable.html");

        WebElement one = driver.findElement(By.name("one"));
        WebElement eleven = driver.findElement(By.name("eleven"));
        WebElement five = driver.findElement(By.name("five"));

        Actions builder = new Actions(driver);

        //Click on One
        builder.click(one);
        builder.build().perform();

        // Click on Eleven
        builder.click(eleven);
        builder.build().perform();

        //Click on Five
        builder.click(five)
        builder.build().perform();
    }
}