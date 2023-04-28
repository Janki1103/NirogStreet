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
Given User should be able to click on post and verify toastmessage as <TagToastMessageverify>
Given User should be able to add tag
Given User should be able to click on Post
Given User should able to verify maximum tag message as <maximumtagmessage>maximumtagmessage
Given User should be able to add tags
Given User should be able to modify uncheck the tags
Given User should be able to click on save
Given User should be able to select images
Given User should be able to add pdf
Given User should be able to add video
Given User should be able to click on Post
# Then User should be able to go profile and logout the account
Then closes the browser


Examples: 

|MobileNumber|OtpOne|OtpTwo|OtpThree|OtpFour|AddHeading|Description|TagToastMessageverify|maximumtagmessage|

 |9911930190|1|2|3|4|Automatin stgFour|This is for Testing Automation stgFour|You need to add at least 1 tag, you can add upto 5 tags.|You can add only upto 5 tags.|


# Scenario Outline:Process to like ,Comment , Bookmark and follow actions for the post (Login into application from login with password page with another user)

# Given User should be able to click on signup icon and verify the user is on signup page
# When User clicks on I already have an account
# Then User clicks on Login with Password button
# When user enters the mobile number as <mobilenumber> mobile number
# When user enters the password as <Password> password
# Then User clicks on proceed button
# Then User should be able to click on FeedQuicklink
# Given User should be able to click on search feed icon
# Given User should be able to search feed <feedpostsearch> feedpostsearch
# Given User should be able to like the post
# # Given User should be able to close the window
# Given User shoul be able to click on comment button
# Given User should be able to comment the post<CommentOnPost>CommentOnPost
# Given User should be able to click on sent comment post button
# Given User should be able to bookmark the feed post
# #Given User should be able to follow the post
# #Then User should be able to go profile and logout the account 
# Then closes the browser   


# Examples: 

# |mobilenumber|Password|feedpostsearch|CommentOnPost|

# |9911930190|Satya@24|Automatin stgFour|Comment By automation|


# Scenario Outline:Process of like the comment and reply to the comment (Login into application from login with OTP page)

# Given User should be able to click on signup icon and verify the user is on signup page
# When User clicks on I already have an account
# Then User clicks on Login with Password button
# When user enters the mobile number as <mobilenumber> mobile number
# When user enters the password as <Password> password
# Then User clicks on proceed button
# Then User should be able to navigate to buy Medicine and verify that page
# Then User should be able to click on FeedQuicklink
# Given User should be able to click on search feed icon
# Given User should be able to search feed<postsearchnamewhichiscreatedabove>postsearchnamewhichiscreatedabove
#  Given User should be able to like the post
# # Given User should be able to close the window
# Given User shoul be able to click on comment button
# Given User should be able to click on like on previous comment
# Given User should be able to click on reply button
# Given User should be able to comment the post<ReplyOnPost>ReplyOnPost
# Given User should be able to click on sent comment post button
# Given User should be able to click on comment dot
# Given User should be able to delete the comment
# Then closes the browser


# Examples: 

# |mobilenumber|Password|postsearchnamewhichiscreatedabove|CommentOnPostSecondTime|ReplyOnPost|

# |9911930190|Satya@24|Automatin stgFour||Automation comment reply|

# Scenario Outline: Process of post create and update delete operation

# Given User click on loginsignup button
# Given User should be able to click on i already have an account
# Given User should be able to enter the number<MobileNumber> mobile number
# Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
# Then User should be able to click on proceed button

# Then User should be able to click on FeedQuicklink
# Then User should be able to click on post to create a new post
# Given User should be able to add heading<AddHeading>addheading
# Given User should be able to enter the text<Description>add Description
# Given User should be able to click on Post
# # Given User should be able to click on post and verify toastmessage as <TagToastMessageverify>
#  Given User should be able to add tag
# Given User should be able to click on Post
# #Given User should be able to click on post and <TagToastMessage>TagToastMessage
# Given User should be able to add tags
# Given User should be able to modify uncheck the tags
# Given User should be able to click on save
# Given User should be able to select images
# Given User should be able to click on Post
# Given User should be able to click on Post dot
# Given User should be able to click Post Edit
# Given User should be able to cut the image from post edit
# Given User should be able to enter the text<Descriptionchange>add Descriptionchange
# Given user should be able to click on Update button
# Given User should be able to click on post upadte message and <PostUpdateSuccussfullmessage>PostUpdateSuccussfullmessage
# Given User should be able to click on Post dot
# Given User should be able to delete the post
# Given User should be able to click on Confirmation Delete
# Then closes the browser

# Examples: 

# |MobileNumber|OtpOne|OtpTwo|OtpThree|OtpFour|AddHeading|Description|TagToastMessage|mobilenumber|Password|postsearchname|CommentOnPost|postsearchnamewhichiscreatedabove|ReplyOnPost|Descriptionwithvideo|Descriptionchange|PostUpdateSuccussfullmessage|

# |9911930190|1|2|3|4|Testing Automation with videoo created and update stg4|Automatin stgFour|You need to add at least 1 tag, you can add upto 5 tags.|7980598251|abc@123|Unique name|Comment By automation testing|Testing Automation with videoo|Goodpostonreply|https://youtu.be/aRLvnc7TGdw|Edittednew|Post updated successfully !!|

# # Scenario Outline: Post view in full detail screen and play the videos and then save all image and video in gallery

# # # Given User click on loginsignup button
# # # Given User should be able to click on i already have an account
# # # Given User should be able to enter the number<MobileNumber> mobile number
# # # Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
# # # Then User should be able to click on proceed button

# # # Then User should be able to click on FeedQuicklink
# # # Then User should be able to click on post to create a new post
# # # Given User should be able to add heading<AddHeading>addheading
# # # Given User should be able to add video
# # #  Given User should be able to select images
# # #  Given User should be able to add pdf

# # # Given User should be able to add tag
# # # Given User should be able to click on Post
# # # Given User should able to verify maximum tag message as <maximumtagmessage>maximumtagmessage
# # # Given User should be able to click on post and <TagToastMessage>TagToastMessage
# # # Given User should be able to add tags
# # # Given User should be able to modify uncheck the tags
# # # Given User should be able to click on save
# # # Given User should be able to click on Post

# # # Then User should be able to go profile and logout the account
# # # Given User should be able to click on signup icon and verify the user is on signup page
# # # When User clicks on I already have an account
# # # Then User clicks on Login with Password button
# # # When user enters the mobile number as <mobilenumber> mobile number
# # # When user enters the password as <Password> password
# # # Then User clicks on proceed button
# # # Then User should be able to navigate to buy Medicine and verify that page

# # # Then User should be able to click on FeedQuicklink
# # # Given User should be able to click on search feed icon
# # # Given User should be able to search feed<postsearchnamewhichiscreatedabove>postsearchnamewhichiscreatedabove
# # # Given User should be able to click on image
# # #Then closes the browser


# # # Examples: 

# # # |MobileNumber|OtpOne|OtpTwo|OtpThree|OtpFour|AddHeading|Description|TagToastMessage|mobilenumber|Password|postsearchname|CommentOnPost|postsearchnamewhichiscreatedabove|ReplyOnPost|Descriptionwithvideo|Descriptionchange|PostUpdateSuccussfullmessage|

# # # |7980598251|1|2|3|4|Testing Automation with videoo|This is for Testing Automation New|You need to add at least 1 tag, you can add upto 5 tags.|7980598251|abc@123|Unique name|Comment By automation testing|Testing Automation with videoo|Goodpostonreply|https://youtu.be/aRLvnc7TGdw|Edittednew|Post updated successfully !!|


# Scenario Outline:Youtube video post in feed 

# Given User click on loginsignup button
# Given User should be able to click on i already have an account
# Given User should be able to enter the number<MobileNumber> mobile number
# Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
# Then User should be able to click on proceed button

# Then User should be able to click on FeedQuicklink
# Then User should be able to click on post to create a new post
# Given User should be able to add heading<AddHeading>addheading
# Given User should be able to enter the text<Descriptionwithvideo>add Descriptionwithvideo
# Given User should be able to click on Post
# # Given User should be able to click on post and verify toastmessage as <TagToastMessageverify>
# Given User should be able to add tag
# Given User should be able to click on Post
# # Given User should able to verify maximum tag message as <maximumtagmessage>maximumtagmessage
# #Given User should be able to click on post and <TagToastMessage>TagToastMessage
# Given User should be able to add tags
# Given User should be able to modify uncheck the tags
# Given User should be able to click on save
# Given User should be able to click on Post
# Then closes the browser


# Examples: 

# |MobileNumber|OtpOne|OtpTwo|OtpThree|OtpFour|AddHeading|Description|TagToastMessage|mobilenumber|Password|postsearchname|CommentOnPost|postsearchnamewhichiscreatedabove|ReplyOnPost|Descriptionwithvideo|Descriptionchange|PostUpdateSuccussfullmessage|

# |9911930190|1|2|3|4|Automatin stgFour Video|This is for Testing Automation With Video In stgFour|You need to add at least 1 tag, you can add upto 5 tags.|7980598251|abc@123|Unique name|Comment By automation testing|Testing Automation with videoo|Goodpostonreply|https://youtu.be/aRLvnc7TGdw|Edittednew|Post updated successfully !!|



