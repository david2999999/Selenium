// The isSelected() method verifies if an element is selected right now on the web page
//      - can only be executed on radio button, options in select, and checkboxes
public class Selected {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.isSelected());
    }
}