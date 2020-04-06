// The submit action can be taken on a form or on an element, which is inside the form.
// The submit() method can be used to submit a form of a web page to the server hosting the
// web application.
// A 'NoSuchElementException' will be thrown if the method is executed on a WebElement that is not
// present within a form.
public class Submit {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(Keys.chord(Keys.SHIFT,"packt publishing"));
        searchBox.submit();
    }
}