package com.testAppNameCucumber.pages;

import com.testAppNameCucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ZerobankMainPage {
    public ZerobankMainPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='online-banking']")
    public WebElement morServicesButton;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillButton;

    @FindBy(xpath = "//select[@id='sp_payee']")
    public WebElement payeeList;

    @FindBy(xpath = "//select[@id='sp_account']")
    public WebElement accountList;



 }
