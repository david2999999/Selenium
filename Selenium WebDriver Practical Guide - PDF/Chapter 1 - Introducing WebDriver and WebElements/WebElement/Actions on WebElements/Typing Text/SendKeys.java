// The sendKeys action is applicable for textbox or textarea HTML element
// This is used to type text into the text box
//      simulates the user keyboard and types text into WebElements
public class SendKeys {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchButton.sendKeys("Packt Publishing");
    }
}