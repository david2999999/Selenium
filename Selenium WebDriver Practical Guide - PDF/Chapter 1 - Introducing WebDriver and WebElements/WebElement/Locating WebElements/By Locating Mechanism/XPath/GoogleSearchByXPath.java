public class GoogleSearchByXPath {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='gbqfba']"));
        System.out.println(searchButton.getText());
    }
}

// one disadvantage of using XPath is it is costly in terms of time.
// For every element to be identified, the WebDriver scans through the entire page that
// is very time consuming, and too much usage of XPath in your test script will make
// them too slow to be executed