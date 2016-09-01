package productsMenu;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class InProductsTxt extends Base  {
   // @Test
    public void getProductsTxt() throws InterruptedException {
        clickByXpath(".//*[@id='collegeBridalArea']/div[1]/a");
        for (int i = 1; i < 14; i++) {
            mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[1]/div/ul/li[" + i + "]/a");
            sleepFor(5);
        }
        System.out.print(getTextById("shopLinkPanelCat_13806"));
    }
}
