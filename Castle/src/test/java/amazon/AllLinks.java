package amazon;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.DataRead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PlayBoy on 9/16/16.
 */
public class AllLinks extends AmazonResources {
    @Test(priority = 0)
    public void links() throws IOException {
        getAllLinks("www.google.com");
        verifyAllLinks();
    }
}


