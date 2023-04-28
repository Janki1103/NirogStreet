package com.example.Utilities;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.example.PageObjects.PageObjectManager;


public class TestContextSetup {

	public WebDriver driver;
	
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public String expectedPageTitle;
	public String Pagetitle;
	public boolean visible;

	public TestContextSetup() 
	{
		testBase = new TestBase();
		
		pageObjectManager = new PageObjectManager();

		try {
			genericUtils = new GenericUtils();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
