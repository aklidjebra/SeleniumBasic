package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Setup {
    public static  WebDriver driver = null;

    public static WebDriver setupdriver(String platforme, String url, String Browser ){

        if (platforme.equalsIgnoreCase("mac")&&Browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");}
        else if (platforme.equalsIgnoreCase("windows")&& Browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");}
        driver  =new ChromeDriver();
        driver.get (url);


        return driver;

    }
    @Test
    public void EbayFunc1(){

        setupdriver("mac","https://www.ebay.com","chrome");
        driver.findElement(By.id("gh-ac")).sendKeys("selenium books");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
    @Test
    public void EbayFunc2(){
        ScreenShot scr = new ScreenShot();
        setupdriver("mac","https://www.ebay.com","chrome");
        driver.findElement(By.id("gh-ac")).sendKeys("sunglasses");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        scr.getScreenShot(driver);
    }
    @AfterTest
    public  void Quite(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();


    }
@Test
public void EbayFunc3(){

    setupdriver("mac","https://www.ebay.com","chrome");
    driver.findElement(By.linkText("Fashion")).click();
    driver.quit();

}











}
