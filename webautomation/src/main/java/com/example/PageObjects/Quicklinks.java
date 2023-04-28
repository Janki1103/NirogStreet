package com.example.PageObjects;
import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Quicklinks extends GenericUtils{

    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(SignUpAsDoctor.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
    }
public Quicklinks() throws IOException {

    // this.driver=getDriver();
   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }
   
    public void login(String OTPOne,String OTPTwo,String OTPThree,String OTPFour){
       scrollTillElementDisplay(locators.getKey("ClickAlreadyAccounts_button"));
       scrollDown();
       scrollDown();
       scrollDown();
        clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));
        log.info("STEP:Click on Already account button Successfully" + "ClickAlreadyAccounts_button");
        pasteMobNumber(locators.getKey("Mobile_input"));
      //  enterText(locators.getKey("Mobile_input"), mobile);
        clickOnElement(locators.getKey("GetOTP_button_login"));
        log.info("STEP:Click on Get OTP button Successfully" + "LogingetOTP_button");
        enterText(locators.getKey("OTPOne_login_input"), OTPOne);
        enterText(locators.getKey("OTPTwo_login_input"), OTPTwo);
        enterText(locators.getKey("OTPThree_login_input"), OTPThree);
        enterText(locators.getKey("OTPFour_login_input"), OTPFour);
        clickOnElement(locators.getKey("Procced_button"));
        log.info("STEP:Click on procced button Successfully" + "Procced_button");

    }
    public void logginWithMob(String mobile,String OTPOne,String OTPTwo,String OTPThree,String OTPFour){
        scrollTillElementDisplay(locators.getKey("ClickAlreadyAccounts_button"));
         scrollDown();
         scrollDown();
         scrollDown();
         clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));
         log.info("STEP:Click on Already account button Successfully" + "ClickAlreadyAccounts_button");
         enterText(locators.getKey("Mobile_input"), mobile);
         clickOnElement(locators.getKey("GetOTP_button_login"));
         verifyVisibility(locators.getKey("OTPOne_login_input"));
         log.info("STEP:Click on Get OTP button Successfully" + "GetOTP_button");
         enterText(locators.getKey("OTPOne_login_input"), OTPOne);
         enterText(locators.getKey("OTPTwo_login_input"), OTPTwo);
         enterText(locators.getKey("OTPThree_login_input"), OTPThree);
         enterText(locators.getKey("OTPFour_login_input"), OTPFour);
         clickOnElement(locators.getKey("Procced_button"));
         log.info("STEP:Click on procced button Successfully" + "Procced_button");
 
     }
    
    public void clickOnBuyMedicineMenu(){
        verifyVisibility(locators.getKey("BuyMedicine_Menu"));
        clickOnElement(locators.getKey("BuyMedicine_Menu"));
        log.info("STEP:Click on BuyMedicine Menu Successfully" + "BuyMedicine_Menu");
    }

     public void userIsOnBuyMedicineMenu() {
		boolean test = isElementDisplay(locators.getKey("AllMedicines_header"));
		if (test) {
			log.info("STEP: " + "AllMedicines_header" + " is present on buy medicineine page");
		} else {
			log.info("STEP: " + "AllMedicines_header" + " is not present on buy medicationine page");
		}
	}
    public void clickOnFeedMenu(){
        verifyVisibility(locators.getKey("Feed_Menu"));
        clickOnElement(locators.getKey("Feed_Menu"));
        log.info("STEP:Click on feed menu Successfully" + "Feed_Menu");
    }

    public void verifyFeedMenuOpened(){
        boolean test = isElementDisplay(locators.getKey("Create_Post_Button"));
		if (test) {
			log.info("STEP: " + "Create_Post_Button" + " is present feed page");
		} else {
			log.info("STEP: " + "Create_Post_Button" + " is not present on Feed page");
		}

    }
    public void clickOnComunityMenu(){
        verifyVisibility(locators.getKey("Community_menu"));

        clickOnElement(locators.getKey("Community_menu"));
        log.info("STEP:Click on Community Menu Successfully" + "Community_menu");
    }

    public void verifyCommunityMenuOpened(){
        boolean test = isElementDisplay(locators.getKey("Add_community_icon"));
		if (test) {
			log.info("STEP: " + "Add_community_icon" + " is present Community page");
		} else {
			log.info("STEP: " + "Add_community_icon" + " is not present on Community page");
		}

    }
    public void clickOnQuizMenu(){
        verifyVisibility(locators.getKey("Quiz_menu"));
        clickOnElement(locators.getKey("Quiz_menu"));
        log.info("STEP:Click on Quiz Menu Successfully" + "Quiz_menu");
    }
    public void verifyQuizMenuOpened(){

        boolean test = isElementDisplay(locators.getKey("Quiz_search_button"));
		if (test) {
			log.info("STEP: " + "Quiz_search_button" + " is present Quiz page");
            System.out.println("Quiz search verified successfully");
		} else {
			log.info("STEP: " + "Quiz_search_button" + " is not present on Quiz page");
            System.out.println("Quiz search  not verified ");
        }

    }
    public void clickOnMyOrderMenu(){
        System.out.println("My order menu will be click ");
         isElementDisplay(locators.getKey("MyOrder_menu"));
        System.out.println("My order menu is displayed ");
        //clickOnElementWithJS(locators.getKey("MyOrder_menu")); 
       // isElementDisplay(locators.getKey("MyOrder_menu"));
        clickOnElement(locators.getKey("MyOrder_menu"));
        System.out.println("My order menu verified successfully");
        log.info("STEP:Click on MyOrder Menu Successfully" + "MyOrder_menu");
    }
    public void verifyMyOrderMenuOpened(){
       
     clickOnElement(locators.getKey("Order_Search_Icon"));
        

    }
    public void openMyorderMenu(){
        verifyVisibility(locators.getKey("MyOrder_menu"));
        clickOnElement(locators.getKey("MyOrder_menu"));

    }

    public void searchOrder(){
        clickOnElement(locators.getKey("Order_Search_Icon"));
       

    }
    public void verifyMyOrderMenuOpenedForChemist(String Title){
       verifyText(locators.getKey("Myorder_Search_button"), Title);
    

    }

    public void clickOnWebinarMenu(){
        verifyVisibility(locators.getKey("Webinar_menu"));
        clickOnElement(locators.getKey("Webinar_menu"));
        log.info("STEP:Click on Webinar Menu Successfully" + "Webinar_menu");
    }

    public void verifyWebinarMenuOpened(){
        boolean test = isElementDisplay(locators.getKey("Webinar_Search_button"));
		if (test) {
			log.info("STEP: " + "Webinar_Search_button" + " is present webinar page");
		} else {
			log.info("STEP: " + "Webinar_Search_button" + " is not present on webinar page");
		}
    }
    public void clickOnHealthBlogMenu(){
        verifyVisibility(locators.getKey("Health_Blog_menu"));
        clickOnElement(locators.getKey("Health_Blog_menu"));
        log.info("STEP:Click on Webinar Menu Successfully" + "Health_Blog_menu");
    }

    public void verifyHealthBlogMenuOpened(){
        boolean test = isElementDisplay(locators.getKey("Php_AllMedicine_Header_blog"));
		if (test) {
			log.info("STEP: " + "Php_AllMedicine_Header_blog" + " is present Health Blog page");
		} else {
			log.info("STEP: " + "Php_AllMedicine_Header_blog" + " is not present on Health Blog page");
		}
    }
    public void clickOnFindclinicMenu(){
        verifyVisibility(locators.getKey("Find_clinic_menu"));

        clickOnElement(locators.getKey("Find_clinic_menu")); 
        log.info("STEP:Click on Find clinic Menu Successfully" + "Find_clinic_menu");
    }
    public void clickOnFindclinicMenuWithChemist(){
        clickOnElement(locators.getKey("Find_clinic_menu_for_chemist")); 
        log.info("STEP:Click on Find clinic Menu Successfully" + "Find_clinic_menu_for_chemist");
    }
    public void verifyFindClinicMenuOpened(){
        boolean test = isElementDisplay(locators.getKey("Search_Clinic_Input"));
		if (test) {
			log.info("STEP: " + "Search_Clinic_Input" + " is present Clinic page");
		} else {
			log.info("STEP: " + "Search_Clinic_Input" + " is not present on Clinic page");
		}
    }
    public void verifyFindClinicMenuOpenedChemist(){
        
        boolean test = isElementDisplay(locators.getKey("Doctor_Search_Input_Chemist"));
		if (test) {
			log.info("STEP: " + "Doctor_Search_Input_Chemist" + " is present Clinic page");
		} else {
			log.info("STEP: " + "Doctor_Search_Input_Chemist" + " is not present on Clinic page");
		}
    }
    public void clickOnFindDoctorMenu(){
        
        clickOnElement(locators.getKey("FindDoctor_menu"));
        log.info("STEP:Click on Find doctor Menu Successfully" + "FindDoctor_menu");
    }

    public void clickOnFindDoctorMenuChemist(){
        verifyVisibility(locators.getKey("FindDoctorChemist_menu"));
        clickOnElement(locators.getKey("FindDoctorChemist_menu"));
        log.info("STEP:Click on Find doctor Menu Successfully" + "FindDoctorChemist_menu");
    }

    public void verifyFindDoctorMenuOpened(){
        boolean test = isElementDisplay(locators.getKey("Doctor_Search_Input"));
		if (test) {
			log.info("STEP: " + "Doctor_Search_Input" + " is present FindDoctor page");
		} else {
			log.info("STEP: " + "Doctor_Search_Input" + " is not present on FindDoctor page");
		}
    }

    public void verifyFeedNotAvialble(){
        boolean test = isElementNotDisplay(locators.getKey("Feed_Menu"));
		if (test) {
			log.info("STEP: " + "Feed_Menu" + " is not present FindDoctor page");
		} else {
			log.info("STEP: " + "Feed_Menu" + " is present on FindDoctor page");
		}
    }



}   
