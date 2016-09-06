package Search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/4/2016.
 */
public class FindBestMatch extends Base {
    @Test
    public void FindBest() throws InterruptedException {{
        driver.navigate().to("http://www.ebay.com/sch/i.html?_from=R40&_sacat=0&_nkw=laptops&_sop=12");
        clickByCss(".img");
        sleepFor(20);
    }
}

}
