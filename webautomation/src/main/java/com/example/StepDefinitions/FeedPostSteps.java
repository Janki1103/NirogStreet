package com.example.StepDefinitions;

import com.example.PageObjects.CreateFeedPost;

import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FeedPostSteps {
    
        //Initialized and declared driver out side of the method to accessible for entire 
        //public WebDriver driver;
        
        
        PageObjectManager pageObjectManager; 
        // Call object of other classes
//        TestContextSetup testContextSetup;
        TestContextSetup testContextSetup  =  new TestContextSetup();
        GenericUtils genericUtils;
        //Spring Framework,EJB -Cucumber dependancy injection -Cucumber PicoContainer
        //Create a new TestContextSetupClass file under Utility
        // Will create one constructor with the same class name
        // This constructor will automatically called when we create objects of this class
        // Will pass instance of TestContextSetup
        // Constructor
        
//        
//public FeedPostSteps(TestContextSetup testContextSetup)
//{
//	this.testContextSetup= testContextSetup;
//}

public FeedPostSteps()
{
//this.testContextSetup= testContextSetup;
}

        @Then("^User should be able to click on FeedQuicklink$")
        public void user_should_be_able_to_click_on_feedquicklink() throws Throwable {
            CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
           createpost.clickOnFeedlink();
        }
    
        @Then("^User should be able to click on post to create a new post$")
        public void user_should_be_able_to_click_on_post_to_create_a_new_post() throws Throwable {
            CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
            createpost.clickoncreatepostbutton();
    
}
@Given("^User should be able to add heading(.+)addheading$")
public void user_should_be_able_to_add_headingaddheading(String addheading) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.addHeading(addheading);
}

    @Given("^User should be able to enter the text(.+)add Description$")
    public void user_should_be_able_to_enter_the_textadd_description(String description) throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.addDescription(description);
}


@Given("^User should be able to add tag$")
public void user_should_be_able_to_add_tag() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnAddTag();
    createpost.selectOneTag();
    createpost.saveTag();
 }


@Given("^User should able to verify maximum tag message as (.+)maximumtagmessage$")
    public void user_should_able_to_verify_maximum_tag_message_as_maximumtagmessage(String maximumtagmessage) throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.verifyMaxTagging(maximumtagmessage);
        
    }


    @Given("^User should be able to modify uncheck the tags$")
public void user_should_be_able_to_modify_uncheck_the_tags() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.uncheckTagBox();
}

@Given("^User should be able to add tags$")
public void user_should_be_able_to_add_tags() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnAddTag();
    createpost.addTagsForUncheck();
    createpost.saveTag();
}



@Given("^User should be able to select images$")
    public void user_should_be_able_to_select_images() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.selectImage();


}


@Given("^User should be able to add tagss$")
public void user_should_be_able_to_add_tagss() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnAddTag();
    createpost.addTagOneGo();

   
}



@Given("^User should be able to add pdf$")
public void user_should_be_able_to_add_pdf() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.selectPdf();

}


@Given("^User should be able to add video$")
public void user_should_be_able_to_add_video() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.selectVideo();
    

}
@Given("^User should be able to click on Post$")
public void user_should_be_able_to_click_on_post() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnPostFeed();
   
}

@Given("^User verifies that news feed is avilable then clicks to get the new feed$")
    public void user_verifies_that_news_feed_is_avilable_then_clicks_to_get_the_new_feed() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.verifyNewFeedButton();
    }

@Given("^User should be able to click on Post button$")
    public void user_should_be_able_to_click_on_post_button() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnPostFeedFinal();
    }
@Given("^User should be able to click on post and (.+)TagToastMessageverify$")
public void user_should_be_able_to_click_on_post_and_tagtoastmessageverify(String tagtoastmessageverify) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnPost();
    createpost.verifyToastMessage(tagtoastmessageverify);
}





// @Given("^User should be able to click on post and (.+)$")
// public void user_should_be_able_to_click_on_post_and(String TagToastMessageverify) throws Throwable {
//     CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
//     createpost.clickOnPost(TagToastMessageverify);
// }

// @Given("^User should be able to click on post and (.+)$")
// public void user_should_be_able_to_click_on_post_and(String TagToastMessage) throws Throwable {
//     CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
//     createpost.clickOnPost(TagToastMessage);
// }


@Given("^User should be able to click on post and verify toastmessage as (.+)$")
public void user_should_be_able_to_click_on_post_and_verify_toastmessage_as(String tagtoastmessageverify) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnPost();
    createpost.verifyToastMessage(tagtoastmessageverify);
}




@Given("^User should be able to click on save$")
public void user_should_be_able_to_click_on_save() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.saveUncheckTags();
}


@Then("^User should be able to go profile and logout the account$")
public void user_should_be_able_to_go_profile_and_logout_the_account() throws Throwable {
   
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();

     createpost.clickOnProfile();

}

@Given("^User should be able to search feed(.+)postsearchname$")
public void user_should_be_able_to_search_feedpostsearchname(String postsearchname) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.searchFeed(postsearchname);
}

@Given("^User should be able to search feed (.+) feedpostsearch$")
public void user_should_be_able_to_search_feed_feedpostsearch(String feedpostsearch) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.searchFeed(feedpostsearch);



}

@Given("^User should be able to click on search feed icon$")
public void user_should_be_able_to_click_on_search_feed_icon() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnSearchIcon();
}


@Given("^User should be able to like the post$")
public void user_should_be_able_to_like_the_post() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    
    createpost.likePost();
}


@Given("^User should be able to close the window$")
public void user_should_be_able_to_close_the_window() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnCloseWindow();
}

@Given("^User should be able to reply like the post$")
    public void user_should_be_able_to_reply_like_the_post() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnLikeReplyButton();


    }
@Given("^User shoul be able to click on comment button$")
public void user_shoul_be_able_to_click_on_comment_button() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnCommentBox();
}

    @Given("^User should be able to comment the post(.+)CommentOnPost$")
    public void user_should_be_able_to_comment_the_postcommentonpost(String commentonpost) throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.commentFeedPost(commentonpost);
    }

    @Given("^User should be able to comment the post(.+)CommentOnPostSecondTime$")
    public void user_should_be_able_to_comment_the_postcommentonpostsecondtime(String commentonpostsecondtime) throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.commentFeedPost(commentonpostsecondtime);
    }
    
    @Given("^User should be able to click on sent comment post button$")
    public void user_should_be_able_to_click_on_sent_comment_post_button() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnSentButton();
    }

    @Given("^User should be able to click on comment dot$")
    public void user_should_be_able_to_click_on_comment_dot() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnThreeDotReplyComment();
    }

    @Given("^User should be able to delete the comment$")
    public void user_should_be_able_to_delete_the_comment() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnDeleteComment();

    }


@Given("^User should be able to bookmark the post$")
    public void user_should_be_able_to_bookmark_the_post() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.bookMarkthePost();

}


@Given("^User should be able to bookmark the feed post$")
    public void user_should_be_able_to_bookmark_the_feed_post() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.bookMarkthePost();



    }

@Given("^User should be able to follow the post$")
    public void user_should_be_able_to_follow_the_post() throws Throwable {
        
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.followButton();

}


@Given("^User should be able to search feed(.+)postsearchnamewhichiscreatedabove$")
public void user_should_be_able_to_search_feedpostsearchnamewhichiscreatedabove(String postsearchnamewhichiscreatedabove) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.writeSeacrhFeedpost(postsearchnamewhichiscreatedabove);



}

@Given("^User should be able to click on image$")
public void user_should_be_able_to_click_on_image() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnImageToSave();

}


@Given("^User should be able to click on save icon$")
public void user_should_be_able_to_click_on_save_icon() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
      createpost.clickOnSaveIcon();
 }





@Given("^User should be able to click on like on previous comment$")
public void user_should_be_able_to_click_on_like_on_previous_comment() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnLikeReplyButton();


}

@Given("^User should be able to click on reply button$")
    public void user_should_be_able_to_click_on_reply_button() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
         createpost.clickOnReplyButton();

}

@Given("^User should be able to comment the post(.+)ReplyOnPost$")
public void user_should_be_able_to_comment_the_postreplyonpost(String replyonpost) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.replycomment(replyonpost);


}


@Given("^User should be able to click on Post dot$")
public void user_should_be_able_to_click_on_post_dot() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
   // createpost.scrollDown();
    createpost.clickOnthreedot();



}


@Given("^User should be able to click on New Feed$")
public void user_should_be_able_to_click_on_new_feed() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnNewFeed();

}
   





@Given("^User should be able to click Post Edit$")
public void user_should_be_able_to_click_post_edit() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnEditPost();


}


@Given("^User should be able to cut the image from post edit$")
public void user_should_be_able_to_cut_the_image_from_post_edit() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnEditImagePost();
}

@Given("^User should be able to enter the text(.+)add Descriptionchange$")
    public void user_should_be_able_to_enter_the_textadd_descriptionchange(String descriptionchange) throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnEditDescription(descriptionchange);
    }

@Given("^user should be able to click on Update button$")
public void user_should_be_able_to_click_on_update_button() throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.clickOnUpdatePost();

}

@Given("^User should be able to click on post upadte message and (.+)PostUpdateSuccussfullmessage$")
    public void user_should_be_able_to_click_on_post_upadte_message_and_postupdatesuccussfullmessage(String postupdatesuccussfullmessage)  throws Throwable{

        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnPostUpdateSuccussfullmessage(postupdatesuccussfullmessage);
    }


@Given("^User should be able to delete the post$")
    public void user_should_be_able_to_delete_the_post() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnDeletePost();
        

    }

    
    @Given("^User should be able to click on Confirmation Delete$")
    public void user_should_be_able_to_click_on_confirmation_delete() throws Throwable {
        CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
        createpost.clickOnConfirmationDeletePost();

}

@Given("^User should be able to post a youtube video link(.+)youtubelink$")
public void user_should_be_able_to_post_a_youtube_video_linkyoutubelink(String youtubelink) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();


}


@Given("^User should be able to enter the text(.+)add Descriptionwithvideo$")
public void user_should_be_able_to_enter_the_textadd_descriptionwithvideo(String descriptionwithvideo) throws Throwable {
    CreateFeedPost createpost = testContextSetup.pageObjectManager.getCreatePost();
    createpost.addDescriptionwithvideo(descriptionwithvideo);
}
}