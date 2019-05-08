package initialization;

import org.openqa.selenium.By;

public class SelenuimMethods extends Setup {

    public static void main(String[] args) {

        SetDriver("mac","https://www.ebay.com","chrome");

        String title=driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("java books");
        driver.findElement(By.xpath(" //*[@id=\"gh-btn\"]")).click();

        String ActualUrl=driver.getCurrentUrl();
        System.out.println(ActualUrl);
        String expectedUrl ="https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=java+books&_sacat=0";
        if (ActualUrl.equalsIgnoreCase(expectedUrl)){
            System.out.println("PASSED");
        }else {
            System.out.println("failed");
        }
        String pagesource=driver.getPageSource();
        System.out.println(pagesource);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.yahoo.com");




        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().deleteAllCookies();

        driver.quit();


    }


}
