package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Setup_Basic {
    public static WebDriver driver = null;

    public static WebDriver SetupDriver(String platforme, String url) {

        if (platforme.equalsIgnoreCase("mac")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver/");

        } else {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_win32.zip");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public static void main(String[] args) {
        SetupDriver("mac", "https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();
    }

}
