package amazon;

import Common.Base;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.DataRead;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/7/16.
 */
public class Search  extends AmazonResources {
    @Parameters()
    @Test
    public void test() throws IOException, InterruptedException, ATUTestRecorderException {
        screenCastStart("dhonu");
        navigateTo(url);
        getTitleSearch(amazonSearchBox, SuiteExcelFile, SheetName, ReadColumnName, WrColumnName );
        screenCastStop();

    }
}
