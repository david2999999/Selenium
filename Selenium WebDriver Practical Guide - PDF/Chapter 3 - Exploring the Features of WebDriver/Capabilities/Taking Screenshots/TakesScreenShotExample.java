public class TakesScreenShotExample {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.packtpub.com/");
        File scrFile = ((TakesScreenShot) driver).
                getScreenshotAs(OutputType.FILE);
        System.out.println(scrFile.getAbsolutePath());
    }
}