package pages;

import helpers.MobileHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage extends MobileHelper {

    protected BasePage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.olx.olx:id/walkthrough_title")
    private MobileElement currentPageTitle;

    public WebElement getCurrentPageTitle() {
        return currentPageTitle;
    }

}
