

public class HomePageTitleTest extends BaseTest {
  
  @Test
  void verifyHomePageTitle() {  // Use a stable site for CI
    friver. get("https://example.com");

    String actualTitle = driver.getTitle();
    String expectedTitle = "Example Domain";

    assertEquals(expectedTitle, actualTitle, "Home Page Title should match expected value");
  }
}
                 
    
