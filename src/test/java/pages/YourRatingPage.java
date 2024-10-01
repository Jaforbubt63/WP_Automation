package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourRatingPage extends BasePage{
    public YourRatingPage(WebDriver driver) {
        super(driver);
    }

    By yourRating_button = By.xpath("//a[normalize-space()='5']");


    public void click_on_yourRating_in_button() {
        clickOnElement(yourRating_button);
    }
}
