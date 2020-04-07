// The getTagName() method can be executed on all WebElements
//      - return the tag name of the WebElement
//  <button id="gbqfba" class="gbqfba" name="btnK" aria-label="Google Search">
//      - The tag name of th preceding code is 'button'
public class TagName {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.getTagName());
    }
}