package lesson_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleMainPage;

public class LessonTestOne {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuril\\Desktop\\java\\seleniumtest2\\src\\main\\resources\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void setSomethingInSearchField() {
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        mainPage.open();
        mainPage.setSearchField("Selenium");
        mainPage.clickSearchButton();
    }


    @Test
    public void setSomethingInSearchField2() {
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        mainPage.open();
        mainPage.performSearch("Selenium");
    }
}
