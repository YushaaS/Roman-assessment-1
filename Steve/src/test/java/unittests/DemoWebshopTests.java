package unittests;

import Roman.RomanBase;
import applications.demowebshop.DemoWebshopApplication;
import applications.demowebshop.models.Credentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class DemoWebshopTests extends RomanBase {

    @BeforeEach
    public void setup(){
        roman()._driver = roman().selenium.getChromeDriver();
        roman()._driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    void demoTest(){
        DemoWebshopApplication app = new DemoWebshopApplication(roman());

        String itemName = "Build your own cheap computer";
        app.storePage.goToLogin();
        app.loginPage.Login(new Credentials("fakemail@fakemail.com", "fakepassword"));
        app.storePage.clickComputersTab();
        app.storePage.clickDesktops();
        app.storePage.clickAddToCart();
        app.storePage.finalClickAddToCart();
        app.storePage.clickGoToCart();
        Assertions.assertTrue(app.cartPage.checkItemIsPresent(itemName));
        app.cartPage.removeItem(itemName);
        Assertions.assertFalse(app.cartPage.checkItemIsPresent(itemName));
    }
}
