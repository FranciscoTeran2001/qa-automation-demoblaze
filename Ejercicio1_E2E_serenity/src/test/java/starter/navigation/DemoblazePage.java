package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoblazePage extends PageObject {

    // "Add to cart" button on the product detail page
    @FindBy(css = "a.btn.btn-success")
    private WebElement addToCartButton;

    // "Home" link in the navbar
    @FindBy(partialLinkText = "Home")
    private WebElement homeLink;

    // Cart link in the navbar
    @FindBy(partialLinkText = "Cart")
    private WebElement cartLink;

    // "Place Order" button in the cart
    @FindBy(css = "button.btn.btn-success")
    private WebElement placeOrderButton;

    // Purchase form fields
    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "country")
    private WebElement countryField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "card")
    private WebElement cardField;

    @FindBy(id = "month")
    private WebElement monthField;

    @FindBy(id = "year")
    private WebElement yearField;

    // "Purchase" button inside the order modal
    @FindBy(css = "button[onclick='purchaseOrder()']")
    private WebElement purchaseButton;

    // Confirmation message in the sweet-alert popup
    @FindBy(css = ".sweet-alert h2")
    private WebElement confirmationMessage;


    public void clickProduct(String productName) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement product = wait.until(
            ExpectedConditions.elementToBeClickable(By.linkText(productName))
        );
        product.click();
    }

    public void addToCart() {
        addToCartButton.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
        homeLink.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(
            By.cssSelector("#tbodyid .card")
        ));
    }

    public void goToCart() {
        ((org.openqa.selenium.JavascriptExecutor) getDriver())
                .executeScript("arguments[0].click();", cartLink);
    }

    public void clickPlaceOrder() {
        placeOrderButton.click();
    }

    public void fillForm(String name, String country, String city,
                         String card, String month, String year) {
        nameField.sendKeys(name);
        countryField.sendKeys(country);
        cityField.sendKeys(city);
        cardField.sendKeys(card);
        monthField.sendKeys(month);
        yearField.sendKeys(year);
    }

    public void clickPurchase() {
        purchaseButton.click();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
}
