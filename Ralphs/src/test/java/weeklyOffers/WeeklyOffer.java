package weeklyOffers;
import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory.WeeklyOffers;

/**
 * Created by PlayBoy on 9/9/16.
 */
public class WeeklyOffer extends Base {
    @Test
    public void test() throws InterruptedException {
        WeeklyOffers offers = PageFactory.initElements(driver, WeeklyOffers.class);
        scrollPageDown();
        sleepFor(2);
        offers.clickGetStarted();
        sleepFor(3);
    }
}
