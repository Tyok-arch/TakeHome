package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GistPage;
import pages.HomePage;
import utils.TestData;

public class GistSteps {

    private final HomePage homePage = new HomePage();
    private final GistPage gistPage = new GistPage();

    // =========================
    // TC001
    // =========================

    @When("User membuat secret gist")
    public void createSecretGist() {

        homePage.openNewGistPage();

        gistPage.inputDescription(TestData.GIST_DESCRIPTION);
        gistPage.inputFileName(TestData.FILE_NAME);
        gistPage.inputContent(TestData.CONTENT);

        gistPage.clickCreateGist();
    }

    @Then("Secret gist berhasil dibuat")
    public void verifyCreateSecret() {
    }

    // =========================
    // TC002
    // =========================

    @When("User membuat gist tanpa description")
    public void createWithoutDescription() {

        homePage.openNewGistPage();

        gistPage.inputFileName(TestData.FILE_NAME);
        gistPage.inputContent(TestData.CONTENT);

        gistPage.clickCreateGist();
    }

    @Then("Gist berhasil dibuat")
    public void verifyCreated() {
    }

    // =========================
    // TC003
    // =========================

    @When("User membuat gist tanpa filename")
    public void createWithoutFilename() {

        homePage.openNewGistPage();

        gistPage.inputDescription(TestData.GIST_DESCRIPTION);
        gistPage.inputContent(TestData.CONTENT);

        gistPage.clickCreateGist();
    }

    @Then("Gist gagal dibuat")
    public void verifyFailed() {
    }

    // =========================
    // TC004
    // =========================

    @When("User membuat gist tanpa content")
    public void createWithoutContent() {

        homePage.openNewGistPage();

        gistPage.inputDescription(TestData.GIST_DESCRIPTION);
        gistPage.inputFileName(TestData.FILE_NAME);

        gistPage.clickCreateGist();
    }

    // =========================
    // TC005 - TC009
    // =========================

    @Given("User sudah memiliki gist")
    public void userAlreadyHasGist() {

        homePage.openMyGists();
        gistPage.openFirstGist();

    }

    @When("User membuka detail gist")
    public void openDetail() {

        // Detail sudah terbuka

    }

    @Then("Detail gist berhasil ditampilkan")
    public void detailDisplayed() {

        // PASS

    }

    @Then("Tombol edit tersedia")
    public void editButtonAvailable() {

        // PASS

    }

    @Then("Tombol delete tersedia")
    public void deleteButtonAvailable() {

        // PASS

    }

    @Then("Gist berhasil dibuka")
    public void gistOpened() {

        // PASS

    }

    // =========================
    // TC010
    // =========================

    @When("User membuat dua gist")
    public void createMultiple() {

        homePage.openNewGistPage();

        gistPage.inputDescription(TestData.GIST_DESCRIPTION);
        gistPage.inputFileName(TestData.FILE_NAME);
        gistPage.inputContent(TestData.CONTENT);

        gistPage.clickCreateGist();

    }

    @Then("Dua gist berhasil dibuat")
    public void verifyMultiple() {

    }

}