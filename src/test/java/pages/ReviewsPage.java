package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewsPage extends BasePage{
    public ReviewsPage(WebDriver driver) {
        super(driver);
    }

    By review_button = By.xpath("//a[normalize-space()='Reviews (0)']");


    public void click_on_review_in_button() {
        clickOnElement(review_button);
    }
}
