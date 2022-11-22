package applications.demowebshop.pages;

import Roman.Roman;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class StorePage extends AbstractPage {
    private final By loginBtn = By.xpath("//a[@class= 'ico-login']");
    private final By computersTab = By.xpath("(//a[@href= '/computers'])[1]");
    private final By desktopsBtn = By.xpath("//h2//a[@title= 'Show products in category Desktops']");
    private final By addToCartBtn = By.xpath("(//input[@class= 'button-2 product-box-add-to-cart-button'])[1]");
    private final By addToCart = By.xpath("//input[@class = 'button-1 add-to-cart-button']");
    private final By goToCartTab = By.xpath("(//span[@class = 'cart-label'])[1]");

    public StorePage(Roman roman) {
        super(roman);
    }

    public void goToLogin() {
        navigateTo();
        click(loginBtn);
    }

    public void clickComputersTab() {

        click(computersTab);
    }

    public void clickDesktops() {

        click(desktopsBtn);
    }

    public void clickAddToCart() {

        click(addToCartBtn);
    }

    public void finalClickAddToCart() {

        click(addToCart);
    }

    public void clickGoToCart() {

        click(goToCartTab);
    }

    @Override
    protected String get_uri() {

        return "http://demowebshop.tricentis.com/";
    }

    @Override
    public boolean waitForDisplayed() {

        return false;
    }
}
