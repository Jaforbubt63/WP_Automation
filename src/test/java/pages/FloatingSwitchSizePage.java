package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloatingSwitchSizePage extends BasePage {
    public FloatingSwitchSizePage(WebDriver driver) {
        super(driver);
    }

    By floatingSwitchSize_button = By.xpath("//div//span[text()='Custom']");


    public void click_on_floatingSwitchSize_in_button() {
        scrollToElement(floatingSwitchSize_button);
        clickOnElement(floatingSwitchSize_button);
    }
}
