package core;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Zaqc on 9/14/2016.
 */
public class DropdownMethods extends Base {

//    @FindBy(how = How.CSS, using = ".selectedIndex")
//    public static WebElement ddm;
    @FindBy(how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/a")
    public static WebElement ddmenu;

    public void clickDropDownMenuXpath() {
        ddmenu.click();
    }

    public void clickOnItem(int i) throws NullPointerException{

        driver.findElement(By.xpath(".//*[@id='globalSearchForm']/div[1]/ul/li[" + i + "]")).click();}
}
