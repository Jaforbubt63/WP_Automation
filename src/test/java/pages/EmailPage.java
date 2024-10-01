package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage extends BasePage {
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    By email_button = By.xpath("//input[@id='email']");


    public void click_on_email_in_button() {
        sendText(email_button,"jafor63@gmail.com");
    }

}
