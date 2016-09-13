package amazon;

import Common.Base;
import org.testng.annotations.Test;
import utility.DataRead;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/7/16.
 */
public class Search  extends AmazonResources {

    @Test
    public void test() throws IOException, InterruptedException {

        navigateTo(url);
        getTitleSearch(amazonSearchBox, SuiteExcelFile, SheetName, ReadColumnName, WrColumnName );
    }
}
