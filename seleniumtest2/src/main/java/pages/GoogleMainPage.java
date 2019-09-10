package pages;

import org.openqa.selenium.WebDriver;

public class GoogleMainPage extends AbstractPage {
    private static final String SEARCH_FIELD = "//input[@name='q']";
    private static final String SEARCH_BUTTON = "//input[@name='btnK']";
    private static final String URL = "http://google.com";

    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    public void setSearchField(String text){
        find(SEARCH_FIELD).sendKeys(text);
    }

    public void open(){
        super.openPage(URL);
    }

    public void clickSearchButton(){
        click(SEARCH_BUTTON);
    }

    public void performSearch(String searchCriteria){
        setSearchField(searchCriteria);
        clickSearchButton();
    }


}
