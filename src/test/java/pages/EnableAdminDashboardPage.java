package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnableAdminDashboardPage extends BasePage {
    public EnableAdminDashboardPage(WebDriver driver) {
        super(driver);
    }

    By enableAdminDashboard_button = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/label[1]/div[1]/div[1]");

    public String EnableAdminDashboardClassValue() {
        return getAttribute(enableAdminDashboard_button, "class");


    }
    public void click_on_enableAdminDashboard_in_button () {
        scrollToElement(enableAdminDashboard_button);
        clickOnElement(enableAdminDashboard_button);
    }
}
