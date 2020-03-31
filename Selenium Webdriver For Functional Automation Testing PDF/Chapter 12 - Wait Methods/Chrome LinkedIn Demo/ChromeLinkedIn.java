public class ChromeLinkedIn {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "PATH TO CHROME DRIVER ON DISK");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void enterTextInSearchField() {
        // object reference of wait is created for WebDriverWait while driver is the reference object
        // for WebDriver. A maximum of 5 seconds is provided to locate the WebElement
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Afterwards, we need to inform WebDriver to wait until an expected condition is met
        // The ExpectedConditions class supplies many methods for dealing with scenarios that may occur before
        // executing the next Test Step
    }

    @Test
    public void verifyCredentials() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Click Submit button after it becomes enabled
        wait.until(ExceptedConditions.elementsToBeClickable(By.id("submit")));

        // Next Test Step is Executed After Above Condition is Met
    }
}