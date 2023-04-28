Feature: Verify Add To Cart Flow With Pay On Delivery Option with Nirog Moeny and Coupon verfication in the cart

  Background: 
    Given Validate the browser


  Scenario Outline: Verify add to cart flow with pay on delivery option
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User verify the cart
    When User click on all medicine menu and search the brand as <brand>
    When User open the product
    When User click on bookmark icon
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User click on change Pincode and click on add new address
    When User enter full name as a <FullName>,Mobile Number as a <mobileNumber>,Alternative Mobile NUmber as a <AlternativeNumber>,Address as a <Address> , Landmark as a <landmark>,pincode as a <pincode>
    When User click on save address button
    When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
    When User search the product as <productName>
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User verify succesfull message as <AddToCartSuccessMessage>
    When User remove address
    When User click on cart and procced for checkout
    When User select pay on deleivery option
    When User click on Pay Now button
    When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
    Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | updateQty | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm | GSTNumber       | LegalEntity                        |
      | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  560068 | Successfully added to cart | Giloy Juice |         5 |             1 |             2 |               3 |              4 | Order Confirmed         | 29AABCU9603R2ZI | UJJIVAN SMALL FINANCE BANK LIMITED |


  Scenario Outline: Verify ecom flow with Add GSTN details and then order placement
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User verify the cart
    When User click on all medicine menu and search the brand as <brand>
    When User open the product
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User click on change Pincode and click on add new address
    When User enter address details like full name as a <FullName>,Mobile Number as a <mobileNumber>,Alternative Mobile NUmber as a <AlternativeNumber>,Address as a <Address> , Landmark as a <landmark>,pincode as a <pincode>,GST Number as a <GSTNumber> and Legal Entity name as a <LegalEntity>
    When User click on save address button
    When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
    When User click on cart and procced for checkout
    When User select pay on deleivery option
    When User click on Pay Now button
    When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
    Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
    When Open Address menu
    When User can enter full name as a <FullName>,Mobile Number as a <mobileNumber>,Alternative Mobile NUmber as a <AlternativeNumber>,Address as a <Address> , Landmark as a <landmark>,pincode as a <pincode> and click on save button
    When User remove address which is created previosuly
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | updateQty | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm | GSTNumber       | LegalEntity                        |
      | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  560068 | Successfully added to cart | Giloy Juice |         5 |             1 |             2 |               3 |              4 | Order Confirmed         | 29AABCU9603R2ZI | UJJIVAN SMALL FINANCE BANK LIMITED |

@Run
  Scenario Outline: Verify ecom flow with Changing default shipping address
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User verify the cart
    When User click on all medicine menu and search the brand as <brand>
    When User open the product
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User click on change Pincode and click on add new address
    When User add address with default shipping address like enter full name as a <FullName>,Mobile Number as a <mobileNumber>,Alternative Mobile NUmber as a <AlternativeNumber>,Address as a <Address> , Landmark as a <landmark>,pincode as a <pincode>
    When User click on save address button
    When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
    When User click on cart and procced for checkout
    When User select pay on deleivery option
    When User click on Pay Now button
    When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
    Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
    When Open Address menu
    When User can enter full name as a <FullName>,Mobile Number as a <mobileNumber>,Alternative Mobile NUmber as a <AlternativeNumber>,Address as a <Address> , Landmark as a <landmark>,pincode as a <pincode> and click on save button
    When User remove address which is created previosuly
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | updateQty | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm | GSTNumber       | LegalEntity                        |
      | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  560068 | Successfully added to cart | Giloy Juice |         5 |             1 |             2 |               3 |              4 | Order Confirmed         | 29AABCU9603R2ZI | UJJIVAN SMALL FINANCE BANK LIMITED |

  # Scenario Outline: Verify ecom flow with same state in billing and in shipping address
  #   Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
  #   When User verify the cart
  #   When User click on all medicine menu and search the brand as <brand>
  #   When User open the product
  #   When User Select the size of the product
  #   When User Enter the quantity of product as <Quantity>
  #   When user click on add to cart button
  #   When User click on change Pincode and click on add new address
  #   When User add address with default shipping address like enter full name as a <FullName>,Mobile Number as a <mobileNumber>,Alternative Mobile NUmber as a <AlternativeNumber>,Address as a <Address> , Landmark as a <landmark>,pincode as a <diffrentstatepincode>
  #   When User click on save address button
  #   When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
  #   When User click on cart and procced for checkout
  #   When User select pay on deleivery option
  #   When User click on Pay Now button
  #   When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
  #   Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
  #   When Open Address menu
  #   When User enter full name as a <FullName>,Mobile Number as a <mobileNumber>,Alternative Mobile NUmber as a <AlternativeNumber>,Address as a <Address> , Landmark as a <landmark>,pincode as a <pincode>
  #   When User remove address which is created previosuly
  #   Then closes the browser

  #   Examples: 
  #     | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | updateQty | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm | GSTNumber       | LegalEntity                        | diffrentstatepincode |
  #     | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  560068 | Successfully added to cart | Giloy Juice |         5 |             1 |             2 |               3 |              4 | Order Confirmed         | 29AABCU9603R2ZI | UJJIVAN SMALL FINANCE BANK LIMITED |               560069 |


  Scenario Outline: Verify Coupon in the cart
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User verify the cart
    When User search the product as <productName>
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
    When User click on cart and procced for checkout to apply coupon
    When User search coupon as <CouponCode> and click on apply coupon and verify coupon message as <InvalidCouponMessage>
    When User click on back
    When User can update the quantity as <updateQty> and then again proceed
    When User open the coupon and search coupon as <CouponCode> then applied the coupon and verified the message as <SuccessmessageOfAppliedCoupon>
    When User select pay on deleivery option
    When User click on Pay Now button
    When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
    Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | InvalidCouponMessage                                                            | updateQty | nirogmoneyAppliedMessage                                                                                                                                   | SuccessmessageOfAppliedCoupon | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm | CouponCode       |
      | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  110005 | Successfully added to cart | Diabe-250   | The applied coupon is only valid for a minimum value of 500 for brand(s) 1Veda. |        10 | Dear Patron, the applied coupon or nirog money will be removed as soon as you exit the payment page. Please make a purchase and enjoy exciting discounts." | Coupon Applied                |             1 |             2 |               3 |              4 | Order Confirmed         | AUTOMATIONCOUPON |

  Scenario Outline: Verify nirogmoney in the cart
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User verify the cart
    When User search the product as <productName>
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
    When User verify succesfull message as <AddToCartSuccessMessage>
    When User click on cart and procced for checkout to apply coupon
    When User click on nirogmoney checkbox and verify it is disabled
    When User click on back
    When User can update the quantity as <updateQty> and then again proceed
    When User applied nirogmoney
    Then User verify nirogMoney message as <NirogMoneyInfoMessage>
    When User select pay on deleivery option
    When User click on Pay Now button
    When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
    Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | updateQty | nirogmoneyAppliedMessage                                                  | NirogMoneyInfoMessage                                                                                                                                       | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm |
      | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  110005 | Successfully added to cart | Diabe-250   |        25 | NirogMoney is not applicable to Kottakal medicines if added to your cart. | "Dear Patron, the applied coupon or nirog money will be removed as soon as you exit the payment page. Please make a purchase and enjoy exciting discounts." |             1 |             2 |               3 |              4 | Order Confirmed         |


  Scenario Outline: Test the Notify Me from product detail for OOS
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    When User clicks on All medicines button
    Then User clicks on universal search bar
    Then User enters the Medicine1 Name as <Medicine2> medicineName1
    Then User clicks on medicine detail
    Then User clicks on Notify Me button
    Then User clicks on Quantity Box to Add into Cart
    Then User enters the quantity for OOS as <Quantity> Quantity
    Then User cliks on save button
    Then User see the Alert Message as <AlertNotifyMeSent>
    Then closes the browser

    Examples: 
      | mobilenumber | Password | Quantity | AlertNotifyMeSent              | Medicine2        |
      |   9911930190 | Satya@24 |       20 | Successfully sent Notification | Chropaxe Tablets |

  Scenario Outline: Test the Notify Me from Prodlist for InStock Items
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    When User clicks on All medicines button
    Then User clicks on universal search bar
    Then User enters the Medicine1 Name as <Medicine1> medicineName1
    Then User clicks on add to cart button
    Then User Selects the medicine size
    Then User clicks on Notify Me button
    Then User clicks on QuantityBox
    Then User enters the quantity as <Quantity> Quantity
    Then User cliks on save button
    Then User see the Alert Message as <AlertNotifyMeSent>
    Then closes the browser

    Examples: 
      | mobilenumber | Password | Quantity | AlertNotifyMeSent              | Medicine1 |
      |   9911930190 | Satya@24 |       20 | Successfully sent Notification | Diabe-250 |

  Scenario Outline: Test the Notify Me from Prodlist for OOS
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    When User clicks on All medicines button
    Then User clicks on universal search bar
    Then User enters the Medicine1 Name as <Medicine2> medicineName1
    Then User clicks on add to cart button
    Then User clicks on Notify Me of OOS item
    Then User clicks on Quantity Box to Add into Cart
    Then User enter the quantity for OOS as <Quantity> Quantity
    Then User cliks on save button
    Then User verify the Alert Message as <AlertNotifyMeSent>
    Then closes the browser

    Examples: 
      | mobilenumber | Password | Quantity | AlertNotifyMeSent              | Medicine2        |
      |   9911930190 | Satya@24 |       20 | Successfully sent Notification | Chropaxe Tablets |

  Scenario Outline: Test the Notify Me from Product detail for Instock items
    Given User should be able to click on signup icon and verify the user is on signup page
    When User clicks on I already have an account
    Then User clicks on Login with Password button
    When user enters the mobile number as <mobilenumber> mobile number
    When user enters the password as <Password> password
    Then User clicks on proceed button
    When User clicks on All medicines button
    Then User clicks on universal search bar
    Then User enters the Medicine1 Name as <Medicine1> medicineName1
    Then User clicks on Medicine Detail
    Then User Selects the medicine size
    Then User clicks on Notify Me button
    Then User clicks on QuantityBox
    Then User enters the quantity as <Quantity> Quantity
    Then User cliks on save button
    Then User see the Alert Message as <AlertNotifyMeSent>
    Then closes the browser

    Examples: 
      | mobilenumber | Password | Quantity | AlertNotifyMeSent              | Medicine1 |
      |   9911930190 | Satya@24 |       20 | Successfully sent Notification | Diabe-250 |
