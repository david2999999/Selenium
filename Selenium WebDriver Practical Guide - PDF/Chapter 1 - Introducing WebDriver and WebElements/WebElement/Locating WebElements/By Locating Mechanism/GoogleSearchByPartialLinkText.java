public class GoogleSearchByPartialLinkText {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement aboutLink = driver.findElement(By.partialLinkText("About"));
        aboutLink.click();
    }
}

// The By.partialLinkText locating mechanism is an extension to the previous one,
// which is locating WebeElemnt by linkText
// If you are unsure of the entire link text or want to use only part of the link text,
// you can use this locating mechanism to identify the link element

// Use WebDriver's findElements() method if you think you need all the WebElements
// that satisfy a locating mechanism condition