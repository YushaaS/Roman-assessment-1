package applications.demowebshop.pages;

import Roman.Roman;
import applications.demowebshop.models.Credentials;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class LoginPage extends AbstractPage {
    private By emailField = By.xpath("//input[@id = 'Email']");
    private By passwordField = By.xpath("//input[@id = 'Password']");
    private By loginBtn = By.xpath("//input[@class = 'button-1 login-button']");

    public LoginPage(Roman roman) {
        super(roman);

    }

    public void Login(Credentials credentials) {
        sendKeys(emailField, credentials.email);
        sendKeys(passwordField, credentials.password);
        click(loginBtn);
    }

    @Override
    protected String get_uri() {

        return "http://demowebshop.tricentis.com/login";
    }

    @Override
    public boolean waitForDisplayed() {

        return false;
    }
}
