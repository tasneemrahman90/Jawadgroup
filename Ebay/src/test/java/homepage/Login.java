package homepage;
import Common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_factory.LoginWithPageFactory;

/**
 * Created by Asef on 9/11/2016.
 */
public class Login extends Base{
    @Test
    public void EbayLoginUser() throws InterruptedException {
//        driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=http%3A%2F%2Fwww.ebay.com%2F");
        LoginWithPageFactory loginWithPageFactory = PageFactory.initElements(driver,LoginWithPageFactory.class);
        loginWithPageFactory.UserLoginInitial();
        typeByCss("#formDiv #pri_signin .fld", "a11@hh.com");
        typeByCss("#formDiv #pri_signin .m19 .fld", "1111");

       // loginWithPageFactory.UserLoginClick();
        sleepFor(7);

    }
}
