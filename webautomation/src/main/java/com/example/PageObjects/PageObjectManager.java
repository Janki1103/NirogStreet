package com.example.PageObjects;
// In this file we are going to create all objects of page object files

import java.io.IOException;
import org.openqa.selenium.WebDriver;


import com.example.Utilities.GenericUtils;



public class PageObjectManager {
	
	
	
	public WebDriver driver;
	public GenericUtils genericUtils;
	public SignUpAsDoctor signUpAsDoctor;
	public Quicklinks quicklinks;
	public LoginWithResendOtp loginwithresendOTP ;
	public VerificationWithDoctor verificationWithDoctor;
	public AddToCart addToCart;
	public MyOrder myOrder;
	public CreateFeedPost createFeedPost;
	public Loginwithotp loginwithotp;
	public ForgetPassword forgetpassword;
	public LoginWithPassword loginwithpassword;
	public DoctorMyProfileAddDetails doctorAddMyProfileAddDetails;
	public HomePageNonLoggedUser homepageloggeduser;
	public ChangeNumber changenumber;
	public NotifyMeFeature notifyme;
	public NotifyMefromProdList notifymefromprodlist;

	public PageObjectManager()
	{
		//this.driver = driver;
		//this.driver = driver;
	}

	
	public SignUpAsDoctor getSignUpAsDoctorPage() throws IOException
	{
		
		signUpAsDoctor = new SignUpAsDoctor();

	return signUpAsDoctor;
	
	}
	
	public Quicklinks getQuicklinks() throws IOException
	{
		
		quicklinks = new Quicklinks();

	return quicklinks;
	
	}
	
	public VerificationWithDoctor getVerificationWithDoctor() throws IOException
	{
		
		verificationWithDoctor = new VerificationWithDoctor();

	return verificationWithDoctor;
	
	}
	public AddToCart getAddToCart() throws IOException
	{
		
		addToCart = new AddToCart();

	return addToCart;
	
	}
	public CreateFeedPost getCreatePost() throws IOException
	{
		
		createFeedPost = new CreateFeedPost();

	return createFeedPost;
	
	}
	public MyOrder getMyOrder() throws IOException
	{
		
		myOrder = new MyOrder();

	return myOrder;
	
	}
	public Loginwithotp getLoginwithotp() throws IOException
	{
		
		loginwithotp = new Loginwithotp();

	return loginwithotp;
	
	}
	public ForgetPassword getForgetPassword() throws IOException
	{
		
		forgetpassword = new ForgetPassword();

	return forgetpassword;
	
	}
	// public LoginWithPassword getLoginWithPassword() throws IOException
	// {
		
	// 	loginwithpassword = new LoginWithPassword();

	// return loginwithpassword;
	
	// }
	public LoginWithResendOtp getLoginWithResendOtp() throws IOException
	{
		
		LoginWithResendOtp loginwithresendOTP = new LoginWithResendOtp();

	return loginwithresendOTP;
	
	}

	public HomePageNonLoggedUser getHomePageNonLoggedUser() throws IOException{
		HomePageNonLoggedUser homepageloggeduser = new HomePageNonLoggedUser();
		return homepageloggeduser;
	}

	public DoctorMyProfileAddDetails getDoctorMyProfileAddDetails() throws IOException{
		DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = new DoctorMyProfileAddDetails();
		return doctorAddMyProfileAddDetails;
	}
	public ChangeNumber getChangeNumber() throws IOException
	{
	changenumber = new ChangeNumber();
	return changenumber;
}

// 	public NotifyMeFeature getNotifyMe() throws IOException
// 	{
// 	notifyme = new NotifyMeFeature();
// 	return notifyme;
// }


// 	public NotifyMefromProdList getNotifyMefromProdList() throws IOException
// {
//    notifymefromprodlist = new NotifyMefromProdList();
//    return notifymefromprodlist;
// }
	
	
	public GenericUtils genericUtils() throws IOException
	{
		genericUtils=new GenericUtils();
		return genericUtils;
	}
				


public LoginWithPassword getLoginWithPassword() throws IOException
	{
	 loginwithpassword = new LoginWithPassword();
	return loginwithpassword;
	}
	// public NotifyMeFeature getOrderWithCOD() throws IOException
	// {
	// 	orderwithcod = new NotifyMeFeature();
	// 	return orderwithcod;
	// }
	public NotifyMeFeature getNotifyMe() throws IOException
	{
	notifyme = new NotifyMeFeature();
	return notifyme;
}
public NotifyMefromProdList getNotifyMefromProdList() throws IOException
{
   notifymefromprodlist = new NotifyMefromProdList();
   return notifymefromprodlist;

}

}


