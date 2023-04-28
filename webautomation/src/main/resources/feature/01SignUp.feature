Feature: Verify Login and sign up module with SignUp for Doctor,Chemist and Student, verify login with OTP and Password, ForgotPassword,Resend OTP,changepassword functionality and Quicklinks verification, Homepage Nonloggedin user access.

  Background: 
    Given Validate the browser

  Scenario Outline: Verify the SignUp Page for Doctor, Chemist and Student profile
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
    Then User should get rediected to the homepage with a congratulation popup and title is <Congratulations>
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | OtpOne | OtpTwo | OtpThree | OtpFour | Congratulations  |
      | Doctor     | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! |
      | Student    | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! |
      | Chemist    | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! |

  Scenario Outline: Verify login with otp functionality
    Given User click on loginsignup button
    Given User should be able to click on i already have an account
    Given User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to click the get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User should be able to click on proceed button
    When User should be able to verify Buy Medicine menu
    Then closes the browser

    Examples: 
      | MobileNumber | OtpOne | OtpTwo | OtpThree | OtpFour |
      |   8530906851 |      1 |      2 |        3 |       4 |

  Scenario Outline: Verify forgot password functionality
    Given User click on loginsignup button
    Given User should be able to click on i already have an account
    Given User should be able to click on Login Using Password
    Then User should click on Forget Password
    Then User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to click the troble get otp <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Given User should be able to click on proceed
    Given User should be able to click on  password<setpassword> setpassword
    Given User should be able to click on confirm password<confirmpassword> confirmpassword
    Given User should be able to click on save button
    Given User should be able to again Login Using Password
    Then User should be able to enter the number<MobileNumber> mobile number
    Given User should be able to enter password<Password>password
    Given User should be able to click on proceed with password
    When User should be able to verify Buy Medicine menu by using login using password
    Then closes the browser

    Examples: 
      | MobileNumber | OtpOne | OtpTwo | OtpThree | OtpFour | setpassword | confirmpassword | SuccessfullyaddnewpasswordToastMessage | Password |
      |   8530906851 |      1 |      2 |        3 |       4 | Test@123    | Test@123        | Successfully added new password        | Test@123 |


  Scenario Outline: Verify Login with Password functionality
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    Then closes the browser

    Examples: 
      | mobilenumber | Password |
      |   8530906851 | Test@123 |

  Scenario Outline: Verify Resend OTP functionality
    Given User click on loginsignup button
    Given User should be able to click on i have account button
    Given User should be able to enter the number as <Mobile> mobile and click on otp button
    Given User should be able to click resend otp
    When user can add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    Then User should be able to click on the proceed button
    Then closes the browser

    Examples: 
      | Mobile     | OtpOne | OtpTwo | OtpThree | OtpFour |
      | 8530906851 |      1 |      2 |        3 |       4 |

@Run
  Scenario Outline: Verify change the number functionality
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    When User Enters Mobile Number as <MobileNumber> MobileNumber
    And clicks on GET OTP button
    Then User clicks on Change Number button
    When User Enters Other Mobile Number as <OtherMobileNumber> Other Mobile Number
    And clicks on GET OTP button
    Then User enters the OTP as <OTPOne> <OTPTwo> <OTPThree> <OTPFour>
    Then User clicks on Proceed button
    Then closes the browser

    Examples: 
      | MobileNumber | OtherMobileNumber | OTPOne | OTPTwo | OTPThree | OTPFour |
      |   8530906851 |        8530906851 |      1 |      2 |        3 |       4 |

  Scenario Outline: Verify all the quicklinks available in website with doctor profile
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on Buy Medicine menu
    Then User should be able to navigate to buy Medicine and verify that page
    When User should be able to click on Feed menu
    Then User should be able to navigate to Feed and verify that page
    When User should be able to click on Quiz menu
    Then User should be able to navigate to Quiz and verify that page
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | MyOrderURL                        |
      | 8530906851 |      1 |      2 |        3 |       4 | https://stg4web.1veda.in/myorders |

  Scenario Outline: Verify all the quicklinks available in website with chemist profile
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on Buy Medicine menu
    Then User should be able to navigate to buy Medicine and verify that page
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | MyOrderURL                        | MyOrders        |
      | 8178358333 |      1 |      2 |        3 |       4 | https://stg4web.1veda.in/myorders | Previous Orders |

  Scenario Outline: Verify all the quicklinks available in website with Student profile
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User should be able to click on Buy Medicine menu
    Then User should be able to navigate to buy Medicine and verify that page
    When User should be able to click on Feed menu
    Then User should be able to navigate to Feed and verify that page
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | MyOrderURL                        |
      | 9854588410 |      1 |      2 |        3 |       4 | https://stg4web.1veda.in/myorders |

  Scenario Outline: Test the Nirogstreet homepage for Non-logged user
    Given User should be in home page
    When User clicks on Buy Medicine Quicklinks and redirected to the signup page
    When User clicks on Feed Quicklinks and redirected to the signup page
    When User clicks on Quiz Quicklinks and redirected to the signup page
    When User clicks on My Orders Quicklinks and redirected to the signup page
    When User clicks on VaidyaTool Quicklinks and redirected to the signup page
    When User clicks on Find Clinics QuickLink and redirected to the find clinic page
    Then User search for clinic as <ClinicName>
    Given User should be in home page
    When User clicks on Patented Medicine and selects a medicine as <PatentedMedicine>
    Then User clicks on Get The Best Price Button in patented and redirected to the signup page
    When User clicks on HealthBlogs Quicklinks and redirected to the healthBlog page
    Then User goes to home page
    When User clicks on Classic Medicine and enters a classic mediicne as <ClassicMedicine>
    Then User clicks on Get The Best Price Button and redirected to the signup page
    Given User should be in home page
    When User clicks on All medicines Link
    Then User clicks on Get The Best Price Button and redirected to the signup page
    When User clicks on Find Doctors QuickLink and redirected to the Doctors list page
    Then User search for a Doctor as <DoctorName>
    Given User should be in home page
    When User clicks on Brandlink and enters a Brand
    Then User clicks on Get The Best Price Button for brand and redirected to the signup page
    When User clicks on universal search and enter a medicine as <MedName>
    Then User clicks on Get the Best Price Button and redirected to the signup page
    Given User should be in home page
    When User clicks on Offers
    Then User clicks on Get the Best Price Button and redirected to the signup page
    When User clicks on Need help button
    Then User Enters the Full Name as <FullName>
    Then User Enters the Mobile Number as <MobileNumber>
    Then User Enters Email as <Email>
    Then User Enters the Message as <Message>
    Then User clicks on send button and verify the success message as <SuccessAlertMessage>
    Then closes the browser

    Examples: 
      | DoctorName | MedName  | FullName   | MobileNumber | Email             | Message           | ClinicName  | ClassicMedicine | PatentedMedicine | SuccessAlertMessage                                              |
      | Satyashri  | Ayurveda | SatyaShree |   9911930190 | satya@yopmail.com | AutomationTesting | Satya 1veda | Arishta         | Churna           | Thanks for contacting us! We will get in touch with you shortly. |
