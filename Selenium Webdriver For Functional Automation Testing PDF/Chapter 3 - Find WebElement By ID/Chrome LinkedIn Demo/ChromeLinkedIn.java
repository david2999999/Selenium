public class ChromeLinkedIn {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void enterFirstName() {
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Test First Name");
        firstName.clear();
    }
}