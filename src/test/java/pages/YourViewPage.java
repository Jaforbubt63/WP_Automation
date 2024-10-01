package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourViewPage extends BasePage{
    public YourViewPage(WebDriver driver) {
        super(driver);
    }

    By yourView_button = By.xpath("//textarea[@id='comment']");


    public void click_on_yourView_in_button() {

        sendText(yourView_button,"Yes");
    }
}
