package storeLocator;

import Common.Base;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
        Users users = PageFactory.initElements(driver,Users.class);
        locations.clickfindStore();
        locations.inputZipNEnter("90660");
        sleepFor(5);
        String str = users.signInButton.getText();
        System.out.println(str);
        Assert.assertEquals("Sign In",str);
        System.out.println("Assertion passed");


    }
}
