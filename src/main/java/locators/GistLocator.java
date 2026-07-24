package locators;

import org.openqa.selenium.By;

public final class GistLocator {

    private GistLocator() {
        // Prevent instantiation
    }

    // =========================
    // Navigation
    // =========================

    public static final By PROFILE_MENU =
            By.xpath("//img[@data-testid='github-avatar']/ancestor::button[1]");

    public static final By YOUR_GISTS_MENU =
            By.xpath("//a[contains(@href,'gist.github.com/mine')]");

    // =========================
    // Create Gist
    // =========================

    public static final By NEW_GIST_BUTTON =
            By.id("gists-header-new-gist");

    public static final By DESCRIPTION_INPUT =
            By.cssSelector("input[placeholder='Gist description…']");

    public static final By FILE_NAME_INPUT =
            By.cssSelector("input[placeholder='Filename including extension…']");

    public static final By CONTENT_EDITOR =
            By.id("code-editor");

    public static final By ADD_FILE_BUTTON =
            By.xpath("//*[@id='new_gist']/div/div[2]/div/button");

    // Visibility Dropdown
    public static final By GIST_VISIBILITY_DROPDOWN =
            By.cssSelector("summary[aria-label='Select a type of gist']");

    // Select Public Gist
    public static final By CREATE_PUBLIC_GIST_OPTION =
            By.xpath("//label[contains(normalize-space(),'Create public gist')]");

    // Submit Create
    public static final By CREATE_GIST_BUTTON =
            By.cssSelector("button[type='submit']");

    // =========================
    // Edit Gist
    // =========================

    // Edit
    // Tombol titik tiga (...)
    public static final By GIST_OPTIONS_BUTTON =
            By.id("gist_options-button");

    // Menu Edit
    public static final By EDIT_BUTTON =
            By.xpath("//span[normalize-space()='Edit']/ancestor::a[1]");

    public static final By UPDATE_GIST_BUTTON =
            By.xpath("//button[contains(normalize-space(),'Update')]");

    // =========================
    // Delete Gist
    // =========================

    public static final By DELETE_BUTTON =
            By.cssSelector("button[aria-label='Delete this Gist']");

    // =========================
// View Gist
// =========================

    // Membuka gist pertama pada daftar gist
    public static final By FIRST_GIST =
            By.xpath("(//strong[@class='css-truncate-target']/parent::a)[1]");



}