package com.carguru.pages;

import com.carguru.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsForSalePage extends Utility {

    public UsedCarsForSalePage()
    {
        PageFactory.initElements(driver,this);
    }

    private final static Logger log = LogManager.getLogger(UsedCarsForSalePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Used Cars For Sale")
    WebElement usedCarsPageNavigationMessage;

    public String getUsedCarsPageNavigationMessage()
    {
        log.info("Verify 'Used Cars For Sale ' is displayed " + usedCarsPageNavigationMessage.toString());
        return getTextFromElement(usedCarsPageNavigationMessage);
    }

}
