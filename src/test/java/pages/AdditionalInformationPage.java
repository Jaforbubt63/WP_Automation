package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdditionalInformationPage extends BasePage {
    public AdditionalInformationPage(WebDriver driver) {
        super(driver);
    }

    By additional_button = By.xpath("//a[normalize-space()='Additional information']");


    public void click_on_additional_in_button() {
        clickOnElement(additional_button);
    }
}
