package core;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Zaqc on 9/5/2016.
 */
public class GiftCardTxt  {


//    @FindBy(how = How.CSS, using = ".nav-input")
//    public static WebElement searchSubmit ;

    @FindBy(how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/a")
    public static WebElement dropDownMenu;

    public void clickDropDownMenuXpath(){dropDownMenu.click();}

    @FindBy(how = How.CSS, using = ".selectedIndex")
    public static WebElement dropDownMenuCss;

    public void clickDropDownMenuCss(){dropDownMenuCss.click();}


    @FindBy(how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span")
    public static WebElement clickMenuChoice;

    public void clickDropdownChoice(String value){clickMenuChoice.sendKeys(value);}

    @FindBy(how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span")
    public static WebElement clickGiftCard;

    public void clickGiftCard() { clickGiftCard.click();}

    @FindBy(how = How.CSS, using  = "#searchFormInput")
    public static WebElement searchForm;

    public void clickSearchFormNEnter(String value){searchForm.sendKeys(value);}

    @FindBy(how = How.CSS, using = ".searchFormButton")
    public static WebElement searchButton;
    public void clickSearchButton(){ searchButton.click();}


    @FindBy(how = How.CSS, using = "#message")
    public static WebElement searchInput;

    public void searchFor(String item){searchInput.sendKeys(item, Keys.ENTER);}

    @FindBy(how = How.XPATH, using = ".//*[@id='Map']/area[2]")
    public static WebElement clickEGiftCard;

    public void clickEGiftCard() { clickEGiftCard.click();}

    @FindBy(how = How.XPATH, using = ".//*[@id='img_DD48GRTP8']")
    public static WebElement faceCard;

    public void clickFaceCard() { faceCard.click();}

    @FindBy(how = How.XPATH, using = ".//*[@id='amount-250']")
    public static WebElement cardAmount;

    public void clickCardAmount() { cardAmount.click();}

    @FindBy(how = How.CSS, using = "#name")
    public static WebElement cardName;

    public void clickCardName(String value) { cardName.sendKeys(value);}

    @FindBy(how = How.CSS, using = "#email")
    public static WebElement cardEmail;

    public void clickCardEmail(String value) { cardEmail.sendKeys(value);}

    @FindBy(how = How.CSS, using = "#from_name")
    public static WebElement cardFromName;

    public void clickCardFromNamel(String value) { cardFromName.sendKeys(value);}

    @FindBy(how = How.XPATH, using = ".//*[@id='order-add-another']")
    public static WebElement addToCard;

    public void clickAddToCard() { addToCard.click();}


    ///////////////////////////
    //  clickByCss(".findStore>a");
    @FindBy(how = How.XPATH, using = ".//*[@id='topNavMenu']/ul/li[2]/a")
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





