// In the sendKeys() example from before, we only pass in normal keys to the textbox.
// If we want to type in some special keys, such as BackSpace, Enter, Tab, Shift, and so on, we need to use
// a special enum class of WebDriver named Keys
//      Using the Keys enumeration, we can simulate many special keys while typing into a WebElement
//      The follow example displays the use of 'Shift' key to type the text in uppercase
public class SendKeysSpecialCharacters {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchButton.sendKeys(Keys.chord(Keys.SHIFT, "Testing Uppercase Words."));
    }
}

