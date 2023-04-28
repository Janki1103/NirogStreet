package com.example.StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import com.epam.reportportal.message.ReportPortalMessage;
import com.example.Utilities.GenericUtils;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import app.constants.ApplicationConstants;

public class Hooks  {
        public static WebDriver driver;
  
           
     public static void intitializeApplication() throws InterruptedException {
         try {
         String	browserType = ApplicationConstants.browser;
         if (browserType.equals("Chrome")) {
         System.out.println("Opening browser");	
                 WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
                 driver.manage().deleteAllCookies();
                 System.out.println("==========Chrom Browser is Opened===========");
             
                } 
                 else if (browserType.equals("firfox")) {
                 WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                 System.out.println("==========Firefox Browser is Opened===========");
             
 
                 } 
         }catch (Exception e) {
                 e.printStackTrace();                 
                  throw new WebDriverException("Could not open browser instance");
                  }
                
             driver.manage().window().maximize();
             driver.navigate().to(ApplicationConstants.URL);
                  System.out.println("Website is Opened");
         }
        
//        @AfterAll
//          public static void takeSnapShot() throws Exception{
//                 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//                 try {
//                     FileUtils.copyFile(screenshot, new File("src//test//resources//MediaFiles//PageScreenshot.png"));
//                 } catch (IOException e) {
//                     System.out.println(e.getMessage());
//                 }
         
                
//         }
         
  
     public static void closeBrowser() {
       
        // driver.close();
         driver.quit();
         System.out.println("==========Browser is closed===========");
          
}



    public static void closeBrowserforAdmintoRescheduleorCancel(Scenario scenario) throws IOException{
        if (scenario.isFailed()) {
            GenericUtils genericUtils =new GenericUtils();
            genericUtils.captureScreen(genericUtils.getDriver(), "Test");
                File f = new File(System.getProperty("user.dir") + "/Reporting/" + "Test" + ".png");
                // ReportPortalMessage m = new ReportPortalMessage(f, "Screenshot on test completion");
                //         // result.setTestName(result.getName());
                //       //  log.info(m);
        }
      //  driver.quit();
        System.out.println("============close the Browser==========");
    }


}






