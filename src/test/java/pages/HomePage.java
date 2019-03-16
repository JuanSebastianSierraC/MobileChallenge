package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='com.olx.olx:id/toolbar']/android.widget.TextView")
    private MobileElement homePageTitle;

    public MobileElement getHomePageTitle() {
        return homePageTitle;
    }
}
