package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizationPage extends BasePage {
    public CustomizationPage(WebDriver driver) {
        super(driver);
    }

    By customization_button = By.xpath("//h4[normalize-space()='Customization']");


    public void click_on_customization_in_button() {
        clickOnElement(customization_button);
    }
}
