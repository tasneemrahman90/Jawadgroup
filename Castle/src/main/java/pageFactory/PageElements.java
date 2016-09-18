package pageFactory;

import Common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by PlayBoy on 9/15/16.
 */
public class PageElements extends Base {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav_prefetch_yourorders']/span")
    public static WebElement orders;

    @FindBy(how = How.CSS, using = ".a-section .a-box .a-box-inner.a-padding-extra-large .a-row.a-spacing-base #ap_email")
    public static WebElement email;

    @FindBy(how = How.CSS, using = "#ap_password")
    public static WebElement pass;

    @FindBy(how = How.CSS, using = "#signInSubmit")
    public static WebElement signInBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-yourAccount']/span[1]")
    public static WebElement signIn;


    public void waitUntilOrderIsClickable(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(orders));
    }
    public void waitUntilOrderIsClickableNClick(){
        waitUntilOrderIsClickable();
        orders.click();
    }
    public void clickSignInAtHomePage(){
        signIn.click();
    }
    public void typeEmail(String userId){
        email.sendKeys(userId);
    }

    public void typePass(String password){
        pass.sendKeys(password);
    }

    public void clickSignInAtLoginPage(){
        signInBtn.click();
    }

    public void hoverMouseToSignIn(){
        Actions action = new Actions(driver);
        action.moveToElement(signIn).perform();
    }
}
