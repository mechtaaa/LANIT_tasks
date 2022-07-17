package pages;

import org.openqa.selenium.WebDriver;

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