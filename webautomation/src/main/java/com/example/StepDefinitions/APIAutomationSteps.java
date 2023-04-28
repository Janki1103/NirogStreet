package com.example.StepDefinitions;

import org.testng.Assert;

import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.IOException;
import io.restassured.path.json.JsonPath;



public class APIAutomationSteps extends GenericUtils{
    PageObjectManager pageObjectManager; 
    
    private static final String Base_URL=  "http://stg1web.1veda.in/api/core";
    private static Response response;
    private static String jsonString;
    private static String TokenType="x-access-token";
  //	private static String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAzNTg0LCJpYXQiOjE2NTQ3Njg0MjF9.emOEgu-w87Ey66MnLWHoc8GCaownT3kHT5rxIn2ETNQ";
  	private static String token;

   private static final String mobileNumber = "6851";
   private static final String otp = "1234";


   private static final int user_id = 238620;
   private static final String contact_person_name = "Janki";
   private static final String contact_person_phone = "8530906851";
   private static final String addresss = "Shanti Apartment";
   private static final String city = "Jamnagar";
   private static final int pin_code = 361305;
   private static final String landmark = "vardan Tower";
   private static final String alt_mobile = "9974580345";
  


// Call object of other classes
//TestContextSetup testContextSetup;
TestContextSetup testContextSetup  =  new TestContextSetup();


public APIAutomationSteps () throws IOException
{
	//this.testContextSetup= testContextSetup;
}
    @Given("User is an authorized user")
	  public void AuthorizedUser() {

    	    	
    	RestAssured.baseURI = Base_URL;
		RequestSpecification request = RestAssured.given();

		//request.header("Content-Type", "application/json");
    request.header("Content-Type", "application/json");

		response = request.body("{ \"mobileNumber\":\"" + mobileNumber + "\", \"otp\":\"" + otp + "\"}")
				.post("/users/post/users/login/mobile");
		
        System.out.println(response);
        System.out.println("yy");

//		String jsonString = response.asString();
//		token = JsonPath.from(jsonString).get("token");
//		System.out.println(token);

	  }
    @Given("^User post the address with API$")
    public void user_post_the_address_with_api() throws Throwable {

      RestAssured.baseURI = Base_URL;
		  RequestSpecification request = RestAssured.given();
		  request.header("ApplicationConstants.TokenType", "ApplicationConstants.Token")
		  .header("Content-Type", "application/json");

		  response = request.body("{ \"user_id\": \"" + user_id + "\", " +
      "contact_person_name\": \"" + contact_person_name + "\", " +
      "contact_person_phone\": \"" + contact_person_phone + "\", " +
      "address\": \"" + addresss + "\", " +
      "city\": \"" + city + "\", " +
      "pin_code\": \"" + pin_code + "\", " +
      "landmark\": \"" + landmark + "\", " +
      "alt_mobile\": \"" + alt_mobile + "\"}")
      .post("/v0/address");
  

      System.out.println("Response: " + response);
    }

    @Then("^User can verify the response$")
    public void user_can_verify_the_response() throws Throwable {
      Assert.assertEquals(200, response.getStatusCode());
      System.out.println("API hit successfully");
    }

    @Given("^User verify all the saved address with API$")
    public void user_verify_all_the_saved_address_with_api() throws Throwable {
      
      RestAssured.baseURI = Base_URL;
		  RequestSpecification request = RestAssured.given();
      request.header(token, TokenType)
		  .header("x-access-token", "application/json");
      response = request.get("/v0/address?user_id=238620");
      jsonString = response.asString();     
      System.out.println(token + TokenType);

      token = JsonPath.from(jsonString).get("token");
      System.out.println(jsonString); 
  

    }

}