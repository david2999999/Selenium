// The moveToElement() method is similar to moveByOffset()
// It helps us to move the mouse cursor to a specific WEbElement on the web page
public class MoveToElement {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Sortable.html");
        WebElement three = driver.findElement(By.name("three"));

        Actions builder = new Actions(driver);
        //Move tile3 to the position of tile2
        builder.moveToElement(three)
                .clickAndHold()
                .moveByOffset(120, 0)
                .perform();
    }
}