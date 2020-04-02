public class GoogleSearchButtonByName {
    // <button id="gbqfba" aria-label="Google Search" name="btnK"
    //         class="gbqfba"><span id="gbqfsa">Google Search</span></button>
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("btnK"));
        searchBox.submit();
    }
}

// The locating mechanism used here is 'By.name' and the name is 'btnK'

