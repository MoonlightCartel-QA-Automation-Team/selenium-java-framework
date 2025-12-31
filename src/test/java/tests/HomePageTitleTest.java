package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTitleTest extends BaseTest {

    @Test
    void verifyHomePageTitle() {
        // Use a stable site for CI
        driver.get("https://example.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Example Domain";

        assertEquals(expectedTitle, actualTitle,
                "Home page title should match expected value");
    }
}
