package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPanelPage extends BasePage {
    public AdminPanelPage(WebDriver driver) {
        super(driver);
    }

    By adminPanel_button = By.xpath("//a[normalize-space()='Admin Panel Dark Mode']");


    public void click_on_adminPanel_in_button() {
        clickOnElement(adminPanel_button);
    }
}
