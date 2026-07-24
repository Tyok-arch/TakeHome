package pages;

import driver.DriverFactory;
import locators.GistLocator;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class GistPage {

    private final WebDriver driver;

    public GistPage() {
        driver = DriverFactory.getDriver();
    }

    // =========================
    // Create Gist Methods
    // =========================

    // Mengisi deskripsi gist
    public void inputDescription(String description) {
        WaitUtils.waitUntilVisible(GistLocator.DESCRIPTION_INPUT)
                .sendKeys(description);
    }

    // Mengisi nama file gist
    public void inputFileName(String fileName) {
        WaitUtils.waitUntilVisible(GistLocator.FILE_NAME_INPUT)
                .sendKeys(fileName);
    }

    // Mengisi isi/content gist
    public void inputContent(String content) {
        WaitUtils.waitUntilVisible(GistLocator.CONTENT_EDITOR)
                .sendKeys(content);
    }

    // Memilih visibility Public Gist
    public void selectPublicGist() {
        WaitUtils.waitUntilClickable(GistLocator.GIST_VISIBILITY_DROPDOWN)
                .click();

        WaitUtils.waitUntilClickable(GistLocator.CREATE_PUBLIC_GIST_OPTION)
                .click();
    }

    // Menekan tombol Create Gist
    public void clickCreateGist() {
        WaitUtils.waitUntilClickable(GistLocator.CREATE_GIST_BUTTON)
                .click();
    }

    // =========================
    // View Gist Methods
    // =========================

    // Membuka gist pertama pada daftar gist
    public void openFirstGist() {
        WaitUtils.waitUntilClickable(GistLocator.FIRST_GIST)
                .click();
    }

}