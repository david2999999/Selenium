public class GoogleSearchByCSSSelector {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.cssSelector("#gbqfba"));
        System.out.println(searchButton.getText());
    }
}