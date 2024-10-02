package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeaniePage extends BasePage {
    public BeaniePage(WebDriver driver) {
        super(driver);
    }

    By beanie_button = By.xpath("//article[@id='post-34']//a[@title='Continue Reading'][normalize-space()='Continue Reading']");


    public void click_on_beanie_in_button() {
        scrollToElement(beanie_button);
        clickOnElement(beanie_button);
    }
}
