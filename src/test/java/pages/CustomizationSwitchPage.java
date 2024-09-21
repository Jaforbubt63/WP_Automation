package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizationSwitchPage extends BasePage {
    public CustomizationSwitchPage(WebDriver driver) {
        super(driver);
    }

    By customizationSwitch_button = By.xpath("//h4[normalize-space()='Customization']");


    public void click_on_customizationSwitch_in_button() {
        clickOnElement(customizationSwitch_button);
    }
}
