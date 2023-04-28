package com.example.PageObjects;    

import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loginwithotp extends GenericUtils {
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(Loginwithotp.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
    }
public Loginwithotp() throws IOException {

    // this.driver=getDriver();
   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }

    public void clickOnLoginSignupButton(){
      
        clickOnElement(locators.getKey("LoginSignUp_Button"));

       // log.info("STEP:Click on signup button");
    }

   
    public void clickOnIHaveAnAccount(){

        scrollDown();
       scrollDown();
       scrollDown();
       scrollDown();
        // scrollTillElementDisplay(locators.getKey("ClickAlreadyAccounts_button"));
        clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));
        //log.info("STEP:Click on I already have an account successfully" + "Ialreadyhaveanaccount");

    }

    public void enterMobileInput(String MobileNumber) throws InterruptedException{
        
    enterText(locators.getKey("Mobile_input"),MobileNumber);
   
       
    }

    public void GetOtpButton() throws InterruptedException{
       clickOnElement(locators.getKey("GetOTP_button_login"));
        

    }
    public void  enterOtpOnelogininput(String OtpOne) throws InterruptedException{
        verifyVisibility(locators.getKey("OTPOne_login_input"));

       enterText(locators.getKey("OTPOne_login_input"), OtpOne);
        

    }

    public void enterOtpTwologininput(String OtpTwo) throws InterruptedException{
        enterText(locators.getKey("OTPTwo_login_input"),OtpTwo );
      
        

    }
    public void enterOtpThreelogininput(String OtpThree) throws InterruptedException{
           enterText(locators.getKey("OTPThree_login_input"), OtpThree);
       
    
    }

    public void enterOtpFourlogininput(String OtpFour) throws InterruptedException{
       enterText(locators.getKey("OTPFour_login_input"),OtpFour);
       
        
    }

    public void proccedButton() throws InterruptedException{
        verifyVisibility(locators.getKey("Procced_button"));

       clickOnElement(locators.getKey("Procced_button"));
     
    }

    public void userIsOnVerifyBuyMedicineMenufotlogin() {
		boolean test = isElementDisplay(locators.getKey("AllMedicines_header"));
		if (test) {
			log.info("STEP: " + "AllMedicines_header" + " is present on buy medicineine page");
		} else {
			log.info("STEP: " + "AllMedicines_header" + " is not present on buy medicationine page");
		}
	}
    
}

    
