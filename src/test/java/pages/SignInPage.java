package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    public SignInPage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.olx.olx:id/tutorial_btn_sign_in")
    private MobileElement signInWithEmailBtn;

    @FindBy(id = "com.olx.olx:id/tutorial_login_btn_facebook")
    private MobileElement signInWithFacebookBtn;

    @FindBy(id = "com.olx.olx:id/tutorial_form_edt_email")
    private MobileElement emailTextField;

    @FindBy(id = "com.olx.olx:id/password_edt")
    private MobileElement passwordTextField;

    @FindBy(id = "com.olx.olx:id/tutorial_signup_btn_register")
    private MobileElement registerBtn;

    @FindBy(id = "com.olx.olx:id/email_confirmation_btn_ok")
    private MobileElement confirmationBtn;

    @FindBy(id = "m_login_email")
    private MobileElement facebookLoginEmailTextField;

    @FindBy(id = "m_login_password")
    private MobileElement facebookLoginPasswordTextField;

    @FindBy(id = "u_0_5")
    private MobileElement facebookLoginBtn;


    public MobileElement getSignInWithEmailBtn() {
        return signInWithEmailBtn;
    }

    public MobileElement getSignInWithFacebookBtn() {
        return signInWithFacebookBtn;
    }

    public MobileElement getEmailTextField() {
        return emailTextField;
    }

    public MobileElement getPasswordTextField() {
        return passwordTextField;
    }

    public MobileElement getRegisterBtn() {
        return registerBtn;
    }

    public MobileElement getConfirmationBtn() {
        return confirmationBtn;
    }

    public void goToSignInByEmail(){
        waitForClickeableElement(signInWithEmailBtn);
        touchASpecificElement(signInWithEmailBtn);
    }

    public void clickInTheConfirmationBtn(){
        waitForClickeableElement(confirmationBtn);
        touchASpecificElement(confirmationBtn);
    }

    public void goToSignInByFacebook(){
        waitForClickeableElement(signInWithFacebookBtn);
        touchASpecificElement(signInWithFacebookBtn);
    }

    public void enterEmailAccountInformation(){
        emailTextField.sendKeys("UsuarioPrueba111@test.com");
        passwordTextField.sendKeys("1234567");
        driver.hideKeyboard();
        touchASpecificElement(registerBtn);
    }

    public void enterFacebookAccountInformation(){
        waitForVisibilityOfElement(facebookLoginEmailTextField);
        facebookLoginEmailTextField.sendKeys("jsierracuellar@hotmail.com");
        facebookLoginPasswordTextField.sendKeys("AdmiralFloyd2698");
        driver.hideKeyboard();
        touchASpecificElement(facebookLoginBtn);
    }
}
