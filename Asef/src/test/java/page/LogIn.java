package page;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/4/2016.
 */
public class LogIn extends Base {
    @Test
    public void EbayLoginUser() throws InterruptedException {
        driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=http%3A%2F%2Fwww.ebay.com%2F");
        typeByCss("#formDiv #pri_signin .fld", "a11@hh.com");
        typeByCss("#formDiv #pri_signin .m19 .fld", "1111");
        clickByCss("#sgnBt");
        sleepFor(7);

    }
}
