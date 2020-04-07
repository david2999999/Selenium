// The getSize() method can be applied to all visible components of the HTML
//      - Returns the width and height of the rendered WebElement
public class Size {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.getSize());
    }
}