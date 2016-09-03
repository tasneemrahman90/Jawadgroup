package Lufthansa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tarikBase.Core;

/**
 * Created by tzaman on 9/1/16.
 */
public class Search extends Core {
        @Test
        public void test() throws InterruptedException {
            driver.findElement(By.cssSelector("#flightmanager-tab-1")).click();
            driver.findElement(By.cssSelector("#flightmanagerFlightsFormOnewayLabel")).click();
            driver.findElement(By.cssSelector("#flightmanagerFlightsFormOrigin")).click();
            driver.findElement(By.cssSelector("#flightmanagerFlightsFormDestination")).click();
            driver.findElement(By.cssSelector("#.next")).click();
            driver.findElement(By.cssSelector("#..day-body.day-focus-to>button")).click();
            driver.findElement(By.cssSelector("#.btn.btn-primary")).click();


            Thread.sleep(3000);
        }
    }

