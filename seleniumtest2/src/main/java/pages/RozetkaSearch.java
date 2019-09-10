package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaSearch extends AbstractPage {

    private static final String SEARCH_FIELD = "//input[@name='search']";
    private static final String URL = "https://rozetka.com.ua/";
    private static final String SEARCH_LIST = "//*[@class='search-suggest__item']";
    private static final String SEARCH_NO_RESULT = "//*[contains(text(),'По вашему запросу ничего не найдено')]";

    public RozetkaSearch(WebDriver driver) {
        super(driver);
    }
    public void setSearchField(String text){
        find(SEARCH_FIELD).sendKeys(text);
    }

    public void open(){
        super.openPage(URL);
    }
    public WebElement searchListItem(Integer item){

        List<WebElement> listOfElements = driver.findElements(By.xpath(SEARCH_LIST));

        if(listOfElements.size() == 0){
            System.out.println("Element not found!");
        }
            return listOfElements.get(item - 1);


    }
}
