import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariables {


    Properties prop = new Properties();
    WebDriver driver;
    public WebDriver initializeBrowser() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\NAHID AKHTAR\\Downloads\\InstagramProject\\src\\main\\resources\\Input.properties");
        prop.load(fileInputStream);

        String browserName=prop.getProperty("browser");

        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\diverss\\chromedriver.exe");
            driver = new ChromeDriver();

        }
        return driver;

    }

    public static void main(String[] args) throws IOException {
        GlobalVariables gb=new GlobalVariables();
        gb.initializeBrowser().get("https://www.google.com");


    }



}
