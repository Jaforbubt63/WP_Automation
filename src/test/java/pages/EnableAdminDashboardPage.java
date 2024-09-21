package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnableAdminDashboardPage extends BasePage {
    public EnableAdminDashboardPage(WebDriver driver) {
        super(driver);
    }

    By enableAdminDashboard_button = By.xpath("//div[@class='relative w-10 h-full rounded-full transition duration-100 bg-slate-200']");


    public void click_on_enableAdminDashboard_in_button() {
        clickOnElement(enableAdminDashboard_button);
    }
}
