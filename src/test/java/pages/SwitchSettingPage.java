package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchSettingPage extends BasePage {
    public SwitchSettingPage(WebDriver driver) {
        super(driver);
    }

    By switchSetting_button = By.xpath("//a[normalize-space()='Switch Settings']");


    public void click_on_switchSetting_in_button() {
        clickOnElement(switchSetting_button);
    }
}
