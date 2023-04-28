Feature: Doctor my profile - Process of add operations for all details

  Background: 
    Given Validate the browser

  Scenario Outline: Test the Doctor should able to add the details
    Given User click on loginsignup button
    Given User should be able to click on i have account button
    Given User should be able to enter the number as <Mobile> mobile and click on otp button
    Given User should be able to click resend otp
    When User get resend successfull message as <resendSuccessfullyMessage>
    When user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on proceed button
    When User click on profile icon
    When User click on change profile picture and upload the profile picture
    When User Select the dropdown and Select the gender<gender>
    When User click on category and select the category<category>
    When User able to add the experience<experience>
    When user able to add the date as <date>
    When User able to add the Website as <Website>
    When User able to add the about as <about>
    When User able to click the save and <SuccessfullyMessage>
    When user click on qualification and select the qualification as <qualification>
    When User click on university and select the university as <university>
    When User add passing year as <passingyear>
    When User able to upload the document and click on save button as <EducationDetailSaveSuccessfullMessage>
    When User click on three dots
    When User able to click on edit the education details
    When User able to update qualification as <UpdateQualification>
    When User able to update university as <updateUniversity>
    When User able to update passing year as <updatepassingYear>
    When User able to update upload document and click on save button get successfull message as <EducationUpdateSuccessfullMessage>
    When User click on three dots for delete
    When User able to delete the education details as <EducationDetailRemovedSuccessfullMessage>
    When User click on services tab and User click on add more button
    When User click on search text field and select services and save the services as <services>
    When User save service SuccessfullyMessage<serviceSuccessfullMessage>
    When User delete services and get the remove services successfully message as <RemoveServicesSuccessfulyMessage>
    When User click on specialization tab and click on add more button
    When User click on specialization tab and User click on add more button <specialization>
    When User save specialization SuccessfullyMessage<specializationSuccessfullMessage>
    When User remove the specialization and getting special remove message as <removespecialisationsuccessfullmessage>
    When User click on experience tab and click on add more button
    When User add the city as <city>
    When User add the Hospital or clinic name as <hospitalorClinicName>
    When User add from as <from>
    When User add to as <to> and click on check box currently working here
    When User click on save button and get experience SuccessfullyMessage as <experienceSuccessfullMessage>
    When User click on Experience three dots
    When User Click On edit experience detail
    When User update the city as <updateCity>
    When User update the hospital or clinic name as <updatehospitalorClinicName>
    When User update from as <updatefrom>
    When User update to as <updateto>
    When User click on save button and get update experience SuccessfullyMessage as <UpdateexperienceSuccessfullMessage>
    When User click on three dots and click on delete
    When User getting the delete experience message as <deleteexperiencemessage>
    When User click on Awards tab and click on add button
    When User add the Award name as <Awardname>
    When User select the year as <year> and click on save button
    When User get the award successfull message as <AwardSuccessfullMessage>
    When User get the award detail removed message as <AwardRemovedSuccessfullMessage>
    When User memberships tab and click on add button
    When User add the membership name as <membership> and click on save button
    When User get the membership successfull message<MembershipSuccessfullMessage>
    When User delete the membersip details and get the msg membership removed as <MembershipRemovedSuccessfullMessage>
    When User Click on clinic details tab and click on vidyatool button
    Then closes the browser

    Examples: 
      | Mobile     | resendSuccessfullyMessage | OtpOne | OtpTwo | OtpThree | OtpFour | gender | category | experience | date       | Website                   | about       | SuccessfullyMessage                                            | qualification             | university | passingyear | EducationDetailSaveSuccessfullMessage | UpdateQualification | updateUniversity                             | updatepassingYear | EducationUpdateSuccessfullMessage   | EducationDetailRemovedSuccessfullMessage | services  | serviceSuccessfullMessage    | RemoveServicesSuccessfulyMessage  | specialization | specializationSuccessfullMessage    | removespecialisationsuccessfullmessage   | city      | hospitalorClinicName | from | to   | experienceSuccessfullMessage       | updateCity | updatehospitalorClinicName | updatefrom | updateto | UpdateexperienceSuccessfullMessage   | deleteexperiencemessage              | Awardname   | year | AwardSuccessfullMessage   | AwardRemovedSuccessfullMessage  | membership             | MembershipSuccessfullMessage       | MembershipRemovedSuccessfullMessage  |
      | 8530906851 | Resent OTP successfully!  |      1 |      2 |        3 |       4 | Male   | Unani    |          6 | 12-10-1995 | https://stg3web.1veda.in/ | i am doctor | Successfully updated Personal information and Contact details! | B.A.M.S. (Ayurvedacharya) | Gauhati    |        1995 | Successfully added the Education!     | B.A.M.S. & M.D      | Andhra Pradesh University of Health Sciences |              2022 | Successfully updated the Education! | Successfully removed the Education!      | abdominal | Successfully added Services! | Successfully removed the Service! | Accupressure   | Successfully added Specializations! | Successfully removed the Specialization! | ghaziabad | nirogstreet          | 1985 | 1995 | Successfully added the Experience! | delhi      | Hinirog                    |       1990 |     1998 | Successfully updated the Experience! | Successfully removed the Experience! | officeAward | 1992 | Successfully added Award! | Successfully removed the Award! | Nirogstreet membership | Successfully added the Membership! | Successfully removed the Membership! |

  Scenario Outline: Test the Chemist should able to add the details
    Given User click on loginsignup button
    Given User should be able to click on i have account button
    Given User should be able to enter the number as <Mobile> mobile and click on otp button
    Given User should be able to click resend otp
    When User get resend successfull message as <resendSuccessfullyMessage>
    When user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on proceed button
    When User click on profile icon
    When User click on change profile picture and upload the profile picture
    When User Select the dropdown and Select the gender<gender>
    When User click on category and select the category<category>
    When User able to add the experience<experience>
    When user able to add the date as <date>
    When User able to add the Website as <Website>
    When User able to add the about as <about>
    When User able to click the save and <SuccessfullyMessage>
    Then closes the browser

    Examples: 
      | Mobile     | resendSuccessfullyMessage | OtpOne | OtpTwo | OtpThree | OtpFour | gender | category | experience | date       | Website                   | about        | SuccessfullyMessage                                            |
      | 8872447855 | Resent OTP successfully!  |      1 |      2 |        3 |       4 | Male   | Unani    |          6 | 10-10-1995 | https://stg3web.1veda.in/ | i am chemist | Successfully updated Personal information and Contact details! |
@Run
  Scenario Outline: Test the Student should able to add the details
    Given User click on loginsignup button
    Given User should be able to click on i have account button
    Given User should be able to enter the number as <Mobile> mobile and click on otp button
    Given User should be able to click resend otp
    When User get resend successfull message as <resendSuccessfullyMessage>
    When user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on proceed button
    When User click on profile icon
    When User click on change profile picture and upload the profile picture
    When User Select the dropdown and Select the gender<gender>
    When User click on category and select the category<category>
    When User able to add the experience<experience>
    When user able to add the date as <date>
    When User able to add the Website as <Website>
    When User able to add the about as <about>
    When User able to click the save and <SuccessfullyMessage>
    When user click on qualification and select the qualification as <qualification>
    When User click on university and select the university as <university>
    When User add passing year as <passingyear>
    When User able to upload the document and click on save button as <EducationDetailSaveSuccessfullMessage>
    When User click on three dots
    When User able to click on edit the education details
    When User able to update qualification as <UpdateQualification>
    When User able to update university as <updateUniversity>
    When User able to update passing year as <updatepassingYear>
    When User able to update upload document and click on save button get successfull message as <EducationUpdateSuccessfullMessage>
    When User click on three dots for delete
    When User able to delete the education details as <EducationDetailRemovedSuccessfullMessage>
    When User click on Awards tab and click on add button for student profile
    When User add the Award name as <Awardname>
    When User select the year as <year> and click on save button
    When User get the award successfull message as <AwardSuccessfullMessage>
    When User get the award detail removed message as <AwardRemovedSuccessfullMessage>
    When User memberships tab and click on add button
    When User add the membership name as <membership> and click on save button
    When User get the membership successfull message<MembershipSuccessfullMessage>
    When User delete the membersip details and get the msg membership removed as <MembershipRemovedSuccessfullMessage>
    When User Click on clinic details tab and click on vidyatool button
    Then closes the browser

    Examples: 
      | Mobile     | resendSuccessfullyMessage | OtpOne | OtpTwo | OtpThree | OtpFour | gender | category | experience | date       | Website                   | about        | SuccessfullyMessage                                            | qualification             | university | passingyear | EducationDetailSaveSuccessfullMessage | UpdateQualification | updateUniversity                             | updatepassingYear | EducationUpdateSuccessfullMessage   | EducationDetailRemovedSuccessfullMessage | services  | serviceSuccessfullMessage    | RemoveServicesSuccessfulyMessage  | specialization | specializationSuccessfullMessage    | removespecialisationsuccessfullmessage   | city      | hospitalorClinicName | from | to   | experienceSuccessfullMessage       | updateCity | updatehospitalorClinicName | updatefrom | updateto | UpdateexperienceSuccessfullMessage   | deleteexperiencemessage              | Awardname   | year | AwardSuccessfullMessage   | AwardRemovedSuccessfullMessage  | membership             | MembershipSuccessfullMessage       | MembershipRemovedSuccessfullMessage  |
      | 9854588410 | Resent OTP successfully!  |      1 |      2 |        3 |       4 | Male   | Unani    |          6 | 12-10-1995 | https://stg3web.1veda.in/ | i am student | Successfully updated Personal information and Contact details! | B.A.M.S. (Ayurvedacharya) | Gauhati    |        1995 | Successfully added the Education!     | B.A.M.S. & M.D      | Andhra Pradesh University of Health Sciences |              2022 | Successfully updated the Education! | Successfully removed the Education!      | abdominal | Successfully added Services! | Successfully removed the Service! | Accupressure   | Successfully added Specializations! | Successfully removed the Specialization! | ghaziabad | nirogstreet          | 1985 | 1995 | Successfully added the Experience! | delhi      | Hinirog                    |       1990 |     1998 | Successfully updated the Experience! | Successfully removed the Experience! | officeAward | 1992 | Successfully added Award! | Successfully removed the Award! | Nirogstreet membership | Successfully added the Membership! | Successfully removed the Membership! |

  Scenario Outline: Test the Student Update the Profession from Student to Doctor
    Given User should be able to click on signup icon and verify the user is on signup page
    When User should be able to select a profession as <Profession>
    When User should be able to select a title as <Title>
    When User should be able to Enter full name as <Name>
    When User should be able to Enter mobile number
    When User should be able to Enter the pincode as <PINCODE>
    When User Should be able to set a Password as <Password>
    When User Should be able to set a Confrim Password as <ConfirmPassword>
    When User should be able to click on GET OTP button
    When Popup should come and user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User verify congratulation popup and title is <Congratulations>
    When User click on add to cart button then <Attention> attention popup should display
    When User click on create post button on feed menu then <Attention> attention popup should display
    When user click on quiz menu and click on take quiz button then <Attention> attention popup should display
    When user should enter registeration details enter roll number and <year> as a year
    When user upload a collage ID file and click on to the the save button
    Then closes the browser
    Then User should be able to logout and navigate to the admin portal and login with admin by username as a <AdminUsername> and password as a password <AdminPassword>
    When user should be able to navigate to user detail
    Then User should be able to open the details and approve the user
    Then closes the browser
    Given Validate the browser
    When User should be logged in with entering mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User click on profile icon
    When User click on update profession button
    When User select the council name as <councilname>
    When User write the medical rajistration number <rajistrationNumber>
    When User write the year <passingyear>
    When User upload the medical rajistration number doc
    Then User click on save button
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | Congratulations  | Attention  | ROllNo | year | DocumentReview         | AdminUsername | AdminPassword |  | Mobile     | resendSuccessfullyMessage | OtpOne | OtpTwo | OtpThree | OtpFour | councilname                                                                | rajistrationNumber | passingyear |
      | Student    | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       | Congratulations! | Attention! | 123456 | 2020 | Documents under review | superadmin    |        123456 |  | 9876543212 | Resent OTP successfully!  |      1 |      2 |        3 |       4 | Andhra Boards for Ayurveda & Homoeopathy Department of Ayush, Secunderabad |             123456 |        1992 |

  Scenario Outline: Test the Mobile Number  Update in Personal Detail Section
    Given User click on loginsignup button
    Given User should be able to click on i have account button
    Given User should be able to enter the number as <Mobile> mobile and click on otp button
    Given User should be able to click resend otp
    Given User get resend successfull message as <resendSuccessfullyMessage>
    Given user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Given User should be able to click on proceed button
    Given User click on profile icon
    Given User click on mobile edit icon
    Given User enter the mobile number as <entermobileupdate> and click on get otp button
    When Popup should come and user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on otp proceed button and get mobile number change successfull message as <MobileNumberChangeSuccessfullMessage>
    When User Click on personal and contact details tab for update mobile number
    Given User click on mobile edit icon again
    Given User enter the mobile number as <Mobile> and click on get otp button
    When Popup should come and user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on otp proceed button and get mobile number change successfull message as <MobileNumberChangeSuccessfullMessage>
    Then closes the browser

    Examples: 
      | Mobile     | resendSuccessfullyMessage | OtpOne | OtpTwo | OtpThree | OtpFour | gender | category | experience | date       | Website                   | about       | entermobileupdate | MobileNumberChangeSuccessfullMessage                           |
      | 8530906851 | Resent OTP successfully!  |      1 |      2 |        3 |       4 | Male   | Unani    |          6 | 10-10-1995 | https://stg3web.1veda.in/ | i am doctor |        6530906852 | Successfully updated Personal information and Contact details! |
