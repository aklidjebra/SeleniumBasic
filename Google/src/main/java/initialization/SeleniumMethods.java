package initialization;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SeleniumMethods extends Setup {


    public static void main(String[] args) {

        SetupDriver("mac","https://www.ebay.com","chrome");

        String Title = driver.getTitle();
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";

        if(Title.equalsIgnoreCase(expectedTitle)) {
            System.out.println("PassedTitle");
        }else System.out.println("FailedTitle");

        System.out.println(Title);

        driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Java Books");
        driver.findElement(By.xpath("//*[@id='gh-btn']")).click();


        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.ebay.com";

        if(actualURL.equalsIgnoreCase(expectedURL)){
            System.out.println("Passed");
        }else System.out.println("Failed");

        //Hard Assert : it fails if there is any small change
        Assert.assertEquals(actualURL,expectedURL);

        //Soft Assert: we need to create instance of the class
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL,expectedURL);



        String pageSource = driver.getPageSource();
        System.out.println(pageSource); // whole page source of that page

        //Back
        driver.navigate().back();    // bring the page back

        //Forward
        driver.navigate().forward(); // take the page forward

        //Refresh
        driver.navigate().refresh(); // refresh the page

        //Navigate to different URL
        driver.navigate().to("https://www.Yahoo.com"); // navigate from a web to an other


        try {
            Thread.sleep(5000);
        }catch (Exception ee){

        }

        driver.manage().deleteAllCookies(); // to clear all the cookies and clear all the memory space added as value in the RAM

        driver.close(); // it will just close the instance of Browser
        driver.quit();  // it will fully quit the browser


    }









}

