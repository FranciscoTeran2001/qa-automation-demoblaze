package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.search.CompraActions;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CompraStepDefinitions {

    @Steps
    CompraActions compraActions;

    @Given("el usuario está en la página principal")
    public void openHomePage() {
        compraActions.openAt("https://www.demoblaze.com");
    }

    @When("agrega los siguientes productos al carrito:")
    public void addProducts(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> products = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : products) {
            compraActions.addProduct(row.get("producto"));
        }
    }

    @When("navega al carrito de compras")
    public void navigateToCart() {
        compraActions.goToCart();
    }

    @Then("visualiza los productos en el carrito")
    public void viewProductsInCart() {
        // Pending: validate products are visible in cart
    }

    @When("completa el formulario de compra con los siguientes datos:")
    public void fillPurchaseForm(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> formData = dataTable.asMap(String.class, String.class);
        compraActions.fillPurchaseForm(
            formData.get("nombre"),
            formData.get("pais"),
            formData.get("ciudad"),
            formData.get("tarjeta"),
            formData.get("mes"),
            formData.get("anio")
        );
    }

    @And("finaliza la compra")
    public void completePurchase() {
        compraActions.completePurchase();
    }

    @Then("ve el mensaje de compra exitosa")
    public void verifySuccessMessage() {
        String message = compraActions.getConfirmationMessage();
        assertThat(message).isEqualTo("Thank you for your purchase!");
    }
}
