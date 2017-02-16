/*******************************************************************************
 * Copyright (c) 2017 Shreyas Patil.
 * All rights reserved. This assessment framework or any portion thereof
 * may not be reproduced or used in any manner whatsoever
 * without the express written permission of the publisher
 * except for the use to review for assessment results by the members of build.com.
 *
 * Contributors:
 *     Shreyas Patil
 *******************************************************************************/
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Assessment.feature");
formatter.feature({
  "line": 2,
  "name": "Build - Selenium Webdriver Automation Assessment",
  "description": "",
  "id": "build---selenium-webdriver-automation-assessment",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Build"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Assessment_TestCase1",
  "description": "",
  "id": "build---selenium-webdriver-automation-assessment;assessment-testcase1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open the browser and navigate to build website homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add one product with Suede Kohler K66266U name to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I add one product with Cashmere Kohler K66266U name to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I add two product with Kohler K-5180-ST name to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I checkout from shopping",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select checkout as guest option",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I enter \u003cfname\u003e in first name field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter \u003clname\u003e in last name field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter \u003ccompany\u003e in company name field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter \u003cstreetAddress\u003e in street address field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I enter \u003capartment\u003e in apartment address field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter \u003czipCode\u003e in zip code field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter \u003ccity\u003e in city field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I select \u003cstate\u003e from state dropdown in Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I select \u003ccountry\u003e from country dropdown in Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I enter \u003cphone\u003e in phone field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I enter \u003cemail\u003e in email field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I enter \u003ccreditCardNo\u003e in credit card number field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I select \u003cexpiryMonth\u003e in credit card month validity field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I select \u003cexpiryYear\u003e in credit card year validity field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I enter \u003ccardName\u003e in cardName field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I enter \u003ccvv\u003e in cvv field of Shipping Address Form",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on Review Order button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I verify \u003curl\u003e for delivery \u0026 review page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I verify that CA tax is correct",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I verify that grand total is correct",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "build---selenium-webdriver-automation-assessment;assessment-testcase1;",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "company",
        "streetAddress",
        "apartment",
        "zipCode",
        "city",
        "state",
        "country",
        "phone",
        "email",
        "creditCardNo",
        "expiryMonth",
        "expiryYear",
        "cardName",
        "cvv",
        "url"
      ],
      "line": 34,
      "id": "build---selenium-webdriver-automation-assessment;assessment-testcase1;;1"
    },
    {
      "cells": [
        "Shreyas",
        "Patil",
        "Build",
        "3041 S Michigan Ave",
        "Apt 211",
        "60616",
        "Chicago",
        "Illinois",
        "United States",
        "3128891919",
        "patilsr91@gmail.com",
        "4111111111111111",
        "02",
        "2017",
        "Shreyas Patil",
        "123",
        "https://www.build.com/index.cfm?page\u003dcheckout:review"
      ],
      "line": 35,
      "id": "build---selenium-webdriver-automation-assessment;assessment-testcase1;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12351262830,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Assessment_TestCase1",
  "description": "",
  "id": "build---selenium-webdriver-automation-assessment;assessment-testcase1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Build"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open the browser and navigate to build website homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add one product with Suede Kohler K66266U name to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I add one product with Cashmere Kohler K66266U name to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I add two product with Kohler K-5180-ST name to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I checkout from shopping",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select checkout as guest option",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I enter Shreyas in first name field of Shipping Address Form",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter Patil in last name field of Shipping Address Form",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter Build in company name field of Shipping Address Form",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter 3041 S Michigan Ave in street address field of Shipping Address Form",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I enter Apt 211 in apartment address field of Shipping Address Form",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter 60616 in zip code field of Shipping Address Form",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter Chicago in city field of Shipping Address Form",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I select Illinois from state dropdown in Shipping Address Form",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I select United States from country dropdown in Shipping Address Form",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I enter 3128891919 in phone field of Shipping Address Form",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I enter patilsr91@gmail.com in email field of Shipping Address Form",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I enter 4111111111111111 in credit card number field of Shipping Address Form",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I select 02 in credit card month validity field of Shipping Address Form",
  "matchedColumns": [
    12
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I select 2017 in credit card year validity field of Shipping Address Form",
  "matchedColumns": [
    13
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I enter Shreyas Patil in cardName field of Shipping Address Form",
  "matchedColumns": [
    14
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I enter 123 in cvv field of Shipping Address Form",
  "matchedColumns": [
    15
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on Review Order button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I verify https://www.build.com/index.cfm?page\u003dcheckout:review for delivery \u0026 review page",
  "matchedColumns": [
    16
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I verify that CA tax is correct",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I verify that grand total is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_open_the_browser_and_navigate_to_build_website_homepage()"
});
formatter.result({
  "duration": 169232574,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_add_one_Suede_Kohler_K66266U_to_the_cart()"
});
formatter.result({
  "duration": 30942232896,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_add_one_Cashmere_Kohler_K66266U_to_the_cart()"
});
formatter.result({
  "duration": 26379483582,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_add_two_product_with_Kohler_K_5180_ST_name_to_the_cart()"
});
formatter.result({
  "duration": 25386229788,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_checkout_from_shopping()"
});
formatter.result({
  "duration": 9851282305,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_select_checkout_as_guest_option()"
});
formatter.result({
  "duration": 5755707736,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shreyas",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_firstName_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 8306877181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patil",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_lastName_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 1609245871,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_companyName_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 835411783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3041 S Michigan Ave",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_street_address_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 909485538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apt 211",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_apartment_address_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 851590720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60616",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_zipcode_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 992754260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chicago",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_city_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 1164507150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Illinois",
      "offset": 9
    }
  ],
  "location": "AssessmentStepDefinitions.I_select_state_from_dropdown_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 1378680613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United States",
      "offset": 9
    }
  ],
  "location": "AssessmentStepDefinitions.I_select_country_from_dropdown_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 744397787,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3128891919",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_phone_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 765407218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "patilsr91@gmail.com",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_email_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 805639893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4111111111111111",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_creditCardNo_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 790488104,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02",
      "offset": 9
    }
  ],
  "location": "AssessmentStepDefinitions.I_select_expiryMonth__validity_field_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 1441059013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017",
      "offset": 9
    }
  ],
  "location": "AssessmentStepDefinitions.I_select_expiryYear_validity_field_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 1186746170,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shreyas Patil",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_cardName_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 735011249,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 8
    }
  ],
  "location": "AssessmentStepDefinitions.I_enter_cvv_in_Shipping_Address_Form(String)"
});
formatter.result({
  "duration": 640370534,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_click_on_Review_Order_button()"
});
formatter.result({
  "duration": 6742576728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.build.com/index.cfm?page\u003dcheckout:review",
      "offset": 9
    }
  ],
  "location": "AssessmentStepDefinitions.I_verify_url_for_delivery_and_review_page(String)"
});
formatter.result({
  "duration": 681806078,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_verify_that_CA_tax_is_correct()"
});
formatter.result({
  "duration": 317477455,
  "status": "passed"
});
formatter.match({
  "location": "AssessmentStepDefinitions.I_verify_that_grand_total_is_correct()"
});
formatter.result({
  "duration": 850172731,
  "status": "passed"
});
formatter.after({
  "duration": 783330676,
  "status": "passed"
});
});