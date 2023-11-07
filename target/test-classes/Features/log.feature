
@tag
Feature: User is able to create an account and log into account
Background:
    Given user is on login page
    

  @tag1
  Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    When user enters <email>and<password>
    And clicks on login button
    Then user is navigated to home page

    Examples: 
      | email                      | password         | status  |
      | farah.besbes1989@Gmail.com | FARAHbesbes1234! | success |

  @tag2
  Scenario Outline: Check login is not successful with invalid credentials
    #Given user is on login page
    When user enters <email>and<password>
    And clicks on login button
    Then error message is displayed

    Examples: 
      | email                  | password         |
      | farah.besbes@Gamil.com | FARAHbesbes1234! |

  @tag3
  Scenario Outline: Check login is not successful with invalid credentials
    #Given user is on login page
    When user enters <email>and<password>
    And clicks on login button
    Then error message is displayed

    Examples: 
      | email                      | password    |
      | farah.besbes1989@Gamil.com | FARAHbesbes |

  @tag4
  Scenario Outline: Check login is not successful with invalid credentials
    #Given user is on login page
    When user enters <email>and<password>
    And clicks on login button
    Then error message is displayed

    Examples: 
      | email                  | password    |
      | farah.besbes@Gamil.com | FARAHbesbes |