// WebDriver has provided a convenient way out of the box method to use for drag and drop components
// The API Syntax for the dragAndDropBy() method is as follows
//          public Actions dragAndDropBy(WebElement source, int xOffset,int yOffset)
// The WebElement input parameter is the target WebElement to be dragged
// The xOffset and yOffset are the directions that the element is going to be dragged
public class DragAndDropBy {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/DragMe.html");

        WebElement dragMe = driver.findElement(By.id("draggable"));

        Actions builder = new Actions(driver);
        builder.dragAndDropBy(dragMe, 300, 200).perform();
    }
}