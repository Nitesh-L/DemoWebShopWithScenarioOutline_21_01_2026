 Feature: Working with demo web shop application
   Scenario Outline: User needs to login to the application
     Given User needs to enter the URL
     When User needs to enter te login Cred "<UserName>" and "<Password>"
     Then User needs to verify login
     Examples:
       | UserName | Password |
       | ViratKohli25@rcb.com|Kingkohli@rcb2025|

     Scenario: User needs to print for demo purpose
       Given User needs to enter the URL
       When user needs to print something for example purpsoe
       Then User needs to close the browser

