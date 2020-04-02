public class Windows {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "PATH TO CHROME DRIVER ON DISK");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void getWindowHandles() {
        String handle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();

        for (String windowHandle: allHandles) {
            driver.switchTo().window(windowHandle);
        }
    }
}