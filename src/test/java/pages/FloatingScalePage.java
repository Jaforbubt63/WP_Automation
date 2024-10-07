package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloatingScalePage extends BasePage {
    public FloatingScalePage(WebDriver driver) {
        super(driver);
    }

    By floatingScale_button = By.xpath("//input[@type='number']");


    public void click_on_floatingScale_in_button() {

        sendText(floatingScale_button, "220");
    }
}
