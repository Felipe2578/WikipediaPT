#language: en
#encoding: utf8

  Feature: Consult
    Scenario: Consult Ovo de Páscoa
      Given that access to Wikipedia in Portuguese
      When search for "Ovo de Páscoa"
      Then Displays the expression "Ovo de Páscoa" in the title of the guide