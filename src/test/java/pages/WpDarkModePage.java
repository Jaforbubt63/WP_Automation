package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WpDarkModePage extends BasePage {
    public WpDarkModePage(WebDriver driver) {
        super(driver);
    }

    By wpDarkMode_button = By.xpath("//div[normalize-space()='WP Dark Mode']");

    public void click_on_wpDarkMode_in_button() {
        clickOnElement(wpDarkMode_button);
    }
}
