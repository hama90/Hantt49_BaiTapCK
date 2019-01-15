#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: register to receive email with no email 
    Given I am staying at site "http://testmaster.vn/"
    When I fill email text with no data
    And I click on Register button
   Then I should see the error message : "* Email không đúng định dạng"
   
   @tag2
    Scenario: register successfully 
    Given I am staying at site "http://testmaster.vn/"
    When I enter valid email
    And I provide extra information
   Then I should see the success message : "Bạn đã đăng ký nhận bản tin thành công. Hãy kiểm tra Email để xác nhận việc đăng ký"

 @tag3
    Scenario: register without FULLNAME
    Given I am staying at site "http://testmaster.vn/"
    When I provide a valid email
    And I do not input Fullname and submit form
   Then I should see the required message: "This is required field"
   
    @tag4
    Scenario: register with existed email
    Given I am staying at site "http://testmaster.vn/"
    When I provide an existed email 
    Then I should see a popup with content: "E-mail abc@123.com đã được sử dụng, bạn hãy chọn một E-mail khác"
    
