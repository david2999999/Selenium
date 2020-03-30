public class ChromeFacebook {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "PATH TO CHROME DRIVER ON DISK");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void selectGender() {
        driver.findElement(By.linkText("Forgot password?")).click();
    }
}