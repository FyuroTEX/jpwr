package lesson_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleMainPage;
import pages.RozetkaSearch;

import java.util.concurrent.TimeUnit;

public class LessonTestRozetka {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuril\\Desktop\\java\\seleniumtest2\\src\\main\\resources\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void setSomethingInSearchField() {
        RozetkaSearch mainPage = new RozetkaSearch(driver);
        mainPage.open();
        mainPage.setSearchField("samsung");
        mainPage.searchListItem(2).click();
    }
}
