package pageFactory;

import Common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class Users extends Base{
    @FindBy(how = How.ID, using = "signIn")
    public static WebElement signInButton;

    @FindBy(how = How.CSS, using = "#signin-drawer-email-address")
    public static WebElement email;

    @FindBy(how = How.CSS, using = "#signin-drawer-password")
    public static WebElement password;

    @FindBy(how = How.CSS, using = "#signin-drawer-submit")
    public static WebElement signIn;

    @FindBy(how = How.CSS, using = ".sign-in-other-actions>a")
    public static WebElement forgotPass;

    @FindBy(css = "#emailAddress")
    public static WebElement recoveryEmail;

    @FindBy(how = How.NAME, using = "submitForgotPassword")
    public static WebElement continueBtn;

    public void clickSignInAtHome(){
        signInButton.click();
    }
    public void inputEmail(String str){
        email.sendKeys(str);
    }
    public void inputPassword(String pass){
        password.sendKeys(pass);
    }
    public void clickSignInAtLoginPage(){
        signIn.click();
    }
    public void clickForgotPass(){
        forgotPass.click();
    }
    public void setRecoveryEmail(String email){
        recoveryEmail.sendKeys(email);
    }
    public void clickContinueBtn(){
        continueBtn.click();
    }





}
