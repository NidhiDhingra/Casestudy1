Feature: Test Signup
This feature includes scenario that would validate the following feature.
1) Successfull signup
2) Login with user
3) Compose mail and send to valid email id


@Signup
Scenario: Signup successfully with valid data and validate the email and send to valid id
Given I should be on the Screen with signup
When I click on Signup button 
And I Enter First name as "Nidhi1"
And I Enter Last name as "Nidhi1"
And I Enter e-mail as "nidhi1@nidhi1.com"
And I Enter Username as "ndhingra1"
And I Enter Pass as "abcd"
And I Enter Confirm Pass as "abcd"
And I click on Register button
#Then I should see the message as "Dear ady8 ady8"
And I click on the picture button
And I click on the inbox button
And I click on the compose button
And I click on sendto as "nidhi1@nidhi1.com"
And I enter the subject as "Hi"
And I click on the Send Message button
Then I should see the acknowledgement window as "The message has been sent to Nidhi1 Nidhi1 (ndhingra1)"
