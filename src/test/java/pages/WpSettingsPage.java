package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WpSettingsPage extends BasePage {
    public WpSettingsPage(WebDriver driver) {
        super(driver);
    }

    By wpSettings_button = By.xpath("//a[@href='admin.php?page=wp-dark-mode'][normalize-space()='Settings']");


    public void click_on_wpSettings_in_button() {
        clickOnElement(wpSettings_button);
    }
}
