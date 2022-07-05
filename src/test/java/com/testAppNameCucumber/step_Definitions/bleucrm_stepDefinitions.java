package com.testAppNameCucumber.step_Definitions;

import com.bleucrm.pages.bleucrmLoginPage;
import com.testAppNameCucumber.utilities.BrowserUtils;
import com.testAppNameCucumber.utilities.ConfigurationReader;
import com.testAppNameCucumber.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class bleucrm_stepDefinitions {

    bleucrmLoginPage bleucrmLoginPage = new bleucrmLoginPage();

    @When("user go to bleucrm login page")
    public void user_go_to_bleucrm_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bleuCrm_url"));

    }

    @When("user enter username and password and click login")
    public void user_enter_username_and_password_and_click_login() {
        bleucrmLoginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("bleuCrm_userName"));
        bleucrmLoginPage.passWordInput.sendKeys(ConfigurationReader.getProperty("bleuCrm_passWord"));
        bleucrmLoginPage.logInButton.click();

    }

    @Then("check user successfully login")
    public void checkUserSuccessfullyLogin() {
        Assert.assertTrue(bleucrmLoginPage.crm24Logo.isDisplayed());
    }


}
