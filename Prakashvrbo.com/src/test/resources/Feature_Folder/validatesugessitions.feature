Feature: validating the destination places


Scenario: validating the top destination places

Given user should scrooll down to top destination
When  And print all the destination

Scenario: validating the searched places

Given user should search the places
When user should scrooll down to view the rooms/hotels
And print all the places
