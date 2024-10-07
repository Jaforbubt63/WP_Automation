package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloatingSwitchPositionPage extends BasePage {
    public FloatingSwitchPositionPage(WebDriver driver) {
        super(driver);
    }

    By floatingSwitchPosition_button = By.xpath("//span[normalize-space()='Left']");


    public void click_on_floatingSwitchPosition_in_button() {
        clickOnElement(floatingSwitchPosition_button);
    }
}
