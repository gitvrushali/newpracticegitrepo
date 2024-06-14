
Feature: Search and place the the order for Products

Scenario: Searrch Experience forproduct search in both home and offers Page

   Given User is on GreenCart Landing Page 

   When  User Serach with Shortname "Tom" and extracted actual name of product

   Then  User Search for "Tom" Shortname in offerpage 
   And Validate product namae in offers page matches with LandingPage
   

 