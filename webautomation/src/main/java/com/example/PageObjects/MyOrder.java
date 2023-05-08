package com.example.PageObjects;
import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MyOrder extends GenericUtils{
    
    PropertyFileOperations locators;
    public WebDriver driver;
    
    public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(AddToCart.class);
    
    
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public MyOrder() throws IOException {

   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }   
    public void copyGeneratedOrderID(){
        //  actionDoubleClick(locators.getKey("Copy_Order_ID")); 
        //  scrollup();
          CopyOrderID(locators.getKey("Copy_Order_ID"));   
      }
  
      public void openMyorderMenu(){
          clickOnElement(locators.getKey("MyOrder_menu"));
  
      }
  
      public void searchOrder(){
        wait(6000);
       // verifyVisibility(locators.getKey("ActiveOrderTab"));

        verifyVisibility(locators.getKey("Order_Search_Icon"));
          clickOnElement(locators.getKey("Order_Search_Icon"));
         
         
  
      }
  
      public void writeOrderID(){
         verifyVisibility(locators.getKey("Order_Search_input"));
          WriteOrder(locators.getKey("Order_Search_input"));
      }

      public void openOrder(){
        verifyVisibility(locators.getKey("Order_track_arrow"));
        clickOnElement(locators.getKey("Order_track_arrow"));
      }
      public void clickOnDownloadInvoiceButton(){
        clickOnElement(locators.getKey("DownloadInvoiceButton"));

      }

      public void verifyInvoiceDownloadMessage(String Message){
        verifyText(locators.getKey("InvoiceDownloadMessage"), Message);
     
      }
      public void clickOnReturnRequestButton(){
        scrollDown();
      //  scrollDown();
        verifyVisibility(locators.getKey("Request_return_button"));
        clickOnElement(locators.getKey("Request_return_button"));
        
      }

      public void selectReturnType(){
        verifyVisibility(locators.getKey("Full_return_radio"));
        clickOnElement(locators.getKey("Full_return_radio"));

      }
      public void orderReturn(){
        // scrollDown150();
        // scrollUp();
        // scrollUp();       
        // clickOnElement(locators.getKey("Return_Reason_input"));
        // keyDown(locators.getKey("Return_Reason_input"));
        // // actionEnter();
        clickOnElement(locators.getKey("ReasonReturn_selection"));
        scrollDown();
        scrollDown150();
        //scrollDown();
        


    }
      public void returnFileUpload(){
        JPGfileuploading(locators.getKey("orderimageupload"));
        scrollDown();
      }

      public void clickonReturnOrderButton(){
        verifyVisibility(locators.getKey("return_order_button"));

        clickOnElement(locators.getKey("return_order_button"));
      }

      public void openReturnOrdrMenu(){
        clickOnElement(locators.getKey("OrdersMenu"));
        clickOnElement(locators.getKey("ReturnrequestMenu"));
        

      }

      public void searchOrderForReturnOrder(){
        verifyVisibility(locators.getKey("OrderIdSearch"));

        clickOnElement(locators.getKey("OrderIdSearch"));
        WriteOrder(locators.getKey("OrderIdSearch"));
      
      }
       
      public void clickOnReturnButton(){
        clickOnElement(locators.getKey("ViewButton"));
        
      }

      public void EnterRTOThenClickOnVerifyButton(String RTONumber){
        enterText(locators.getKey("RTONumber"), "RTONumber");
        clickOnElement(locators.getKey("VerifyOrderButton"));


      }
       public void clickOnVerifyOrder(){
        clickOnElement(locators.getKey("VerifyOrderButton"));

       }
   
       public void enterResonForReturn(String ReasonReturn ){
        enterText(locators.getKey("ReturnReason_input"), "ReasonReturn");
        clickOnElement(locators.getKey("PickRequiredRadio_input"));
        clickOnElement(locators.getKey("ApproveButton"));
       

       }
   
   
   
      }

