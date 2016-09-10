package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.xpath.XPath;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class SearchItems {
    @FindBy(how = How.XPATH, using = ".//*[@id='search']/div/input")
    public static WebElement searchBox;


    @FindBy(how = How.XPATH, using = ".//*[@id='grid-wrap']/div/header/header/div/div[3]/div/span[1]/ul/li[1]/a/span")
    public static WebElement department;

    public void clearInput(){
        searchBox.clear();
    }
    public void searchFor(String items){
        searchBox.sendKeys(items, Keys.ENTER);
    }

    public void clickDept(){
        department.click();
    }
}
