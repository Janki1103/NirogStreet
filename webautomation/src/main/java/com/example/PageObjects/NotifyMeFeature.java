package com.example.PageObjects;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotifyMeFeature extends GenericUtils{
    private static final String Brand = null;
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(NotifyMeFeature.class);
       
    {
        locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
        log.info("STEP: Assets Page Locators loaded into memory");
    }
    public NotifyMeFeature() throws IOException {
       
    }
        public  WebDriver getDriver() {
            return driverThread.get();
        }   
    
        public void clickOnLoginSignupButton() throws InterruptedException{
            clickOnElement(locators.getKey("LoginSignUp_Button"));
            log.info("STEP: Clicked on signup button successfully");
            
        }
        public void ClickOnIhaveAccountButton() throws InterruptedException{
            clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));
            log.info("STEP: Clicked on Already have an account button successfully");  
        }
    
    
        public void LoginWithPasswordbutton() {
            clickOnElement(locators.getKey("LoginWithPassword_button"));
            log.info("STEP: Clicked on loginwith password successfully");
        }
    
    
        public void enterMobileNo(String mobilenumber){
           enterText(locators.getKey("Mobile_input"),mobilenumber);
           log.info("STEP: Entered Mobile Number successfully");
     }
    
        public void enterPassword(String Password){
           enterText(locators.getKey("EnterPassword"),Password);
           log.info("STEP: Entered Password successfully");
     }
    
         public void clickOnProceed(){
           clickOnElement(locators.getKey("Proceed_button"));
           log.info("STEP: Loggedin successfully + Loggedin");
     }

     public void clickOnAllMedicineButton(){
        clickOnElement(locators.getKey("AllMedicines_header"));
        scrollDown();
     }
   
     public void clickOnMedicineDetail(){
        clickOnElement(locators.getKey("MedicineDetail"));
     }
     public void clickOnMedicineDetails(){
        clickOnElement(locators.getKey("MedicineDetail"));
     }

    public void clickOnNotifyMe(){
        scrollDown150();
        wait(2000);
        clickOnElement(locators.getKey("NotifyMeButton")); 

    }

    public void clickonQuantityBox(){
        verifyVisibility(locators.getKey("QuantityButton"));

        clickOnElement(locators.getKey("QuantityButton"));

    }

    public void enterQuantity(String Quantity){
        verifyVisibility(locators.getKey("QuantityButton"));
        enterText(locators.getKey("QuantityButton"),Quantity);

    }
    public void enterQuantityforOOS(String Quantity){
        verifyVisibility(locators.getKey("QuantityButtonNotifyMe"));
        enterText(locators.getKey("QuantityButtonNotifyMe"), Quantity);
    }

    public void enterQuantityOOS(String Quantity){
        verifyVisibility(locators.getKey("QuantityNotifyMe"));
        enterText(locators.getKey("QuantityNotifyMe"), Quantity);
    }

    public void clickOnSave(){
        clickOnElement(locators.getKey("SaveButton"));
    }
    public void seeTheAlertMsg(String AlertNotifyMeSent){
   verifyText(locators.getKey("SuccessfullyAddedMsg"), AlertNotifyMeSent);
        
   
    }
    public void verifyTheAlertMsg(String AlertNotifyMeSent){
        verifyText(locators.getKey("AlertMessage_NeedHelp"), AlertNotifyMeSent);
    }

//     public void notificationSentforNotifyMe(){
//         boolean test = isElementDisplay(locators.getKey("Profession_Input"));
//     if (test) {
//         log.info("STEP: " + "Profession" + " is present on sign up screen");
//     } else {
//         log.info("STEP: " + "Profession" + " is not present on sign up screen");
//     }
//     }
}

