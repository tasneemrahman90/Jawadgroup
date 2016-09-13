package core;

import Common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Zaqc on 9/5/2016.
 */
public class GiftCardTxt extends Base {


//    @FindBy(how = How.CSS, using = ".nav-input")
//    public static WebElement searchSubmit ;

    @FindBy(how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/a")
    public static WebElement dropDownMenu;

    public void clickDropDownMenu(){dropDownMenu.click();}



    @FindBy(how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span")
    public static WebElement globalSearchForm;

    public void clickSearchForm(String value){globalSearchForm.sendKeys(value);}

    @FindBy(how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span")
    public static WebElement clickEGiftCard;

    public void clickEGiftCard() { clickEGiftCard.click();}

    @FindBy(how = How.CSS, using  = ".searchFormButton")
    public static WebElement searchButton;

    public void clickSearchButton(){ searchButton.click();}


    @FindBy(how = How.CSS, using = "#message")
    public static WebElement searchInput;

    public void searchFor(String item){searchInput.sendKeys(item, Keys.ENTER);}





//    public void clearSearchInput() {
//        searchInput.clear();
//    }
}
//    @FindBy(how = How.XPATH, using = ".//*[@id='dealsErrorSection']/a")
//    public static WebElement weeklyDeals;
//
//
//    public void clickGetStarted(){
//        weeklyDeals.click();
//    }