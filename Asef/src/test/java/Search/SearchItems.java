package Search;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/4/2016.
 */
public class SearchItems extends Base {
    @Test
    public void Search() throws InterruptedException {
        typeByCss("#gh-ac", "laptops");
        clickByCss("#gh-btn");
        sleepFor(5);
    }
}