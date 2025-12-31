package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleTitleTest extends BaseTest {

    @Test
    void googleTitleShouldContainGoogle() {
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().toLowerCase().contains("google"));
    }
}
