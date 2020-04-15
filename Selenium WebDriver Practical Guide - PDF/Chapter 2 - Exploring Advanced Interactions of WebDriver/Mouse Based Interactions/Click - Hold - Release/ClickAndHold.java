// The clickAndHold() method is another method of the Actions class that left-clicks
// on an element and holds it without releasing the left button of the mouse.
// The method is useful when executing operations such as drag and drop
public class ClickAndHold {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Sortable.html");
        Actions builder = new Actions(driver);

        //Move tile3 to the position of tile2
        builder.moveByOffset(200, 20)
                .clickAndHold()
                .moveByOffset(120, 0)
                .perform();
    }
}