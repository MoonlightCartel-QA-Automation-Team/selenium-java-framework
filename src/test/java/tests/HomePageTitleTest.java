package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTitleTest extends BaseTest {

    @Test
    void homePageTitle_shouldBeExampleDomain() {
        HomePage home = new HomePage(driver).open();
        assertEquals("Example Domain", home.getTitle(), "Home page title should match");
    }
}
