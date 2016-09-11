package weeklyOffers;
import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactory.Locations;
import pageFactory.WeeklyOffers;

/**
 * Created by PlayBoy on 9/9/16.
 */
public class WeeklyOffer extends Base {
    @Test
    public void test() throws InterruptedException {
        WeeklyOffers offers = PageFactory.initElements(driver, WeeklyOffers.class);
        Locations locations = PageFactory.initElements(driver, Locations.class);
        scrollPageDown();
        sleepFor(2);
        offers.clickGetStarted();
        locations.inputZipNEnter("90660");
        sleepFor(3);
    }
}
