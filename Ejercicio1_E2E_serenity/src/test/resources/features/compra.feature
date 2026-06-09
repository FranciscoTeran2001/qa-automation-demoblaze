Feature: Flujo de compras en Demoblaze

  Scenario: Compra de productos
    Given el usuario está en la página principal
    When agrega los siguientes productos al carrito:
      | producto          |
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
    And navega al carrito de compras
    Then visualiza los productos en el carrito
    When completa el formulario de compra con los siguientes datos:
      | campo   | valor            |
      | nombre  | Juan Perez       |
      | pais    | Colombia         |
      | ciudad  | Bogota           |
      | tarjeta | 1234567890123456 |
      | mes     | Enero            |
      | anio    |             2025 |
    And finaliza la compra
    Then ve el mensaje de compra exitosa
