
package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTitleTest {

    @Test
    void verifyExampleDotComTitle() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");      // headless mode for CI
        options.addArguments("--no-sandbox");        // required in many CI environments
        options.addArguments("--disable-dev-shm-usage"); // stability on GitHub runners

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://example.com");
            String title = driver.getTitle();
            assertTrue(title.contains("Example Domain"), "Title was: " + title);
        } finally {
            driver.quit();
        }
    }
}
