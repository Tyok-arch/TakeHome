package pages;

import driver.DriverFactory;
import locators.GistLocator;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class HomePage {

    private final WebDriver driver;

    public HomePage() {
        driver = DriverFactory.getDriver();
    }

    public void openNewGistPage() {

        driver.get("https://gist.github.com/");

        // Tunggu sampai form benar-benar muncul
        WaitUtils.waitUntilVisible(GistLocator.DESCRIPTION_INPUT);

    }

    public void openMyGists() {
        driver.get("https://gist.github.com/mine");
    }

    public void openHome() {
        driver.get("https://gist.github.com/");
    }

    public void openProfileMenu() {
        WaitUtils.waitUntilClickable(GistLocator.PROFILE_MENU).click();
    }

    public void clickYourGists() {
        WaitUtils.waitUntilClickable(GistLocator.YOUR_GISTS_MENU).click();
    }

    public void clickNewGist() {
        WaitUtils.waitUntilClickable(GistLocator.NEW_GIST_BUTTON).click();
    }
}