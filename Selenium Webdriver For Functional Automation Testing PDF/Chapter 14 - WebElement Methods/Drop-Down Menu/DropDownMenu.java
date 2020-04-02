public class DropDownMenu {
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
    public void demoDropDownMenu() {
        WebElement findJobTitle = driver.findElement(By.id("job-titles"));
        Select selectJobTitle = new Select(findJobTitle);
        selectJobTitle.selectByVisibleText("QA Engineer");
    }
}