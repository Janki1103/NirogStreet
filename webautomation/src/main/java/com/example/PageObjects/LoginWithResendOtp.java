package com.example.PageObjects;


import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoginWithResendOtp extends GenericUtils{
    
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(LoginWithResendOtp.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public LoginWithResendOtp() throws IOException {

    // this.driver=getDriver();
   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }   

    public void clickOnLoginSignupButton() throws InterruptedException{
        clickOnElement(locators.getKey("LoginSignUp_Button"));
        // LoginSignUp_Button.click(); 
        // Thread.sleep(3000);
        // return LoginSignUp_Button;   
    }
    

    public void ClickOnIhaveAccountButton() throws InterruptedException{
        scrollDown();
        verifyVisibility(locators.getKey("ClickAlreadyAccounts_button"));
        clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));
        
        // Click_On_Ihave_Account_Button.click();
        // return Click_On_Ihave_Account_Button;
    }

    // @FindBy (xpath ="//input[@name='mobile_Email']")
    // private WebElement EnterNumber;

    public void EnterTheNUmber(String Mobile) throws InterruptedException{
        verifyVisibility(locators.getKey("Mobile_input"));
        enterText(locators.getKey( "Mobile_input"),Mobile);
        // Thread.sleep(3000);
        // EnterNumber.sendKeys("9899563884");
        // return EnterNumber;
    }

    // @FindBy (xpath = "(//button[@data-automation='get-otp-button'])[2]")
    // private WebElement Click_Get_Otp;
    public void ClickGetOtp() throws InterruptedException{
        clickOnElement(locators.getKey("GetOTP_button_login"));
        // Thread.sleep(3000);
        // Click_Get_Otp.click();
        // return Click_Get_Otp;
    }

    // @FindBy(xpath = "(//input[@aria-label='Please enter verification code. Digit 1'])[2]")
    // private WebElement Enter_otp1;
    public void EnterOtp1(String OtpOne) throws InterruptedException{
        enterText(locators.getKey("OTPOne_login_input"),OtpOne);
        // Thread.sleep(3000);
        // Enter_otp1.sendKeys("1");
        // return Enter_otp1;
    }

    // @FindBy(xpath = "(//input[@aria-label='Digit 2'])[2]")
    // private WebElement Enter_Otp2;
    
    public void EnterOtp2(String OtpTwo) throws InterruptedException{
        enterText(locators.getKey("OTPTwo_login_input"),OtpTwo);

        // Thread.sleep(3000);
        // Enter_Otp2.sendKeys("2");
        // return Enter_Otp2;
    }

    // @FindBy(xpath = "(//input[@aria-label='Digit 3'])[2]")
    // private WebElement Enter_Otp3;

    public void EnterOtp3(String OtpThree) throws InterruptedException{
        enterText(locators.getKey("OTPThree_login_input"),OtpThree);
        // Thread.sleep(3000);
        // Enter_Otp3.sendKeys("3");
        // return Enter_Otp3;
    }

    // @FindBy(xpath = "(//input[@aria-label='Digit 4'])[2]")
    // private WebElement Enter_Otp4;

    public void EnterOtp4(String OtpFour) throws InterruptedException{
        enterText(locators.getKey("OTPFour_login_input"),OtpFour);

        // Thread.sleep(3000);
        // Enter_Otp4.sendKeys("4");
        // return Enter_Otp4;

    }

    // @FindBy (xpath ="(//button[@data-automation='resend-otp-button'])[2]")
    // private WebElement Click_Resend_Otp;

    public void ClickResendOtp() throws InterruptedException{
        clickOnElement(locators.getKey("Click_Resend_Otp"));
    }

    public void getResendSuccessfullyMessage(String resendSuccessfullyMessage ){
        verifyText(locators.getKey("ResendOtp_SucessfullyMessage"), resendSuccessfullyMessage);
    }

    public void ClickProceedButton() throws InterruptedException{
        clickOnElement(locators.getKey("Procced_button"));
        // Thread.sleep(2000);
        // Click_Proceed_Button.click();
        // return Click_Proceed_Button;
    }

    public void userIsOnBuyMedicineMenu() {
		boolean test = isElementDisplay(locators.getKey("AllMedicines_header"));
		if (test) {
			log.info("STEP: " + "AllMedicines_header" + " is present on buy medicineine page");
		} else {
			log.info("STEP: " + "AllMedicines_header" + " is not present on buy medicationine page");
		}
	}

    
    




}
