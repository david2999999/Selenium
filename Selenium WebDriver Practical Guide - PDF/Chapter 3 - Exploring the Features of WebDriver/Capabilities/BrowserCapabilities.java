public class BrowserCapabilities {
    public static void main(String... args) {
        Map capabilitiesMap = new HashMap();
        capabilitiesMap.put("takesScreenShot", true);
        DesiredCapabilities capabilities
                = new DesiredCapabilities(capabilitiesMap);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("http://www.google.com");
    }
}