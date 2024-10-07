package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnablePageTransitionAnimation extends BasePage{
    public EnablePageTransitionAnimation(WebDriver driver) {
        super(driver);
    }

    By enablePageTransitionAnimation_button = By.xpath("(//span[@class='w-5 h-5 flex rounded-full mt-0.5 ml-0.5 transition duration-100 border-4 border-white bg-slate-200'])[1]");


    public void click_on_enablePageTransitionAnimation_in_button() {
        scrollToElement(enablePageTransitionAnimation_button);
        clickOnElement(enablePageTransitionAnimation_button);
    }
}
