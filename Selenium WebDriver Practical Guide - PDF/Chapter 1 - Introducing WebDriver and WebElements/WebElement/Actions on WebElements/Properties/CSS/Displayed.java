// The isDisplayed() method is to determine if an element is diplayed on the web page
public class Displayed {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.isDisplayed());
    }
}