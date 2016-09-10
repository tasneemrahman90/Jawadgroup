package tarikBase;

/**
 * Created by tzaman on 9/9/16.
 */

import Common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by tzaman on 9/9/16.
 */

import Common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;


public class Users extends Base {
    @FindBy(how = How.XPATH, using = ".//*[@id='pagecontainer']/section/form/blockquote/label[8]")
    public static WebElement MyAccount;

    @FindBy(how = How.ID, using = "inputEmailHandle")
    public static WebElement email;

    @FindBy(how = How.ID, using = "inputPassword")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = ".//*[@id='pagecontainer']/section/div/div[1]/form/div[3]/button")
    public static WebElement signIn;

    //@FindBy(how = How.CSS, using = ".sign-in-other-actions>a")
    //public static WebElement forgotPass;

    //@FindBy(css = "#emailAddress")
    //public static WebElement recoveryEmail;

    //@FindBy(how = How.NAME, using = "submitForgotPassword")
    //public static WebElement continueBtn;

    public void clickSignInAtHome(){ MyAccount.click();
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
    //public void clickForgotPass(){ forgotPass.click();}
    //public void setRecoveryEmail(String email){recoveryEmail.sendKeys(email); }
    //public void clickContinueBtn(){continueBtn.click();}






}
