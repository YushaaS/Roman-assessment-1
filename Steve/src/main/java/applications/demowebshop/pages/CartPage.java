package applications.demowebshop.pages;

import Roman.Roman;
import applications.demowebshop.widgets.CartItem;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class CartPage extends AbstractPage {
    private CartItem cartItem;
    private By updateShoppingCart = By.xpath("//input [@name='updatecart']");

    public CartPage(Roman roman) {
        super(roman);
        cartItem = new CartItem();

    }

    public boolean checkItemIsPresent(String itemName) {
        return validateElement_Displayed(cartItem.productItem(itemName));
    }

    public void removeItem(String itemName) {
        click(cartItem.productRadioBtn(itemName));
        click(updateShoppingCart);

    }

    @Override
    protected String get_uri() {
        return "http://demowebshop.tricentis.com/cart";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }
}
