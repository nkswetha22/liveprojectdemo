$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "AddCustomer flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@karthi"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user enters all the fields with valid data",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_enters_all_the_fields_with_valid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});