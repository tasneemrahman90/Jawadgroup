package page;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/4/2016.
 */
public class SignUp extends Base {
    @Test
    public void EbayLoginUser() throws InterruptedException {
        driver.navigate().to("https://reg.ebay.com/reg/PartialReg?ru=http%3A%2F%2Fwww.ebay.com%2F");
        typeByCss("#email", "a11@hh.com");
        typeByCss("#remail", "a11@hh.com");
        typeByCss("#PASSWORD", "1111");
        typeByCss("#firstname", "aaa");
        typeByCss("#lastname", "bbb");
        typeByCss("#phoneFlagComp1", "1111111");
        clickByCss("#sbtBtn");
        sleepFor(7);



    }
}
