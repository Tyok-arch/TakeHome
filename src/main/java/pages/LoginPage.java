package pages;

import config.ConfigReader;
import driver.DriverFactory;
import locators.LoginLocator;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage() {

        driver = DriverFactory.getDriver();

    }

    public void openLoginPage() {

        driver.get(ConfigReader.get("github.url"));

    }

    public void inputEmail(String email) {

        WaitUtils.waitUntilVisible(LoginLocator.EMAIL_INPUT)
                .sendKeys(email);

    }

    public void inputPassword(String password) {

        WaitUtils.waitUntilVisible(LoginLocator.PASSWORD_INPUT)
                .sendKeys(password);

    }

    public void clickSignIn() {

        WaitUtils.waitUntilClickable(LoginLocator.SIGN_IN_BUTTON)
                .click();

    }

}