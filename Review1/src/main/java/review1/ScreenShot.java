package review1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {

    public void getScreenShot(WebDriver driver) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-hh:mm)");
        Date date = new Date();
        String name = df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File("src/Screenshotfile/" + name + ".png"));
        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}