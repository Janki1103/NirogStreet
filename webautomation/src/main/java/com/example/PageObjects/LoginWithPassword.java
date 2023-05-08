package com.example.PageObjects;
import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoginWithPassword extends GenericUtils{
    
    PropertyFileOperations locators;
    public WebDriver driver;
    
    public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(LoginWithPassword.class);
    
    
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public LoginWithPassword() throws IOException {

   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }   

    public void clickOnLoginSignupButton() throws InterruptedException{
        clickOnElement(locators.getKey("LoginSignUp_Button"));
        log.info("STEP:Click on loginsignup button Successfully" + "LoginSignUp_Button");
    }
    

    public void ClickOnIhaveAccountButton() throws InterruptedException{
        scrollDown();
        verifyVisibility(locators.getKey("ClickAlreadyAccounts_button"));
        clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));  
        log.info("STEP:Click on I have already accpunt button Successfully" + "ClickAlreadyAccounts_button"); 
    }


    public void LoginWithPasswordbutton() {
        clickOnElement(locators.getKey("LoginWithPassword_button"));
        log.info("STEP:Click on Login With Password Successfully" + "LoginWithPassword_button");
    }


    public void enterMobileNo(String mobilenumber){
        
       // verifyVisibility(locators.getKey("EnterPassword"));
       enterText(locators.getKey("Mobile_input"), mobilenumber);
       log.info("STEP:Enter mobile number successfully" + "Mobile_input");
      
 }

    public void enterPassword(String Password){

       enterText(locators.getKey("EnterPassword"),Password);
       log.info("STEP:Enter password successfully" + "EnterPassword");
 }

     public void clickOnProceed(){
       clickOnElement(locators.getKey("Proceed_button2"));
       log.info("STEP:Click on proceed button Successfully" + "Proceed_button2");
 }
}
