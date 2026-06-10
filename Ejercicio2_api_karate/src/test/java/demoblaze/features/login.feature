Feature: Pruebas de Login - Demoblaze

  Background:
    * url 'https://api.demoblaze.com'

  Scenario: Login con usuario y password correcto
    Given path '/login'
    And request { username: 'FranciscoTeran123', password: '1234' }
    When method POST
    Then status 200
    And match response contains 'Auth_token'

  Scenario: Login con usuario y password incorrecto
    Given path '/login'
    And request { username: 'FranciscoTeran123', password: '123' }
    When method POST
    Then status 200
    And match response.errorMessage == "Wrong password."