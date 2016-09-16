package addToCart;

import Common.Base;
import core.GiftCardReadFromFile;
import core.GiftCardTxt;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Zaqc on 8/26/2016.
 */
public class giftCardReadFile extends Base {

     @Test
    public void giftCAddToCart() throws InterruptedException, IOException{


         GiftCardTxt gc = PageFactory.initElements(driver, GiftCardTxt.class);
         gc.clickDropDownMenuXpath();
         gc.clickDropdownChoice("Gift");
         gc.clickGiftCard();
         gc.clickSearchFormNEnter("GiftCard");
         gc.clickSearchButton();
         //takeScreenshot("GiftCardScreenshot");
         scrollPageDown();
         gc.clickEGiftCard();

         getCurrentPageUrl();
         driver.navigate().to("https://bedbathandbeyond.cashstar.com/");

        GiftCardTxt search = PageFactory.initElements(driver, GiftCardTxt.class);
        GiftCardReadFromFile message = new GiftCardReadFromFile();
         String [] value = message.getMessage();
         for(String input:value){
             search.searchFor(input);
             sleepFor(2);
         }
         gc.clickFaceCard();
         gc.clickCardAmount();
         gc.clickCardName("Your Name");
         gc.clickCardEmail("MyE-Mail@yahoo.com");
         gc.clickCardFromNamel("My Name");
         gc.clickAddToCard();
         sleepFor(5);
        // takeScreenshot("GCAddedToCard");
     }
}
