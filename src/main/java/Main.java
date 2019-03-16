import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    //@FindBy(id = "com.olx.olx:id/search_location")
    protected WebElement SearchLocationBar;

    private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        /*DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("app", new File("C:/Users/jsierra/Documents/mobileChallenge/src/resources/com.olx.olx_52505_apps.evozi.com.apk").getAbsolutePath());
        capabilities.setCapability("udid", "emulator-5554");// to get
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);*/
    }
}
