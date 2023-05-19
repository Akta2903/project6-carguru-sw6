package com.carguru.pages;

import com.carguru.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buySell;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCar;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement used;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealerLink;

    public void mouseHoverOnBuySell()
    {
        mouseHoverToElement(buySell);
        log.info("Mouse hover on buy + sell " + buySell.toString());
    }

    public void mouseHoverOnSearchCarsAndClick()
    {
        mouseHoverToElementAndClick(searchCar);
        log.info("Mouse hover on Search Cars And Click " + searchCar.toString());
    }

    public void mouseHoverOnUsedAndClick()
    {
        mouseHoverToElementAndClick(used);
        log.info("Mouse hover and click on Used " + used.toString());
    }

    public void mouseHoverOnFindADealerAndClick()
    {
        mouseHoverToElementAndClick(findDealerLink);
        log.info("Mouse Hover on Find a Dealer link and click " + findDealerLink.toString());
    }


}
