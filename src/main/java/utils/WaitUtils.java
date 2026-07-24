package utils;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class WaitUtils {

    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    private WaitUtils() {}

    public static WebElement waitUntilVisible(By locator) {

        WebDriverWait wait =
                new WebDriverWait(DriverFactory.getDriver(), TIMEOUT);

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );

    }

    public static WebElement waitUntilClickable(By locator) {

        WebDriverWait wait =
                new WebDriverWait(DriverFactory.getDriver(), TIMEOUT);

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );

    }

}