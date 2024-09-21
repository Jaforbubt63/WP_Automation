package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizationSiteAnimationPage extends BasePage {
    public CustomizationSiteAnimationPage(WebDriver driver) {
        super(driver);
    }

    By customizationSiteAnimation_button = By.xpath("//a[normalize-space()='Site Animation']");


    public void click_on_customizationSiteAnimation_in_button() {
        clickOnElement(customizationSiteAnimation_button);
    }
}
