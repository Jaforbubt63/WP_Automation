package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloatingSwitchPage extends BasePage {
    public FloatingSwitchPage(WebDriver driver) {
        super(driver);
    }

    By floatingSwitch_button = By.xpath("//div[@class='relative w-10 h-full rounded-full transition duration-100 bg-slate-200']");


    public void click_on_floatingSwitch_in_button() {
        clickOnElement(floatingSwitch_button);
    }
}
