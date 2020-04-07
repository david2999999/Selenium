// The moveByOffset() method is used to move the mouse from its current position to another point on the WebPage
// Developers can specify the X distance and Y distance the mouse has to be moved
//      - When the page is loaded, the initial position of a mouse would be (0,0)
// Syntax for the method is - public Actions moveByOffset(int xOffSet, int yOffSet)
//      - a positive value used for xOffset will move the cursor to the left
//      - a negative value used for xOffset will move the cursor to the right
//      - a positive value used for yOffset will move the cursor to the down
//      - a negative value used for yOffset will move the cursor to the up
public class MoveByOffset {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Selectable.html");
        WebElement three = driver.findElement(By.name("three"));
        System.out.println("X coordinate: " + three.getLocation().getX() + " Y coordinate: " + three.getLocation().getY());

        Actions builder = new Actions(driver);
        builder.moveByOffset(three.getLocation().getX() + 1, three.getLocation().getY() + 1);
        builder.perform();
    }
}