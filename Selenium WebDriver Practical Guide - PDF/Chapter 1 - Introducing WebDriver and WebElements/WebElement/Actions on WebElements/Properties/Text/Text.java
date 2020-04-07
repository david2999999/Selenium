// The getText() method can be executed on all the WebElement
//      - It returns the visible text if the element contains any text on it or else will return nothing
public class Text {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.getText());
    }
}