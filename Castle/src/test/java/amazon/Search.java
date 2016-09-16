package amazon;

import Common.Base;
import atu.testrecorder.exceptions.ATUTestRecorderException;
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
    public void test() throws IOException, InterruptedException, ATUTestRecorderException {
        navigateTo("www.google.com");
        printVisibleLinks("data/amazonSearch.xlsx");
        //getTitleSearch(amazonSearchBox, SuiteExcelFile, SheetName, ReadColumnName, WrColumnName );
        //getAllLinks("www.google.com");

       // System.out.println();

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        for (int i = 1; i<=links.size()-1; i=i+1)
//
//        {
//
//           // System.out.println(links.get(i).getText());
//            dataRead.setCellData(SheetName,"AllLinks",i+1,(links.get(i).getText()));
//
//        }
        //dataRead.setCellData(SheetName, "Links", 2, );
        //getTitleSearch(amazonSearchBox, SuiteExcelFile, SheetName, ReadColumnName, WrColumnName );
        //screenCastStop();

    }
}
