package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimPage extends BasePage {
    public ClaimPage(WebDriver driver) {
        super(driver);
    }

    By claim_button = By.xpath("//span[@class='close-promo']");


    public void click_on_claim_in_button() {
        clickOnElement(claim_button);
    }
}
