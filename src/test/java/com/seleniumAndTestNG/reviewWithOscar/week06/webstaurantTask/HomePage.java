package com.seleniumAndTestNG.reviewWithOscar.week06.webstaurantTask;

import com.testAppNameCucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchval")
    public WebElement searchBox;



}
