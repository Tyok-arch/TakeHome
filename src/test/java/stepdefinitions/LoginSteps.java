package stepdefinitions;

import config.ConfigReader;
import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();

    @Given("User membuka halaman login GitHub")
    public void openLoginPage() {

        loginPage.openLoginPage();

    }

    @When("User login menggunakan akun GitHub")
    public void loginGithub() {

        loginPage.inputEmail(
                ConfigReader.get("github.email")
        );

        loginPage.inputPassword(
                ConfigReader.get("github.password")
        );

        loginPage.clickSignIn();

    }

    @Then("User berhasil masuk ke halaman GitHub")
    public void verifyLogin() {

        String currentUrl = DriverFactory
                .getDriver()
                .getCurrentUrl();

        assertTrue(currentUrl.contains("github.com"));

    }

}