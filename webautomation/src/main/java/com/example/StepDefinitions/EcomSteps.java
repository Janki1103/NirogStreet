package com.example.StepDefinitions;

import com.example.PageObjects.AddToCart;
import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EcomSteps {
    PageObjectManager pageObjectManager; 
// Call object of other classes
    TestContextSetup testContextSetup  =  new TestContextSetup();
//TestContextSetup testContextSetup;
GenericUtils genericUtils;
//Spring Framework,EJB -Cucumber dependancy injection -Cucumber PicoContainer
//Create a new TestContextSetupClass file under Utility
// Will create one constructor with the same class name
// This constructor will automatically called when we create objects of this class
// Will pass instance of TestContextSetup
// Constructor
//=========


//public EcomSteps (TestContextSetup testContextSetup)
//{
//	this.testContextSetup= testContextSetup;
//}
public EcomSteps ()
{
//	this.testContextSetup= testContextSetup;
}

@When("^User verify the cart$")
    public void user_verify_the_cart() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.verifyCart();
    }
@When("^User click on all medicine menu and search the brand as (.+)$")
    public void user_click_on_all_medicine_menu_and_search_the_brand_as(String brand) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.clickonAllMedicine();
      addToCart.clickonSearchIconForFilter();
      addToCart.EnterBrandName(brand);
      addToCart.selectBrandName();
    }

    @When("^User open the product$")
    public void user_open_the_product() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.openTheProduct();
    }

    @When("^User click on bookmark icon$")
    public void user_click_on_bookmark_icon() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.clickOnBookmark();
    }

    @When("^User Select the size of the product$")
    public void user_select_the_size_of_the_product() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.selectSizeOfProduct();    
    }

    @When("^User Enter the quantity of product as (.+)$")
    public void user_enter_the_quantity_of_product_as(String quantity) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.enterQuantity(quantity);
    }

    

    @When("^user click on add to cart button$")
    public void user_click_on_add_to_cart_button() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.clickOnAddToCart();
    }

    @When("^User verify succesfull message as (.+)$")
    public void user_verify_succesfull_message_as(String addtocartsuccessmessage) throws Throwable {
     // AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      //addToCart.verifyAddToCartSuccessMessage(addtocartsuccessmessage);
    }

    @When("^User remove address$")
    public void user_remove_address() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.removeAddress();

    }

    @When("^Open Address menu$")
    public void open_address_menu() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.openAddress();
    }
    
    @When("^User click on change Pincode and click on add new address$")
    public void user_click_on_change_pincode_and_click_on_add_new_address() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.clickOnChangePincode();
    }

    @When("^User enter full name as a (.+),Mobile Number as a (.+),Alternative Mobile NUmber as a (.+),Address as a (.+) , Landmark as a (.+),pincode as a (.+)$")
    public void user_enter_full_name_as_a_mobile_number_as_a_alternative_mobile_number_as_a_address_as_a_landmark_as_a_pincode_as_a(String fullname, String mobilenumber, String alternativenumber, String address, String landmark, String pincode) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.addAddressDetails(fullname, mobilenumber, alternativenumber, address, landmark, pincode);
    }
    @When("^User can enter full name as a (.+),Mobile Number as a (.+),Alternative Mobile NUmber as a (.+),Address as a (.+) , Landmark as a (.+),pincode as a (.+) and click on save button$")
    public void user_can_enter_full_name_as_a_mobile_number_as_a_alternative_mobile_number_as_a_address_as_a_landmark_as_a_pincode_as_a_and_click_on_save_button(String fullname, String mobilenumber, String alternativenumber, String address, String landmark, String pincode) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.addAddressDetailsWithSave(fullname, mobilenumber, alternativenumber, address, landmark, pincode);
    }

    @When("^User remove address which is created previosuly$")
    public void user_remove_address_which_is_created_previosuly() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.olderAddressRemove();
    }
    @When("^User enter address details like full name as a (.+),Mobile Number as a (.+),Alternative Mobile NUmber as a (.+),Address as a (.+) , Landmark as a (.+),pincode as a (.+),GST Number as a (.+) and Legal Entity name as a (.+)$")
    public void user_enter_address_details_like_full_name_as_a_mobile_number_as_a_alternative_mobile_number_as_a_address_as_a_landmark_as_a_pincode_as_a_gst_number_as_a_and_legal_entity_name_as_a(String fullname, String mobilenumber, String alternativenumber, String address, String landmark, String pincode, String gstnumber, String legalentity) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.addAddressFullDetails(fullname, mobilenumber, alternativenumber, address, landmark, pincode,gstnumber,legalentity);
    }

  
    @When("^User add address with default shipping address like enter full name as a (.+),Mobile Number as a (.+),Alternative Mobile NUmber as a (.+),Address as a (.+) , Landmark as a (.+),pincode as a (.+)$")
    public void user_add_address_with_default_shipping_address_like_enter_full_name_as_a_mobile_number_as_a_alternative_mobile_number_as_a_address_as_a_landmark_as_a_pincode_as_a(String fullname, String mobilenumber, String alternativenumber, String address, String landmark, String pincode) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.addAddressFullDetailsWithDefaultShipping(fullname, mobilenumber, alternativenumber, address, landmark, pincode);
    }

    @When("^User click on save address button$")
    public void user_click_on_save_address_button() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.saveAddress();
            
    }

    @When("^User click on continue shopping and verify succesfull message as (.+)$")
    public void user_click_on_continue_shopping_and_verify_succesfull_message_as(String addtocartsuccessmessage) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.clickonContinueShopping();
      //addToCart.verifyAddToCartSuccessMessage(addtocartsuccessmessage);
    }

    @When("^User click on cart and procced for checkout to apply coupon$")
    public void user_click_on_cart_and_procced_for_checkout_to_apply_coupon() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.openCart();
      addToCart.clickonProceedToCartforCoupon();
    }
    @When("^User search the product as (.+)$")
    public void user_search_the_product_as(String productname) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.searchProduct(productname);
      addToCart.actionEnter();         
      addToCart.openProduct();
    }
    
    @When("^User Select the size of the product for searched product$")
    public void user_select_the_size_of_the_product_for_searched_product() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.selectSizeOfSearchedProduct();
    }

    @When("^User click on cart and procced for checkout$")
    public void user_click_on_cart_and_procced_for_checkout() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.openCart();
      addToCart.clickonProceedToCartforCoupon();
    }

    @When("^User click on nirogmoney checkbox and verify it is disabled$")
    public void user_click_on_nirogmoney_checkbox_and_verify_it_is_disabled() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.verifyNirogMoneyCheckBox();
    }

    // @When("^User click on apply coupon and verify coupon message as (.+)$")
    // public void user_click_on_apply_coupon_and_verify_coupon_message_as(String invalidcouponmessage) throws Throwable {
    //   AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
    //   addToCart.applyCoupon();
    //   addToCart.searchCoupon(CouponCode);
    //   addToCart.VerifyCouponInvaliMessage(invalidcouponmessage);
     
    // }

    @When("^User search coupon as (.+) and click on apply coupon and verify coupon message as (.+)$")
    public void user_search_coupon_as_and_click_on_apply_coupon_and_verify_coupon_message_as(String couponcode, String invalidcouponmessage) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.searchCoupon(couponcode);
      addToCart.VerifyCouponInvaliMessage(invalidcouponmessage);
    }

    @When("^User click on back$")
    public void user_click_on_back() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.clickOnBackOnCart();
           
    }
    
    @When("^User update the quantity as (.+) and click on remove product Icon and then again proceed$")
    public void user_update_the_quantity_as_and_click_on_remove_product_icon_and_then_again_proceed(String updateqty) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.removeQty();
      addToCart.updateQuanity(updateqty);
      addToCart.clickOnProceesAfterUpdateDeleteQty();
    }
    @When("^User can update the quantity as (.+) and then again proceed$")
    public void user_can_update_the_quantity_as_and_then_again_proceed(String updateqty) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.updateQuanity(updateqty);
      addToCart.clickOnProceesAfterUpdateDeleteQty();
    }
    @When("^User open the coupon and search coupon as (.+) then applied the coupon and verified the message as (.+)$")
    public void user_open_the_coupon_and_search_coupon_as_then_applied_the_coupon_and_verified_the_message_as(String couponcode, String successmessageofappliedcoupon) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      //addToCart.applyCoupon();
      addToCart.scrollUp();
      
      addToCart.searchCoupon(couponcode);
      addToCart.VerifyCouponInvaliMessage(successmessageofappliedcoupon);
    }
    

    @When("^User applied nirogmoney$")
    public void user_applied_nirogmoney() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.scrollUp150();
      addToCart.applyNirogMoney();
    }

    @Then("^User verify nirogMoney message as (.+)$")
    public void user_verify_nirogmoney_message_as(String nirogmoneyinfomessage) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.verifyNirogMoenyInfoMessage(nirogmoneyinfomessage);
        
    }
    @When("^User select pay on deleivery option$")
    public void user_select_pay_on_deleivery_option() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.selectPayOnDeliveryOption();
    }
    
    @When("^User click on Pay Now button$")
    public void user_click_on_pay_now_button() throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.clickOnpayNowButton();
    }
    
    @When("^User enter OTP As (.+) (.+) (.+) (.+)$")
    public void user_enter_otp_as(String paymentotpone, String paymentotptwo, String paymentotpthree, String paymentotpfour) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.enterOTPOnFinalPayment(paymentotpone, paymentotptwo, paymentotpthree, paymentotpfour);
    }
 
    @Then("^user click on Confirm Order and verify the confirm order message as (.+)$")
    public void user_click_on_confirm_order_and_verify_the_confirm_order_message_as(String successmessageofconfirm) throws Throwable {
      AddToCart addToCart=testContextSetup.pageObjectManager.getAddToCart();
      addToCart.verifyConfirmMessage(successmessageofconfirm);
      addToCart.scrollUp();
    }

 
 
  }













