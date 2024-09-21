package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingPage extends BasePage {
    public SettingPage(WebDriver driver) {
        super(driver);
    }

    By setting_button = By.xpath("//div[contains(text(),'WP Dark Mode')]");


    public void click_on_setting_in_button() {
        clickOnElement(setting_button);
    }
}
