Feature: Verify My Order with all track status

  Background: 
    Given Validate the browser

  Scenario Outline: Verify My Order with all status
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User verify the cart
    When User search the product as <productName>
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
    When User verify succesfull message as <AddToCartSuccessMessage>
    When User click on cart and procced for checkout
    When User select pay on deleivery option
    When User click on Pay Now button
    When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
    Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
    Then User execute post request for Shipment Created status
    Then User execute post request for pick created status
    Then User execute post request for Approved status
    Then User execute post request for Pick Assigned status
    Then User execute post request for Pick Registered status
    Then User execute post request for Completly Packed status
    Then User execute post request for Shipment Post status
    Then User execute post request for Shipped status
    Then User execute post request for dispatch status
    Then User execute post request for Delivered status
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | updateQty | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm |
      | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  110005 | Successfully added to cart | Diabe-250   |         5 |             1 |             2 |               3 |              4 | Order Confirmed         |

@Run
  Scenario Outline: Verify My Order Return request and download the invoice
    Given User should be logged in with <mobile> as a mobile number and add OTP As <OtpOne> <OtpTwo> <OtpThree> <OtpFour>
    When User verify the cart
    When User search the product as <productName>
    When User Select the size of the product
    When User Enter the quantity of product as <Quantity>
    When user click on add to cart button
    When User click on continue shopping and verify succesfull message as <AddToCartSuccessMessage>
    When User verify succesfull message as <AddToCartSuccessMessage>
    When User click on cart and procced for checkout
    When User select pay on deleivery option
    When User click on Pay Now button
    When User enter OTP As <PaymentOtpOne> <PaymentOtpTwo> <PaymentOtpThree> <PaymentOtpFour>
    Then user click on Confirm Order and verify the confirm order message as <SuccessMessageOfConfirm>
    Then User execute post request for Shipment Created status
    Then User execute post request for pick created status
    Then User execute post request for Approved status
    Then User execute post request for Pick Assigned status
    Then User execute post request for Pick Registered status
    Then User execute post request for Completly Packed status
    Then User execute post request for Shipment Post status
    Then User execute post request for Shipped status
    Then User execute post request for dispatch status
    Then User execute post request for Delivered status
    Then user copy order id and click on my order menu
    When User search the order
    When User open the order
    Then User click on download Invoice Button and verify message as <InvoiceMessage>
    Then User click on return buttton and select return type
    Then User select return reason
    Then click on return order
    Then closes the browser
    Then User should be able to logout and navigate to the admin portal and login with admin by username as a <AdminUsername> and password as a password <AdminPassword>
    Then User open the return order menu
    Then User search order
    When User click on Return Button on the listing page
    When User enter return reson as <ReturnReason> and click on approve button
    Then closes the browser

    Examples: 
      | mobile     | OtpOne | OtpTwo | OtpThree | OtpFour | brand | Quantity | FullName    | mobileNumber | AlternativeNumber | Address         | landmark                 | pincode | AddToCartSuccessMessage    | productName | InvalidCouponMessage                                                                      | updateQty | nirogmoneyAppliedMessage                                                  | SuccessmessageOfAppliedCoupon | PaymentOtpOne | PaymentOtpTwo | PaymentOtpThree | PaymentOtpFour | SuccessMessageOfConfirm | ReturnReason     | AdminUsername | AdminPassword | RTONumber | ReturnReason | InvoiceMessage                 |
      | 8530906851 |      1 |      2 |        3 |       4 | 1Veda |        1 | Janki Bhatt |   8530906851 |        9974580345 | 12/141,jamnagar | Vedant School of Science |  110005 | Successfully added to cart | Diabe-250   | The applied coupon is only valid for a minimum value of 1000 for brand(s) Dhootpapeshwar. |        15 | NirogMoney is not applicable to Kottakal medicines if added to your cart. | Coupon Applied                |             1 |             2 |               3 |              4 | Order Confirmed         | No Longer Needed | superadmin    |        123456 |     12345 | Returned     | Your invoice is downloading... |
