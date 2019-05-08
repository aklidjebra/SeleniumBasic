package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver = null;

    public static WebDriver SetDriver(String platforme, String url, String browser) {

        if (platforme.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver/");
        } else if (platforme.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_win32.zip");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void facebooklogin() {
        SetDriver("mac", "https://www.facebook.com", "Chrome");
        //driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Selenuim books");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("akli ");
        driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("password");
        driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {                            //*[@id='email']
            e.printStackTrace();
        }
        driver.quit();

    }
    @Test
    public void MessengerreaderDrive() {
        SetDriver("mac", "https://www.facebook.com", "Chrome");
        driver.findElement(By.linkText("Messenger")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
