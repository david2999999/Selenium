public class WebElement {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Testing Search Box");
        searchBox.submit();
    }
}

// The findElement() and By() methods instruct WebDriver to locate a WebElement
// on a web page, and once founds, the findElement(0 metho returns the WebElement
// instance of that element