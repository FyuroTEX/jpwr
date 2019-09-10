package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractPage {
    WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void click(String xpath) {
        find(xpath).click();
    }


}
