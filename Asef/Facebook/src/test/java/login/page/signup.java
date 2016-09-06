package login.page;
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/3/2016.
 */
public class signup extends Base {
    @Test
    public void loginUser() throws InterruptedException {
//        typeByCss("#u_0_1", "aaa");
//        typeByCss("#u_0_3", "bab");
//        typeByCss("#u_0_5", "13477549979");
//        typeByCss("#u_0_8", "asef_07@yahoo.com");
//        typeByCss("#u_0_a", "1234" );
//        Select dropdown = new Select(driver.findElement(By.id("month")));
//        dropdown.selectByValue("2");
//        Select dropdown2 = new Select(driver.findElement(By.id("day")));
//        dropdown2.selectByValue("2");
//        Select dropdown3 = new Select(driver.findElement(By.id("year")));
//        dropdown3.selectByValue("2016");
//        clickByCss("#u_0_e");
//        clickByCss("#u_0_i");
//        sleepFor(3);
        typeByCss("#u_0_1", "aaa");
        typeByCss("#u_0_3", "bbb");
        typeByCss("#u_0_5", "13477549979");
        typeByCss("#u_0_8", "asef_07@yahoo.com");
        typeByCss("#u_0_a", "1234" );
        clickByCss("select#month > option[value='12']");
        clickByCss("select#day > option[value='12']");
        clickByCss("select#year > option[value='2010']");
        clickByCss("#u_0_e");
        clickByCss("#u_0_i");
        sleepFor(3);


    }
}
