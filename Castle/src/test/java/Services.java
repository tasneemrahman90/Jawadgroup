import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/1/16.
 */
public class Services extends CastleBase {
    @Test
    public void test() throws InterruptedException {
        navigateTo("http://www.bestbuy.com/");

        typeByCss("#abt-email-coll>input","jawad@yahoo.com");
        clickByCss(".btn.btn-default");

        clickByCss(".close");
        sleepFor(2);
        clickByCss("#menu3");
        clickByXpath(".//*[@id='group3']/div[1]/div[1]/div[2]/ul/li[10]/a");
        sleepFor(2);
    }
}
