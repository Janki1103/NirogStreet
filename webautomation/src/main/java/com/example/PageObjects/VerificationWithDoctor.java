package com.example.PageObjects;

import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import app.constants.ApplicationConstants;
import cucumber.app.enums.FileNames;
import java.awt.AWTException;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerificationWithDoctor  extends GenericUtils{
    
    
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(SignUpAsDoctor.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public VerificationWithDoctor() throws IOException {

    // this.driver=getDriver();
   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }
//     public void clickOnLoginSignupButton() throws InterruptedException {
       
        
//         clickOnElement(String.format(locators.getKey("LoginSignUp_Button")));
//         log.info("STEP:Click on login sign up button Successfully" + "LoginSignUp_Button");

//    }

//    public void userIsOnSignUpPage()  {
//     boolean test = isElementDisplay(locators.getKey("Profession_Input"));
//     if (test) {
//         log.info("STEP: " + "Profession" + " is present on sign up screen");
//     } else {
//         log.info("STEP: " + "Profession" + " is not present on sign up screen");
//     }
// }

//     public void  selectProfession(String profession)  {
//         selectDropDown(locators.getKey( "Profession_Input"), profession);
   
//                }
    
    
//     public void selectTitle(String title) {
//         selectDropDown(locators.getKey( "title_input"), title);
        
//     }

   

//     public void enterFullName(String fullname_input) {
//         enterText(locators.getKey( "fullname_input"), fullname_input);
//     }

//     public void enterMobileNo(String mobileNo_input) {
//         enterText(locators.getKey( "mobileNo_input"), mobileNo_input);
             
//     }

//     public void enterRandomMobileNo(String mobileNo_input , String output) {
//        // enterText(locators.getKey( "mobileNo_input"), mobileNo_input);
//         output="";
//         enterText(locators.getKey( "mobileNo_input"),output);
        
//     }



//     public void enterPinCode(String pinCode_input) {
//         enterText(locators.getKey( "pinCode_input"), pinCode_input);
             

// }


// public void enterPassword(String password_input){
//     enterText(locators.getKey( "password_input"), password_input);
// }


// public void enterConfirmPassword(String confirm_password_input){
//     enterText(locators.getKey( "confirm_password_input"), confirm_password_input);

// }

// public void  clickOnGetOTPButton() { 
    
//     clickOnElement(String.format(locators.getKey("getOTP_button")));
//     log.info("STEP:Click on GetOTP button Successfully" + "getOTP_button");

// }

// public void enterOTPOne(String OTPOne)
// {
//     enterText(locators.getKey( "OTPOne"), OTPOne);
// }

// public void enterOTPTwo(String OTPTwo)
// {
//     enterText(locators.getKey( "OTPTwo"), OTPTwo);
// }


//     public void enterOTPThree(String OTPThree)
//     {
//         enterText(locators.getKey( "OTPThree"), OTPThree);
//     }


//     public void enteOTPFour(String OTPFour){

//         enterText(locators.getKey( "OTPFour"), OTPFour);
        
//     }

    public void clickOnProceed(){
        clickOnElement(String.format(locators.getKey("OTProceedButton")));
        log.info("STEP:Click on procced button Successfully" + "OTProceedButton");

    }

    public void verifyCongratulationPopUp(String actualMessage)
    {
        verifyTextForCongrtualtionsPopup(locators.getKey("congratulationsHeder"), actualMessage);
        log.info("STEP:Congratulations Pop Up verify Successfully" + "congratulationsHeder");
    }
    
    public void clickOnCloseButtonPopUp(){
        clickOnElement(String.format(locators.getKey("closeButtonPopup")));
         log.info("STEP:Click on close icon for closing the popup " + "closeButtonPopup");

    }
    public void logout() throws InterruptedException{
       mouseOver(String.format(locators.getKey("profile_icon")));
       scrollTillElementDisplay(locators.getKey("logout"));
       clickOnElement(locators.getKey("logout"));
       log.info("STEP:logout successfully " + "logout");
    }

    public void scrollUptoAddToCart(){
         wait(3000);
         scrollTillElementDisplay(locators.getKey("About_Us"));
         wait(2000);
            }
    public void clickOnAddToCart() {     
        wait(2000);   
        clickOnElement(locators.getKey("AddToCart_button"));
        //clickonElementJavaScript(locators.getKey("AddToCart_button"));
        
    }

    public void verifyAttentionPopup(String actualMessage){
        verifyText(locators.getKey("Attention_popup_header"), actualMessage);
        log.info("STEP:Attention popup text verification performed successfully" + "actualMessage");
    }

    public void clickOnContinueWithVerification(){
        clickOnElement(locators.getKey("ContinueWithVerification_button"));
        log.info("STEP:Click on Continue with Verification successfully " + "-" + "ContinueWithVerification_button");
    }

    public void clickonCreatePostButton(){
       
        verifyVisibility(locators.getKey("Feed_Menu"));
        clickOnElement(locators.getKey("Feed_Menu"));     
      //  clickOnElement(locators.getKey("slider_Close"));
      verifyVisibility(locators.getKey("Create_Post_Button"));

        clickOnElement(locators.getKey("Create_Post_Button"));
        log.info("STEP:Click on Create Post Button successfully " + "-" + "Create_Post_Button");
    }
    public void clickonCreatePostButtonAfterslider(){
        clickOnElement(locators.getKey("Feed_Menu"));     
        wait(5000);   
       clickOnElement(locators.getKey("slider_Close"));
        wait(1000);   
        clickOnElement(locators.getKey("Create_Post_Button"));
        log.info("STEP:Click on Create Post Button successfully " + "-" + "Create_Post_Button");
    }

    public void clickOnCommunityMenu(){
        clickOnElement(locators.getKey("Community_menu"));
        log.info("STEP:Click on community menu successfully " + "-" + "Community_menu");
    }

    public void clickOnTakeQuiz(){
        verifyVisibility(locators.getKey("Quiz_menu"));
        clickOnElement(locators.getKey("Quiz_menu"));
        wait(2000);   
        verifyVisibility(locators.getKey("TakeQuiz_button"));
        clickOnElement(locators.getKey("TakeQuiz_button"));
        log.info("STEP:Click on take Quiz button  successfully " + "-" + "TakeQuiz_button");
    }

    public void scrollTillCouncilName(){
        scrollTillElementDisplay(locators.getKey("Council_name_input"));
        log.info("STEP:scrolling down the page successfully " + "-" + "Council_name_input");
    }

    public void selectCouncilName(String councilName){
        wait(2000);        
        //selectDropDown(locators.getKey("Council_name_input"),councilName);
       selectList(locators.getKey("Council_name_input"),councilName);
        log.info("STEP:Select council name successfully " + "-" + "Council_name_input");
    }
    public void enterRegisterationNumber(){
        PassingregisterationNumber(locators.getKey("Registeration_number_input"));
       // enterText(locators.getKey("Registeration_number_input"), registerationNumber);
        log.info("STEP:Enter registeration number successfully " + "-" + "Registeration_number_input");
    }
    
    public void enterRegisterationYear(String registerationYear){
        enterText(locators.getKey("Registeration_year_input"), registerationYear);
        log.info("STEP:Enter registeration year successfully " + "-" + "Registeration_year_input");
    }


    public void uploadDegree() throws InterruptedException, AWTException{
        
        PNGfileuploading(locators.getKey("Upload_degree_input"));
        log.info("STEP:File upload successfully for degree " + "-" + "Upload_degree_input");
    }
    public void uploadpancard() throws InterruptedException, AWTException{
        PNGfileuploading(locators.getKey("Documenttype_upload"));
       
        log.info("STEP:File upload successfully for degree " + "-" + "Upload_degree_input");
    }

    public void uploadcollageID() throws InterruptedException, AWTException{
        PNGfileuploading(locators.getKey("collageid_front_upload"));
        wait(1000);
        scrollDown150();
        PNGfileuploading(locators.getKey("collageid_back_upload"));
        log.info("STEP:File upload successfully for collage id " + "-" + "collageid_back_upload");
    }

    public void clickOnSaveForDocRegister(){
        wait(1000);
        clickOnElement(locators.getKey("Doc_Reg_Save_button"));
        verifyVisibility(locators.getKey("Reg_Confirm_button"));
        clickOnElement(locators.getKey("Reg_Confirm_button"));
        log.info("STEP:Click on save button successfully " + "-" + "Doc_Reg_Save_button");
        wait(2000);
    }

    public void clickOnSaveForDocRegisterForStudent(){
        verifyVisibility(locators.getKey("Doc_Reg_Save_button"));
        clickOnElement(locators.getKey("Doc_Reg_Save_button"));
        wait(2000);
        log.info("STEP:Click on save button successfully " + "-" + "Doc_Reg_Save_button");
    }

    public void verifyDocumentReviewMessage(String actualMessage ){
        verifyText(locators.getKey("Document_Review_Popup"), actualMessage);
        log.info("STEP:Document Review popup text verification performed successfully" + " " +"actualMessage");
        clickOnElement(locators.getKey("Document_Review_Ok_button"));
        
    }

    public void navigateAndLoginToAdmin(String username , String password){
        initBrowser(ApplicationConstants.browser, ApplicationConstants.ADMINURL);
        enterText(locators.getKey("admin_username_input"), username);
        enterText(locators.getKey("admin_password_input"), password);
        verifyVisibility(locators.getKey("Signin_button"));
        clickOnElement(locators.getKey("Signin_button"));
        
    }

    public void openUserDetail(){
        clickOnElement(locators.getKey("UserDetail_Menu"));
        log.info("STEP:Open User details menu successfully" + " " +"UserDetail_Menu");
        clickOnElement(locators.getKey("AllUserDetail_Menu"));
        log.info("STEP:Open All User details menu successfully" + " " +"AllUserDetail_Menu");
      //  enterText(locators.getKey("MobileSearch_input"), MobileNumber);
         pasteMobNumber(locators.getKey("MobileSearch_input"));
        actionEnter();
    }

    public void approveUserWithAdmin(){
        verifyVisibility(locators.getKey("View_Icon"));
        clickOnElement(locators.getKey("View_Icon"));
        scrollDown();
        //verifyVisibility(locators.getKey("View_Icon"));
        clickOnElement(locators.getKey("Approve_Radio_Button"));
        acceptAlerts();
        
    }

    public void selectDocumentType(String documenttype){
        wait(3000);
        selectList(locators.getKey("Doctument_Type_input"),documenttype);
        log.info("STEP:Select Doctument Type successfully " + "-" + "Doctument_Type_input");
    }

    public void EnterPanNumber(){
        PanNumberRandomGenerator(locators.getKey("PANNumber_input"));
       // PassinPANNumber(locators.getKey("PANNumber_input"));
       // enterText(locators.getKey("PANNumber_input"), pannumber);
        log.info("STEP:pan number entered successfully " + "-" + "PANNumber_input");
    }

    
    public void enterPancardName(String Name){
        enterText(locators.getKey("Pan_Name"), Name);
        log.info("STEP:pan name entered successfully " + "-" + "Pan_Name");
    }




    public void scrollTillDocumentType(){
        wait(2000);
        scrollTillElementDisplay(locators.getKey("Doctument_Type_input"));
        log.info("STEP:Scroll the page successfully  till document type" + "-" + "Doctument_Type_input");
    }
    

    public void enterRollNumber(){
        wait(2000);
        scrollTillElementDisplay(locators.getKey("RollNo_input"));
        scrollup();
        log.info("STEP:Scroll the page successfully  till Roll number" + "-" + "RollNo_input");
        PassingRoleNumber(locators.getKey("RollNo_input"));
        //enterText(locators.getKey("RollNo_input"), RollNo);
        log.info("STEP:entered roll number successfully" + "-" + "RollNo_input");
    }


    public void enteryear(String year){
         enterText(locators.getKey("CurrentYear_input"), year);
         log.info("STEP:entered year successfully" + "-" + "CurrentYear_input");
    }
    public void disApproveUserWithAdmin(String reasonofDisapprove){
        verifyVisibility(locators.getKey("View_Icon"));
        clickOnElement(locators.getKey("View_Icon"));
        scrollDown();
        clickOnElement(locators.getKey("Disapproved_Radio_button"));
        wait(2000);
        acceptAlerts();
        
        selectDropDown(locators.getKey("Reson_for_dispapprove_input"), reasonofDisapprove);
        clickOnElement(locators.getKey("Submit_button"));
        wait(3000);

      //  verifyVisibility(locators.getKey("Disapproved_Nessage_Admin"));
        

    }

    public void verifyRejectionPopup(String actualMessage){
        verifyText(locators.getKey("Rejection_Popup"), actualMessage);
        log.info("STEP:Rejection popup text verification performed successfully" + "actualMessage");
    }
    public void clickonReuploadButton(){
        clickOnElement(locators.getKey("Reupload_button"));
        log.info("STEP:Click on Continue with Reupload button successfully " + "-" + "Reupload_button");
    }
    
    public void clickonBuyMedicineMenu(){
        verifyVisibility(locators.getKey("BuyMedicine_Menu"));
        clickOnElement(locators.getKey("BuyMedicine_Menu"));        
        log.info("STEP:Click on Buy Medicine Menu successfully " + "-" + "BuyMedicine_Menu");
    }
    public void clickOnFeedMenu(){
        verifyVisibility(locators.getKey("Feed_Menu"));
        clickOnElement(locators.getKey("Feed_Menu"));
        log.info("STEP:Click on feed menu Successfully" + "Feed_Menu");
    }
    public void clickOnMyOrderMenu(){
        verifyVisibility(locators.getKey("MyOrder_menu"));
        clickOnElement(locators.getKey("MyOrder_menu"));
        log.info("STEP:Click on feed menu Successfully" + "Feed_Menu");
    }
}



