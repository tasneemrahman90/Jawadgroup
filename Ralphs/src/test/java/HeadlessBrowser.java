import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/12/16.
 */
public class HeadlessBrowser extends Base{
    @Test
    public void test() throws InterruptedException, IOException {
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();
        System.out.println("Page title is "+driver.getTitle());
        sleepFor(4);
    }
}
