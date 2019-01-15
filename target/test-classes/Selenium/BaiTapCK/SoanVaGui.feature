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
  Scenario: login successfully with valid account
    Given I navigate site "http://testmaster.vn/admin"
    And I enter valid information to login    
    And I click link "Soạn và Gửi tin" on menu
    Then I should see form "Soạn và Gửi Tin"
    
    
  @tag2
  Scenario: Validate 
     Given I navigate site "http://testmaster.vn/admin"
    And I enter valid information to login    
    And I choose "Soạn và Gửi tin"
     And I provide nothing and click button Next 
     Then I should see error message "This is required field" for each text
     
     
     
    

 
