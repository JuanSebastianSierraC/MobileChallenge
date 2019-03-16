package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class MobileHelper {

    private static final long WAIT_SECONDS = 15;
    protected final AppiumDriver driver;

    public MobileHelper(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 9, TimeUnit.SECONDS), this);
    }

    public AppiumDriver<MobileElement> getAppiumDriver() {
        return driver;
    }

    public void waitForVisibilityOfElement(MobileElement element) {
        new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.visibilityOf(element));

    }
    public Boolean waitForInvisibility(By by){
        return new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public AppiumDriver waitForVisibilityOfElementLocated(String className){
        return (AppiumDriver) new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
    }

    public void waitForVisibilityOfElementLocatedById(String id){
        new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    public void waitForClickeableElement(MobileElement element){
        new WebDriverWait(driver, WAIT_SECONDS).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickInAElement(MobileElement element){
        element.click();
    }

    public void moveToElement(MobileElement element){
        Actions action = new Actions(getAppiumDriver());
        action.moveToElement(element).click().perform();
    }

    public void touchInASpecificcoordinates(int x, int y){
        TouchAction touchAction = new TouchAction(getAppiumDriver());
        touchAction.press(x,y).waitAction(3000).moveTo(x,y).release().perform();
    }

    public void touchASpecificElement(MobileElement element){
        TouchAction touchAction = new TouchAction(getAppiumDriver());
        touchAction.press(element).waitAction(3000).moveTo(element).release().perform();
    }

}
