package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    By search_button = By.xpath("//input[@id='ocean-search-form-2']");


    public void click_on_search_in_button(String search_Text) {
        WebElement search = driver.findElement(search_button);
        search.sendKeys(Keys.ENTER);
    }
}
