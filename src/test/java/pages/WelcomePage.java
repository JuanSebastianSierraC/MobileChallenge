package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePage extends BasePage {
    public WelcomePage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.olx.olx:id/search_location")
    private MobileElement searchLocationField;

    @AndroidFindBy(id = "com.olx.olx:id/search_button")
    private MobileElement searchLocationBtn;

    @AndroidFindBy(id = "com.olx.olx:id/walkthrough_next")
    private MobileElement nextBtn;

    @AndroidFindBy(id = "com.olx.olx:id/fragment_tutorial_start")
    private MobileElement StartBtn;

    @AndroidFindBy(id = "com.olx.olx:id/fragment_tutorial_title")
    private MobileElement welcomeTitle;

    public MobileElement getWelcomeTitle() {
        return welcomeTitle;
    }

    public MobileElement getSearchLocationField() {
        return searchLocationField;
    }

    public MobileElement getSearchLocationBtn() {
        return searchLocationBtn;
    }

    public MobileElement getNextBtn() {
        return nextBtn;
    }

    public MobileElement getStartBtn() {
        return StartBtn;
    }

    public boolean searchLocationButtonIsDisplayed(){
        waitForVisibilityOfElement(searchLocationBtn);
        return searchLocationBtn.isDisplayed();
    }

    public void inputACountryName(){
        searchLocationField.sendKeys("Colombia");
    }

    public void tapInASelectedLocation() {
        touchInASpecificcoordinates(250,450);
    }

    public void selectACountry(){
        inputACountryName();
        clickInAElement(getSearchLocationBtn());
        tapInASelectedLocation();
    }

    public void inputAStateName(){
        searchLocationField.sendKeys("Cundinamarca");
    }

}
