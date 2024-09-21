package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingSwitchPositionPage extends BasePage {
    public FloatingSwitchPositionPage(WebDriver driver) {
        super(driver);
    }

    By floatingSwitchPosition_button = By.xpath("//span[normalize-space()='Left']");


    public void click_on_floatingSwitchPosition_in_button() {
        clickOnElement(floatingSwitchPosition_button);
    }
}
