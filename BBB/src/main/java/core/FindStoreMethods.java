package core;

import Common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Zaqc on 9/14/2016.
 */
public class FindStoreMethods  {

  //  clickByCss(".findStore>a");
    @FindBy(how = How.XPATH, using = ".//*[@id='topNavMenu']/ul/li[2]/a)")
    public static WebElement findStore;
    public void clickFindStore(){ findStore.click();}

//    clickByCss(".findStore>a");
//    @FindBy(how= How.CSS, using = ".findStore>a")
//    public static WebElement findStore;
//
//    public void clickFindStore(){ findStore.click();}

  //  clickByCss("#storeLocatorOmnibarInput");
    @FindBy(how= How.CSS, using = "#storeLocatorOmnibarInput")
    public static WebElement zipInput;
    public void clickFindStoreNEnter(String value){ zipInput.sendKeys(value);}

  //  typeByCss("#storeLocatorOmnibarInput", "08401");
  //  clickByCss("#storeLocatorRadiusInput");
    @FindBy(how=How.CSS, using ="#storeLocatorRadiusInput")
    public static WebElement searchWithinButton;

    public void clickSearchWithinButton(String value){ searchWithinButton.sendKeys(value);}


   // clickByCss("#findStoreSubmitButton");
    @FindBy(how=How.CSS, using ="#findStoreSubmitButton")
    public static WebElement submitButton;

    public void clickSubmitButton(){ submitButton.click();}


}
