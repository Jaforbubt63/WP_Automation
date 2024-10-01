package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    By search_button = By.xpath("//input[@id='ocean-search-form-2']");


    public void click_on_search_in_button(String search) throws InterruptedException {
        sendText(search_button,"search");
        search_button.sendKeys(Keys.ENTER);
    }
}
