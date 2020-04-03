public class GoogleSearchByLinkText{
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement aboutLink = driver.findElement(By.linkText("About Google"));
        aboutLink.click();
    }
}

// By.linkText locating mechanism can only be used to identify the HTML links
// HTML links elements are represented on a web page using the anchor tag
    // <a href="/intl/en/about.html">About Google</a>