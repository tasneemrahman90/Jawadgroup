package resetPassword;

import Common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory.Users;
import signIn.SignInUsers;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class ResetPass extends Base {
    @Test
    public void resetPass() throws InterruptedException {
        Users users = PageFactory.initElements(driver,Users.class);
        users.clickSignInAtHome();
        users.clickForgotPass();
        users.setRecoveryEmail("jfarsa@yahoo.com");
        users.clickContinueBtn();
        sleepFor(10);

    }

}
