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
    public void captureSignInErrorMessage() {
        WebElement parentSignIn = driver.findElement(By.className("login-form"));
        WebElement email = parentSignIn.findElement(By.id("login-email"));
        WebElement password = parentSignIn.findElement(By.id("login-password"));
        WebElement signInButton = parentSignIn.findElement(By.name("submit"));

        email.sendKeys("djiang@gmail.com");
        password.sendKeys("Testing");
        signInButton.click();

        String signInErrorMessage = driver.findElement(By.className("alert")).getText();
        System.out.println(signInErrorMessage);
    }
}