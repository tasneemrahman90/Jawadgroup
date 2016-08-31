import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 8/30/16.
 */
public class Search extends CastleBase {
    @Test
    public void search() throws InterruptedException {
        driver.findElement(By.cssSelector(".cb-search-field.cb-font-header")).sendKeys("pig", Keys.ENTER);
        sleepFor(5);
    }
}
