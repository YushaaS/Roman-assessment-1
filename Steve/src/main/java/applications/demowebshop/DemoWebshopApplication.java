package applications.demowebshop;

import Roman.Roman;
import applications.demowebshop.pages.CartPage;
import applications.demowebshop.pages.StorePage;
import applications.demowebshop.pages.LoginPage;

public class DemoWebshopApplication {
    public StorePage storePage;
    public LoginPage loginPage;
    public CartPage cartPage;

    public DemoWebshopApplication(Roman roman) {
        storePage = new StorePage(roman);
        loginPage = new LoginPage(roman);
        cartPage = new CartPage(roman);
    }

}
