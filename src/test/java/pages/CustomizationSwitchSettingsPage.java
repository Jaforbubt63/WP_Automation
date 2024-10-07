package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizationSwitchSettingsPage extends BasePage {
    public CustomizationSwitchSettingsPage(WebDriver driver) {
        super(driver);
    }

    By customizationSwitchSetting_button = By.xpath("//a[normalize-space()='Switch Settings']");


    public void click_on_customizationSwitchSetting_in_button() {
        clickOnElement(customizationSwitchSetting_button);
    }
}
