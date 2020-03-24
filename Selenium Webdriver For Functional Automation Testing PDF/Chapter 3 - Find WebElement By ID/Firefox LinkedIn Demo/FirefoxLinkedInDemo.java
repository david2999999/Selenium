public class FirefoxLinkedInDemo {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/"); // go to LinkedIn home page
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit(); // closes the browser
    }

    @Test
    public void joinLinkedIn() {
        // Find the element with the id 'first-name'
        // Enter 'Test First Name' via sendKeys
        driver.findElement(By.id("first-name")).sendKeys("Test First Name");
    }
}