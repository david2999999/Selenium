// The click() method simulate the left-click of the mouse at its current position
// The method does not know where and on which element it is clicking
// It blindly clicks wherever it is at that point
//      - This method is used in combination with some other action rather than independently
//        to create a composite action
public class ClickCurrentLocation {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Selectable.html");
        WebElement seven = driver.findElement(By.name("seven"));

        System.out.println("X coordinate: " + seven.getLocation().getX() + " Y coordinate: " + seven.getLocation().getY());
        Actions builder = new Actions(driver);

        builder.moveByOffset(seven.getLocation().getX() + 1, seven.getLocation().getY() + 1).click();
        builder.perform();
    }
}