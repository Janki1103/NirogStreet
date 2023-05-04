package com.example.StepDefinitions;


import java.io.IOException;

import com.example.PageObjects.ChangeNumber;
import com.example.PageObjects.ForgetPassword;
import com.example.PageObjects.HomePageNonLoggedUser;
import com.example.PageObjects.LoginWithPassword;
import com.example.PageObjects.LoginWithResendOtp;
import com.example.PageObjects.Loginwithotp;
import com.example.PageObjects.PageObjectManager;
import com.example.PageObjects.Quicklinks;

import app.constants.ApplicationConstants;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;
import com.example.PageObjects.SignUpAsDoctor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SignupLoginSteps  {
//Initialized and declared driver out side of the method to accessible for entire 
//public WebDriver driver;

	

PageObjectManager pageObjectManager; 
// Call object of other classes
TestContextSetup testContextSetup  =  new TestContextSetup();
//this.testContextSetup = new TestContextSetup();
GenericUtils genericUtils;
//Spring Framework,EJB -Cucumber dependancy injection -Cucumber PicoContainer
//Create a new TestContextSetupClass file under Utility
// Will create one constructor with the same class name
// This constructor will automatically called when we create objects of this class
// Will pass instance of TestContextSetup
// Constructor
//=========




public SignupLoginSteps ()
{
//	this.testContextSetup= testContextSetup;
}
    

    @Given("^User should be able to click on signup icon and verify the user is on signup page$")
    public void user_should_be_able_to_click_on_signup_icon() throws Throwable {
    	
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        
        signUpAsDoctor.clickOnLoginSignupButton();
        signUpAsDoctor.userIsOnSignUpPage();
      
    }
    
    @When("^User should be able to select a profession as (.+)$")
    public void user_should_be_able_to_select_a_profession_as(String profession) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.selectProfession(profession);
    }

    
    @When("^User should be able to select a title as (.+)$")
    public void user_should_be_able_to_select_a_title_as_a_title(String Title) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.selectTitle(Title);
    }

    @When("^User should be able to Enter full name as (.+)$")
    public void user_should_be_able_to_enter_full_name_as(String name) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.enterFullName(name);
    }
    @When("^User should be able to Enter mobile number$")
    public void user_should_be_able_to_enter_mobile_number() throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        // signUpAsDoctor.enterMobileNo(mobileNumber);
        //signUpAsDoctor.MobileRandom(output);
        signUpAsDoctor.generateMobileNumber();
        signUpAsDoctor.copyMobNumber();
        
    }
   
    @When("^User should be able to Enter (.+) mobile number$")
    public void user_should_be_able_to_enter_mobile_number(String mobilenumber) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.enterMobileNo(mobilenumber);
        //signUpAsDoctor.MobileRandom(output);
        // signUpAsDoctor.generateMobileNumber();
    }
    @When("^User should be able to Enter the pincode as (.+)$")
    public void user_should_be_able_to_enter_the_pincode_as(String pincode) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.enterPinCode(pincode);
    }
    
    @When("^User Should be able to set a Password as (.+)$")
    public void user_should_be_able_to_set_a_password_as(String password) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
       signUpAsDoctor.enterPassword(password);
    }

    @When("^User Should be able to set a Confrim Password as (.+)$")
    public void user_should_be_able_to_set_a_confrim_password_as(String ConfirmPassword) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.enterConfirmPassword(ConfirmPassword);
    }

    @When("^User should be able to click on GET OTP button$")
    public void user_should_be_able_to_click_on_get_otp_button() throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.clickOnGetOTPButton();
       
    }

    @When("^Popup should come and user can add OTP As (.+) (.+) (.+) (.+)$")
    public void popup_should_come_and_user_can_add_otp_as(String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
        
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
    
        signUpAsDoctor.enterOTPOne(otpone);
        signUpAsDoctor.enterOTPTwo(otptwo);
        signUpAsDoctor.enterOTPThree(otpthree);
        signUpAsDoctor.enteOTPFour(otpfour);
    }
    
    @Then("^User should get rediected to the homepage with a congratulation popup and title is (.+)$")
    public void user_should_get_rediected_to_the_homepage_with_a_congratulation_popup_and_title_is(String congratulations) throws Throwable {
        SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
        signUpAsDoctor.clickOnProceed();
        signUpAsDoctor.verifyCongratulationPopUp(congratulations);
        signUpAsDoctor.clickOnCloseButtonPopUp();
        signUpAsDoctor.terminateBrowser();
  
        
    }


@Given("Validate the browser")
public void validate_the_browser() throws IOException {
    
    genericUtils=new GenericUtils();
   
    genericUtils.initBrowser(ApplicationConstants.browser, ApplicationConstants.URL);
 

}

@Given("^User should be logged in with (.+) as a mobile number and add OTP As (.+) (.+) (.+) (.+)$")
public void user_should_be_logged_in_with_as_a_mobile_number_and_add_otp_as(String mobilenumber,String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
       
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
    signUpAsDoctor.clickOnLoginSignupButton();
    signUpAsDoctor.userIsOnSignUpPage();
    quicklinks.logginWithMob(mobilenumber,otpone, otptwo, otpthree, otpfour);
}

@When("^User should be logged in with entering mobile number and add OTP As (.+) (.+) (.+) (.+)$")
    public void user_should_be_logged_in_with_entering_mobile_number_and_add_otp_as(String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
 Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    SignUpAsDoctor signUpAsDoctor=testContextSetup.pageObjectManager.getSignUpAsDoctorPage();
    signUpAsDoctor.clickOnLoginSignupButton();
    signUpAsDoctor.userIsOnSignUpPage();
    quicklinks.login(otpone, otptwo, otpthree, otpfour);
    }


@When("^User should be able to click on Buy Medicine menu$")
public void user_should_be_able_to_click_on_buy_medicine_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnBuyMedicineMenu();
}

@When("^User should be able to click on Feed menu$")
public void user_should_be_able_to_click_on_feed_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnFeedMenu();
}

@Then("^User should be able to navigate to buy Medicine and verify that page$")
public void user_should_be_able_to_navigate_to_buy_medicine_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.userIsOnBuyMedicineMenu();
    
}

@Then("^User should be able to navigate to Feed and verify that page$")
public void user_should_be_able_to_navigate_to_feed_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyFeedMenuOpened();
   
}

@When("^User should be able to click on Community menu$")
public void user_should_be_able_to_click_on_community_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnComunityMenu();
    
}

@When("^User should be able to click on Quiz menu$")
public void user_should_be_able_to_click_on_quiz_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnQuizMenu();
   
}

@When("^User should be able to click on MyOrder menu$")
public void user_should_be_able_to_click_on_myorder_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();

    quicklinks.clickOnMyOrderMenu();    
}


@When("^User should be able to click on Webinar menu$")
public void user_should_be_able_to_click_on_webinar_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnWebinarMenu();
   
}

@When("^User should be able to click on Health Blog menu$")
public void user_should_be_able_to_click_on_health_blog_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnHealthBlogMenu();
    
}

@When("^User should be able to click on Find clinic menu$")
public void user_should_be_able_to_click_on_find_clinic_menu() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnFindclinicMenu();
    
}

@When("^User should be able to click on Find Doctor$")
public void user_should_be_able_to_click_on_find_doctor() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnFindDoctorMenu();
}
@When("^User should be able to click on Find Doctor for chemist profile$")
    public void user_should_be_able_to_click_on_find_doctor_for_chemist_profile() throws Throwable {
        Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnFindDoctorMenuChemist();
    }
@Then("^User should be able to navigate to Community and verify that page$")
public void user_should_be_able_to_navigate_to_community_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyCommunityMenuOpened();
    
}

@Then("^User should be able to navigate to Quiz and verify that page$")
public void user_should_be_able_to_navigate_to_quiz_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyQuizMenuOpened();
    
}

@Then("^User should be able to navigate to MyOrder and verify that page$")
public void user_should_be_able_to_navigate_to_myorder_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    //quicklinks.verifyMyOrderMenuOpened();
    quicklinks.openMyorderMenu();
    quicklinks.searchOrder();
    
    
}
@Then("^User should be able to navigate to MyOrder and verify that page title as a (.+)$")
    public void user_should_be_able_to_navigate_to_myorder_and_verify_that_page_title_as_a(String myorders) throws Throwable {
        Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
        quicklinks.verifyMyOrderMenuOpenedForChemist(myorders);
    }
@Then("^User should be able to navigate to MyOrder and verify that page with URL As (.+)$")
    public void user_should_be_able_to_navigate_to_myorder_and_verify_that_page_with_url_as(String myorderurl) throws Throwable {
        Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyMyOrderMenuOpenedForChemist(myorderurl);
    }

@Then("^User should be able to navigate to Webinar and verify that page$")
public void user_should_be_able_to_navigate_to_webinar_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyWebinarMenuOpened();
   
}

@Then("^User should be able to navigate to Health Blog and verify that page$")
public void user_should_be_able_to_navigate_to_health_blog_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyHealthBlogMenuOpened();   
    
}

@Then("^User should be able to navigate to Find clinic and verify that page$")
public void user_should_be_able_to_navigate_to_find_clinic_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();    
    quicklinks.verifyFindClinicMenuOpened();
      
}

@Then("^User should be able to navigate to Find clinic menu and verify that page$")
public void user_should_be_able_to_navigate_to_find_clinic_menu_and_verify_that_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyFindClinicMenuOpenedChemist();
}
    


@When("^User should be able to click on Find clinic menu with chemist$")
public void user_should_be_able_to_click_on_find_clinic_menu_with_chemist() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.clickOnFindclinicMenuWithChemist();
}

@Then("^User should be able to navigate to Find Doctor and verify that page$")
public void user_should_be_able_to_navigate_to_find_doctor_and_verify_that_page_and_go_back_to_home_page() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyFindDoctorMenuOpened();
    
}

@Then("^User should be able to verify that feed menu is not available$")
public void user_should_be_able_to_verify_that_feed_menu_is_not_available() throws Throwable {
    Quicklinks quicklinks = testContextSetup.pageObjectManager.getQuicklinks();
    quicklinks.verifyFeedNotAvialble();
}



@When("^User should be able to verify Buy Medicine menu$")
public void user_should_be_able_to_verify_buy_medicine_menu() throws Throwable {
    Loginwithotp loginwithotp = testContextSetup.pageObjectManager.getLoginwithotp();
    loginwithotp.userIsOnVerifyBuyMedicineMenufotlogin();

}



    

//ForgetPassword



@Given("^User should be able to click on Login Using Password$")
public void user_should_be_able_to_click_on_login_using_password() throws Throwable {
    
 ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
  forgetpassword.clickonLoginUsingPassword();
  
}

@Then("^User should click on Forget Password$")
public void user_should_click_on_forget_password() throws Throwable {

     ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
     forgetpassword.clickonforgetpassword();
    
}


@Given("^User should be able to click the troble get otp (.+) (.+) (.+) (.+)$")
public void user_should_be_able_to_click_the_troble_get_otp(String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
    ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
    forgetpassword.GetOtp();
   forgetpassword.enterOtpOnelogininput(otpone);
   forgetpassword.enterOtpTwologininput(otptwo);
   forgetpassword.enterOtpThreelogininput(otpthree);
   forgetpassword.enterOtpFourlogininput(otpfour);
}

@Given("^User should be able to click on proceed$")
public void user_should_be_able_to_click_on_proceed() throws Throwable {
    ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
    forgetpassword.procced();
    
}



@Given("^User should be able to click on  password(.+) setpassword$")
public void user_should_be_able_to_click_on_password_setpassword(String setpassword) throws Throwable {
   
  
    ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
    forgetpassword.setpassword(setpassword);

}

@Given("^User should be able to click on confirm password(.+) confirmpassword$")
public void user_should_be_able_to_click_on_confirm_password_confirmpassword(String confirmpassword) throws Throwable {
    ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
    forgetpassword.confirmpassword(confirmpassword);
}


@Given("^User should be able to click on save button$")
public void user_should_be_able_to_click_on_save_button() throws Throwable {
    ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
    forgetpassword.savebutton();
}   
// @Given("^User should be able to verify the new password$")
// public void user_should_be_able_to_verify_the_new_password() throws Throwable {
//     ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();

// }

@Given("^User should be able to again Login Using Password$")
    public void user_should_be_able_to_again_login_using_password() throws Throwable {
        ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
        forgetpassword.loginUsingPasswrd();
    }

 

    @Given("^User should be able to enter password(.+)password$")
    public void user_should_be_able_to_enter_passwordpassword(String password) throws Throwable {
        ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
        forgetpassword.enterPassword(password);
    }

    @Given("^User should be able to click on proceed with password$")
    public void user_should_be_able_to_click_on_proceed_with_password() throws Throwable {
        ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
        forgetpassword.proccedWithPassword();
    }

    @When("^User should be able to verify Buy Medicine menu by using login using password$")
    public void user_should_be_able_to_verify_buy_medicine_menu_by_using_login_using_password() throws Throwable {
        ForgetPassword forgetpassword = testContextSetup.pageObjectManager.getForgetPassword();
        forgetpassword.loginWithPassworduserIsOnVerifyBuyMedicineMenu();
    }

//LoginWithPassword

@When("^User clicks on I already have an account$")
public void user_clicks_on_i_already_have_an_account() throws Throwable {
    LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
    loginwithpassword.ClickOnIhaveAccountButton();
}

@Then("^User clicks on Login with Password button$")
public void user_clicks_on_login_with_password_button() throws Throwable {
 LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
  loginwithpassword.LoginWithPasswordbutton();

}

@When("^user enters the mobile number as (.+) mobile number$")
public void user_enters_the_mobile_number_as_mobile_number(String mobilenumber) throws Throwable {
    LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
    loginwithpassword.enterMobileNo(mobilenumber);
    
}
@When("^user enters the password as (.+) password$")
    public void user_enters_the_password_as_password(String Password) throws Throwable {
        LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
        loginwithpassword.enterPassword(Password);
        
    
}
@Then("^User clicks on proceed button$")
public void user_clicks_on_proceed_button() throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.clickOnProceed(); 
}



@Given("^User click on loginsignup button$")
public void user_click_on_loginsignup_button() throws Throwable {
    Loginwithotp loginwithotp = testContextSetup.pageObjectManager.getLoginwithotp();
     loginwithotp.clickOnLoginSignupButton();
}
@Given("^User should be able to click on i already have an account$")
public void user_should_be_able_to_click_on_i_already_have_an_account() throws Throwable {
  Loginwithotp loginwithotp = testContextSetup.pageObjectManager.getLoginwithotp();
  loginwithotp.clickOnIHaveAnAccount();
}
@Given("^User should be able to enter the number(.+) mobile number$")
public void user_should_be_able_to_enter_the_number_mobile_number(String mobilenumber) throws Throwable {
    Loginwithotp loginwithotp = testContextSetup.pageObjectManager.getLoginwithotp();
    loginwithotp.enterMobileInput("7980598251");
}
@Given("^User should be able to click the get otp (.+) (.+) (.+) (.+)$")
public void user_should_be_able_to_click_the_get_otp(String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
    Loginwithotp loginwithotp = testContextSetup.pageObjectManager.getLoginwithotp();
    loginwithotp.GetOtpButton();
    loginwithotp.enterOtpOnelogininput(otpone);
    loginwithotp.enterOtpTwologininput(otptwo);
    loginwithotp.enterOtpThreelogininput(otpthree);
    loginwithotp.enterOtpFourlogininput(otpfour);
}
@Then("^User should be able to click on proceed button$")
public void user_should_be_able_to_click_on_proceed_button() throws Throwable {
    Loginwithotp loginwithotp = testContextSetup.pageObjectManager.getLoginwithotp();
    loginwithotp.proccedButton();
}

// @Given("^User click on loginsignup button$")
// public void user_click_on_loginsignup_button() throws Throwable {
//     LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
//     loginWithResendOtp.clickOnLoginSignupButton();
    
// }

@Given("^User should be able to click on i have account button$")
public void user_should_be_able_to_click_on_i_have_account_button() throws InterruptedException, IOException {
    LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
    loginWithResendOtp.ClickOnIhaveAccountButton();
    
}

@Given("^User should be able to enter the number as (.+) mobile and click on otp button$")
public void user_should_be_able_to_enter_the_number_as_mobile_and_click_on_otp_button(String mobile) throws InterruptedException, IOException{
    LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
    loginWithResendOtp.EnterTheNUmber(mobile);
    loginWithResendOtp.ClickGetOtp();
   
}

@Given("^User should be able to enter the number and click on otp button$")
    public void user_should_be_able_to_enter_the_number_and_click_on_otp_button() throws Throwable {
        LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
    //loginWithResendOtp.
    loginWithResendOtp.ClickGetOtp();
    }

@Given("^User should be able to click resend otp$")
public void user_should_be_able_to_click_resend_otp() throws Throwable {
    LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
    loginWithResendOtp.ClickResendOtp();
    
}

@When("^User get resend successfull message as (.+)$")
public void user_get_resend_successfull_message_as(String resendsuccessfullymessage) throws Throwable {
    LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
    loginWithResendOtp.getResendSuccessfullyMessage(resendsuccessfullymessage);
}

@When("^user can add OTP As (.+) (.+) (.+) (.+)$")
public void user_can_add_otp_as(String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
    LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
    loginWithResendOtp.EnterOtp1(otpone);
    loginWithResendOtp.EnterOtp2(otptwo);
    loginWithResendOtp.EnterOtp3(otpthree);
    loginWithResendOtp.EnterOtp4(otpfour);
    
}


@Then("^User should be able to click on the proceed button$")
public void user_should_be_able_to_click_on_the_proceed_button() throws Throwable {
    LoginWithResendOtp loginWithResendOtp = testContextSetup.pageObjectManager.getLoginWithResendOtp();
    loginWithResendOtp.ClickProceedButton();
    loginWithResendOtp.userIsOnBuyMedicineMenu();
}
@Given("^User click on loginsignup button and redirecting to the loginsignup page and click the nirogstreet icon$")
    public void user_click_on_loginsignup_button_and_redirecting_to_the_loginsignup_page_and_click_the_nirogstreet_icon() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser(); 
        homepageloggeduser.clickOnLoginSignupButtonAndRedirectedBackToHomepage();
        
    }

    @Given("^User should be able to click on Quicklinks and back to homepage$")
    public void user_should_be_able_to_click_on_quicklinks_and_back_to_homepage() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser(); 
        homepageloggeduser.clickOnQuicklinksAndRedirectedToLoginPage();
       homepageloggeduser.clickOnBannerHomepage();
        
    }
   //Change Number
 
@When("^User Enters Mobile Number as (.+) MobileNumber$")
public void user_enters_mobile_number_as_mobilenumber(String mobilenumber) throws Throwable {
    ChangeNumber changenumber = testContextSetup.pageObjectManager.getChangeNumber();
    changenumber.enterMobileNo(mobilenumber);
  
} @When("^clicks on GET OTP button$")
public void clicks_on_get_OTP_button() throws Throwable {
    ChangeNumber changenumber = testContextSetup.pageObjectManager.getChangeNumber();
    changenumber.ClickOnGetOTPbutton();
}

@When("^User clicks on Change Number button")
public void user_clicks_on_change_number_button() throws Throwable {
    ChangeNumber changenumber = testContextSetup.pageObjectManager.getChangeNumber();
    changenumber.ClickOnChangeNumber();
}

@When("^User Enters Other Mobile Number as (.+) Other Mobile Number$")
public void user_enters_other_mobile_number_as(String othermobilenumber) throws Throwable {
    ChangeNumber changenumber = testContextSetup.pageObjectManager.getChangeNumber();
    changenumber.enterOtherMobileNo(othermobilenumber);
}

@Then("^User enters the OTP as (.+) (.+) (.+) (.+)$")
public void user_enters_the_otp_aas(String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
    ChangeNumber changenumber = testContextSetup.pageObjectManager.getChangeNumber();
    changenumber.enterOTPOne(otpone);
    changenumber.enterOTPTwo(otptwo);
    changenumber.enterOTPThree(otpthree);
    changenumber.enterOTPFour(otpfour);
}
@Then("^User clicks on Proceed button$")
public void user_clicks_on_Proceed_button() throws Throwable {
   ChangeNumber changenumber = testContextSetup.pageObjectManager.getChangeNumber();
   changenumber.clickOnProceed();
}
// HomwPageNonLoggedUSer

@Given("^User should be in home page$")
public void user_should_be_in_home_page() throws Throwable {
    HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
    homepageloggeduser.clickOnNirogStreetIcon();
}
@When("^User clicks on Buy Medicine Quicklinks and redirected to the signup page$")
    public void user_clicks_on_buy_medicine_quicklinks_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnBuyMedicineQuickLink();
        homepageloggeduser.userIsOnSignUpPage();
    }
    @When("^User clicks on Feed Quicklinks and redirected to the signup page$")
    public void user_clicks_on_feed_quicklinks_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnFeedQuickLink();
        homepageloggeduser.userIsOnSignUpPage();  
    }
    @When("^User clicks on Quiz Quicklinks and redirected to the signup page$")
    public void user_clicks_on_quiz_quicklinks_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnQuizQuicklink();
        homepageloggeduser.userIsOnSignUpPage();
    }
    @Then("^User search for clinic as (.+)$")
    public void user_search_for_clinic_as(String clinicname) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.searchForAClinic(clinicname);
    }
    // @Then("^User search for clinic as (.+)$")
    // public void user_search_for_clinic_as(String clinicname) throws Throwable {
    //     HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
    //     homepageloggeduser.searchForAClinic(clinicname);
    // }
    @When("^User clicks on My Orders Quicklinks and redirected to the signup page$")
    public void user_clicks_on_my_orders_quicklinks_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnMyOrdersQuickLink();
        homepageloggeduser.userIsOnSignUpPage(); 
    }
    @When("^User clicks on VaidyaTool Quicklinks and redirected to the signup page$")
    public void user_clicks_on_vaidyatool_quicklinks_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnVaidyaToolQuickLink();
        homepageloggeduser.userIsOnSignUpPage();
    }
    
    @When("^User clicks on Communities Quicklinks and redirected to the signup page$")
    public void user_clicks_on_communities_quicklinks_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnCommunityQuickLink();
        homepageloggeduser.userIsOnSignUpPage();
    }
    @When("^User clicks on HealthBlogs Quicklinks and redirected to the healthBlog page$")
    public void user_clicks_on_healthblogs_quicklinks_and_redirected_to_the_healthblog_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnHealthBlogsQuickLink(); 
    }
        @Then("^User goes to home page$")
        public void user_goes_to_home_page() throws Throwable {
            HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
            homepageloggeduser.GotoHomePage();  
        }
    
    @When("^User clicks on Find Clinics QuickLink and redirected to the find clinic page$")
    public void user_clicks_on_find_clinics_quicklink_and_redirected_to_the_find_clinic_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnFindClinics();
        
    }
    @When("^User clicks on All medicines Link$")
    public void user_clicks_on_all_medicines_link() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickonAllMedicineLink();
        
    }
    @Then("^User clicks on Get The Best Price Button in patented and redirected to the signup page$")
    public void user_clicks_on_get_the_best_price_button_in_patented_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickongetthepricepatened();
        homepageloggeduser.userIsOnSignUpPage();
    }
    @Then("^User clicks on Get The Best Price Button and redirected to the signup page$")
    public void user_clicks_on_get_the_best_price_button_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickongetthepricepatened();
        homepageloggeduser.userIsOnSignUpPage();
        
    }
    @Then("^User clicks on Get The Best Price Button for brand and redirected to the signup page$")
    public void user_clicks_on_get_the_best_price_button_for_brand_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickongetThebestpriceBrand();
        homepageloggeduser.userIsOnSignUpPage();
    }
    

    @When("^User clicks on Find Doctors QuickLink and redirected to the Doctors list page$")
    public void user_clicks_on_find_doctors_quicklink_and_redirected_to_the_doctors_list_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnFindDoctors();
    }
    @Then("^User search for a Doctor as (.+)$")
    public void user_search_for_a_doctor_as(String doctorname) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.enterDoctorName(doctorname); 
    }
    @When("^User clicks on Brandlink and enters a Brand$")
    public void user_clicks_on_brandlink_and_enters_a_brand() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.selectBrandName();
    }
    // @When("^User clicks on Brandlink and enters a Brand (.+)$")
    // public void user_clicks_on_brandlink_and_enters_a_brand() throws Throwable {
    //     HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
    //     homepageloggeduser.selectBrandName();
        

    
    @When("^User clicks on universal search and enter a medicine as (.+)$")
    public void user_clicks_on_universal_search_and_enter_a_medicine_as(String medname) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnSearchBarOnHomePage(medname); 
    }
    
    @Then("^User clicks on Get the Best Price Button and redirected to the signup page$")
    public void user_clicks_on_get_best_price_button_and_redirected_to_the_signup_page() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnGettheBestPrice();
        homepageloggeduser.userIsOnSignUpPage();
    }
    @When("^User clicks on Need help button$")
    public void user_clicks_on_need_help_button() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnNeedHelpButton();
    }
    @Then("^User Enters the Full Name as (.+)$")
    public void user_enters_the_full_name_as(String fullname) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.enterFullNameinNeedHelp(fullname);
    
    }
    @Then("^User Enters the Mobile Number as (.+)$")
    public void user_enters_the_mobile_number_as(String mobilenumber) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.enterMobileNumberNeedHelp(mobilenumber);

    }
    @Then("^User Enters Email as (.+)$")
    public void user_enters_email_as(String email) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.enterEmail(email);
    }
    
    @Then("^User Enters the Message as (.+)$")
    public void user_enters_the_message_as(String message) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.enterMessage(message);
    
    }@Then("^User clicks on send button and verify the success message as (.+)$")
    public void user_clicks_on_send_button_and_verify_the_success_message_as(String successalertmessage) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnSend(successalertmessage);
    }
    @When("^User clicks on Classic Medicine and enters a classic mediicne as (.+)$")
    public void user_clicks_on_classic_medicine_and_enters_a_classic_mediicne_as(String classicmedicine) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnClassicMedicine(classicmedicine);
    }
    @When("^User clicks on Patented Medicine and selects a medicine as (.+)$")
    public void user_clicks_on_patented_medicine_and_selects_a_medicine_as(String patentedmedicine) throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnPatentedMedicine(patentedmedicine);
    }@When("^User clicks on Offers$")
    public void user_clicks_on_offers() throws Throwable {
        HomePageNonLoggedUser homepageloggeduser = testContextSetup.pageObjectManager.getHomePageNonLoggedUser();
        homepageloggeduser.clickOnOffers();
    }
        
}

    
