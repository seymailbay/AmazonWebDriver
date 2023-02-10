# AmazonWebDriver

BDD,selenium,cucumber, reporting software, TestNG

This repo consists of test scenarios performed on "Amazon.com.tr"

Feature: Amazon.com
  Scenario: Add product to the cart
    Given User is on homepage
    When Click accept cookies
    When Click the search button
    When Write product name
    When Click the submit button
    When Filter for shipped by Amazon
    When Filter for Apple
    When Click for the first product
    When Add to cart
    When Go to cart page
    Then The item should be added to the cart
    
    
    
