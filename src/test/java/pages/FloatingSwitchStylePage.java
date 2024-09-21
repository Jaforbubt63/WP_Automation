package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingSwitchStylePage extends BasePage {
    public FloatingSwitchStylePage(WebDriver driver) {
        super(driver);
    }

    By floatingSwitchStyle_button = By.xpath("//body/div/div/div[contains(@role,'main')]/div/div/div/div/div/div/div/div/section/div/div/div/div/div[1]/div[2]/div[4]");


    public void click_on_floatingSwitchStyle_in_button() {
        clickOnElement(floatingSwitchStyle_button);
    }
}
