package com.example.PageObjects;


import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SignUpAsDoctor extends GenericUtils {
   
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(SignUpAsDoctor.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
 
 public SignUpAsDoctor(WebDriver driver) throws IOException {
	 this.driver=getDriver();
 }

public SignUpAsDoctor() throws IOException {

    // this.driver=getDriver();
   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }
   
    public void clickOnLoginSignupButton() throws InterruptedException {
       
        clickOnElement(String.format(locators.getKey("LoginSignUp_Button")));
        log.info("STEP:Click on login sign up button Successfully" + "LoginSignUp_Button");

   }

   public void userIsOnSignUpPage()  {
    boolean test = isElementDisplay(locators.getKey("Profession_Input"));
    if (test) {
        log.info("STEP: " + "Profession" + " is present on sign up screen");
    } else {
        log.info("STEP: " + "Profession" + " is not present on sign up screen");
    }
}

    public void  selectProfession(String profession)  {
        selectDropDown(locators.getKey( "Profession_Input"), profession);
   
               }
    
    
    public void selectTitle(String title) {
        selectDropDown(locators.getKey( "title_input"), title);
        
    }

   

    public void enterFullName(String fullname_input) {
        enterText(locators.getKey( "fullname_input"), fullname_input);
    }

    public void enterMobileNo(String mobileNo_input) {
        enterText(locators.getKey( "mobileNo_input"), mobileNo_input);
             
    }

    public void enterRandomMobileNo(String mobileNo_input , String output) {
       // enterText(locators.getKey( "mobileNo_input"), mobileNo_input);
        output="";
        enterText(locators.getKey( "mobileNo_input"),output);
        
    }



    public void enterPinCode(String pinCode_input) {
        enterText(locators.getKey( "pinCode_input"), pinCode_input);
             

}


public void enterPassword(String password_input){
    enterText(locators.getKey( "password_input"), password_input);
}


public void enterConfirmPassword(String confirm_password_input){
    enterText(locators.getKey( "confirm_password_input"), confirm_password_input);

}

public void  clickOnGetOTPButton() { 
    scrollDown();
    scrollDown();
    scrollDown();
    verifyVisibility(locators.getKey("getOTP_button_signup"));
    clickOnElementfor(String.format(locators.getKey("getOTP_button_signup")));
    log.info("STEP:Click on GetOTP button Successfully" + "getOTP_button_signup");

}

public void enterOTPOne(String OTPOne)
{
    enterText(locators.getKey( "OTPOne"), OTPOne);
}

public void enterOTPTwo(String OTPTwo)
{
    enterText(locators.getKey( "OTPTwo"), OTPTwo);
}


    public void enterOTPThree(String OTPThree)
    {
        enterText(locators.getKey( "OTPThree"), OTPThree);
    }


    public void enteOTPFour(String OTPFour){

        enterText(locators.getKey( "OTPFour"), OTPFour);
        
    }

    public void clickOnProceed(){
        verifyVisibility(locators.getKey("OTProceedButton"));
        clickOnElement(locators.getKey("OTProceedButton"));

       // clickOnElement(String.format(locators.getKey("OTProceedButton")));
        System.out.println("Proceed Button Clicked!!");
        log.info("STEP:Click on procced button Successfully" + "OTProceedButton");

    }

    public void verifyCongratulationPopUp(String actualMessage)
    {
        verifyVisibility(locators.getKey("congratulationsHeder"));
       // verifyTextForCongrtualtionsPopup(locators.getKey("congratulationsHeder"), actualMessage);
        verifyText(locators.getKey("congratulationsHeder"), actualMessage);

    }
    
    public void clickOnCloseButtonPopUp(){
    clickOnElement(String.format(locators.getKey("closeButtonPopup")));
    log.info("STEP:Click on close icon for closing the popup " + "closeButtonPopup");

    }
    public void logout() throws InterruptedException{
       mouseOver(String.format(locators.getKey("profile_icon")));
       scrollTillElementDisplay(locators.getKey("logout"));
       clickOnElement(locators.getKey("logout"));
    }

    public void generateMobileNumber(){
        MobileRandom(locators.getKey("mobileNo_input"));
        log.info("STEP:Enter mobile number successfully" + "mobileNo_input");
    }

    public void copyMobNumber(){
        CopymobileNumber(locators.getKey("mobileNo_input"));
    }
    public void refrenceMobNumber(){
        pasteMobNumber(locators.getKey("MobileSearch_input"));
    }
}