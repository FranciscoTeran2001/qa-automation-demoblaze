package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.annotations.Step;
import starter.navigation.DemoblazePage;

public class CompraActions extends UIInteractionSteps {

    DemoblazePage demoblazePage;

    @Step("Add product {0} to cart")
    public void addProduct(String product) {
        demoblazePage.clickProduct(product);
        demoblazePage.addToCart();
    }

    @Step("Navigate to cart")
    public void goToCart() {
        demoblazePage.goToCart();
    }

    @Step("Fill purchase form")
    public void fillPurchaseForm(String name, String country, String city,
                                 String card, String month, String year) {
        demoblazePage.clickPlaceOrder();
        demoblazePage.fillForm(name, country, city, card, month, year);
    }

    @Step("Complete purchase")
    public void completePurchase() {
        demoblazePage.clickPurchase();
    }

    @Step("Get confirmation message")
    public String getConfirmationMessage() {
        return demoblazePage.getConfirmationMessage();
    }
}
