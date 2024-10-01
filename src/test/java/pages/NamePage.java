package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NamePage extends BasePage{
    public NamePage(WebDriver driver) {
        super(driver);
    }

    By name_button = By.xpath("//input[@id='author']");


    public void click_on_name_in_button() {
        sendText(name_button,"Abu Jafor");
    }
}
