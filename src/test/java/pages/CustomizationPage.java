package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizationPage extends BasePage {
    public CustomizationPage(WebDriver driver) {
        super(driver);
    }

    By customization_button = By.xpath("//h4[normalize-space()='Customization']");


    public void click_on_customization_in_button() {
        clickOnElement(customization_button);
    }
}
