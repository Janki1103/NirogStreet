package com.example.PageObjects;

import java.io.IOException;
// import java.util.logging.LogManager;


import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cucumber.app.enums.FileNames;

public class NotifyMefromProdList extends GenericUtils{
    private static final String Brand = null;
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(NotifyMeFeature.class);
       
    {
        locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
        log.info("STEP: Assets Page Locators loaded into memory");
    }
    public NotifyMefromProdList() throws IOException {
       
        }
        public  WebDriver getDriver() {
            return driverThread.get();
        }   
    
        public void clickOnLoginSignupButton() throws InterruptedException{
            clickOnElement(locators.getKey("LoginSignUp_Button"));
            log.info("STEP: Clicked on signup button successfully");
            
        }
        public void ClickOnIhaveAccountButton() throws InterruptedException{
            clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));
            log.info("STEP: Clicked on Already have an account button successfully");  
        }
    
    
        public void LoginWithPasswordbutton() {
            clickOnElement(locators.getKey("LoginWithPassword_button"));
            log.info("STEP: Clicked on LoginWithPassword successfully");
        }
    
    
        public void enterMobileNo(String mobilenumber){
           enterText(locators.getKey("Mobile_input"),mobilenumber);
           log.info("STEP:Entered Moble Number successfully");
        }
    
        public void enterPassword(String Password){
           enterText(locators.getKey("EnterPassword"),Password);
           log.info("STEP:Entered password successfully");
        }
    
         public void clickOnProceed(){
           clickOnElement(locators.getKey("Proceed_button"));
           log.info("STEP: Loggedin successfully + Loggedin");
        }
        public void clickOnAllMedicineButton(){
            clickOnElement(locators.getKey("All_Medicine_Button"));
            log.info("STEP: clicked on All medicine successfully");
            scrollDown();
        } 
        public void clickOnUniversalSearchBar(){
            clickOnElement(locators.getKey("Uiversal_search"));
            log.info("STEP: Clicked on Universal search bar successfully");
        }
        public void enterMedicineName(String medicine1){
            enterText(locators.getKey("Uiversal_search"), medicine1);
            wait(6000);
            actionEnter();
            wait(3000);
        //    EnterWithActionDownEnter(locators.getKey("Universal_Search_Bar"), medicine1);
            log.info("STEP:Entered Medicine Name successfully");  
        }

        public void clickOnAddToCartButton(){
            wait(3000);
            // scrollDown();
        clickOnElement(locators.getKey("AddToCart_button"));
        log.info("STEP:Clicked on add to cart successfully");
        }

        public void clickOnNotifyMeButton(){
        scrollDown();
        clickOnElement(locators.getKey("NotifyMeButton"));
        log.info("STEP: Clicked on NotifyMe button successfully");
        }

        public void clickOnQuantityBox(){
            wait(3000);
        clickOnElement(locators.getKey("QuantityButton"));
        log.info("STEP:Clicked on QuantityBox successfully");
        }

        public void enterQuantity(String quantity){
         enterText(locators.getKey("QuantityButton"),quantity);
         log.info("STEP:Entered Quantity successfully");
        }

        public void clickOnSave(String successfullMessage){  
        clickOnElement(locators.getKey("SaveButton"));
        verifyText(locators.getKey("SuccessfullyAddedMsg"), successfullMessage);
        }
        public void clickOnCrossButton(){
            scrollDown();
            clickOnElement(locators.getKey("CrossButtonOnProduct"));
            log.info("STEP: Clicked on Cross button successfully");
        
        }
        public void clickOnAddtoCartonOtherMed(){
            clickOnElement(locators.getKey("AddToCart2nd"));
            log.info("STEP: Clicked on Addto Cart successfully");
        }
        public void selectMedicineSize(){
            clickOnElement(locators.getKey("MedicineSizeRadioButton"));
            log.info("STEP: Selected Medicine Size successfully");
            scrollUp150();
        }
        public void clickOnNotifyMeofInStockItem(){
            clickOnElement(locators.getKey("NotifyMe_of_Available_Stock"));
            log.info("STEP: Clicked on Notify Me successfully");
        }
        public void clickOnNotifyMeOfOOSProduct(){
            scrollDown();
            wait(3000);
            clickOnElement(locators.getKey("NotifyMe_of_OutofStock_product"));
            log.info("STEP: Clicked on Notify Me successfully"); 
        }
        public void clickOnQuantityBoxInStockNF(){
            clickOnElement(locators.getKey("QuantityBoxOfInStockNF"));
            log.info("STEP:EClicked on QuantityBox  successfully");
        }
        public void enteraQuantity(String Quantity){
            enterText(locators.getKey("QuantityButton"),Quantity);
            log.info("STEP:Entered Quantity successfully");
    
        }
    
        // public void clickOnSave(){
        //     clickOnElement(locators.getKey("SaveButton"));
            
        // }
        public void clicksOnQuantityBoxtoAddintoCart(){
            clickOnElement(locators.getKey("QuantityButtonNotifyMe"));
            log.info("STEP:Clicked on add to cart successfully");

        }
        
        public void enterQuantitytoadd(String AddtoCartQuantity){
            enterText(locators.getKey("QuantityButtonNotifyMe"),AddtoCartQuantity);
            verifyText(locators.getKey("Asserstion_Keep_Me_Posted"), AddtoCartQuantity);
    
        }
        public void clickOnAddtoCart(){
            clickOnElement(locators.getKey("AddtoCartforavailable"));
        }
        public void clickOnOkButton(){
            clickOnElement(locators.getKey("Ok_Button_On_AlertPage"));
        }
        public void enterAllQuantity(String AddAllQuantity){
            enterText(locators.getKey("QuantityBoxtoAddtoCart"), AddAllQuantity);

        }
        public void goToProfileAndLogout(){
            mouseOver(String.format(locators.getKey("profile_icon")));
       scrollTillElementDisplay(locators.getKey("logout"));
       clickOnElement(locators.getKey("logout"));
    }
    public void clickOnMyCart(){
        clickOnElement(locators.getKey("my-cart_xpath"));
    }
    public void clickOnNotifyMeonCartDetailPage(){
        clickOnElement(locators.getKey("Brand"));
    }
    public void clickOnProceedButtonOnCartPage(){
        clickOnElement(locators.getKey("Proceed_button_on_CartPage"));
    } 
    public void clickOnProceedButtonOnAddressPage(){
        clickOnElement(locators.getKey("Prodeed_button_on_AddressPage"));
    }
      public void clickOnNirogPartnerQuickLink(){
        clickOnElement(locators.getKey("NirogPartner_QuickLink"));
      }
      public void clickOnOrderForPatient(){
        clickOnElement(locators.getKey("OrderForPatient"));
      }
      public void clickonEnterMobileNoForPatient(String PatientMobNo){
        clickOnElement(locators.getKey("MobileNoForPatient"));
        wait(2000);
        enterText(locators.getKey("MobileNoForPatient"), PatientMobNo);
      }
      public void clickOnNEXT(String Alert){
        clickOnElement(locators.getKey("NEXT"));
        verifyText(locators.getKey("AlertMessage"), Alert);
      }
      public void clickOnAddNewPatient(){
        clickOnElement(locators.getKey("Add_New_Patient"));
      }
      public void clickOnFullName(String FullName){
        clickOnElement(locators.getKey("PatientFullName"));
        enterText(locators.getKey("PatientFullName"), FullName);
      }
      public void clickOnMobileNumber(String MobileNumber){
        clickOnElement(locators.getKey("PatientMobileNumber"));
        enterText(locators.getKey("PatientMobileNumber"), MobileNumber);
      }

      public void generateMobileNumberforPatient(){
        MobileRandom(locators.getKey("PatientMobileNumber"));
        log.info("STEP:Enter mobile number successfully" + "PatientMobileNumber");
    }
     public void clickOnAlternateMobileNumber(String AlternateNumber){
        clickOnElement(locators.getKey("PatientAlternateMianer"));
        enterText(locators.getKey("PatientAlternateMianer"), AlternateNumber);
     }
     public void clickOnAddress(String Address){
        clickOnElement(locators.getKey("PatientAddress"));
        enterText(locators.getKey("PatientAddress"), Address);
     }
     public void clickOnLandMark(String Landmark){
        clickOnElement(locators.getKey("PatientLandmark"));
        enterText(locators.getKey("PatientLandmark"), Landmark);
     }
     public void clickOnPIN(String PIN){
        clickOnElement(locators.getKey("PatientPINCode"));
        enterText(locators.getKey("PatientPINCode"), PIN);
        wait(2000);
     }
     public void clickOnAddPatientButton(){
        clickOnElement(locators.getKey("AddPatientButton"));
     }
     public void clickOnMedicineSearch(String ResellerMedicine){
        verifyVisibility(locators.getKey("MedicineSearch"));
        clickOnElement(locators.getKey("MedicineSearch"));
        enterText(locators.getKey("MedicineSearch"), ResellerMedicine);
     }
     public void clickOnSelect(){
        verifyVisibility(locators.getKey("Select"));
        clickOnElement(locators.getKey("Select"));
        wait(2000);
     }

     public void selectSizeForReseller(){
        verifyVisibility(locators.getKey("Reseller_Medicine_Size"));
        clickOnElement(locators.getKey("Reseller_Medicine_Size"));
     }
     public void enterQuantityForReseller(String quantity){
        clickOnElement(locators.getKey("Reseller_Quantity"));
        enterText(locators.getKey("Reseller_Quantity"),quantity);
     }

     public void clickOnContinueButtonForReseller(){
        clickOnElement(locators.getKey("Reseller_Continue_Button"));
        verifyVisibility(locators.getKey("Reseller_Add_To_Cart"));
        clickOnElement(locators.getKey("Reseller_Add_To_Cart"));
     
     }

     public void verifyAddToCartSuceessMessage(String successfullMessage){
        verifyVisibility(locators.getKey("Verify_Text_Add_Tag"));
        verifyText(locators.getKey("Verify_Text_Add_Tag"), successfullMessage);

     }

     public void clickOnCartForResller(){
        clickOnElement(locators.getKey("Reseller_Cart"));
     }


     public void updateResellerQTy(String UpdateQty){
        verifyVisibility(locators.getKey("Reseller_Cart_Quantity"));
        enterText(locators.getKey("Reseller_Quantity"),UpdateQty);
     }


     public void clickOnProccedButtonForReseller(){
        clickOnElement(locators.getKey("Resller_Proceed_Button"));

     }


    }

 
