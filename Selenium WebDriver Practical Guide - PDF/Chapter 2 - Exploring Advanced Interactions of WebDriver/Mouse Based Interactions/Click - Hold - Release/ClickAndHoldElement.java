// In the class 'ClickAndHold', the method to click and hold does not care which WebElement
// it is dealing with.
//      - If we want to deal with a particular WebElement on the web page, we have to first
//         move the cursor to the appropriate position and then perform the action
//      - In order to avoid the hassle of moving the cursor, WebDriver allows WebElement to be passed
//        into the method as input
public class ClickAndHoldElement {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Sortable.html");

        WebElement three = driver.findElement(By.name("three"));

        Actions builder = new Actions(driver);
        //Move tile3 to the position of tile2
        builder.clickAndHold(three)
                .moveByOffset(120, 0)
                .perform();
    }
}