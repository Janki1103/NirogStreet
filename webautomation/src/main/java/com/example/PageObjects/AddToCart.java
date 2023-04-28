package com.example.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AddToCart extends GenericUtils{
    
    PropertyFileOperations locators;
    public WebDriver driver;
    
    public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(AddToCart.class);
    
    
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public AddToCart() throws IOException {

   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }   

    public void clickonAllMedicine(){
        clickOnElement(locators.getKey("Allmedicine_menu"));
        log.info("STEP:Click on All medicine Successfully" + "Allmedicine_menu");
    }

    // public WebElement verifyCart() throws InterruptedException{

    //     verifyVisibility(locators.getKey("my_cart"));
    //      clickOnElement(locators.getKey("my_cart"));
    //      wait(5000);
    //      verifyVisibility(locators.getKey("my_cart_proceed_button"));
    //      clickOnElement(locators.getKey("my_cart_proceed_button"));
    //       wait(4000);
    //         // verifyVisibility(locators.getKey("loader")); 
    //         // verifyInvisibility(locators.getKey("loader"));    
    //        // verifyVisibility(locators.getKey("loader")); 
    //         List<WebElement> elements = getDriver().findElements(By.xpath("//button[@data-automation='medicine-remove-button' and @class='w-10 h-10 rounded-full bg-gray-50 shrink-0 flex justify-center items-center group']"));
         
    //         if(elements.size() > 0) {
    //             System.out.println("Avaialble product count in the cart is :  "  + elements.size());
    //             for(WebElement product: elements) {
    //         	clickOnElement(locators.getKey("Remove_Product"));
             
    //         	System.out.println("Product removed!!");
    //             wait(2000);
            	             	
    //         }

    //         }
	// 		return null;
              
         
    //     }        

        public WebElement verifyCart() throws InterruptedException{

             verifyVisibility(locators.getKey("my_cart"));
             clickOnElement(locators.getKey("my_cart"));
             wait(7000);
             verifyVisibility(locators.getKey("my_cart_proceed_button"));
             WebElement element= getElement(locators.getKey("my_cart_proceed_button"));
             wait(5000);  
                 if (element.isDisplayed() && element.isEnabled()) {
                    clickOnElement(locators.getKey("my_cart_proceed_button"));                  
                    System.out.println("Button is enabled and will check for products!!");
                    verifyVisibility(locators.getKey("Remove_Product"));

                    List<WebElement> elements = getDriver().findElements(By.xpath("//button[@data-automation='medicine-remove-button' and @class='w-10 h-10 rounded-full bg-gray-50 shrink-0 flex justify-center items-center group']"));
             
                    if(elements.size() > 0) {
                        System.out.println("Avaialble product count in the cart is :  "  + elements.size());
                        for(WebElement product: elements) {
                        clickOnElement(locators.getKey("Remove_Product"));
                     
                        System.out.println("Product removed!!");
                        verifyPageLoader(locators.getKey("loader"));
                        wait(2000);
                        }
                    }
                    else{
                        System.out.println("Not able to remove product!!");
                    }
                }
                return element;
                }
                        
              
             
         

    public void clickonSearchIconForFilter(){
        verifyVisibility(locators.getKey("Medicine_searh_icon"));
        clickOnElement(locators.getKey("Medicine_searh_icon"));
        log.info("STEP:Click on search icon Successfully" + "Medicine_searh_icon");
    }
    public void EnterBrandName(String brandName){
        
        verifyVisibility(locators.getKey("search_input_medicine"));

        enterText(locators.getKey("search_input_medicine"), brandName);
        log.info("STEP:Click on search icon Successfully" + "Medicine_searh_icon");
       // actionEnter();
       clickOnElement(locators.getKey("Medicine_searh_icon"));
     
    }
    public void selectBrandName(){
        clickOnElement(locators.getKey("filter_checkbox"));
        log.info("STEP:Click on checkbox Successfully" + "filter_checkbox");
    }

    // public void openTheProduct(){
    //     clickOnElement(locators.getKey("item_of_medicine"));
    //     log.info("STEP:Open the product Successfully" + "item_of_medicine");
    // }

    public void openTheProduct(){
        wait(3000);
        // String productName = "Kudos";
        // String customizedXpath ="(//div[contains(text()," + "'" +productName+ "'" + ")])[1]";
        // System.out.println(customizedXpath);
        // WebElement element = driver.findElement(By.xpath(customizedXpath));
        // element.click();
        
       clickOnElement(locators.getKey("item_of_medicine"));
       log.info("STEP:Open the product Successfully" + "item_of_medicine");
    }

    public void clickOnBookmark(){
        clickOnElement(locators.getKey("bookmark_medicine_button"));
        log.info("STEP:bookmark of product Successfully" + "bookmark_medicine_button");
    }

    public void selectSizeOfProduct(){
        verifyVisibility(locators.getKey("size_of_profuct"));
        clickOnElement(locators.getKey("size_of_profuct"));
        log.info("STEP:Product size select Successfully" + "size_of_profuct");
    }
    public void selectSizeOfSearchedProduct(){
        verifyVisibility(locators.getKey("product_size"));
        clickOnElement(locators.getKey("product_size"));
        log.info("STEP:Product size select Successfully" + "product_size");
    }

    public void enterQuantity(String Quantity){
        verifyVisibility(locators.getKey("Quantity_input"));
        enterText(locators.getKey("Quantity_input"), Quantity);
        wait(1000);
        log.info("STEP:Quantity added Successfully" + "Quantity_input");
    }

    public void clickOnAddToCart(){
        verifyVisibility(locators.getKey("add_to_cart_button"));
        clickOnElement(locators.getKey("add_to_cart_button"));
        log.info("STEP:Add to cart button clicked Successfully" + "add_to_cart_button");
    }

    public void clickOnChangePincode(){
        verifyVisibility(locators.getKey("Reg_Confirm_button"));
        clickOnElement(locators.getKey("Reg_Confirm_button"));
        wait(1000);
        log.info("STEP: Click on change pincode successfully" + "Reg_Confirm_button");
        verifyVisibility(locators.getKey("add-new-address"));
        clickOnElement(locators.getKey("add-new-address"));
        log.info("STEP: Click on add new address successfully" + "add-new-address");
    }
    
    public void removeAddressolder(){
        wait(2000);
        verifyVisibility(locators.getKey("Profileiconclick"));
        clickOnElement(locators.getKey("Profileiconclick"));
        verifyVisibility(locators.getKey("Address_menu"));
        clickOnElement(locators.getKey("Address_menu"));
        verifyVisibility(locators.getKey("Address_remove"));
        clickOnElement(locators.getKey("Address_remove"));
        
    }
    public WebElement removeAddress() throws InterruptedException{
       
        verifyVisibility(locators.getKey("Profileiconclick"));
        mouseOver(locators.getKey("Profileiconclick"));
        wait(2000);
        verifyVisibility(locators.getKey("Address_menu"));
        clickOnElement(locators.getKey("Address_menu"));
        scrollDown150();
        List<WebElement> address = getDriver().findElements(By.xpath("//button[@data-automation='remove-default-address-button']"));
          if(address.size() > 0) {
              System.out.println("Avaialble Address count in the cart is :  "  + address.size());
              for(WebElement addreses: address) {
              
              clickOnElement(locators.getKey("Address_remove"));
           
              System.out.println("Address removed!!");
              wait(2000);
                               
          }

          }
          return null;
            
       
      }        
      public WebElement olderAddressRemove() throws InterruptedException{
       
       wait(1000);
        scrollup();
       wait(1000);
        scrollup();
       wait(2000);
        List<WebElement> address = getDriver().findElements(By.xpath("//button[@data-automation='remove-default-address-button']"));
          if(address.size() > 0) {
              System.out.println("Avaialble product count in the cart is :  "  + address.size());
              for(WebElement addreses: address) {
              
              clickOnElement(locators.getKey("Address_remove"));
           
              System.out.println("Address removed!!");
              wait(2000);
                               
          }

          }
          return null;
            
       
      } 
      public void openAddress(){
        pageRefresh();
        wait(4000);
        verifyVisibility(locators.getKey("Profileiconclick"));
         mouseOver(locators.getKey("Profileiconclick"));
        wait(2000);
        verifyVisibility(locators.getKey("Address_menu"));
        clickOnElement(locators.getKey("Address_menu"));
        scrollDown();
        wait(2000);
        scrollDown();
        clickOnElement(locators.getKey("add-new-address"));
      }


    public void addAddressDetails(String name,String mobname , String alternatemob, String address,String Landmark,String Pincode){
        enterText(locators.getKey("addressfullname"), name);
        log.info("STEP: Entered full name succesfully" + "addressfullname");
        enterText(locators.getKey("addressmobnumber"), mobname);
        log.info("STEP: Entered mobile number succesfully" + "addressmobnumber");
        enterText(locators.getKey("addrssalternatenumber"), alternatemob);
        log.info("STEP: Entered alternate number succesfully" + "addrssalternatenumber");
        enterText(locators.getKey("addressaddress"), address);
        log.info("STEP: Entered address succesfully" + "addressaddress");
        enterText(locators.getKey("adresslandmark"), Landmark);
        log.info("STEP: Entered landmark succesfully" + "adresslandmark");
        enterText(locators.getKey("addresspincode"), Pincode);
        wait(3000);
        // verifyVisibility(locators.getKey("save-address-button"));
        // clickOnElement(locators.getKey("save-address-button"));
        // wait(3000);
        // log.info("STEP: Click on save address button succesfully" + "save-address-button");
        // clickOnElement(locators.getKey("close_Address_popup"));
            

    }
    public void addAddressDetailsWithSave(String name,String mobname , String alternatemob, String address,String Landmark,String Pincode){
        verifyVisibility(locators.getKey("addressfullname"));
        enterText(locators.getKey("addressfullname"), name);
        log.info("STEP: Entered full name succesfully" + "addressfullname");
        enterText(locators.getKey("addressmobnumber"), mobname);
        log.info("STEP: Entered mobile number succesfully" + "addressmobnumber");
        enterText(locators.getKey("addrssalternatenumber"), alternatemob);
        log.info("STEP: Entered alternate number succesfully" + "addrssalternatenumber");
        enterText(locators.getKey("addressaddress"), address);
        log.info("STEP: Entered address succesfully" + "addressaddress");
        enterText(locators.getKey("adresslandmark"), Landmark);
        log.info("STEP: Entered landmark succesfully" + "adresslandmark");
        enterText(locators.getKey("addresspincode"), Pincode);
        wait(3000);
        verifyVisibility(locators.getKey("save-address-button"));
        clickOnElement(locators.getKey("save-address-button"));
        wait(3000);
        log.info("STEP: Click on save address button succesfully" + "save-address-button");
      //  clickOnElement(locators.getKey("close_Address_popup"));
            

    }

    public void addAddressFullDetails(String name,String mobname , String alternatemob, String address,String Landmark,String Pincode,String GSTNumber,String LegalEntityName){
        enterText(locators.getKey("addressfullname"), name);
        log.info("STEP: Entered full name succesfully" + "addressfullname");
        enterText(locators.getKey("addressmobnumber"), mobname);
        log.info("STEP: Entered mobile number succesfully" + "addressmobnumber");
        enterText(locators.getKey("addrssalternatenumber"), alternatemob);
        log.info("STEP: Entered alternate number succesfully" + "addrssalternatenumber");
        enterText(locators.getKey("addressaddress"), address);
        log.info("STEP: Entered address succesfully" + "addressaddress");
        enterText(locators.getKey("adresslandmark"), Landmark);
        log.info("STEP: Entered landmark succesfully" + "adresslandmark");
        enterText(locators.getKey("addresspincode"), Pincode);
        wait(1000);
        enterText(locators.getKey("GST_numbers"), GSTNumber);
        enterText(locators.getKey("Legal_Entity_Name"), LegalEntityName);
        wait(3000);
      

    }
    public void addAddressFullDetailsWithDefaultShipping(String name,String mobname , String alternatemob, String address,String Landmark,String Pincode){
        enterText(locators.getKey("addressfullname"), name);
        log.info("STEP: Entered full name succesfully" + "addressfullname");
        enterText(locators.getKey("addressmobnumber"), mobname);
        log.info("STEP: Entered mobile number succesfully" + "addressmobnumber");
        enterText(locators.getKey("addrssalternatenumber"), alternatemob);
        log.info("STEP: Entered alternate number succesfully" + "addrssalternatenumber");
        enterText(locators.getKey("addressaddress"), address);
        log.info("STEP: Entered address succesfully" + "addressaddress");
        enterText(locators.getKey("adresslandmark"), Landmark);
        log.info("STEP: Entered landmark succesfully" + "adresslandmark");
        enterText(locators.getKey("addresspincode"), Pincode);
        wait(1000);
       clickOnElement(locators.getKey("Billing_Address"));


    }


    public void saveAddress(){

        wait(4000);
        clickOnElement(locators.getKey("save-address-button"));
        log.info("STEP: Click on save address button succesfully" + "save-address-button");
        wait(2000);
        clickOnElement(locators.getKey("close_Address_popup"));
        log.info("STEP: Close the popup of address succesfully" + "close_Address_popup");
        wait(2000);
        verifyVisibility(locators.getKey("add_to_cart_button"));
        clickOnElement(locators.getKey("add_to_cart_button"));
        wait(2000);
        log.info("STEP:Add to cart button clicked Successfully" + "add_to_cart_button");

    }

    public void clickonContinueShopping(){
        wait(1000);
        verifyVisibility(locators.getKey("ContinueShppoing_button"));
        clickOnElement(locators.getKey("ContinueShppoing_button"));
        log.info("STEP: Click on continue shopping button succesfully" + "ContinueShppoing_button");
        clickOnElement(locators.getKey("add_to_cart_button"));
        log.info("STEP:Add to cart button clicked Successfully" + "add_to_cart_button");
    }

    public void verifyAddToCartSuccessMessage(String actualMessage){
        verifyVisibility(locators.getKey("success_Message"));
        verifyText(locators.getKey("success_Message"), actualMessage);
        log.info("STEP:Add to cart message verified  Successfully" + "success_Message");
    }

    public void searchProduct(String productName){
        verifyVisibility(locators.getKey("Uiversal_search"));
        enterText(locators.getKey("Uiversal_search"), productName);
        wait(2000);
        log.info("STEP:search the product Successfully" + "Uiversal_search");
    }
    public void openProduct(){
        verifyVisibility(locators.getKey("open_medicine"));
        clickOnElement(locators.getKey("open_medicine"));
        log.info("STEP: open medidicine Successfully" + "open_medicine");
    }

    public void openCart(){
        verifyVisibility(locators.getKey("my_cart"));

        clickOnElement(locators.getKey("my_cart"));
        wait(3000);
         verifyVisibility(locators.getKey("my_cart_proceed_button"));
         clickOnElement(locators.getKey("my_cart_proceed_button"));
        log.info("STEP:opeed the cart Successfully" + "my_cart");
    }
    public void clickonProceedToCartforCoupon(){
        // clickOnElement(locators.getKey("my_cart_proceed_button"));
         log.info("STEP: click on proceed button Successfully" + "my_cart_proceed_button");
         scrollDown();
         scrollDown();
         scrollDown();
         verifyVisibility(locators.getKey("proceed_button"));
         clickOnElement(locators.getKey("proceed_button"));
        //  pageRefresh();  
        //  wait(1000); 
        //  scrollDown();
        //  scrollDown();
        //  verifyVisibility(locators.getKey("proceed_button"));
        //  clickOnElement(locators.getKey("proceed_button"));  
         scrollDown();
         wait(1000);
         scrollDown();
         wait(1000);
         verifyVisibility(locators.getKey("proceed_button"));
         clickOnElement(locators.getKey("proceed_button"));               
         log.info("STEP: click on proceed button Successfully" + "proceed_button");
         wait(1000);
     }
    public void clickonProceedToCart(){
       // clickOnElement(locators.getKey("my_cart_proceed_button"));
        log.info("STEP: click on proceed button Successfully" + "my_cart_proceed_button");
        wait(4000);
        scrollDown();
        scrollDown();
        scrollDown();
        verifyVisibility(locators.getKey("proceed_button"));
        clickOnElement(locators.getKey("proceed_button"));
        // pageRefresh(); 

        // wait(1000); 
        // scrollDown();
        // scrollDown();
        // verifyVisibility(locators.getKey("proceed_button"));
        //  clickOnElement(locators.getKey("proceed_button"));  
        // wait(2000);      
        // log.info("STEP: click on proceed button Successfully" + "proceed_button");
        scrollDown();
        scrollDown();
        wait(1000);
        verifyVisibility(locators.getKey("proceed_button"));
        clickOnElement(locators.getKey("proceed_button"));
        scrollDown();
        scrollDown();
        wait(1000);
        clickOnElement(locators.getKey("proceed_button"));
        log.info("STEP: click on proceed button Successfully" + "proceed_button");
    }

    public void verifyNirogMoneyCheckBox(){
        verifyVisibility(locators.getKey("nirogMoney_checkbox"));
        verifyDisableCheckbox(locators.getKey("nirogMoney_checkbox"));
        log.info("STEP: NirogMoney CheckBox is Disabled" + "nirogMoney_checkbox");
    }

    public void searchCoupon(String CouponCode){
     
        verifyVisibility(locators.getKey("coupon_apply_open"));
        clickOnElement(locators.getKey("coupon_apply_open"));
        log.info("STEP: open the coupon section successfully" + "coupon_apply_open");
        verifyVisibility(locators.getKey("enter_coupon_input"));
        clickOnElement(locators.getKey("enter_coupon_input"));
        enterText(locators.getKey("enter_coupon_input"), CouponCode);
        verifyVisibility(locators.getKey("apply_button"));
        clickOnElement(locators.getKey("apply_button"));
        log.info("STEP: Select the coupon successfully" + "coupon_option");
       

    }

    public void applyCoupon(){
        verifyVisibility(locators.getKey("coupon_apply_open"));
        clickOnElement(locators.getKey("coupon_apply_open"));
        log.info("STEP: open the coupon section successfully" + "coupon_apply_open");

        verifyVisibility(locators.getKey("coupon_option"));
        clickOnElement(locators.getKey("coupon_option"));
        log.info("STEP: Select the coupon successfully" + "coupon_option");
        clickOnElement(locators.getKey("apply_coupon_button"));
        log.info("STEP: click on apply coupon button successfully" + "apply_coupon_button");
    }

    public void VerifyCouponInvaliMessage(String InvalidMessage){
        verifyVisibility(locators.getKey("Coupon_invalid_message"));
        verifyText(locators.getKey("Coupon_invalid_message"), InvalidMessage);
        log.info("STEP: verified invalid coupon message successfully" + "apply_coupon_button");
    }

    public void clickOnBackOnCart(){
        verifyVisibility(locators.getKey("Cart_back_arrow"));

        clickOnElement(locators.getKey("Cart_back_arrow"));
        verifyVisibility(locators.getKey("GSTIN_Warning_Msg"));

        verifyInvisibility(locators.getKey("GSTIN_Warning_Msg"));
        clickOnElement(locators.getKey("Cart_back_arrow"));
        log.info("STEP: click on apply coupon button successfully" + "Cart_back_arrow");
    }

    public void updateQuanity(String UpdateQty){
     
        verifyVisibility(locators.getKey("Update_Qty_input"));
        enterText(locators.getKey("Update_Qty_input"), UpdateQty);
        wait(2000);
        log.info("STEP:Click on search icon Successfully" + "Medicine_searh_icon");
    }

    public void removeQty(){
        clickOnElement(locators.getKey("Remove_qty_icon"));
        log.info("STEP: click on remove button successfully" + "Remove_qty_icon");
        wait(3000);
    }
    public void clickOnProceesAfterUpdateDeleteQty(){
        scrollDown();
        wait(2000);
        scrollDown();    
        verifyVisibility(locators.getKey("proceed_button"));
        clickOnElement(locators.getKey("proceed_button"));
        log.info("STEP: click on proceed button Successfully" + "proceed_button");
        scrollDown();
        wait(3000);        scrollDown();
        verifyVisibility(locators.getKey("proceed_button"));
        clickOnElement(locators.getKey("proceed_button"));
        log.info("STEP: click on proceed button Successfully" + "proceed_button");
    }

    public void applyNirogMoney(){
        wait(3000);
        verifyVisibility(locators.getKey("nirogMoney_checkbox"));
        clickOnElement(locators.getKey("nirogMoney_checkbox"));
        log.info("STEP: click on nirog money checkbox Successfully" + "nirogMoney_checkbox");
    }

    public void verifyNirogMoenyInfoMessage(String actualMessage){
        verifyVisibility(locators.getKey("Verify_Nirog_Money_Message"));
        verifyText(locators.getKey("Verify_Nirog_Money_Message"), actualMessage);
    }

    public void selectPayOnDeliveryOption(){
        scrollDown();
        wait(1000);
        verifyVisibility(locators.getKey("PayOnDelivery_Selection"));
        clickOnElement(locators.getKey("PayOnDelivery_Selection"));        
        log.info("STEP: Select pay on delivery option Successfully" + "PayOnDelivery_Selection");
    }

    public void clickOnpayNowButton(){
        clickOnElement(locators.getKey("PayNow_button"));
        log.info("STEP: click on pay now button Successfully" + "PayNow_button");
        
    }

    public void enterOTPOnFinalPayment(String OTPOne,String OTPTwo, String OTPThree,String OTPFour){
        enterText(locators.getKey("OTPOne"), OTPOne);
        enterText(locators.getKey("OTPTwo"), OTPTwo);
        enterText(locators.getKey("OTPThree"), OTPThree);
        enterText(locators.getKey("OTPFour"), OTPFour);
        log.info("STEP:entered OTP Successfully" );
        
    }

    public void verifyConfirmMessage(String actualMessage){
        clickOnElement(locators.getKey("ConfirmOrder_Button"));
        log.info("STEP:Click on confirm button Successfully" + "ConfirmOrder_Button");
        verifyVisibility(locators.getKey("loader"));
        verifyInvisibility(locators.getKey("loader"));
        verifyText(locators.getKey("Confirm_message"), actualMessage);
        log.info("STEP:Confirm order message verified  Successfully" + "Confirm_message");
    }

   
}

