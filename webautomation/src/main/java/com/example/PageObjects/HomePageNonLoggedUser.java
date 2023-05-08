package com.example.PageObjects;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class HomePageNonLoggedUser extends GenericUtils {

    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(HomePageNonLoggedUser.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
    public HomePageNonLoggedUser() throws IOException {

    // this.driver=getDriver();
   
    }
    public  WebDriver getDriver() {
        return driverThread.get();
    }   

    public void clickOnLoginSignupButtonAndRedirectedBackToHomepage (){
        clickOnElement(locators.getKey("LoginSignUp_Button"));
        clickOnElement(locators.getKey("Click_On_NirogStreet_Icon"));
    }

    public void clickOnQuicklinksAndRedirectedToLoginPage(){
        // clickOnElement(locators.getKey("NirogStreet_Icon"));
        clickOnElement(locators.getKey("BuyMedicine_Menu"));
        clickOnElement(locators.getKey("NirogPartner_Menu"));
        wait(3000);
        clickOnElement(locators.getKey("Feed_Menu"));
        wait(3000);
        clickOnElement(locators.getKey("Community_menu"));
        log.info("STEP:Click on Community Menu Successfully" + "Community_menu");
        wait(3000);
        clickOnElement(locators.getKey("Quiz_menu"));
        clickOnElement(locators.getKey("MyOrder_menu"));
        clickOnElement(locators.getKey("Webinar_menu"));
        clickOnElement(locators.getKey("Vaidya_Tool_Menu"));
        clickOnElement(locators.getKey("Health_Blog_menu"));
        wait(2000);
        clickOnElement(locators.getKey("Find_clinic_menu"));
        clickOnElement(locators.getKey("FindDoctor_menu"));
        wait(2000);
        clickOnElement(locators.getKey("Click_Php_NirogStreet_Icon"));
        wait(2000);
        
    }
    
    public void clickOnNirogStreetIcon(){
        verifyVisibility(locators.getKey("NirogStreet_Icon"));
        clickOnElement(locators.getKey("NirogStreet_Icon"));
           }
           
           public void GotoHomePage(){
            clickOnElement(locators.getKey("NirogStreet_Icon_From_phpPage"));
           }

    public void clickOnBannerHomepage(){
        scrollTillElementDisplay(locators.getKey("Click_On_Banner"));
        clickOnElement(locators.getKey("Click_On_Banner"));
        clickOnElement(locators.getKey("Click_On_NirogStreet_Icon"));
    }

    public void clickOnConnectToPeerLearnMore(){
        scrollTillElementDisplay(locators.getKey("Click_On_ConnectWithPeers_LearnMore"));
        verifyVisibility(locators.getKey("Click_On_ConnectWithPeers_LearnMore"));
        clickOnElement(locators.getKey("Click_On_ConnectWithPeers_LearnMore"));
        
    }
    public void clickOnBuyMedicineQuickLink(){
        verifyVisibility(locators.getKey("BuyMedicine_Menu"));
        clickOnElement(locators.getKey("BuyMedicine_Menu"));
    }
public void clickOnFeedQuickLink(){
    verifyVisibility(locators.getKey("Feed_Menu"));
    clickOnElement(locators.getKey("Feed_Menu"));
}
public void clickOnQuizQuicklink(){
    verifyVisibility(locators.getKey("Quiz_menu"));
    clickOnElement(locators.getKey("Quiz_menu"));
}
   public void clickOnMyOrdersQuickLink(){
    verifyVisibility(locators.getKey("MyOrder_menu"));
    clickOnElement(locators.getKey("MyOrder_menu"));
   } 
   public void clickOnVaidyaToolQuickLink(){
    verifyVisibility(locators.getKey("VaidyaToolQuickLink"));
    clickOnElement(locators.getKey("VaidyaToolQuickLink"));
   }
   public void clickOnCommunityQuickLink(){
    verifyVisibility(locators.getKey("CommunityQuickLink"));
    clickOnElement(locators.getKey("CommunityQuickLink"));
   }
   public void clickOnHealthBlogsQuickLink(){
    verifyVisibility(locators.getKey("HealthBlogsQuickLink"));
    clickOnElement(locators.getKey("HealthBlogsQuickLink"));
   }
   public void clickOnFindClinics(){
    verifyVisibility(locators.getKey("Find_Clinic_Menu"));
    clickOnElement(locators.getKey("Find_Clinic_Menu"));
   }
   
   public void clickonAllMedicineLink(){
    verifyVisibility(locators.getKey("AllMedicines_header"));
    clickOnElement(locators.getKey("AllMedicines_header"));
 }
 public void clickongetthepricepatened(){
    wait(3000);
    verifyVisibility(locators.getKey("GetTheBestPriceButton"));
    clickOnElement(locators.getKey("GetTheBestPriceButton"));
 }
   public void clickOnGetTheBestPrice(){
    verifyVisibility(locators.getKey("GetTheBestPriceButton"));
    clickOnElement(locators.getKey("GetTheBestPriceButton"));
   }
   public void clickongetThebestpriceBrand(){
    verifyVisibility(locators.getKey("GetTheBestPriceButton"));
    clickOnElement(locators.getKey("GetTheBestPriceButton"));
   }
   public void clickOnFindDoctors(){
    verifyVisibility(locators.getKey("FindDoctor_menu"));
    clickOnElement(locators.getKey("FindDoctor_menu"));
   }
   public void enterDoctorName(String doctorname){
    // enterText(locators.getKey("SearchBox_Doctor"), doctorname);
    verifyVisibility(locators.getKey("SearchBox_Doctor"));
    selectListWithTab(locators.getKey("SearchBox_Doctor"), doctorname);
  
    // actionEnter();
   }
   public void selectBrandName(){
        verifyVisibility(locators.getKey("BrandLink"));
        clickOnElement(locators.getKey("BrandLink"));
        verifyVisibility(locators.getKey("BrandFromList"));
        clickOnElement(locators.getKey("BrandFromList"));

  }
  public void clickOnSearchBarOnHomePage(String medname){
        // clickOnElement(locators.getKey("SearchBarOnHomePage"));
        verifyVisibility(locators.getKey("Uiversal_search"));
        enterText(locators.getKey("Uiversal_search"), medname);
        wait(1000);
        actionEnter();
        
  }
  public void clickOnGettheBestPrice(){
    verifyVisibility(locators.getKey("GetTheBestPriceButton"));
    clickOnElement(locators.getKey("GetTheBestPriceButton"));
   }
   public void clickOnNeedHelpButton(){
    verifyVisibility(locators.getKey("NeedHelpButton"));

    clickOnElement(locators.getKey("NeedHelpButton"));
   }
   public void enterFullNameinNeedHelp(String fullname){
    enterTextwithClick(locators.getKey("FullName_NeedHelp"), fullname);
   }

   public void enterMobileNumberNeedHelp(String mobilenuber){
    verifyVisibility(locators.getKey("Mobile_NeedHelp"));
    enterTextwithClick(locators.getKey("Mobile_NeedHelp"), mobilenuber);
  
   }

   public void enterMessage(String message){
    enterText(locators.getKey("MessageBox_NeedHelp"), message);
   }
   public void enterEmail(String email){
    enterText(locators.getKey("Email_NeedHelp"), email);
   }
   public void clickOnClassicMedicine(String Arishta){
    verifyVisibility(locators.getKey("ClassicalMedicineHeader"));

    clickOnElement(locators.getKey("ClassicalMedicineHeader"));
    verifyVisibility(locators.getKey("ClassicalMedicinefromList"));

    clickOnElement(locators.getKey("ClassicalMedicinefromList"));
    // selectListWithTab(locators.getKey("ClassicalMedicinefromList"), Arishta);
}
public void searchForAClinic(String clinicName){
    // clickOnElement(locators.getKey("Search_ClinicLink"));
    selectListWithTab(locators.getKey("Search_ClinicLink"), clinicName);
    // enterText(locators.getKey("Search_ClinicLink"), clinicName);
}
public void clickOnPatentedMedicine(String Churna){
    verifyVisibility(locators.getKey("Patentedmedicine"));
    clickOnElement(locators.getKey("Patentedmedicine"));   
    verifyVisibility(locators.getKey("PatentMedicineFromList"));
    //selectListWithTab(locators.getKey("Patentedmedicine"), Churna);
    clickOnElement(locators.getKey("PatentMedicineFromList"));
}
public void clickOnOffers(){
    clickOnElement(locators.getKey("Offers"));
}
   public void clickOnSend(String alertmessage){
    scrollDown150();    
    scrollDown150();
    verifyVisibility(locators.getKey("SendButton_NeedHelp"));
    clickOnElement(locators.getKey("SendButton_NeedHelp"));
    verifyVisibility(locators.getKey("AlertMessage_NeedHelp"));
    verifyText(locators.getKey("AlertMessage_NeedHelp"), alertmessage);
   }
   public void userIsOnSignUpPage()  {
    boolean test = isElementDisplay(locators.getKey("Profession_Input"));
    if (test) {
        log.info("STEP: " + "Profession" + " is present on sign up screen");
    } else {
        log.info("STEP: " + "Profession" + " is not present on sign up screen");
    }
    
}
}
