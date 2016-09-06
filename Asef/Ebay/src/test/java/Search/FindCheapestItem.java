package Search;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/4/2016.
 */
public class FindCheapestItem extends Base {
    @Test
    public void FindCheap() throws InterruptedException {
        typeByCss("#gh-ac", "laptops");
        clickByCss("#gh-btn");;
        driver.navigate().to("http://www.ebay.com/sch/i.html?_from=R40&_sacat=0&_nkw=laptops&_sop=15");
        clickByCss(".lvpic.pic.img.left");
        sleepFor(5);
    }
}