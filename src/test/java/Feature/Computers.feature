Feature: Verify Pickaboo Computers Section work properly

  Background:
    Given Check that Mobile Number section is displayed
    Then Input the Mobile Number
    And  Input The Password
    When Click SIGN IN


  # Test Case 1
  @Release
  Scenario: Verify that the Computers section is displayed properly
    Given Check that Computers section is displayed
    When Click on Computers section
    Then Check that First Computers section is displayed
    When Click on First Computers section
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
  Scenario: Verify that the Computers added review is given properly
    Given Check that Computers section is displayed
    When Click on Computers section
    Then Check that First Computers section is displayed
    When Click on First Computers section
    Then Check that Add Your Review section is displayed
    When Click on Add Your Review section
    Then Check that Review Title section is displayed
    When Input on Review Title section
    Then Check that Feedback Product section is displayed
    When Input on Feedback Product section
    Then Check that Submit Review button is displayed
    When Click on Submit Review button
