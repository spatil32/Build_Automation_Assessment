@Build
Feature: Build - Selenium Webdriver Automation Assessment 

Scenario Outline: Assessment_TestCase1
	Given I open the browser and navigate to build website homepage
	Then I add one product with Suede Kohler K66266U name to the cart
	Then I add one product with Cashmere Kohler K66266U name to the cart
	Then I add two product with Kohler K-5180-ST name to the cart
	Then I checkout from shopping
	Then I select checkout as guest option
	Then I enter <fname> in first name field of Shipping Address Form
	Then I enter <lname> in last name field of Shipping Address Form
	Then I enter <company> in company name field of Shipping Address Form
	Then I enter <streetAddress> in street address field of Shipping Address Form
	Then I enter <apartment> in apartment address field of Shipping Address Form
	Then I enter <zipCode> in zip code field of Shipping Address Form
	Then I enter <city> in city field of Shipping Address Form
	Then I select <state> from state dropdown in Shipping Address Form
	Then I select <country> from country dropdown in Shipping Address Form
	Then I enter <phone> in phone field of Shipping Address Form
	Then I enter <email> in email field of Shipping Address Form
	Then I enter <creditCardNo> in credit card number field of Shipping Address Form
	Then I select <expiryMonth> in credit card month validity field of Shipping Address Form
	Then I select <expiryYear> in credit card year validity field of Shipping Address Form
	Then I enter <cardName> in cardName field of Shipping Address Form
	Then I enter <cvv> in cvv field of Shipping Address Form
	Then I click on Review Order button
	Then I verify <url> for delivery & review page
	
	
	Examples:
	|   fname | lname    |  	company 		| 		streetAddress 	| apartment | zipCode |   city  | state  |		country    | 		phone 	| 				email 			| creditCardNo   | expiryMonth | expiryYear | 	cardName  	| cvv | 												url 											 |
	| Shreyas |   Patil  | 		 Build 			| 3041 S Michigan Ave |  Apt 211  |  60616  | Chicago |Illinois| United States | 3128891919 | patilsr91@gmail.com |4111111111111111|     02      |		2017		| Shreyas Patil | 123 |https://www.build.com/index.cfm?page=checkout:review|
	