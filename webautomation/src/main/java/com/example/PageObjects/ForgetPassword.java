package com.example.PageObjects;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ForgetPassword extends GenericUtils {
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(ForgetPassword.class);

 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
    }
public ForgetPassword() throws IOException {

    //this.driver=getDriver();
   
}

public  WebDriver getDriver() {
    return driverThread.get();
}
public void clickOnLoginSignupButton(){
      
    clickOnElement(locators.getKey("LoginSignUp_Button"));

}
public void clickOnIHaveAnAccount(){
    scrollTillElementDisplay(locators.getKey("ClickAlreadyAccounts_button"));
    clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));
    //log.info("STEP:Click on I already have an account successfully" + "Ialreadyhaveanaccount");

}

public void clickonLoginUsingPassword(){
    clickOnElement(locators.getKey("Login_Using_Password"));
    
}
public void clickonforgetpassword(){
    clickOnElement(locators.getKey("Forget_Password"));
    
}

public void enterMobileInput(String MobileNumber) throws InterruptedException{
enterText(locators.getKey("Mobile_input"),MobileNumber);
}
public void GetOtp() throws InterruptedException{
    clickOnElement(locators.getKey("Get_OTP"));
     

 }
 public void  enterOtpOnelogininput(String OtpOne) throws InterruptedException{
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
 public void procced() throws InterruptedException{
    clickOnElement(locators.getKey("Procced_button"));
     
 }
 
 public void setpassword(String setpassword){
    enterText(locators.getKey("Set_password"),setpassword);
 }

 public void confirmpassword(String confirmpassword){
    enterText(locators.getKey("Confirm_password"),confirmpassword);
 }


public void savebutton(){
    clickOnElement(locators.getKey("Save_button"));
    log.info("STEP:Click on Save Button Successfully" + "Save_button");
}

public void loginUsingPasswrd(){
    verifyVisibility(locators.getKey("Login_Using_Password"));
    clickOnElement(locators.getKey("Login_Using_Password"));
    log.info("STEP:Click on login using password" + "Login_Using_Password");

}

public void enterPassword(String password){
   enterText(locators.getKey("Enter_Password"),password);
   

}
public void proccedWithPassword(){
    clickOnElement(locators.getKey("Proceed_With_Password"));
}


public void loginWithPassworduserIsOnVerifyBuyMedicineMenu() {
    boolean test = isElementDisplay(locators.getKey("AllMedicines_header"));
    if (test) {
        log.info("STEP: " + "AllMedicines_header" + " is present on buy medicineine page");
    } else {
        log.info("STEP: " + "AllMedicines_header" + " is not present on buy medicationine page");
    }
}

}



    


    

