Feature: Login to HRM application

  Scenario: Login with valid credential
  
    Given login is on home page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enter username and password
    Then user should be on home page