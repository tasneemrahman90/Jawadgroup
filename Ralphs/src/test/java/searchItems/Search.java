package searchItems;

import Common.Base;
import dataSearch.ReadExternalSourceData;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory.SearchItems;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class Search extends Base {

    @Test
    public void searchUsingExcel() throws InterruptedException, IOException {
        SearchItems ralphs = PageFactory.initElements(driver, SearchItems.class);
        ReadExternalSourceData read = new ReadExternalSourceData();
        String [] value = read.getData();
        for(String input:value){
            ralphs.searchFor(input);
            sleepFor(2);
            ralphs.clearInput();
        }


    }
}
