package amazon;

import Common.Base;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.testng.annotations.Test;
import utility.DataRead;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/7/16.
 */
public class Search  extends AmazonResources {

    @Test
    public void test() throws IOException, InterruptedException, ATUTestRecorderException {

        screenCastStart("Amazon search");
        navigateTo(url);
        getTitleSearch(amazonSearchBox, SuiteExcelFile, SheetName, ReadColumnName, WrColumnName );
        screenCastStop();
    }
}
