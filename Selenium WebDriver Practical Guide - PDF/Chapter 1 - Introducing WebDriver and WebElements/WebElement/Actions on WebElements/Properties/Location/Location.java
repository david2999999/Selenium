// The getLocation() method can be executed on all the WebElements
//      - This is used to get the relative position of an element where it is rendered on the webpage
//      - This position is calculated relative to the top-left corner of the web page
//          - (x, y) coordinates are assumed as (0, 0) in the top-left corner
public class Location {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.getLocation());
    }
}