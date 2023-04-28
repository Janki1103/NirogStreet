package com.example.StepDefinitions;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.example.PageObjects.MyOrder;
import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import app.constants.ApplicationConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import java.io.IOException;


public class MyOrderSteps extends GenericUtils{
    PageObjectManager pageObjectManager; 
    private final String Base_URL=  "https://jsonplaceholder.typicode.com/posts/";
    private final String Post_Base_URL="https://stg3web.1veda.in/api/core/orders/";
    private final String token= "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAzNTg0LCJpYXQiOjE2NTQ3Njg0MjF9.emOEgu-w87Ey66MnLWHoc8GCaownT3kHT5rxIn2ETNQ";
    private Response response;
   // private Scenario scenario;
    



// Call object of other classes
//TestContextSetup testContextSetup;
TestContextSetup testContextSetup  =  new TestContextSetup();
// GenericUtils genericUtils;

//Spring Framework,EJB -Cucumber dependancy injection -Cucumber PicoContainer
//Create a new TestContextSetupClass file under Utility
// Will create one constructor with the same class name
// This constructor will automatically called when we create objects of this class
// Will pass instance of TestContextSetup
// Constructor
//=========


//public MyOrderSteps (TestContextSetup testContextSetup) throws IOException
//{
//	this.testContextSetup= testContextSetup;
//}


public MyOrderSteps () throws IOException
{
	//this.testContextSetup= testContextSetup;
}
    @Then("^user copy order id and click on my order menu$")
    public void user_copy_order_id_and_click_on_my_order_menu() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.copyGeneratedOrderID();
     
    }
 
    @Then("^User search the order$")
    public void user_search_the_order() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.openMyorderMenu();
      myOrder.searchOrder();
      myOrder.writeOrderID();
    }
 
    
    @When("^User open the order$")
    public void user_open_the_order() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.openOrder();
    }

    @Then("^User click on download Invoice Button and verify message as (.+)$")
    public void user_click_on_download_invoice_button_and_verify_message_as(String invoicemessage) throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.clickOnDownloadInvoiceButton();
      myOrder.verifyInvoiceDownloadMessage(invoicemessage);
      wait(1000);    }

    
    @Then("^User click on return buttton and select return type$")
    public void user_click_on_return_buttton_and_select_return_type() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.clickOnReturnRequestButton();
      myOrder.selectReturnType();
    }
    @Then("^User select return reason$")
    public void user_select_return_reason() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.orderReturn();
    }

    @Then("^click on return order$")
    public void upload_file_and_click_on_return_order() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.clickonReturnOrderButton();
    }

    @Then("^User open the return order menu$")
    public void user_open_the_return_order_menu() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.openReturnOrdrMenu();
    }
    
    @Then("^User search order$")
    public void user_search_order() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.searchOrderForReturnOrder();
      
    }
    @When("^User click on Return Button on the listing page$")
    public void user_click_on_return_button_on_the_listing_page() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      
      myOrder.clickOnReturnButton(); 
    }
    
    @When("^User enter return reson as (.+) and click on approve button$")
    public void user_enter_return_reson_as_and_click_on_approve_button(String returnreason) throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.enterResonForReturn(returnreason);
    }


    @Then("^User can enter RTO Number as (.+) and click on approve button$")
    public void user_can_enter_rto_number_as_and_click_on_approve_button(String rtonumber) throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.EnterRTOThenClickOnVerifyButton(rtonumber);
    }

    

    @Then("^User click on verify Order button$")
    public void user_click_on_verify_order_button() throws Throwable {
      MyOrder myOrder= testContextSetup.pageObjectManager.getMyOrder();
      myOrder.clickOnVerifyOrder();

    }
    @Given("^: User execute get request and verif response code$")
    public void _user_execute_get_request_and_verif_response_code() throws Throwable {
       
      //Specify base URI
      RestAssured.baseURI = Base_URL;

      //Request object
      RequestSpecification httpRequest=RestAssured.given();
     
      //Response object
      Response response=httpRequest.request(Method.GET,"2");
      //Response response=httpRequest.request(Method.GET,"2");
      //print response in console window
  
      String responseBody=response.getBody().asString();
      System.out.println("Response Body is:" +responseBody);
      //status code validation
      int statusCode=response.getStatusCode();
      System.out.println("Status code is: "+statusCode);
      Assert.assertEquals(statusCode, 200);

       //status line verification
      String statusLine=response.getStatusLine();
      System.out.println("Status line is:"+statusLine);
      Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
              
    }

    @Then("^User execute post request for Shipment Created status$")
    public void user_execute_post_request_for_shipment_created_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();    
      System.out.println("retrieved id is:"+Id);
      String currentdatetime = currentDateTimeGenerate();

        String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Shipment Created\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

          System.out.println(payload);
          String respo=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
          .accept(ContentType.JSON)
          .contentType("application/json")
          .and()
          .body(payload)
          .post(ApplicationConstants.APIForOrder)
          .thenReturn().asString();
           System.out.println("Response is : " + respo);
          wait(1000);
    }
    @Then("User execute post request for pick created status$")
    public void _user_execute_post_request_for_pick_created_status() throws Throwable {
        String Id = CopyOrderIDFORAPI();
        System.out.println("retrieved id is:"+Id);
        String currentdatetime = currentDateTimeGenerate();

        String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Pick Created\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

          System.out.println(payload);
          String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
          .accept(ContentType.JSON)
          .contentType("application/json")
          .and()
          .body(payload)
          .post(ApplicationConstants.APIForOrder)
          .thenReturn().asString();
  
          System.out.println("Response is : " + resp);
          wait(1000);
    }

    @Then("^User execute post request for Approved status$")
    public void user_execute_post_request_for_approved_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
      System.out.println("retrieved id is:"+Id);
      String currentdatetime = currentDateTimeGenerate();

      String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Approved\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

        System.out.println(payload);
        String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
        .accept(ContentType.JSON)
        .contentType("application/json")
        .and()
        .body(payload)
        .post(ApplicationConstants.APIForOrder)
        .thenReturn().asString();

        System.out.println("Response is : " + resp);
        wait(1000);
    }
    @Then("^User execute post request for Pick Assigned status$")
    public void user_execute_post_request_for_pick_assigned_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
      System.out.println("retrieved id is:"+Id);
      String currentdatetime = currentDateTimeGenerate();

      String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Pick Assigned\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

        System.out.println(payload);
        String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
        .accept(ContentType.JSON)
        .contentType("application/json")
        .and()
        .body(payload)
        .post(ApplicationConstants.APIForOrder)
        .thenReturn().asString();

        System.out.println("Response is : " + resp);
        wait(1000);
    }
    @Then("^User execute post request for Pick Registered status$")
    public void user_execute_post_request_for_pick_registered_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
      System.out.println("retrieved id is:"+Id);
      String currentdatetime = currentDateTimeGenerate();

      String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Pick Registered\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

        System.out.println(payload);
        String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
        .accept(ContentType.JSON)
        .contentType("application/json")
        .and()
        .body(payload)
        .post(ApplicationConstants.APIForOrder)
        .thenReturn().asString();

        System.out.println("Response is : " + resp);
        wait(1000);
    }

    @Then("^User execute post request for Completly Packed status$")
    public void user_execute_post_request_for_completly_packed_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
      System.out.println("retrieved id is:"+Id);
      String currentdatetime = currentDateTimeGenerate();

      String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Completly Packed\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

        System.out.println(payload);
        String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
        .accept(ContentType.JSON)
        .contentType("application/json")
        .and()
        .body(payload)
        .post(ApplicationConstants.APIForOrder)
        .thenReturn().asString();

        System.out.println("Response is : " + resp);
        wait(1000);
    }
    @Then("^User execute post request for Shipment Post status$")
    public void user_execute_post_request_for_shipment_post_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
      System.out.println("retrieved id is:"+Id);
      String currentdatetime = currentDateTimeGenerate();

      String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Shipment Post\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

        System.out.println(payload);
        String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
        .accept(ContentType.JSON)
        .contentType("application/json")
        .and()
        .body(payload)
        .post(ApplicationConstants.APIForOrder)
        .thenReturn().asString();

        System.out.println("Response is : " + resp);
        wait(1000);
    }
    @Then("^User execute post request for Shipped status$")
    public void user_execute_post_request_for_shipped_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
      System.out.println("retrieved id is:"+Id);
      String currentdatetime = currentDateTimeGenerate();

      String payload = "{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Shipped\" ," + "\"userId\" : 1 ," + "\"context\" : \"ORDER_STATUS_FROM_OL_CRON\" ," + "\"statusUpdationTime\" : \"" + currentdatetime + "\" }";

        System.out.println(payload);
        String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
        .accept(ContentType.JSON)
        .contentType("application/json")
        .and()
        .body(payload)
        .post(ApplicationConstants.APIForOrder)
        .thenReturn().asString();

        System.out.println("Response is : " + resp);
        wait(1000);
    }

    @Then("^User execute post request for dispatch status$")
    public void user_execute_post_request_for_dispatch_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
        
        System.out.println("retrieved id is:"+Id);
        String payload = "[{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Dispatch\" ," + "\"statusType\" : \"dispatch\" ," + "\"client_id\" : \"NirogStreet\"}]";

         System.out.println(payload);
  
         String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
         .accept(ContentType.JSON)
          .contentType("application/json")
          .and()
          .body(payload)
          .post(ApplicationConstants.APIForDispatch)  
          .thenReturn().asString();
          System.out.println(resp);
          wait(1000);
       
               
    }

    @Then("^User execute post request for Delivered status$")
    public void user_execute_post_request_for_delivered_status() throws Throwable {
      String Id = CopyOrderIDFORAPI();
        
      System.out.println("retrieved id is:"+Id);
      String payloadfordilevered = "[{ \"id\" :\"" + Id + "\" ," + "\"status\" : \"Delivered\" ," + "\"statusType\" : \"dispatch\" ," + "\"client_id\" : \"NirogStreet\"}]";

      System.out.println(payloadfordilevered);

      String resp=  given().log().all().header(ApplicationConstants.TokenType, ApplicationConstants.Token)
      .accept(ContentType.JSON)
       .contentType("application/json")
       .and()
       .body(payloadfordilevered)
       .post(ApplicationConstants.APIForDispatch)  
       .thenReturn().asString();

       System.out.println(resp);
       wait(1000);
      }

      

    @Given("^: User execute put request and verify response code$")
    public void _user_execute_put_request_and_verify_response_code() throws Throwable {
      //Specify base URI
     RestAssured.baseURI=Post_Base_URL;
  
     //Request object
      RequestSpecification httpRequest=RestAssured.given();
 
  
 //Request paylaod sending along with post request
 JSONObject requestParams=new JSONObject();
 
 requestParams.put("id","NS-331322");
 requestParams.put("status","Delivered");
 requestParams.put("statusUpdationTime","2022-11-09 08:20:16.943");
 requestParams.put("statusType","dispatch");
 requestParams.put("client_id","NirogStreet");

 httpRequest.header("Content-Type","application/json");
 httpRequest.body(requestParams.toJSONString()); 
 httpRequest.header("x-access-token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAzNTg0LCJpYXQiOjE2NTQ3Njg0MjF9.emOEgu-w87Ey66MnLWHoc8GCaownT3kHT5rxIn2ETNQ");
 // attach above data to the request
 
 //Response object
 Response response=httpRequest.request(Method.POST,"status/");
 
 

 
 //print response in console window
 
 String responseBody=response.getBody().asString();
 System.out.println("Response Body is:" +responseBody);
 
 //status code validation
 int statusCode=response.getStatusCode();
 System.out.println("Status code is: "+statusCode);
 //Assert.assertEquals(statusCode, 201);
 
 //success code validation
 String successCode=response.jsonPath().get("SuccessCode");
// Assert.assertEquals(successCode, "OPERATION_SUCCESS");
 

    }


    
  }
   













