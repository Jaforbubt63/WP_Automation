package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizationSiteAnimationPage extends BasePage{
    public CustomizationSiteAnimationPage(WebDriver driver) {
        super(driver);
    }

    By customizationSiteAnimation_button = By.xpath("//a[normalize-space()='Site Animation']");


    public void click_on_customizationSiteAnimation_in_button() {
        clickOnElement(customizationSiteAnimation_button);
    }
}
