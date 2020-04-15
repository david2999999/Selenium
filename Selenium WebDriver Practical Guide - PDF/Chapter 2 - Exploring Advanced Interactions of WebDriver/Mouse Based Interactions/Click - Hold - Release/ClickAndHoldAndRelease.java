// After we have clicked and hold an element, the last action that has to be
// taken on a hold WebElement is to release it so that the element can be
// dropped or release from the mouse
// The release() method is one that release the left mouse button on a WebElement
public class ClickAndHoldAndRelease {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Sortable.html");
        WebElement three = driver.findElement(By.name("three"));

        Actions builder = new Actions(driver);
        //Move tile3 to the position of tile2
        builder.clickAndHold(three)
                .moveByOffset(120, 0)
                .release()
                .perform();
    }
}