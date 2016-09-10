package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class Locations {
    @FindBy(how = How.XPATH, using = ".//*[@id='preferredStore']/div/div/div/a[3]/span")
    public static WebElement findStoreBtn;

    @FindBy(css = "#storeLocation")
    public static WebElement area;





    public void clickfindStore(){
        findStoreBtn.click();
    }
    public void inputZipNEnter(String zip){
        area.sendKeys(zip, Keys.ENTER);
    }
}
