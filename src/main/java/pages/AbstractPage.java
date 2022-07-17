package pages;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/** Элементы общие для всех страниц */
public abstract class AbstractPage {

    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
    @Attachment(value = "{screenName}", type = "image/png")
    public static byte[] getScreenShot(String screenName){
        Screenshot screenshot = new AShot().takeScreenshot(driver);
            screenshot.getImage();
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

}