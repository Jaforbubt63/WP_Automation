package test;

import driver.BaseDriver;
import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseDriver {


    @Test
    public void login_to_wordpress() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PluginPage pluginPage = new PluginPage(driver);
        WpDarkModePage wpDarkModePage = new WpDarkModePage(driver);
        WpSettingsPage wpSettingsPage = new WpSettingsPage(driver);
        AdminPanelPage adminPanelPage = new AdminPanelPage(driver);
        EnableAdminDashboardPage enableAdminDashboardPage = new EnableAdminDashboardPage(driver);
        SettingPage settingPage = new SettingPage(driver);
        DefaultPage defaultPage = new DefaultPage(driver);
        CustomizationPage customizationPage = new CustomizationPage(driver);
        CustomizationSwitchSettingsPage customizationSwitchSettingsPage = new CustomizationSwitchSettingsPage(driver);
        FloatingSwitchPage floatingSwitchPage = new FloatingSwitchPage(driver);
        FloatingSwitchStylePage floatingSwitchStylePage = new FloatingSwitchStylePage(driver);
        ClaimPage claimPage = new ClaimPage(driver);
        FloatingSwitchSizePage floatingSwitchSizePage = new FloatingSwitchSizePage(driver);
        FloatingScalePage floatingScalePage = new FloatingScalePage(driver);
        FloatingSwitchPositionPage floatingSwitchPositionPage = new FloatingSwitchPositionPage(driver);
        CustomizationSiteAnimationPage customizationSiteAnimationPage = new CustomizationSiteAnimationPage(driver);
        EnablePageTransitionAnimation enablePageTransitionAnimation = new EnablePageTransitionAnimation(driver);


        loginPage.perform_login("Admin", "Admin123");
        Assert.assertEquals(driver.getCurrentUrl(),"http://wpword.local/wp-admin/");
        pluginPage.click_on_plugin_button();
        wpDarkModePage.click_on_wpDarkMode_in_button();
        Assert.assertEquals(driver.getCurrentUrl(),"http://wpword.local/wp-admin/admin.php?page=wp-dark-mode#/frontend");
        wpSettingsPage.click_on_wpSettings_in_button();
        adminPanelPage.click_on_adminPanel_in_button();
        enableAdminDashboardPage.click_on_enableAdminDashboard_in_button();
        String enable_admin_dashboard_class = enableAdminDashboardPage.EnableAdminDashboardClassValue();
        Assert.assertTrue(enable_admin_dashboard_class.contains("bg-blue-600"));
        settingPage.click_on_setting_in_button();
        defaultPage.click_on_default_in_button();
        customizationPage.click_on_customization_in_button();
        customizationSwitchSettingsPage.click_on_customizationSwitchSetting_in_button();
        floatingSwitchPage.click_on_floatingSwitch_in_button();
        floatingSwitchStylePage.click_on_floatingSwitchStyle_in_button();
        claimPage.click_on_claim_in_button();
        floatingSwitchSizePage.click_on_floatingSwitchSize_in_button();
        floatingScalePage.click_on_floatingScale_in_button();
        floatingSwitchPositionPage.click_on_floatingSwitchPosition_in_button();
        customizationSiteAnimationPage.click_on_customizationSiteAnimation_in_button();
        enablePageTransitionAnimation.click_on_enablePageTransitionAnimation_in_button();
    }

}
