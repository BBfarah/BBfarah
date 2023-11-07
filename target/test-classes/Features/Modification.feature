Feature: Modify Profile Information

  Background: 
    Given user is on login page
    When user enters farah.besbes1989@Gmail.comandFARAHbesbes1234!
    And clicks on login button
   
    
  @smoke
  Scenario: Modify name 
    When user clicks the Information button
    And user sends newName <name> and <password>
    And user clicks the Save button
    Then the user name is changed

    Examples: 
      | name   | password         |
      | Farah  | FARAHbesbes1234! |

