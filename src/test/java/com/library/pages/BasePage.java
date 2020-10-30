package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract  class BasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,10);

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public String getTitle(){
        return driver.getTitle();
    }


}
