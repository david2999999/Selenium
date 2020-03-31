public class SeleniumBasics {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
}

// We instantiate the firefox implementation of the WebDriver interface
    // Webdriver is an interface whose concrete implementation is done in two classes
        // 1) RemoteWebDriver
        // 2) HTMLUnitDriver

// FirefoxDriver is a subclass of the RemoteWebDriver
    // Other similar drivers include InternetExplorerDriver, ChromeDriver,
    // SafariDriver, AndroidDriver, and IPhoneDriver

// Gotchas
    // Solid lines means extend
    // Dotted lines means implement