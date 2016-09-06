package login.page;
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Asef on 9/3/2016.
 */
public class login extends Base {
    @Test
    public void loginUser() throws InterruptedException {
        typeByCss("#email", "a11@hh.com");
        typeByCss("#pass", "1111");
        clickByCss("#u_0_n");
        sleepFor(7);

    }
}

