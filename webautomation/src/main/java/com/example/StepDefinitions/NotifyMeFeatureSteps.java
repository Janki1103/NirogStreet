package com.example.StepDefinitions;

// import com.example.PageObjects.NotifyMe;
import com.example.PageObjects.NotifyMeFeature;
import com.example.PageObjects.NotifyMefromProdList;
import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotifyMeFeatureSteps {
    PageObjectManager pageObjectManager; 
// Call object of other classes
//TestContextSetup testContextSetup;
TestContextSetup testContextSetup  =  new TestContextSetup();
GenericUtils genericUtils;

//public NotifyMeFeatureSteps(TestContextSetup testContextSetup){
//    this.testContextSetup= testContextSetup;
//}

public NotifyMeFeatureSteps(){
  //  this.testContextSetup= testContextSetup;
}

// NotifyMe from Product Detail
// @When("^User clicks on All medicine button$")
//     public void user_clicks_on_all_medicine_button() throws Throwable {
//         NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
//         notifyme.clickOnAllMedicineButton(); 

    
    @When("^User clicks on All medicines button$")
    public void user_clicks_on_all_medicines_button() throws Throwable {
        NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.clickOnAllMedicineButton();
    }
// @When("^User clicks on All medicines button$")
// public void user_clicks_on_all_medicines_button() throws Throwable {
//    NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
//    notifyme.clickOnAllMedicineButton();
// }
@Then("^User clicks on medicine detail$")
    public void user_clicks_on_medicine_detail() throws Throwable {
        NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.clickOnMedicineDetail();}

        @Then("^User clicks on Medicine Detail$")
    public void user_click_on_medicine_detail() throws Throwable {
        NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.clickOnMedicineDetails();}
    
    @Then("^User clicks on Notify Me button$")
    public void user_clicks_on_notify_me_button() throws Throwable {
        NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.clickOnNotifyMe();
    }
    @Then("^User clicks on QuantityBox$")
    public void user_clicks_on_quantitybox() throws Throwable {
        NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.clickonQuantityBox();  
    }
    @Then("^User enters the quantity as (.+) Quantity$")
    public void user_enters_the_quantity_as_quantity(String quantity) throws Throwable {
        NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe(); 
        notifyme.enterQuantity(quantity);
    }
    // @And("^User cliks on save button$")
    // public void user_cliks_on_save_button() throws Throwable {
    //     NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
    //     notifyme.clickOnSave();
    // }
    @Then("^User cliks on save button$")
    public void user_cliks_on_save_button() throws Throwable {
        NotifyMeFeature notifyme=testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.clickOnSave();
    }
    @Then("^User verify the Alert Message as (.+)$")
        public void user_verify_the_alert_message_as(String alertnotifymesent) throws Throwable {
            NotifyMeFeature notifyme=testContextSetup.pageObjectManager.getNotifyMe();
            notifyme.verifyTheAlertMsg(alertnotifymesent);;
    }
    
    @Then("^User see the Alert Message as (.+)$")
    public void user_see_the_alert_message_as(String alertnotifymesent) throws Throwable {
        NotifyMeFeature notifyme=testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.seeTheAlertMsg(alertnotifymesent);
    }
    @Then("^User enters the quantity for OOS as (.+) Quantity$")
    public void user_enters_the_quantity_for_oos_as_quantity(String quantity) throws Throwable {
        NotifyMeFeature notifyme=testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.enterQuantityforOOS(quantity);
    }

    @Then("^User enter the quantity for OOS as (.+) Quantity$")
    public void user_enter_the_quantity_for_oos_as_quantity(String quantity) throws Throwable {
        NotifyMeFeature notifyme=testContextSetup.pageObjectManager.getNotifyMe();
        notifyme.enterQuantityOOS(quantity);
    }
    // @And("^User cliks on save button$")
    // public void user_cliks_on_save_button() throws Throwable {
    //     NotifyMeFeature notifyme =testContextSetup.pageObjectManager.getNotifyMe();
    //     notifyme.clickOnSave();
    // }
    // @And("^User cliks on save button$")
    // public void user_cliks_on_save_button() throws Throwable {
    //     NotifyMeFeature notifyme = testContextSetup.pageObjectManager.getNotifyMe();
    //     notifyme.clickOnSave();
    

// NotifyMe From Product listing Page


@Then("^User clicks on add to cart button$")
    public void user_clicks_on_add_to_cart_button() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnAddToCartButton();   
}

@Then("^User clicks on NotifyMe Button$")
    public void user_clicks_on_notifyme_button() throws Throwable {
 NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();    
 notifymefromprodlist.clickOnNotifyMeButton();
}

@Then("^User clicks on Quantity box$")
public void user_clicks_on_quantity_box() throws Throwable {
    NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();    
    notifymefromprodlist.clickOnQuantityBox();
};

@Then("^User enters a quantity as (.+) Quantity$")
    public void user_enters_a_quantity_as_quantity(String quantity) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
    notifymefromprodlist.enterQuantity(quantity);
    }
    @Then("^User clicks on Save and see the successfully added message as (.+) SuccessfullyAddedToCart$")
    public void user_clicks_on_save_and_see_the_successfully_added_message_as_successfullyaddedtocart(String alertsuccessfullyaddedtocart) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
    notifymefromprodlist.clickOnSave(alertsuccessfullyaddedtocart);
    }
    @Then("^User Clicks on CrossButton$")
    public void user_clicks_on_crossbutton() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
    notifymefromprodlist.clickOnCrossButton();
    }
    @Then("^User clicks on Add to cart on other Medicine$")
    public void user_clicks_on_add_to_cart_on_other_medicine() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
    notifymefromprodlist.clickOnAddtoCartonOtherMed();
    }

@Then("^User Selects the medicine size$")
    public void user_selects_the_medicine_size() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
    notifymefromprodlist.selectMedicineSize();
    }

@Then("^User clicks on Notify Me of In Stock item$")
    public void user_clicks_on_notify_me_of_in_stock_item() throws Throwable {
    NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
    notifymefromprodlist.clickOnNotifyMeofInStockItem();    
    }
    @Then("^User clicks on Quantity Box of In stock NotifyMe$")
    public void user_clicks_on_quantity_box_of_in_stock_notifyme() throws Throwable {
    NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList(); 
    notifymefromprodlist.clickOnQuantityBoxInStockNF(); 
    }
    
    @Then("^User clicks on Quantity Box to Add into Cart$")
    public void user_clicks_on_quantity_box_to_add_into_cart() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clicksOnQuantityBoxtoAddintoCart();
    
    }
   

    @Then("^User adds a quantity as(.+) AddtoCartQuantity$")
    public void user_adds_a_quantity_as_addtocartquantity(String addtocartquantity) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.enterQuantitytoadd(addtocartquantity);
    }
    
    @Then("^User cliks on Add to cart and Verify the alert message as (.+) Keep Me Posted$")
    public void user_cliks_on_add_to_cart_and_verify_the_alert_message_as_keep_me_posted(String keepmeposted) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnAddtoCart();
    }
    @Then("^User clicks on OK button$")
    public void user_clicks_on_ok_button() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnOkButton();
    }
    @Then("^User Enters a quantity to add all InStock medicine as (.+) All Quantity$")
    public void user_enters_a_quantity_to_add_all_instock_medicine_as_all_quantity(String allqunatity) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.enterAllQuantity(allqunatity);
    }
    
    @Then("^User should be able to go profile and logout$")
    public void user_should_be_able_to_go_profile_and_logout() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.goToProfileAndLogout();
    }
    @Then("^User should be able to click on My Cart$")
    public void user_should_be_able_to_click_on_my_cart() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnMyCart();  
    }
    
    @Then("^User should be able to click on NotifyMe on Cart detail page$")
    public void user_should_be_able_to_click_on_notifyme_on_cart_detail_page() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnNotifyMeonCartDetailPage();
    }
   
    @Then("^User clicks on Proceed button on cart page$")
    public void user_clicks_on_proceed_button_on_cart_page() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnProceedButtonOnCartPage();
    }
    @Then("^User shouls e able to click on Proceed button on address page$")
    public void user_shouls_e_able_to_click_on_proceed_button_on_address_page() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnProceedButtonOnAddressPage(); 
    }
    @Then("^User clicks on universal search bar$")
    public void user_clicks_on_universal_search_bar() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnUniversalSearchBar();
    }
    @Then("^User enters the Medicine1 Name as (.+) medicineName1$")
    public void user_enters_the_medicine1_name_as_medicinename1(String medicine1) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.enterMedicineName(medicine1);
    }
    @Then("^User clicks on Notify Me of OOS item$")
    public void user_clicks_on_notify_me_of_oos_item() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnNotifyMeOfOOSProduct();   
    }
    
    @Then("^User clicks on NirogPartner Quick link$")
    public void user_clicks_on_nirogpartner_quick_link() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnNirogPartnerQuickLink();
    }
    @Then("^User clicks on Order for patient$")
    public void user_clicks_on_order_for_patient() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnOrderForPatient();
    }
    @Then("^user enters a mobile number as (.+)$")
    public void user_enters_a_mobile_number_as(String patientmobilenumber1) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickonEnterMobileNoForPatient(patientmobilenumber1);
    }
    
    @Then("^User clicks on Next and verify the Alert Message as (.+)$")
    public void user_clicks_on_next_and_verify_the_alert_message_as(String alertmessage) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnNEXT(alertmessage);
    }
    @Then("^user clicks on add new patient$")
    public void user_clicks_on_add_new_patient() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnAddNewPatient();
    }

    @Then("^clicks on full name and enter a name (.+)$")
    public void clicks_on_full_name_and_enter_a_name(String fullname) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnFullName(fullname);
    }
    @Then("^clicks on Mobile Number and enter a (.+)$")
    public void clicks_on_mobile_number_and_enter_a(String patientmobilenumber2) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnMobileNumber(patientmobilenumber2);
    }

    @Then("^User enter patient number$")
    public void user_enter_patient_number() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.generateMobileNumberforPatient();
    }

    @Then("^clicks on Alternate number and enters a (.+)$")
    public void clicks_on_alternate_number_and_enters_a(String patientalternatenumber) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnAlternateMobileNumber(patientalternatenumber);
    }
    @Then("^clicks on Address and enter (.+)$")
    public void clicks_on_address_and_enter(String address) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnAddress(address);
    }
    @Then("^clicks on Landmark and enter (.+)$")
    public void clicks_on_landmark_and_enter(String landmark) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnLandMark(landmark);
    }
    @Then("^clicks on pincode as (.+)$")
    public void clicks_on_pincode_as(String pincode) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnPIN(pincode);

    }
    @Then("^user clicks on add patient$")
    public void user_clicks_on_add_patient() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnAddPatientButton();
        
    }
    // @Then("^User clicks on Medicine serach$")
    // public void user_clicks_on_medicine_serach() throws Throwable {
    //     NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
    //     notifymefromprodlist.clickOnMedicineSearch();
    // }
    @Then("^User search a medicine as (.+)$")
    public void user_search_a_medicine_as(String resellermedicine) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnMedicineSearch(resellermedicine);
    }
    @Then("^click on Select$")
    public void click_on_select() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnSelect();
    }
   
    @When("^User select the size of medicine, add quantity as (.+) and click on continue button$")
    public void user_select_the_size_of_medicine_add_quantity_as_and_click_on_continue_button(String quantity) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.selectSizeForReseller();
        notifymefromprodlist.enterQuantityForReseller(quantity);
        notifymefromprodlist.clickOnContinueButtonForReseller();
    }

    @Then("^User can verify successful message as (.+)$")
    public void user_can_verify_successful_message_as(String addtocartsuccessmessage) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.verifyAddToCartSuceessMessage(addtocartsuccessmessage);
    }

    @When("^User click on cart and update quantiry as (.+)$")
    public void user_click_on_cart_and_update_quantiry_as(String updateqty) throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnCartForResller();
        notifymefromprodlist.updateResellerQTy(updateqty);

    }

    @When("^User click on procced button$")
    public void user_click_on_procced_button() throws Throwable {
        NotifyMefromProdList notifymefromprodlist = testContextSetup.pageObjectManager.getNotifyMefromProdList();
        notifymefromprodlist.clickOnProccedButtonForReseller();
    }


 }


