package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage {
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    By addToCart_button = By.xpath("//button[@class='single_add_to_cart_button button alt']");


    public void click_on_addToCart_in_button() {
        clickOnElement(addToCart_button);
    }
}
