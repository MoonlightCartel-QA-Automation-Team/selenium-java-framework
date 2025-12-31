package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTitleTest extends BaseTest {

    @Test
    void homePage_hasExpectedTitleUrlAndHeading() {
        HomePage home = new HomePage(driver).open(BASE_URL);

        assertEquals("Example Domain", home.getTitle());
        assertTrue(home.getCurrentUrl().contains("example.com"));
        assertEquals("Example Domain", home.getHeadingText());
    }
}
