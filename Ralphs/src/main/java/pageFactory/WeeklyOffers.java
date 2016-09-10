package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by PlayBoy on 9/10/16.
 */
public class WeeklyOffers {
    @FindBy(how = How.XPATH, using = ".//*[@id='dealsErrorSection']/a")
    public static WebElement weeklyDeals;


    public void clickGetStarted(){
        weeklyDeals.click();
    }
}
