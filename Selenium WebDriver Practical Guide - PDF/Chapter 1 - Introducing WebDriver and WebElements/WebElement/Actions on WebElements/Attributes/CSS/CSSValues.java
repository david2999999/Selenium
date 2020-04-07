// The getCssValue() method can be used on all WebElement
//      - It is used to fetch the CSS properties values of the given element
//      - These properties include font-family, background-color, color, and so on
// This is useful when you want to validate the CSS Styles that are applied to your WebElement
public class CSSValues {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.getCssValue("font-family"));
        System.out.println(searchButton.getCssValue("background-color"));
    }
}