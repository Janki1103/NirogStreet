Feature: Verify functionality of profile verification and Rejection for Doctor, Chemist and Student users.

  Background: 
    Given Validate the browser

  Scenario Outline: Profile verification with doctor
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
    When user should enter registeration details <counil_name> as a council name and enter registeration number and <year> as a year
    When user upload a file and click on to the the save button
    When User click on add to cart button then <DocumentReview>Document Review message popup should display
    When User click on create post button on feed menu then <DocumentReview> Document Review message popup should display
    When user click on quiz menu and click on take quiz button then <DocumentReview> Document Review message popup should display
    Then closes the browser
    Then User should be able to logout and navigate to the admin portal and login with admin by username as a <AdminUsername> and password as a password <AdminPassword>
    When user should be able to navigate to user detail
    Then User should be able to open the details and approve the user
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | OtpOne | OtpTwo | OtpThree | OtpFour | Congratulations  | Attention  | counil_name                                                                | Registeration_Number | year | DocumentReview         | AdminUsername | AdminPassword |
      | Doctor     | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! | Attention! | Andhra Boards for Ayurveda & Homoeopathy Department of Ayush, Secunderabad |               123456 | 2015 | Documents under review | superadmin    |        123456 |

  Scenario Outline: Profile verification with chemist
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
    When user should select Document type as a <DocumentType> and pan number
    When user type pan number name as <PanCardName>
    When user upload a pan file and click on to the the save button
    When User click on add to cart button then <DocumentReview>Document Review message popup should display
    Then closes the browser
    Then User should be able to logout and navigate to the admin portal and login with admin by username as a <AdminUsername> and password as a password <AdminPassword>
    When user should be able to navigate to user detail
    Then User should be able to open the details and approve the user
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | OtpOne | OtpTwo | OtpThree | OtpFour | Congratulations  | Attention  | DocumentType | PanNumber   | DocumentReview         | AdminUsername | AdminPassword | PanCardName |
      | Chemist    | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! | Attention! | PAN          | 41111117485 | Documents under review | superadmin    |        123456 | JANKI BHATT |

  Scenario Outline: Profile verification with Student
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
    When User click on add to cart button then <DocumentReview>Document Review message popup should display
    When User click on create post button on feed menu then <DocumentReview> Document Review message popup should display
    When user click on quiz menu and click on take quiz button then <DocumentReview> Document Review message popup should display
    Then closes the browser
    Then User should be able to logout and navigate to the admin portal and login with admin by username as a <AdminUsername> and password as a password <AdminPassword>
    When user should be able to navigate to user detail
    Then User should be able to open the details and approve the user
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | OtpOne | OtpTwo | OtpThree | OtpFour | Congratulations  | Attention  | ROllNo | year | DocumentReview         | AdminUsername | AdminPassword |
      | Student    | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! | Attention! | 123456 | 2020 | Documents under review | superadmin    |        123456 |

  Scenario Outline: Profile Rejection with doctor
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
    When user click on quiz menu and click on take quiz button then <Attention> attention popup should display
    When user should enter registeration details <counil_name> as a council name and enter registeration number and <year> as a year
    When user upload a file and click on to the the save button
    Then closes the browser
    Then User should be able to logout and navigate to the admin portal and login with admin by username as a <AdminUsername> and password as a password <AdminPassword>
    When user should be able to navigate to user detail
    Then User should be able to open the details and disapprove the user and select the reason <ReasonOfDisapprove>
    Then closes the browser
    Given Validate the browser
    When User should be logged in with entering mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User click on add to cart button then <Rejection> rejection popup should display
    When User click on create post button on feed menu then <Rejection> rejection popup should display
    When user click on quiz menu and click on take quiz button then <Rejection> rejection popup should display
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | OtpOne | OtpTwo | OtpThree | OtpFour | Congratulations  | Attention  | counil_name                                                                | Registeration_Number | year | DocumentReview         | AdminUsername | AdminPassword | ReasonOfDisapprove           | Rejection             |
      | Doctor     | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! | Attention! | Andhra Boards for Ayurveda & Homoeopathy Department of Ayush, Secunderabad |                  123 | 2020 | Documents under review | superadmin    |        123456 | Documents & profile mismatch | Verification Rejected |

  Scenario Outline: Profile Rejection with chemist
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
    When user should select Document type as a <DocumentType> and pan number
    When user enter the pan name as <PanName>
    When user upload a pan file and click on to the the save button
    Then closes the browser
    Then User should be able to logout and navigate to the admin portal and login with admin by username as a <AdminUsername> and password as a password <AdminPassword>
    When user should be able to navigate to user detail
    Then User should be able to open the details and disapprove the user and select the reason <ReasonOfDisapprove>
    Then closes the browser
    Given Validate the browser
    When User should be logged in with entering mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User click on add to cart button then <Rejection> rejection popup should display
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | OtpOne | OtpTwo | OtpThree | OtpFour | Congratulations  | Attention  | DocumentType | PanNumber  | DocumentReview         | AdminUsername | AdminPassword | ReasonOfDisapprove           | Rejection             | PanName     |
      | Chemist    | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! | Attention! | PAN          | 4111111111 | Documents under review | superadmin    |        123456 | Documents & profile mismatch | Verification Rejected | JANKI BHATT |

  @Run
  Scenario Outline: Profile rejection with Student
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
    Then User should be able to open the details and disapprove the user and select the reason <ReasonOfDisapprove>
    Then closes the browser
    Given Validate the browser
    When User should be logged in with entering mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User click on add to cart button then <Rejection> rejection popup should display
    When User click on create post button on feed menu then <Rejection> rejection popup should display
    When user click on quiz menu and click on take quiz button then <Rejection> rejection popup should display
    Then closes the browser

    Examples: 
      | Profession | Title | Name  | PINCODE | Password  | ConfirmPassword | OtpOne | OtpTwo | OtpThree | OtpFour | Congratulations  | Attention  | ROllNo | year | DocumentReview         | AdminUsername | AdminPassword | ReasonOfDisapprove           | Rejection             |
      | Student    | Mrs.  | janki |  361305 | Nirog@123 | Nirog@123       |      1 |      2 |        3 |       4 | Congratulations! | Attention! | 113456 | 2020 | Documents under review | superadmin    |        123456 | Documents & profile mismatch | Verification Rejected |
