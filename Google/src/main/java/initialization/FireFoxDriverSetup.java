package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class FireFoxDriverSetup {

    //public static String OS = null;
    public static WebDriver driver1 = null;


    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver","/Users/user/Documents/Google/src/driver/geckodriver");
        driver1 = new FirefoxDriver();
        driver1.get("https://www.facebook.com/");
    }
}
