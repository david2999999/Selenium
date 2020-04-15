// doubleClick() is another out of the box method that WebDriver provides to
// emulate double-clicking the mouse
// This method comes in 2 flavors
    // 1) double clicking a web-element
    // 2) clicking the current location of the cursor
// This following example is an example of the 2nd flavor
public class DoubleClickCurrentLocation {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Selectable.html");

        WebElement dblClick= driver.findElement(By.name("dblClick"));
        Actions builder = new Actions(driver);
        builder.moveToElement(dblClick).doubleClick().perform();
    }
}