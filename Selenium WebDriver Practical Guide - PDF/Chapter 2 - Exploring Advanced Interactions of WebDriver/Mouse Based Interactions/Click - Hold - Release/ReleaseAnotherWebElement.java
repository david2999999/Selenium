// Overloaded version of the release() method, where we can release
// the currently help WebElement in the middle of another WebElement.
// Using this method, we do not have to calculate the offset of the target
// WebElement from the held WebElement
public class ReleaseAnotherWebElement {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Sortable.html");

        WebElement three = driver.findElement(By.name("three"));
        WebElement two = driver.findElement(By.name("two"));

        Actions builder = new Actions(driver);
        //Move tile3 to the position of tile2
        builder.clickAndHold(three)
                .release(two)
                .perform();
    }
}