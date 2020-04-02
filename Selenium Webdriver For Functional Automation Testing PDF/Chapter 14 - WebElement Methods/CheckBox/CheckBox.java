public class CheckBox {
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
    public void selectReadyHobby() {
        List<WebElement> listCheckBoxes = driver.findElement(By.name("checkbox_5[]"));

        for (int i = 0; i < listCheckBoxes.size(); i++) {
            if (listCheckBoxes.get(i).getAttribute("value").equals("reading")) {
                listCheckBoxes.get(i).click();
            }
        }

        String selectedHobby = "";
        for (int i = 0; i < listCheckBoxes.size(); i++) {
            if (listCheckBoxes.get(i).isSelected()) {
                selectedHobby = listCheckBoxes.get(i).getAttribute("value");
            }
        }

        Assert.assertEquals(selectedHobby, "reading", "The Actual and Expected Results DO NOT Match");
    }
}