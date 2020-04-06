// The clear action is similar to sendKeys() method
//      - They are both applicable for textbox and textarea elements
// The clear() method is used to erase the text that is entered in a WebElement using the sendKeys() method.
// Although, this functionality can also be achieved using the Keys.BACK_SPACE enum,
//      - WebDriver has given us an explicit method to clear the text easily
public class Clear {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(Keys.chord(Keys.SHIFT,"packt publishing"));
        searchBox.clear();
    }
}