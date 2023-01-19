package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AmazonPages;
import util.DriverFactory;

public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();

    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        amazonPages.homePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        amazonPages.acceptCookies();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        amazonPages.searchButton();
    }

    @When("Write product name")
    public void writeProductName() {
        amazonPages.enterProductName();
    }

    @When("Click the submit button")
    public void clickTheSubmitButton() {
        amazonPages.clickSubmitButton();
    }

    @When("Filter for shipped by Amazon")
    public void filterForShippedByAmazon() {
        amazonPages.filterAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        amazonPages.filterApple();
    }

    @When("Click for the first product")
    public void clickForTheFirstProduct() {
        amazonPages.clickFirstProduct();
    }

    @When("Add to cart")
    public void addToCart() {
        amazonPages.addCart();
    }

    @When("Go to cart page")
    public void goToCartPage() {
        amazonPages.cartPage();
    }

    @Then("The item should be added to the cart")
    public void theItemShouldBeAddedToTheCart() {
        amazonPages.shouldBeAdded();
    }


}
