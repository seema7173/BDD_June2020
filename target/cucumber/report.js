$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Techfios Login Functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User should be able to Login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should land on Dashboard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click in Submit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User Should land on Account Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone"
      ],
      "line": 19,
      "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Expense",
        "Savings",
        "4500",
        "a12345",
        "Yusnab",
        "12345"
      ],
      "line": 20,
      "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5377211500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the Techfios Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.User_is_on_the_Techfios_Page()"
});
formatter.result({
  "duration": 812242600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should be able to Login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should land on Dashboard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User fill up the form entering \"Expense\"and \"Savings\"and \"4500\"and \"a12345\"and \"Yusnab\"and \"12345\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click in Submit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User Should land on Account Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.User_enters_username_as(String)"
});
formatter.result({
  "duration": 133383701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2130834800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 6859932000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_land_on_Dashboard_Page()"
});
formatter.result({
  "duration": 515500399,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 2124349701,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 2828243900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Expense",
      "offset": 32
    },
    {
      "val": "Savings",
      "offset": 45
    },
    {
      "val": "4500",
      "offset": 58
    },
    {
      "val": "a12345",
      "offset": 68
    },
    {
      "val": "Yusnab",
      "offset": 80
    },
    {
      "val": "12345",
      "offset": 92
    }
  ],
  "location": "StepDefinition.user_fill_up_the_form_entering_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 5899219101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_in_Submit_Button()"
});
formatter.result({
  "duration": 1641833300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.User_Should_land_on_Account_Page()"
});
formatter.result({
  "duration": 3080219500,
  "status": "passed"
});
formatter.after({
  "duration": 869953101,
  "status": "passed"
});
});