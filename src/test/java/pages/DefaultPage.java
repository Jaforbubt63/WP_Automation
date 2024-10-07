package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefaultPage extends BasePage {
    public DefaultPage(WebDriver driver) {
        super(driver);
    }

    By default_button = By.xpath("//span[@class='flex w-4 rounded-full h-4 shadow group-hover:bg-blue-100 border-4 border-blue-600']");


    public void click_on_default_in_button() {
        clickOnElement(default_button);
    }
}
