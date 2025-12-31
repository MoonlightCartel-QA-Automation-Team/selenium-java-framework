package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTitleTest extends BaseTest {

    @Test
    void verifyExampleDotComTitle() {
        driver.get("https://example.com");
        assertEquals("Example Domain", driver.getTitle());
    }
}
