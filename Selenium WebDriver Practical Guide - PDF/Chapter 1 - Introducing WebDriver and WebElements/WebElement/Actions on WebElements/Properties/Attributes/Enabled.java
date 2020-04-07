// The isEnabled() method is used to verify if an element is enabled on the web page and
// can be used on all WebElements
public class Enabled {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.isEnabled());
    }
}