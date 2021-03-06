// Getting Attribute
//    - The getAttribute() action can be executed on all the WebElement
//    - The attributes are modifiers of HTML elements
//        - They are generally key-value pairs appearing in the start tag of an element
//    - Example:
//        <label name="Username" id="uname">Enter Username: </label>
//    - The API syntax of the getAttributes() is
//        java.lang.String getAttribute(java.lang.String name)
public class GetAttributes {
    // <button id="gbqfba" class="gbqfba" name="btnK" aria-label="Google Search">
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println("Name of the button is: " + searchButton.getAttribute("name"));
        System.out.println("Id of the button is: " + searchButton.getAttribute("id"));
        System.out.println("Class of the button is: " + searchButton.getAttribute("class"));
        System.out.println("Label of the button is: " + searchButton.getAttribute("aria-label"));
    }
}