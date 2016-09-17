package amazon;

import Common.Base;
import org.openqa.selenium.support.PageFactory;
import pageFactory.PageElements;
import utility.DataRead;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/9/16.
 */
public class AmazonResources extends Base {
    String SuiteExcelFile = "data/amazonSearch.xlsx";

    String SheetName = "Search";
    String ReadColumnName = "Items";
    String WrColumnName = "output";
    String url = "www.amazon.com";
    String email = "pntseleniumtests@gmail.com";
    String password = "test1234567890";
    public String amazonSearchBox =  "#twotabsearchtextbox";

    public void getTitleSearch (String SearchBoxLocator, String FileName, String SheetName, String ColumnName, String WriteColumnName) throws InterruptedException, IOException {

        DataRead dr = new DataRead(FileName);
        int x = dr.getRowCount(SheetName);
        for (int i = 2; i <= x; i++) {
            clearInput(SearchBoxLocator);
            typeByCssNEnter(SearchBoxLocator,dr.getCellData(SheetName, ColumnName,i));
            sleepFor(2);
           // takeScreenshot("AmazonSearch");
            dr.setCellData(SheetName,WriteColumnName,i, driver.getTitle());
        }
    }
    public void signIn() throws InterruptedException, NullPointerException{

        PageElements element = PageFactory.initElements(driver, PageElements.class);
        navigateTo(url);
        element.clickSignInAtHomePage();
        element.typeEmail(email);
        element.typePass(password);
        sleepFor(3);

        element.clickSignInAtLoginPage();
        sleepFor(3);
    }
    public void clickOrder(){
        PageElements element = PageFactory.initElements(driver, PageElements.class);
        element.hoverMouseToSignIn();
        element.waitUntilOrderIsClickableNClick();
    }
}
