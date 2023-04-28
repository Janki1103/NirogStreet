package com.example.PageObjects;
import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ChangeNumber extends GenericUtils{
    
    PropertyFileOperations locators;
    public WebDriver driver;
    
    public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(ChangeNumber.class);
    
    
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public ChangeNumber() throws IOException {
   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }   

    public void clickOnLoginSignupButton() throws InterruptedException{
        clickOnElement(locators.getKey("LoginSignUp_Button"));
        
    }
    
    public void ClickOnIhaveAccountButton() throws InterruptedException{
        clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));   
    }
    public void enterMobileNo(String mobilenumber){
        enterText(locators.getKey("Mobile_input"), mobilenumber);

}
public void ClickOnGetOTPButton(){
    clickOnElement(locators.getKey("GetOTP_button"));
}
public void ClickOnChangeNumber(){
    verifyVisibility(locators.getKey("Change_NumberButton"));
    clickOnElement(locators.getKey("Change_NumberButton"));
}
public void enterOtherMobileNo(String othermobilenumber){
    enterText(locators.getKey("Mobile_input"), othermobilenumber);
}
public void ClickOnGetOTPbutton(){
    clickOnElement(locators.getKey("GetOTP_button_login"));
}


public void enterOTPOne(String OTPOne)
{
    enterText(locators.getKey( "OTPoneOnChangeNumber"), OTPOne);
}

public void enterOTPTwo(String OTPTwo)
{
    enterText(locators.getKey( "OTPtwoOnChangeNumber"), OTPTwo);
}

public void enterOTPThree(String OTPThree)
    {
        enterText(locators.getKey( "OTPthreeOnChangeNumber"), OTPThree);
    }


public void enterOTPFour(String OTPFour){

        enterText(locators.getKey( "OTPfourOnChangeNumber"), OTPFour);
        
    }


public void clickOnProceed(){
        clickOnElement(String.format(locators.getKey("Procced_Button")));
        log.info("STEP:Clicked on procced button Successfully" + "OTPProceedButton");

    }
}
