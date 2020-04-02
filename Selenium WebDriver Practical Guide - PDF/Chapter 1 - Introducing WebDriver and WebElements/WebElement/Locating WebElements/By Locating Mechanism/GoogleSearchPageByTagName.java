public class GoogleSearchPageByTagName{
    // <button id=gbqfb aria-label="Google Search" class=gbqfb
    //         name=btnG><span class=gbqfi></span></button>

    //<button id=gbqfba aria-label="Google Search" name=btnK
    //        class=gbqfba><span id=gbqfsa>Google Search</span></button>

    // <button id=gbqfbb aria-label="I'm Feeling Lucky" name=btnI
    //         class=gbqfba onclick="if(this.form.q.value)this.checked=1;else window.
    //          top.location='/doodles/'"><span id=gbqfsb>I'm Feeling Lucky</span></button>
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println(buttons.size()); // prints 3
    }
}

// Locating an element by tag name is slightly differnt from name and id locating mechanism.
// The reason being it can return zero or more results.
    // For example, on the Google Search Page, if you search for an element with the tag name button
    // it will result in three WebElement because there are three buttons present
// It is always advisable to use the findElement() rather than the findElement() when trying to locate
// elements by tag names