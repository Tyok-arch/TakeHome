package locators;

import org.openqa.selenium.By;

public class LoginLocator {

    private LoginLocator() {}

    public static final By EMAIL_INPUT =
            By.id("login_field");

    public static final By PASSWORD_INPUT =
            By.id("password");

    public static final By SIGN_IN_BUTTON =
            By.name("commit");
}