package signIn;

import Common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory.Users;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class SignInUsers extends Base{
    @Test
    public void signIn() throws InterruptedException {

        Users users = PageFactory.initElements(driver, Users.class);
        users.clickSignInAtHome();
        users.inputEmail("jfarsin@yahoo.com");
        users.inputPassword("password");
        users.clickSignInAtLoginPage();

        sleepFor(5);


    }

}
