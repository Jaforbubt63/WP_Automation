package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeanieWithLogoPage extends BasePage {
    public BeanieWithLogoPage(WebDriver driver) {
        super(driver);
    }

    By beanieWithLogo_button = By.xpath("//div[@id='content-wrap']");


    public void click_on_beanie_in_button() {
        clickOnElement(beanieWithLogo_button);
}
