package com.example.StepDefinitions;

import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;
import com.example.PageObjects.VerificationWithDoctor;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileverificationSteps {
    
//Initialized and declared driver out side of the method to accessible for entire 
//public WebDriver driver;


PageObjectManager pageObjectManager; 
// Call object of other classes
//TestContextSetup testContextSetup;
TestContextSetup testContextSetup  =  new TestContextSetup();
GenericUtils genericUtils;
//Spring Framework,EJB -Cucumber dependancy injection -Cucumber PicoContainer
//Create a new TestContextSetupClass file under Utility
// Will create one constructor with the same class name
// This constructor will automatically called when we create objects of this class
// Will pass instance of TestContextSetup
// Constructor
//=========


//public ProfileverificationSteps (TestContextSetup testContextSetup)
//{
//	this.testContextSetup= testContextSetup;
//}

public ProfileverificationSteps ()
{
	//this.testContextSetup= testContextSetup;
}

@Then("^User verify congratulation popup and title is (.+)$")
public void user_verify_congratulation_popup_and_title_is(String congratulations) throws Throwable {
      VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
      verificationWithDoctor.clickOnProceed();
      verificationWithDoctor.verifyCongratulationPopUp(congratulations);
      verificationWithDoctor.clickOnCloseButtonPopUp();

    }

    @When("^User click on add to cart button then (.+) attention popup should display$")
    public void user_click_on_add_to_cart_button_then_attention_popup_should_display(String attention) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.clickonBuyMedicineMenu();
        verificationWithDoctor.pageRefresh();
        verificationWithDoctor.clickOnMyOrderMenu();
        verificationWithDoctor.clickonBuyMedicineMenu();
        verificationWithDoctor.scrollUptoAddToCart();
       //verificationWithDoctor.pageRefresh();
       // verificationWithDoctor.scrollUptoAddToCart();
        verificationWithDoctor.clickOnAddToCart();
        verificationWithDoctor.verifyAttentionPopup(attention);
        verificationWithDoctor.clickOnContinueWithVerification();
       // verificationWithDoctor.clickOnContinueWithVerification();
    }

    @When("^User click on create post button on feed menu then (.+) attention popup should display$")
    public void user_click_on_create_post_button_on_feed_menu_then_attention_popup_should_display(String attention) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        
        verificationWithDoctor.clickonCreatePostButton();
        verificationWithDoctor.verifyAttentionPopup(attention);
        verificationWithDoctor.clickOnContinueWithVerification();
       // verificationWithDoctor.clickOnContinueWithVerification();
    }

    @When("^user click on community menu then (.+) attention popup should display$")
    public void user_click_on_community_menu_then_attention_popup_should_display(String attention) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.clickOnCommunityMenu();
        verificationWithDoctor.verifyAttentionPopup(attention);
        verificationWithDoctor.clickOnContinueWithVerification();
       // verificationWithDoctor.clickOnContinueWithVerification();

    }

    @When("^user click on quiz menu and click on take quiz button then (.+) attention popup should display$")
    public void user_click_on_quiz_menu_and_click_on_take_quiz_button_then_attention_popup_should_display(String attention) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.clickOnTakeQuiz();
        verificationWithDoctor.verifyAttentionPopup(attention);
        verificationWithDoctor.clickOnContinueWithVerification();
        //verificationWithDoctor.clickOnContinueWithVerification();
        
    }
   
    // @When("^user should enter registeration details (.+) as a council name (.+) as a registeration number and (.+) as a year$")
    // public void user_should_enter_registeration_details_as_a_council_name_as_a_registeration_number_and_as_a_year(String counilname, String registerationnumber, String year) throws Throwable {
    //     VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
    //     verificationWithDoctor.scrollTillCouncilName();
    //     verificationWithDoctor.scrollup();
    //     verificationWithDoctor.wait(3000);
    //     verificationWithDoctor.selectCouncilName(counilname);
    //     verificationWithDoctor.enterRegisterationNumber();
    //     verificationWithDoctor.enterRegisterationYear(year);
    // }

    @When("^user should enter registeration details (.+) as a council name and enter registeration number and (.+) as a year$")
    public void user_should_enter_registeration_details_as_a_council_name_and_enter_registeration_number_and_as_a_year(String counilname, String year) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.scrollTillCouncilName();
        verificationWithDoctor.scrollup();
        verificationWithDoctor.wait(3000);
        verificationWithDoctor.selectCouncilName(counilname);
        verificationWithDoctor.enterRegisterationNumber();
        verificationWithDoctor.enterRegisterationYear(year);
    }
    @When("^user upload a file and click on to the the save button$")
    public void user_upload_a_file_and_click_on_to_the_the_save_button() throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.scrollDown();
        verificationWithDoctor.uploadDegree();
        verificationWithDoctor.wait(2000);
      //  verificationWithDoctor.scrollDown();
        verificationWithDoctor.clickOnSaveForDocRegister();
        verificationWithDoctor.wait(2000);
    }
    @When("^user upload a pan file and click on to the the save button$")
    public void user_upload_a_pan_file_and_click_on_to_the_the_save_button() throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.scrollDown();
        verificationWithDoctor.uploadpancard();
        verificationWithDoctor.wait(2000);
        verificationWithDoctor.clickOnSaveForDocRegister();
    }

    @When("^user upload a collage ID file and click on to the the save button$")
    public void user_upload_a_collage_id_file_and_click_on_to_the_the_save_button() throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.scrollDown();
        verificationWithDoctor.uploadcollageID();
        verificationWithDoctor.scrollDown150();
        verificationWithDoctor.wait(2000);
        verificationWithDoctor.scrollDown150();
        verificationWithDoctor.clickOnSaveForDocRegisterForStudent();

    }

    @When("^User click on add to cart button then (.+)Document Review message popup should display$")
    public void user_click_on_add_to_cart_button_then_document_review_message_popup_should_display(String documentreview) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
      //  verificationWithDoctor.verifyDocumentReviewMessage(documentreview);
        //verificationWithDoctor.clickOnCloseButtonPopUp();
        verificationWithDoctor.clickonBuyMedicineMenu();
        verificationWithDoctor.scrollUptoAddToCart();
        verificationWithDoctor.clickonBuyMedicineMenu();
       // verificationWithDoctor.clickOnCloseButtonPopUp();
        verificationWithDoctor.scrollUptoAddToCart();
        verificationWithDoctor.clickOnAddToCart();
        verificationWithDoctor.verifyDocumentReviewMessage(documentreview);
    }

    @When("^User click on create post button on feed menu then (.+) Document Review message popup should display$")
    public void user_click_on_create_post_button_on_feed_menu_then_document_review_message_popup_should_display(String documentreview) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();   
       // verificationWithDoctor.clickonCreatePostButton();
        verificationWithDoctor.clickonCreatePostButtonAfterslider();
        verificationWithDoctor.verifyDocumentReviewMessage(documentreview);
    }

    @When("^user click on community menu then (.+) Document Review message popup should display$")
    public void user_click_on_community_menu_then_document_review_message_popup_should_display(String documentreview) throws Throwable {
        
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        
        verificationWithDoctor.clickOnCloseButtonPopUp();
        verificationWithDoctor.clickOnCommunityMenu();
        verificationWithDoctor.wait(2000);
      //  verificationWithDoctor.clickOnCloseButtonPopUp();
        //verificationWithDoctor.clickOnCommunityMenu();
        verificationWithDoctor.verifyDocumentReviewMessage(documentreview);
    }

    

    @Then("^User should be able to open the details and disapprove the user and select the reason (.+)$")
    public void user_should_be_able_to_open_the_details_and_disapprove_the_user_and_select_the_reason(String reasonofdisapprove) throws Throwable {
        
    VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
    verificationWithDoctor.disApproveUserWithAdmin(reasonofdisapprove);    
    }

   


  
    
    // @When("^user should enter registeration details (.+) as a roll number and (.+) as a year$")
    // public void user_should_enter_registeration_details_as_a_roll_number_and_as_a_year(String rollno, String year) throws Throwable {
    //     VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
    //     verificationWithDoctor.enterRollNumber();
    //     verificationWithDoctor.enteryear(year);
    // }

    @When("^user should enter registeration details enter roll number and (.+) as a year$")
    public void user_should_enter_registeration_details_enter_roll_number_and_as_a_year(String year) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.enterRollNumber();
        verificationWithDoctor.enteryear(year);
    }
   
   

    @When("^User click on add to cart button then (.+) rejection popup should display$")
    public void user_click_on_add_to_cart_button_then_rejection_popup_should_display(String rejection) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.wait(3000);
        verificationWithDoctor.clickonBuyMedicineMenu();
        verificationWithDoctor.wait(3000);
        verificationWithDoctor.scrollUptoAddToCart();
        verificationWithDoctor.clickOnAddToCart();
        verificationWithDoctor.verifyRejectionPopup(rejection);
        verificationWithDoctor.clickonReuploadButton();
      //  verificationWithDoctor.clickonReuploadButton();
    }

    @When("^User click on create post button on feed menu then (.+) rejection popup should display$")
    public void user_click_on_create_post_button_on_feed_menu_then_rejection_popup_should_display(String rejection) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.clickonCreatePostButton();
        verificationWithDoctor.verifyRejectionPopup(rejection);
        verificationWithDoctor.clickonReuploadButton();
    //    verificationWithDoctor.clickonReuploadButton();
    }

    @When("^user click on community menu then (.+) rejection popup should display$")
    public void user_click_on_community_menu_then_rejection_popup_should_display(String rejection) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.clickOnCommunityMenu();
        verificationWithDoctor.verifyRejectionPopup(rejection);
        verificationWithDoctor.clickonReuploadButton();
      //  verificationWithDoctor.clickonReuploadButton();
    }

    @When("^user click on quiz menu and click on take quiz button then (.+) rejection popup should display$")
    public void user_click_on_quiz_menu_and_click_on_take_quiz_button_then_rejection_popup_should_display(String rejection) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.clickOnTakeQuiz();
        verificationWithDoctor.verifyRejectionPopup(rejection);
        verificationWithDoctor.clickonReuploadButton();
      //  verificationWithDoctor.clickonReuploadButton();
    }

    
    @Then("^closes the browser$")
    public void closes_the_browser() throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.terminateBrowser();
        
    }
  @When("^user click on quiz menu and click on take quiz button then (.+) Document Review message popup should display$")
    public void user_click_on_quiz_menu_and_click_on_take_quiz_button_then_document_review_message_popup_should_display(String documentreview) throws Throwable {
       
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
       // verificationWithDoctor.clickOnCloseButtonPopUp();
        verificationWithDoctor.clickOnTakeQuiz();
        verificationWithDoctor.verifyDocumentReviewMessage(documentreview);
    }

    // @When("^user should be able to navigate to user detail and search with mobile number (.+)$")
    // public void user_should_be_able_to_navigate_to_user_detail_and_search_with_mobile_number(String mobilenumber) throws Throwable {
    //     VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
    //     verificationWithDoctor.openUserDetail();
    // }

    @When("^user should be able to navigate to user detail$")
    public void user_should_be_able_to_navigate_to_user_detail() throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.openUserDetail();
    }


    @Then("^User should be able to open the details and approve the user$")
    public void user_should_be_able_to_open_the_details_and_approve_the_user() throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.approveUserWithAdmin();
    }
    @Then("^User should be able to logout and navigate to the admin portal and login with admin by username as a (.+) and password as a password (.+)$")
    public void user_should_be_able_to_logout_and_navigate_to_the_admin_portal_and_login_with_admin_by_username_as_a_and_password_as_a_password(String adminusername, String adminpassword) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
       // verificationWithDoctor.logout();
        verificationWithDoctor.navigateAndLoginToAdmin(adminusername, adminpassword);

    }
    
    @When("^user should select Document type as a (.+) and pan number$")
    public void user_should_select_document_type_as_a_and_pan_number(String documenttype) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.scrollTillDocumentType();
        verificationWithDoctor.scrollup();      
        verificationWithDoctor.selectDocumentType(documenttype);
        verificationWithDoctor.EnterPanNumber();
    }

    
    @When("^user enter the pan name as (.+)$")
    public void user_enter_the_pan_name_as(String panname) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.enterPancardName(panname);
       
    }





    @When("^user type pan number name as (.+)$")
    public void user_type_pan_number_name_as(String pancardname) throws Throwable {
        VerificationWithDoctor verificationWithDoctor=testContextSetup.pageObjectManager.getVerificationWithDoctor();
        verificationWithDoctor.enterPancardName(pancardname);
    }


    
    }
    

    

    





