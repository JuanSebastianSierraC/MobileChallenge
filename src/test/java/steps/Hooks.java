package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    protected static AppiumDriver<MobileElement> driver;

    /*@Before
    public void before() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("app", new File("C:/Users/jsierra/" +
                "Documents/mobileChallenge/src/resources/com.olx.olx_52505_apps.evozi.com.apk").getAbsolutePath());
        capabilities.setCapability("udid", "emulator-5554");// to get
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @After
    public void quit() {
        driver.quit();
    }
    */
}
