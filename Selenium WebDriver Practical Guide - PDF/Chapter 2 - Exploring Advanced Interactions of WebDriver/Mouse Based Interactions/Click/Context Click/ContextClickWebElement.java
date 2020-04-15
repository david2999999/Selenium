// contextClick() method is also known as right-click
// The context is a menu; a list of items is associated to a WebElement based
// on the current state of the WebElement
public class ContextClickWebElement {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/ContextClick.html");

        WebElement contextMenu = driver.findElement(By.id("div-context"));
        Actions builder = new Actions(driver);
        builder.contextClick(contextMenu)
                .click(driver.findElement(By.name("Item 4")))
                .perform();
    }
}