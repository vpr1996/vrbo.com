

Feature: validating the tripboards functonality


Scenario: validate the trip saved hotel

Given user should search for place where they want to save for tripboards
When  user should input checkin and checkout dates and select guest for tripboards 
And   user should click search button
And  user should select the hotell or room to save in tripboards
And user should  clik save and give tripname and click save
And user should check in tripboards whether selected room was available or not

