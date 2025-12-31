package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    // Example.com has an <h1> heading
    private final By heading = By.cssSelector("h1");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage open(String url) {
        driver.get(url);
        return this;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}
