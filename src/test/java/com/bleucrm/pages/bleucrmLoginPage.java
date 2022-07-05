package com.bleucrm.pages;

import com.testAppNameCucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bleucrmLoginPage {
    public bleucrmLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passWordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInButton;

    @FindBy(xpath = "//a[@id='logo_24_a']")
    public WebElement crm24Logo;

}
