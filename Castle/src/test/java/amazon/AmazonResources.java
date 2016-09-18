package amazon;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageFactory.PageElements;
import utility.DataRead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PlayBoy on 9/9/16.
 */
public class AmazonResources extends Base {
    String SuiteExcelFile = "data/externalData.xlsx";

    String SheetName = "Search";
    String LinksSheet = "Links";
    String ReadColumnName = "Items";
    String WrColumnName = "Title";
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
    public void getAllLinks(String url) throws IOException {
        navigateTo(url);
        DataRead dr = new DataRead(SuiteExcelFile);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        ArrayList<String> clickers = new ArrayList<String>();
        int i = 0;
        int j = 1;
        int size = links.size();
        //System.out.println("TOTAL NUMBER OF LINKS ON THE WEBPAGE:################################## " + size);
        for (WebElement ele : links) {
            System.out.println(ele.getAttribute("href"));
            clickers.add(i, ele.getAttribute("href"));
            clickers.add(i, ele.getText());
            j++;
            dr.setCellData(LinksSheet, "Link", j, ele.getAttribute("href"));

        }
    }
    public void verifyAllLinks() throws IOException {
        DataRead dataRead = new DataRead(SuiteExcelFile);
        int x = dataRead.getRowCount(LinksSheet);
        for(int i=2; i<=x;i++){
            navigateTo(dataRead.getCellData(LinksSheet,"Link",i));
            dataRead.setCellData(LinksSheet,"Title",i,driver.getTitle());
            if(driver.getTitle()!= null){
                dataRead.setCellData(LinksSheet,"Result",i,"Pass");
            }
            else dataRead.setCellData(LinksSheet,"Result",i,"Failed");
        }
    }

    public void signIn() throws InterruptedException, NullPointerException, IOException {

        PageElements element = PageFactory.initElements(driver, PageElements.class);
        DataRead dataRead = new DataRead(SuiteExcelFile);
        navigateTo(url);
        element.clickSignInAtHomePage();
        element.typeEmail(email);
        element.typePass(password);
       // element.typeEmail(dataRead.getCellData("Credentials","Email",1));
        //element.typePass(dataRead.getCellData("Credentials","Password",1));
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
