package addToCart;

import Common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/26/2016.
 */
public class giftCardAddToCart extends Base {

    // @Test
    public void giftCAddToCart() throws InterruptedException{

        clickByXpath(".//*[@id='globalSearchForm']/div[1]/a");
        clickByXpath(".//*[@id='globalSearchForm']/div[1]/ul/li[2]/span");
        typeByCss("#searchFormInput", "GiftCard");
        clickByCss(".searchFormButton");
        driver.navigate().to("https://bedbathandbeyond.cashstar.com/");
        driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Happy Birth Day");
        clickByXpath(".//*[@id='img_DD48GRTP8']");
        clickByCss("#amount-250");
        typeByCss("#name", "Your Name");
        typeByCss("#email", "MyE-Mail@yahoo.com");
        typeByCss("#from_name", "My Name");
        Thread.sleep(30000);


    }

}
