package com.example.PageObjects;

import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CreateFeedPost extends GenericUtils {
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(CreateFeedPost.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
    }
public CreateFeedPost() throws IOException {
}
    
    
    public WebDriver getDriver() {
        return driverThread.get();
    }   



   public void clickOnFeedlink(){
   wait(3000);
    clickOnElement(locators.getKey("Feed_Menu"));
    log.info("STEP:Click on feed quick link Successfully" + "Feed_Menu");

   }
public void clickoncreatepostbutton(){
    wait(3000);
    verifyVisibility(locators.getKey("FeedTitle"));
    verifyVisibility(locators.getKey("Create_Post"));
    clickOnElement(locators.getKey("Create_Post"));
    log.info("STEP:Click on post button Successfully" + "Create_Post");
}

public void Click_On_Feed_Heading(){
    
    clickOnElement(locators.getKey("Click_On_Heading"));
    log.info("STEP:Click on textfield heading Successfully" + "Click_On_Heading");

}
public void addHeading(String addheading){
    enterText(locators.getKey("Add_Heading"), addheading);
    log.info("STEP:Feed post add heading Successfully" + "Add_Heading");
    
}

public void clickOnFeedDescription(){
    clickOnElement(locators.getKey("Click_On_Description"));
    log.info("STEP:Click on textfield description Successfully" + "Click_On_Description");

}
public void addDescription(String description){
    enterText(locators.getKey("Post_description"), description);
    log.info("STEP:Feed post description added Successfully" + "Post_description");

}
public void clickOnAddTag(){
   
    verifyVisibility(locators.getKey("Click_On_Add_Tag"));
    clickOnElement(locators.getKey("Click_On_Add_Tag"));
    log.info("STEP:Click on add tag Successfully" + "Click_On_Add_Tag");
}
public void selectOneTag(){
    verifyVisibility(locators.getKey("Checkbox_Add_Tag1"));
    clickOnElement(locators.getKey("Checkbox_Add_Tag1"));
    clickOnElement(locators.getKey("Checkbox_Add_Tag2"));
    clickOnElement(locators.getKey("Checkbox_Add_Tag3"));
    clickOnElement(locators.getKey("Checkbox_Add_Tag4"));
   

    log.info("STEP:Click on select add tag Successfully" + "Checkbox_Add_Tag1");
    log.info("STEP:Click on select add tag Successfully" + "Checkbox_Add_Tag2");
    log.info("STEP:Click on select add tag Successfully" + "Checkbox_Add_Tag3");
    log.info("STEP:Click on select add tag Successfully" + "Checkbox_Add_Tag4");
    
}

public void clickOnNewFeed(){
    clickOnElement(locators.getKey("null"));
}


public void addTagOneGo(){
    clickOnElement(locators.getKey("Checkbox_Add_Tag1"));
    clickOnElement(locators.getKey("Checkbox_Add_Tag2"));

}


public void verifyMaxTagging(String maximumtagmessage){
    verifyText(locators.getKey("Toast_Message_For_Add_Tag"),maximumtagmessage);
   // clickOnElement(locators.getKey("Toast_Message_For_Add_Tag"));
}

public void saveTag(){
    clickOnElement(locators.getKey("Save_Tag"));
    log.info("STEP:Click on save tag Successfully" + "Save_Tag");
}


public void clickOnPostFeed(){
    wait(2000);
    verifyVisibility(locators.getKey("Click_On_Post"));

    clickOnElement(locators.getKey("Click_On_Post"));
    log.info("STEP:Click on post Successfully" + "Click_On_Post");
}

public void verifyNewFeedButton(){
    if(!locators.getKey("New_Feed").isEmpty()){
        
        System.out.println("User clicking on News Feed");
        clickOnElement(locators.getKey("New_Feed"));
        verifyInvisibility(locators.getKey("New_Feed"));
        wait(3000);
    }
    else{
        System.out.println("News feed not available");
        wait(3000);
    }

    }



public void clickOnPostFeedFinal(){
    verifyVisibility(locators.getKey("Click_On_Post"));
    clickOnElement(locators.getKey("Click_On_Post"));
    wait(60000);
    log.info("STEP:Click on post Successfully" + "Click_On_Post");
}
//     public void clickOnPost(String TagToastMessageverify){
//         clickOnElement(locators.getKey("Click_On_Post"));
        
//         verifyText(locators.getKey("Verify_Text_Add_Tag"), TagToastMessageverify);
//         log.info("STEP:Click on post Successfully" + "Click_On_Post");

// }

public void clickOnPost(){
    verifyVisibility(locators.getKey("Click_On_Post"));

 clickOnElement(locators.getKey("Click_On_Post"));
  
log.info("STEP:Click on post Successfully" + "Click_On_Post");
    
    }
    
    public void verifyToastMessage(String expected){
        //verifyText(locators.getKey("Verify_Text_Add_Tag"), TagToastMessage);
        verifyVisibility(locators.getKey("Verify_Text_Add_Tag"));

       verifyText(locators.getKey("Verify_Text_Add_Tag"),expected);

       
           }
           
public void writeSeacrhFeedpost(String postsearchnamewhichiscreatedabove){
    
    verifyVisibility(locators.getKey("Feed_Search_textBox"));

  enterText(locators.getKey("Feed_Search_textBox"),postsearchnamewhichiscreatedabove);
 scrollup();
}

public void clickOnImageToSave(){
    clickOnElement(locators.getKey("image_click_to_save"));
}

public void clickOnSaveIcon(){
    clickOnElement(locators.getKey("Save_Icon"));
}




    public void uncheckTagBox(){
            verifyVisibility(locators.getKey("Remove_Tag1"));
            clickOnElement(locators.getKey("Remove_Tag1"));
            clickOnElement(locators.getKey("Remove_Tag2"));
        }

        public void addTagsForUncheck(){
            clickOnElement(locators.getKey("Checkbox_Add_Tag4"));
            log.info("STEP:Click on Add tag button Successfully" + "Add_Uncheck_Tags");
        }

        public void saveUncheckTags(){
            clickOnElement(locators.getKey("Save_Tag"));
            wait(2000);
            log.info("STEP:Click on Save button Successfully" + "Save_Tag");
        }
        public void selectImage(){

            JPGfileuploading(locators.getKey("Click_On_Select_Image"));
            log.info("STEP:JPG File has been uploaded Successfully" + "Click_On_Select_Image");
        
        }

        public void selectPdf(){
            PDFfileuploading(locators.getKey("Click_On_Doc"));
            log.info("STEP:PDF File has been uploaded Successfully" + "Click_On_Doc");
        }

        public void selectVideo(){
            MP4fileuploading(locators.getKey("Click_on_Video"));
            log.info("STEP:MP4 has been uploaded Successfully" + "Click_on_Video");
        }



        public void clickOnProfile(){
         
          verifyVisibility(locators.getKey("profile_icon"));

            mouseOver(String.format(locators.getKey("profile_icon")));
            scrollTillElementDisplay(locators.getKey("logout"));
            clickOnElement(locators.getKey("logout"));
         }

          public void clickOnSearchIcon(){
          
            verifyVisibility(locators.getKey("Feed_Search_Icon"));
            clickOnElement(locators.getKey("Feed_Search_Icon"));
         
          }  
        

       public void searchFeed(String feedpostsearch){
       
        verifyVisibility(locators.getKey("Feed_Search_textBox"));

       enterText(locators.getKey("Feed_Search_textBox"),feedpostsearch);
        wait(5000);
        log.info("STEP:Click on Feed Search" + "Feed_Search_textBox");

       
       }
       
   
     public void likePost(){
        wait(5000);
        scrollDown150();
       scrollDown150();
       wait(2000);
   
        clickOnElement(locators.getKey("Liked_By"));
        
        log.info("STEP:Click on Feed Search" + "Liked_By");
      
     }

     public void clickOnCloseWindow(){
     verifyVisibility(locators.getKey("Close_the_Liked_By_Window"));

        clickOnElement(locators.getKey("Close_the_Liked_By_Window"));

        log.info("STEP:Click on Close Liked By window" + "Close_the_Liked_By_Window");
     }

     public void clickOnCommentBox(){
      //   scrollDown150();
      verifyVisibility(locators.getKey("Click_On_Comment_Box"));

    clickOnElement(locators.getKey("Click_On_Comment_Box"));

    log.info("STEP:Click on Comment BUtton" + "Click_On_Comment_Box");
      
     }
public void commentFeedPost(String CommentOnPost){
    // scrollDown();
   // scrollDown150();
    clickOnElement(locators.getKey("Comment_Feed_Post"));
      enterText(locators.getKey("Comment_Feed_Post"), CommentOnPost);
     wait(2000);
}

public void clickOnSentButton(){
    clickOnElement(locators.getKey("Comment_Sentbutton"));
}

public void clickOnThreeDotReplyComment(){
    wait(3000);
    clickOnElement(locators.getKey("Click_On_Comment_dot"));
    
}
public void clickOnDeleteComment(){
    clickOnElement(locators.getKey("Comment_delete_icon"));
}

public void bookMarkthePost(){
    // scrollup();
     
    clickOnElement(locators.getKey("Bookmark_Feed_Post"));

    log.info("STEP:Click on Bookmark button" + "Bookmark_Feed_Post");
}

public void followButton(){
    wait(4000);
    scrollup();
    clickOnElement(locators.getKey("Follow_Feed_Post"));

    log.info("STEP:Click on Follow Button" + "Follow_Feed_Post");
}

public void clickOnPostSeacrh(){
    wait(3000);
    clickOnElement(locators.getKey("Feed_Search_textBox"));
}

public void clickOnLikeReplyButton(){
    verifyVisibility(locators.getKey("reply_like"));
    clickOnElement(locators.getKey("reply_like"));
}
public void clickOnReplyButton(){
   scrollDown150();
    wait(3000);
    verifyVisibility(locators.getKey("reply_button"));
    clickOnElement(locators.getKey("reply_button"));
    wait(3000);
  // scrollUp150();
}

public void replycomment(String ReplyOnPost){
  
    scrollDown150();
    verifyVisibility(locators.getKey("Comment_Feed_Post"));

        clickOnElement(locators.getKey("Comment_Feed_Post"));
        
         enterText(locators.getKey("Comment_Feed_Post"), ReplyOnPost);
     
}

public void clickOnthreedot(){
    verifyVisibility(locators.getKey("Post_dot"));
  clickOnElement(locators.getKey("Post_dot"));


}
public void clickOnEditPost(){

    verifyVisibility(locators.getKey("Post_edit"));
    clickOnElement(locators.getKey("Post_edit"));
}

public void clickOnEditImagePost(){
   
    verifyVisibility(locators.getKey("Post_Edit_Image_Cut"));
    clickOnElement(locators.getKey("Post_Edit_Image_Cut"));
    
}
public void clickOnEditDescription(String Descriptionchange){
    enterText(locators.getKey("Edit_Post_Description"), Descriptionchange);
}


public void clickOnUpdatePost(){
    //scrollUp();
    scrollUpWithKey();
    verifyVisibility(locators.getKey("Update_button_on_post_Edit"));
    clickOnElement(locators.getKey("Update_button_on_post_Edit"));
}

public void clickOnPostUpdateSuccussfullmessage(String PostUpdateSuccussfullmessage){
    verifyVisibility(locators.getKey("Post_Update_Successful_message"));

    verifyText(locators.getKey("Post_Update_Successful_message"), PostUpdateSuccussfullmessage);
   
}

public void clickOnDeletePost(){
    verifyVisibility(locators.getKey("Post_Delete"));

    clickOnElement(locators.getKey("Post_Delete"));
  
}

public void clickOnConfirmationDeletePost(){
    verifyVisibility(locators.getKey("Delete_Confirm_Button"));

    clickOnElement(locators.getKey("Delete_Confirm_Button"));

}

public void addDescriptionwithvideo(String description){
    enterText(locators.getKey("Post_description"), description);
    log.info("STEP:Feed post description added Successfully" + "Post_description");

}
}

    
 