package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final String url = "https://example.com";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage open() {
        driver.get(url);
        return this;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
