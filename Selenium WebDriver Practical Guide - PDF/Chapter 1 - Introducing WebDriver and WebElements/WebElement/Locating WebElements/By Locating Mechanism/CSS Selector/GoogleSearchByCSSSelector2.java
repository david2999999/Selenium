public class GoogleSearchByCSSSelector2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.cssSelector("#flrs>a[href='/intl/en/about.html']"));
        System.out.println(searchButton.getText());
    }
}