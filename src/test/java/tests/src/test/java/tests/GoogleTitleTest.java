package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleTitleTest {

    @Test
    void verifyGoogleTitle() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            assertTrue(title.contains("Google"), "Title should contain 'Google'");
        } finally {
            driver.quit();
        }
    }
}
