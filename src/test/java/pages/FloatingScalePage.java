package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingScalePage extends BasePage {
    public FloatingScalePage(WebDriver driver) {
        super(driver);
    }

    By floatingScale_button = By.xpath("//input[@id='4174ikn78']");


    public void click_on_floatingScale_in_button() {
        clickOnElement(floatingScale_button);
    }
}
