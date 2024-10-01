package test;

import driver.BaseDriver;
import org.checkerframework.checker.units.qual.N;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseDriver {


    @Test
    public void login_to_wordpress() throws InterruptedException {

        SearchPage searchPage = new SearchPage(driver);
        AdditionalInformationPage additionalInformationPage = new AdditionalInformationPage(driver);
        ReviewsPage reviewsPage = new ReviewsPage(driver);
        YourRatingPage yourRatingPage = new YourRatingPage(driver);
        YourViewPage yourViewPage = new YourViewPage(driver);
        NamePage namePage = new NamePage(driver);
        EmailPage emailPage = new EmailPage(driver);
        SaveMyNamePage saveMyNamePage = new SaveMyNamePage(driver);
        SubmitPage submitPage = new SubmitPage(driver);



        searchPage.click_on_search_in_button("Beanie");
        Assert.assertEquals(driver.getCurrentUrl(),"https://for-qa-candidate.s4-tastewp.com/?s=Beanie");
        additionalInformationPage.click_on_additional_in_button();
        reviewsPage.click_on_review_in_button();
        yourRatingPage.click_on_yourRating_in_button();
        yourViewPage.click_on_yourView_in_button();
        namePage.click_on_name_in_button();
        emailPage.click_on_email_in_button();
        saveMyNamePage.click_on_save_in_button();
        submitPage.click_on_submit_in_button();



    }
}
