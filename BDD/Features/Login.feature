Feature: Login Page

  Scenario: successful login with valid crediations
    Given user launch crome browse
    When user opens url "https://demo.guru99.com/test/login.html"
    And user enter emial address as "VijayNanaware92@gmail.com" and Passowrd as  "9762951687"
    And user click on sign in button
    Then page title should be "Successfully Logged in..."

  Scenario Outline: Tocheck login with different data DDT
    Given user launch crome browse
    When user opens url "https://demo.guru99.com/test/login.html"
    And user enter emial address as "<Email>" and Passowrd as  "<Password>"
    And user click on sign in button
    Then page title should be "Successfully Logged in..."

    Examples: 
      | Email                     | Password |
      | VijayNanaware92@gmail.com |    12345 |
      | AjayNanaware92@gmail.com | admin    |
      | AmitNanaware92@gmail.com | admin    |
