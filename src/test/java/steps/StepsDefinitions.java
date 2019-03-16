package steps;


import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import pages.SignInPage;
import pages.WelcomePage;
import utils.Constants;
import utils.GetConfigData;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class StepsDefinitions /*extends Hooks*/ {

    private WelcomePage welcomePage;
    private SignInPage signInPage;
    private HomePage homePage;
    GetConfigData getConfigData = new GetConfigData();
    Constants constants = new Constants();
    protected static AppiumDriver<MobileElement> driver;

    @Before
    public void before() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("app", new File("C:/Users/jsierra/" +
                "Documents/mobileChallenge/src/resources/com.olx.olx_52505_apps.evozi.com.apk").getAbsolutePath());
        capabilities.setCapability("udid", "emulator-5554");
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.resetApp();
    }

    @Given("^the user wants to enter in OLX platform$")
    public void theUserWantsToEnterInOLXPlatform(){
        welcomePage = new WelcomePage(driver);
        welcomePage.waitForVisibilityOfElement(welcomePage.getWelcomeTitle());
        welcomePage.clickInAElement(welcomePage.getStartBtn());
    }

    @When("^the welcome page asks to the user to enter their country information$")
    public void theWelcomePageAsksToTheUserToEnterTheirCountryInformation() {
        welcomePage.waitForVisibilityOfElement(welcomePage.getSearchLocationField());

    }

    @And("^the user enters their location information$")
    public void theUserEntersTheirLocationInformation() {
        welcomePage.clickInAElement(welcomePage.getSearchLocationField());
        welcomePage.selectACountry();
    }

    @And("^the user go to registration module with email$")
    public void theGoToRegistrationModuleWithEmail() {
        welcomePage.clickInAElement(welcomePage.getNextBtn());
    }

    @And("^the user enters their email information$")
    public void theUserEntersTheirEmailInformation() throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInPage.goToSignInByEmail();
        signInPage.enterEmailAccountInformation();

    }

    @Then("^the user is registered in the OLX platform by the email way$")
    public void theUserIsRegisteredInTheOLXPlatformByTheEmailWay() {
        System.out.println(signInPage.getConfirmationBtn().getText());
        signInPage.clickInTheConfirmationBtn();
    }

    @And("^the user is in the OLX platform$")
    public void theUserIsInTheOLXPlatform() {
        homePage = new HomePage(driver);
        //homePage.touchInASpecificcoordinates(550,1500);
        System.out.println(homePage.getHomePageTitle().getText());
    }

    @Given("^the user wants to enter in OLX platform with facebook$")
    public void theUserWantsToEnterInOLXPlatformWithFacebook() {
        welcomePage = new WelcomePage(driver);
        welcomePage.waitForVisibilityOfElement(welcomePage.getWelcomeTitle());
        welcomePage.clickInAElement(welcomePage.getStartBtn());
    }

    @And("^the user go to registration module with facebook$")
    public void theUserGoToRegistrationModuleWithFacebook() {
        welcomePage.clickInAElement(welcomePage.getNextBtn());
    }

    @And("^the user enters their facebook information$")
    public void theUserEntersTheirFacebookInformation() {
        signInPage = new SignInPage(driver);
        signInPage.goToSignInByFacebook();
        signInPage.enterFacebookAccountInformation();
    }
}
