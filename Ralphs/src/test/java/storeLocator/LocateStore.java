package storeLocator;

import Common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory.Locations;
import pageFactory.Users;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class LocateStore extends Base {
    @Test
    public void storeLocator() throws InterruptedException {
        Locations locations = PageFactory.initElements(driver, Locations.class);
        locations.clickfindStore();
        locations.inputZipNEnter("90660");
        sleepFor(5);


    }
}
