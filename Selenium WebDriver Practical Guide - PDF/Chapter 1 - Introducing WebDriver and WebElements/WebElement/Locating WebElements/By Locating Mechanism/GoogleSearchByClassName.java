public class GoogleSearchByClassName{
    // <button name="sampleBtnName" id="sampleBtnId" class="gbqfif">I'm Button</button>
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.className("gbqfif"));
        searchBox.sendKeys("Packt Publishing");
    }
}
// 'gbqfif' is used as value for the class attribute of the button element and it
// inherits all the styles declared in the CSS file
// We use the By.className() to select an element based on the value in the class attribute