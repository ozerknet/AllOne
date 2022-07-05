package com.testAppNameCucumber.pages;

import com.testAppNameCucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DicePage {
    public DicePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "typeaheadInput")
    public WebElement keywordBox;

    @FindBy(id = "google-location-search")
    public WebElement zipCodeBox;

    @FindBy(id = "totalJobCount")
    public WebElement totalJobs;



}
