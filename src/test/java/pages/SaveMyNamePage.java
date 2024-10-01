package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveMyNamePage extends BasePage{
    public SaveMyNamePage(WebDriver driver) {
        super(driver);
    }

    By save_button = By.xpath("//input[@id='wp-comment-cookies-consent']");


    public void click_on_save_in_button() {
        clickOnElement(save_button);
    }
}
