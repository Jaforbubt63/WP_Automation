package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitPage extends BasePage{
    public SubmitPage(WebDriver driver) {
        super(driver);
    }

    By submit_button = By.xpath("//input[@id='submit']");


    public void click_on_submit_in_button() {
        clickOnElement(submit_button);
    }
}
