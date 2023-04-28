Feature: Feed Post

  Background: 
    Given Validate the browser

  Scenario Outline: User should be able to create Feed Post
    Given User click on loginsignup button
    Given User should be able to click on i already have an account
    Given User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User should be able to click on proceed button
    Then User should be able to click on FeedQuicklink
    Then User should be able to click on post to create a new post
    Given User should be able to add heading<AddHeading>addheading
    Given User should be able to enter the text<Description>add Description
    Given User should be able to click on Post
    Given User should be able to click on post and <TagToastMessageverify>TagToastMessageverify
    Given User should be able to add tag
    Given User should be able to add tags
    Given User should be able to select images
    Given User should be able to add pdf
    Given User should be able to add video
    Given User should be able to click on Post button
    Then closes the browser

    Examples: 
      | MobileNumber | OtpOne | OtpTwo | OtpThree | OtpFour | AddHeading           | Description                               | TagToastMessage                                          | mobilenumber | Password | postsearchname | CommentOnPost                 | postsearchnamewhichiscreatedabove | ReplyOnPost     | Descriptionwithvideo         | Descriptionchange | PostUpdateSuccussfullmessage | TagToastMessageverify                                    | maximumtagmessage             |
      |   7980598251 |      1 |      2 |        3 |       4 | this is header added | This is for Testing Automation test cases | You need to add at least 1 tag, you can add upto 5 tags. |   7980598251 | abc@123  | Unique name    | Comment By automation testing | Testing Automation with videoo    | Goodpostonreply | https://youtu.be/aRLvnc7TGdw | Edittednew        | Post updated successfully !! | You need to add at least 1 tag, you can add upto 5 tags. | You can add only upto 5 tags. |

  @Run
  Scenario Outline: Process to like ,Comment , Bookmark and follow actions for the post (Login into application from login with password page with another user)
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    Then User should be able to click on FeedQuicklink
    Given User should be able to click on search feed icon
    Given User should be able to search feed <feedpostsearch> feedpostsearch
    Given User should be able to like the post
    Given User shoul be able to click on comment button
    Given User should be able to comment the post<CommentOnPost>CommentOnPost
    Given User should be able to click on sent comment post button
    Given User should be able to bookmark the feed post
    Then closes the browser

    Examples: 
      | mobilenumber | Password | feedpostsearch       | CommentOnPost         |
      |   7980598251 | Test@123 | this is header added | Comment By automation |

  Scenario Outline: Process of like the comment and reply to the comment (Login into application from login with OTP page)
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    Then User should be able to navigate to buy Medicine and verify that page
    Then User should be able to click on FeedQuicklink
    Given User should be able to click on search feed icon
    Given User should be able to search feed<postsearchnamewhichiscreatedabove>postsearchnamewhichiscreatedabove
    Given User should be able to like the post
    Given User shoul be able to click on comment button
    Given User should be able to click on like on previous comment
    Given User should be able to click on reply button
    Given User should be able to comment the post<ReplyOnPost>ReplyOnPost
    Given User should be able to click on sent comment post button
    Given User should be able to click on comment dot
    Given User should be able to delete the comment
    Then closes the browser

    Examples: 
      | mobilenumber | Password | postsearchnamewhichiscreatedabove | CommentOnPostSecondTime | ReplyOnPost              |
      |   7980598251 | Test@123 | this is header added              |                         | Automation comment reply |

  Scenario Outline: Process of post create and update
    Given User click on loginsignup button
    Given User should be able to click on i already have an account
    Given User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User should be able to click on proceed button
    Then User should be able to click on FeedQuicklink
    Then User should be able to click on post to create a new post
    Given User should be able to add heading<AddHeading>addheading
    Given User should be able to enter the text<Description>add Description
    Given User should be able to select images
    Given User should be able to add tagss
    Given User should be able to click on save
    Given User should be able to click on Post
    Given User verifies that news feed is avilable then clicks to get the new feed
    Given User should be able to click on Post dot
    Given User should be able to click Post Edit
    Given User should be able to cut the image from post edit
    Given User should be able to enter the text<Descriptionchange>add Descriptionchange
    Given User should be able to select images
    Given user should be able to click on Update button
    Given User should be able to click on post upadte message and <PostUpdateSuccussfullmessage>PostUpdateSuccussfullmessage
    Then closes the browser

    Examples: 
      | MobileNumber | OtpOne | OtpTwo | OtpThree | OtpFour | AddHeading                  | Description                     | TagToastMessage                                          | mobilenumber | Password | postsearchname | CommentOnPost                 | postsearchnamewhichiscreatedabove | ReplyOnPost     | Descriptionwithvideo         | Descriptionchange      | PostUpdateSuccussfullmessage | TagToastMessageverify                                    |
      |   7980598251 |      1 |      2 |        3 |       4 | Heading Added By Automation | Description Added By Automation | You need to add at least 1 tag, you can add upto 5 tags. |   7980598251 | abc@123  | Unique name    | Comment By automation testing | Heading Added By Automation       | Goodpostonreply | https://youtu.be/aRLvnc7TGdw | Update with automation | Post updated successfully !! | You need to add at least 1 tag, you can add upto 5 tags. |

  Scenario Outline: Process of post create and  delete operation
    Given User click on loginsignup button
    Given User should be able to click on i already have an account
    Given User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User should be able to click on proceed button
    Then User should be able to click on FeedQuicklink
    Then User should be able to click on post to create a new post
    Given User should be able to add heading<AddHeading>addheading
    Given User should be able to enter the text<Description>add Description
    Given User should be able to select images
    Given User should be able to add tagss
    Given User should be able to click on save
    Given User should be able to click on Post
    Given User verifies that news feed is avilable then clicks to get the new feed
    Given User should be able to click on Post dot
    Given User should be able to delete the post
    Given User should be able to click on Confirmation Delete
    Then closes the browser

    Examples: 
      | MobileNumber | OtpOne | OtpTwo | OtpThree | OtpFour | AddHeading                                            | Description                        | TagToastMessage                                          | mobilenumber | Password | postsearchname | CommentOnPost                 | postsearchnamewhichiscreatedabove | ReplyOnPost     | Descriptionwithvideo         | Descriptionchange | PostUpdateSuccussfullmessage | TagToastMessageverify                                    |
      |   7980598251 |      1 |      2 |        3 |       4 | Testing Automation with videoo created and update new | This is for Testing Automation New | You need to add at least 1 tag, you can add upto 5 tags. |   7980598251 | abc@123  | Unique name    | Comment By automation testing | Testing Automation with videoo    | Goodpostonreply | https://youtu.be/aRLvnc7TGdw | Edittednew        | Post updated successfully !! | You need to add at least 1 tag, you can add upto 5 tags. |

  Scenario Outline: Post view in full detail screen and play the videos and then save all image and video in gallery
    Given User click on loginsignup button
    Given User should be able to click on i already have an account
    Given User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User should be able to click on proceed button
    Then User should be able to click on FeedQuicklink
    Then User should be able to click on post to create a new post
    Given User should be able to add heading<AddHeading>addheading
    Given User should be able to enter the text<Description>add Description
    Given User should be able to select images
    Given User should be able to add tagss
    Given User should be able to click on save
    Given User should be able to click on Post
    Given User should be able to click on search feed icon
    Given User should be able to search feed<postsearchnamewhichiscreatedabove>postsearchnamewhichiscreatedabove
    Given User should be able to click on image
    Given User should be able to click on save icon
    Then closes the browser

    Examples: 
      | MobileNumber | OtpOne | OtpTwo | OtpThree | OtpFour | AddHeading                    | Description                                                    | TagToastMessage                                          | mobilenumber | Password | postsearchname | CommentOnPost                 | postsearchnamewhichiscreatedabove | ReplyOnPost     | Descriptionwithvideo         | Descriptionchange | PostUpdateSuccussfullmessage |
      |   7980598251 |      1 |      2 |        3 |       4 | Testing Automation for saving | This is for Testing Automation for saving the images and video | You need to add at least 1 tag, you can add upto 5 tags. |   7980598251 | abc@123  | Unique name    | Comment By automation testing | Testing Automation for saving     | Goodpostonreply | https://youtu.be/aRLvnc7TGdw | Edittednew        | Post updated successfully !! |

  Scenario Outline: Youtube video post in feed
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    Then User should be able to click on FeedQuicklink
    Then User should be able to click on post to create a new post
    Given User should be able to add heading<AddHeading>addheading
    Given User should be able to enter the text<Descriptionwithvideo>add Descriptionwithvideo
    Given User should be able to select images
    Given User should be able to add tagss
    Given User should be able to click on save
    Given User should be able to click on Post
    Then closes the browser

    Examples: 
      | mobilenumber | Password | AddHeading                    | Description                    | TagToastMessage                                          | mobilenumber | Password | postsearchname | CommentOnPost                 | postsearchnamewhichiscreatedabove | ReplyOnPost     | Descriptionwithvideo         | Descriptionchange | PostUpdateSuccussfullmessage | TagToastMessageverify                                    |
      |   7980598251 | Test@123 | Testing Automation with video | This is for Testing Automation | You need to add at least 1 tag, you can add upto 5 tags. |   7980598251 | abc@123  | Unique name    | Comment By automation testing | Testing Automation with videoo    | Goodpostonreply | https://youtu.be/aRLvnc7TGdw | Edittednew        | Post updated successfully !! | You need to add at least 1 tag, you can add upto 5 tags. |
