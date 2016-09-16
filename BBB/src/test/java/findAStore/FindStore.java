package findAStore;

import Common.Base;
import core.FindStoreMethods;
import core.GiftCardTxt;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


/**
 * Created by Zaqc on 8/30/2016.
 */
public class FindStore extends Base {
    @Test
        public void FindStore() throws InterruptedException {
        GiftCardTxt find = PageFactory.initElements(driver, GiftCardTxt.class);
        find.clickFindStore();
        find.clickFindStoreNEnter("08401");
        find.clickSearchWithinButton("25");
        find.clickSubmitButton();

        }
    }

