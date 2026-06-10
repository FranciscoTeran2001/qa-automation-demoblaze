Feature: Pruebas de Signup

  Background:
    * url 'https://api.demoblaze.com'

  Scenario: Crear un nuevo usuario en signup
    Given path '/signup'
    And request { username: 'FranciscoTera5', password: '1234' }
    When method POST
    Then status 200
    And match response.trim() == '""'

  Scenario: Intentar crear un usuario ya existente
    Given path '/signup'
    And request { username: 'FranciscoTeran123', password: '1234' }
    When method POST
    Then status 200
    And match response.errorMessage == "This user already exist."