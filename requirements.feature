Feature: task(e.g. day to day activities) creation
  As a user
  i want to create a new task
  so that I can track my activities
  Scenario: user wants to creat a new task
    Given he knows his task to carry out
    When the user clicks create new task button
    Then the user must be able to write his task
    And click save button
    And the task table must be shown with added and if other task, this also must be shown