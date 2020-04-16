public class SwitchBetweenFrames {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/Frames.html");
        Actions action = new Actions(driver);

        driver.switchTo().frame(0);
        WebElement txt = driver.findElement(By.name("1"));
        txt.sendKeys("I'm Frame One");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        txt = driver.findElement(By.name("2"));
        txt.sendKeys("I'm Frame Two");
    }
}