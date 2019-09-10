import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class FirstTest {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\TAF\\src\\main\\resources\\drivers\\chromedriver.exe");

        ChromeOptions options  =new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void firstTest() {
        driver.get("http://www.google.com");
        WebDriverWait waiter = new WebDriverWait(driver, 15);
        waiter.until(titleIs("Google"));
    }

    @Test
    public void testList() {
        List<Integer> asd = Arrays.asList();
        try {
            String a = "asd";
            a = null;
            a.codePoints();
        } catch (NullPointerException e) {
            System.out.println("Null pointer was throwed");
        }
    }

    @Test
    public void checkedException() {

    }

    public <T> T getFirst(List<T> someList) {
        return (T) someList.get(0);
    }

    public void throwInterapted() {
        try {
            Thread.sleep(100);
            throw new MyCustomException();
        } catch (InterruptedException e) {

        } catch (MyCustomException e) {

        }
    }


}
