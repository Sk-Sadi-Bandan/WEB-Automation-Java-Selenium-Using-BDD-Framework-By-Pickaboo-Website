Feature: Verify Pickaboo Smartphones Section work properly

  Background:
    Given Check that Mobile Number section is displayed
    Then Input the Mobile Number
    And  Input The Password
    When Click SIGN IN


  # Test Case 1
  @Release
  Scenario: Verify that the Smartphone section is displayed properly
    Given Check that Smartphones section is displayed
    When Click on Smartphones section
    Then Check that Camera Phone section is displayed
    When Click on Camera Phone section
    Then Check that First Camera Phone section is displayed
    When Click on First Camera Phone section
    Then Check that Selected Color section is displayed
    When Click on Selected Color section
    Then Check that Add To Cart section is displayed
    When Click on Add To Cart section
    Then Check that Cart button is displayed
    When Click on Cart button
    Then Check that Proceed to Checkout button is displayed
    When Click on Proceed to Checkout button
    Then Check that Continue button is displayed
    When Click on Continue button

  # Test Case 2
  @Release
  Scenario: Verify that the Search product is displayed properly
    Given Check that Search option is displayed
    When Input a product name in Search option
    Then Click on Search button
    When Check that first search product section is displayed
    Then Click on first search product section
    When Check that Selected Color section is displayed
    Then Click on Selected Color section
    Then Check that Add To Cart section is displayed
    When Click on Add To Cart section
    Then Check that Cart button is displayed
    When Click on Cart button
    Then Check that Proceed to Checkout button is displayed
    When Click on Proceed to Checkout button
    Then Check that Continue button is displayed
    When Click on Continue button

  # test Case 3
  @Release
  Scenario: Verify that the product is removed properly
    Given Check that specific product is displayed
    When Click on a specific product
    Then Check that first specific product is displayed
    When Click on first specific product
    Then Check that Add To Cart section is displayed
    When Click on Add To Cart section
    Then Check that Cart button is displayed
    When Click on Cart button
    Then Check that remove product is displayed
    Then Click on a remove product
    Then Check that Proceed to Checkout button is displayed
    When Click on Proceed to Checkout button
    Then Check that Continue button is displayed
    When Click on Continue button
