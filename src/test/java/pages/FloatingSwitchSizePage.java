package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingSwitchSizePage extends BasePage {
    public FloatingSwitchSizePage(WebDriver driver) {
        super(driver);
    }

    By floatingSwitchSize_button = By.xpath("(//span[contains(text(),'Custom')])[1]");


    public void click_on_floatingSwitchSize_in_button() {
        clickOnElement(floatingSwitchSize_button);
    }
}
