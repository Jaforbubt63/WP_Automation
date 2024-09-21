package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanelPage extends BasePage {
    public AdminPanelPage(WebDriver driver) {
        super(driver);
    }

    By adminPanel_button = By.xpath("//a[normalize-space()='Admin Panel Dark Mode']");


    public void click_on_adminPanel_in_button() {
        clickOnElement(adminPanel_button);
    }
}
