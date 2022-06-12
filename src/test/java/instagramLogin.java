import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class instagramLogin extends GlobalVariables {
    WebDriver driver;
    @Test
    public void login() throws IOException {
       driver= initializeBrowser();

       driver.get(prop.getProperty("url"));

    }
}
