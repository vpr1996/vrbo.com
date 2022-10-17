

Feature: validating the login functanality

Scenario Outline: validate Travellor invalid username and invalid password

Given user should click the login button and click travellor login
When user should pass the invalid username"<username>" and invalid password"<password>" in the textbox
And user should click signin button

Examples:
       
        |username|password|
        |pk@gmail.com|pk@137e7|
        |pksh@gmail.com|plsh@1yxfy|
        
        
        


Scenario Outline: validate Owner invalid username and invalid password

Given user should click the login button and click owner login
When user should pass the invalid usernam"<emailadd>" and invalid password"<password>" in the textbox
And user should click login button

Examples:
       
        |emailadd|password|
        |pkst@gmail.com|pksq@137e7|
        |pksaah@gmail.com|pqlsh@1yxfy|


Scenario Outline: validate the Travellorlogin with valid username and valid password

Given user should click the login button and travellor login button

When user should pass the valid username"<username>" and valid password "<password>" in the textbox
And user should click the logib button

Examples:
          |username|password|
          |prakashrandy211996@gmail.com|vgk@184221|


