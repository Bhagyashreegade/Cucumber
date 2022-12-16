$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Customer.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add New Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.userLaunchChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.userOpensURL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.userEntersEmailAsAndPasswordAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.clickOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by Email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.userLaunchChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.userOpensURL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.userEntersEmailAsAndPasswordAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.clickOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer EMail",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.enter_customer_EMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Email in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.user_should_found_Email_in_the_Search_table()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat stepdefinition.CustomerStepDef.user_should_found_Email_in_the_Search_table(CustomerStepDef.java:164)\r\n\tat ✽.User should found Email in the Search table(file:///C:/Users/Bhagyashree/IdeaProjects/BDD/src/test/resources/features/Customer.feature:29)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.CustomerStepDef.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});