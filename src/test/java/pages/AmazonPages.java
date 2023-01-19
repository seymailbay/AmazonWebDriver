package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By acceptCookies = By.id("sp-cc-accept");
    static By searchButton = By.id("twotabsearchtextbox");

    static By submitButton = By.id("nav-search-submit-button");

    static By filterButtonAmazon = By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Amazon Tarafından Gönderilir')]");

    static By filterButtonApple = By.xpath("(//span[@class='a-size-base a-color-base'][normalize-space()='Apple'])[1]");

    static By firstProduct = By.xpath("(//img[@alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu'])[1]");

    static By addCart = By.id("add-to-cart-button");

    static By cartPage = By.xpath("(//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce'])[1]");

    static By check = By.xpath("//span[@class='a-truncate-cut'][contains(text(),'Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu')]");

    public AmazonPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }

    public void homePage() {
        driver.get("https://www.amazon.com.tr");
    }

    public void acceptCookies() {
        elementHelper.click(acceptCookies);
    }

    public void searchButton() {
        elementHelper.click(searchButton);
    }

    public void enterProductName() {
        elementHelper.sendKey(searchButton, "Airpods");
    }

    public void clickSubmitButton() {
        elementHelper.click(submitButton);
    }

    public void filterAmazon() {
        elementHelper.click(filterButtonAmazon);
    }

    public void filterApple() {
        elementHelper.click(filterButtonApple);
    }


    public void clickFirstProduct() {
        elementHelper.click(firstProduct);
    }

    public void addCart() {
        elementHelper.click(addCart);
    }

    public void cartPage() {
        elementHelper.click(cartPage);
    }

    public void shouldBeAdded() {
        elementHelper.checkVisible(check);
    }
}
