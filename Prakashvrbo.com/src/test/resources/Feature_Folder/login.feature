

Feature: Login features.
 

  
  Scenario Outline: validating the login functionality in facebook
    Given Launching the chrome browser and url 
    And Maximize the window
    When click the login button and click travellor login
    And Entering the Invalid username "<username>" and password "<password>"
    And Clicking submit button
    Then It should navigate to error message
    #And closing the browser
    
    Examples:
    |username|password|
    |pral@123|vgh@qww|
    |pr@19w7|vfh@12s32|
    
     
    

 
 # Scenario:just trying to understand the concept
  #Given print the start date
  #And and print tc1
  #When print tc2
  #And print tc2
  #Then  close time 

      
