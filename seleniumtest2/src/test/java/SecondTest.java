import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SecondTest {
    WebDriver driver = new ChromeDriver();


    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\TAF\\src\\main\\resources\\drivers\\chromedriver.exe");
    }

    @Test
    public void driverTest() {
//        driver.get("url");
//        driver.close(); // closeBrowser
//        driver.quit(); // closeWebsriver
//        driver.findElement() // find elemeted
//        driver.findElements() // find list of elemets
//        driver.navigate().to(); //same as get
//        driver.manage().timeouts() // manage driver, such as add cookies, set waits etc
//        driver.switchTo(). // switch to alert or iframe
    }

    @Test
    public void webElemetMethod(){
//        WebElement el = driver.findElement(By.xpath("//"));
//        el.clear(); // clear field
//        el.click();
//        el.getText();
//        el.getAttribute();
//        el.

    }

    @Test
    public void driverCaps(){

        ChromeOptions options  =new ChromeOptions();
        options.addArguments("start-maximized");
        new ChromeDriver(options);
    }

    @Test
    public void secondTest() {
        driver.get("http://google.com");

    }

    @Test
    public void alphaTest() {

    }
}
