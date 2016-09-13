package Search;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/4/2016.
 */
public class AddToCart extends Base {
    @Test
    public void AddedToCart() throws InterruptedException{
        driver.navigate().to("http://www.ebay.com/sch/i.html?_from=R40&_sacat=0&_nkw=laptops&_sop=12");
        clickByCss(".img");
        clickByCss("#isCartBtn_btn");
        sleepFor(20);
    }
}
