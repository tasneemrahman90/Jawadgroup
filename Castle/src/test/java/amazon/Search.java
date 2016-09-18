package amazon;

import Common.Base;
//import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.thoughtworks.selenium.webdriven.commands.GetAllLinks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.DataRead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by PlayBoy on 9/7/16.
 */
public class Search  extends AmazonResources {

    @Test
    public void test() throws IOException, InterruptedException {

        navigateTo("www.amazon.com");
        getTitleSearch(amazonSearchBox, SuiteExcelFile, SheetName, ReadColumnName, WrColumnName );


    }
}
