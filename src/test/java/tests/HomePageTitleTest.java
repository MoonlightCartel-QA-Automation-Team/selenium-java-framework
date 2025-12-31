package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTitleTest extends BaseTest {

    @Test
    void homePage_shouldHaveExpectedTitleAndHeading() {
        HomePage home = new HomePage(driver).open(BASE_URL);

        assertAll("Home page validations",
                () -> assertTrue(home.getTitle().length() > 0, "Title should not be empty"),
                () -> assertTrue(home.getCurrentUrl().startsWith(BASE_URL), "URL should start with base URL"),
                () -> assertEquals("Example Domain", home.getTitle(), "Title should match"),
                () -> assertEquals("Example Domain", home.getHeadingText(), "H1 heading should match")
        );
    }
}
