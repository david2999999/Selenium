// The dragAndDrop() method is similar to the dragAndDropBy() method.
// The only difference being that instead of moving the WebElement by an offet,
// we move it to a target element
// The API syntax for the dragAndDrop() method is
//          public Actions dragAndDrop(WebElement source, WebElement target)
public class DragAndDrop {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/DragAndDrop.html");

        WebElement src = driver.findElement(By.id("draggable"));
        WebElement trgt = driver.findElement(By.id("droppable"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(src, trgt).perform();
    }
}