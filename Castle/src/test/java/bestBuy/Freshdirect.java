package bestBuy;

import Common.Base;
import org.testng.annotations.Test;

import java.util.List;
import java.util.*;
/**
 * Created by PlayBoy on 9/3/16.
 */
public class Freshdirect extends Base{
    @Test
    public void freshDirectTest() throws InterruptedException {
        navigateTo("www.freshdirect.com");



        clickByCss(".locabar-user-action");
        iframeHandle2(0);
        typeByCss("#email", "jnewaj@yahoo.com");
        typeByCss("#password","1234");
        clickByCss("#signinbtn");
        goBackToHomeWindow();
        sleepFor(5);



    }
}
