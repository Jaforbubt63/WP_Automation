package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WpSettingsPage extends BasePage {
    public WpSettingsPage(WebDriver driver) {
        super(driver);
    }

    By wpSettings_button = By.xpath("//a[@href='admin.php?page=wp-dark-mode'][normalize-space()='Settings']");


    public void click_on_wpSettings_in_button() {
        clickOnElement(wpSettings_button);
    }
}
