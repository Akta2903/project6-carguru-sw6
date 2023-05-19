package com.carguru.pages;

import com.carguru.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    public NewAndUsedCarSearchPage()
    {
        PageFactory.initElements(driver,this);
    }
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement make;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement pageNavigationMessage;

    public String getPageNavigationMessage()
    {
        log.info("Verify New And Used Car Search" + pageNavigationMessage.toString());
        return getTextFromElement(pageNavigationMessage);
    }

    public void selectMake(String car)
    {
        selectByVisibleTextFromDropDown(make,car);
        log.info("Select the car that you want to make " + make.toString());
    }

    public void selectModel(String modelName)
    {
        selectByVisibleTextFromDropDown(model,modelName);
        log.info("Select the model " + model.toString());
    }

    public void selectLocation(String loc)
    {
        selectByVisibleTextFromDropDown(location,loc);
        log.info("Select the location " + location.toString());
    }

    public void selectPrice(String p)
    {
        selectByVisibleTextFromDropDown(price,p);
        log.info("Select the Price " + price.toString());
    }

    public void clickOnFindMyNextCarButton()
    {
        clickOnElement(findMyNextCarButton);
        log.info("Click on Find My Next Car button " + findMyNextCarButton.toString());
    }
}
