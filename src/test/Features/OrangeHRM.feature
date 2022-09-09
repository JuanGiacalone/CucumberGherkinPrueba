#Feature: OrangeHRM Login /// DEFINE LA FUNCIONALIDAD A TESTEAR
#
##  Scenario: Logo presence on the home page // DEFINE EL ESCENARIO
##    Given tuvieja -> Pasos para generar el contexto
##    When tuvieja -> Accion e interaccion con el sistema (Precondion)
##    Then tuhermana -> Paso para representar el resultado (Accion)
##    And qcyo -> Pasos para extender el paso anterior
# Ctrl + Shift + F10 para correr la feature
Feature: Login
    Scenario: Logo prescence on home page
      Given I launch browser
      When I Open  the homepage
      Then I verify logo presence
      And End