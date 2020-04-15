public class ContextClickCurrentLocation {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/ContextClick.html");

        WebElement contextMenu = driver.findElement(By.id("div-context"));
        Actions builder = new Actions(driver);
        builder.moveToElement(contextMenu)
                .contextClick()
                .click(driver.findElement(By.name("Item 4")))
                .perform();
    }
}