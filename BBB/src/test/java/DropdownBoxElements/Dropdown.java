package DropdownBoxElements;

import Common.Base;
import core.DropdownMethods;
import core.GiftCardTxt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class Dropdown extends DropdownMethods {

    @Test
    public void Dropdown() throws NullPointerException, InterruptedException {
      //  DropdownMethods drop = PageFactory.initElements(driver, DropdownMethods.class);
        iterate();
   }

       public void iterate() {
           DropdownMethods drop = PageFactory.initElements(driver, DropdownMethods.class);
           for (int i = 1; i <= 15; i++) {
               clickDropDownMenuXpath();
               clickByXpath(".//*[@id='globalSearchForm']/div[1]/ul/li[" + i + "]/span");

           }
       }

}


