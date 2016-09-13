/*package Craigslist;

import Common.Base;
import tarikBase.Core;
import com.sun.tools.javac.comp.Enter;
import org.omg.PortableServer.ThreadPolicyValue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
/**
 * Created by tzaman on 9/3/16.

public class LogIn extends Core {

    @Test
    public void test() throws InterruptedException {
        clickByXpath(".//*[@id='postlks']/li[2]/a");
        sleepFor(1);
        typeByXpath(".//*[@id='inputEmailHandle']", "abc@gmail.com");
        sleepFor(1);
        typeByXpath(".//*[@id='inputPassword']", "**************");
        clickByXpath(".//*[@id='pagecontainer']/section/div/div[1]/form/div[3]/button");
        //takeEnterKeys(".//*[@id='pagecontainer']/section/div/div[1]/form/div[3]/button");
        Thread.sleep(2000);
    }
}*/

package Craigslist;

import Common.Base;
import TarikBase.Users;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import data.Search;


/**
 * Created by PlayBoy on 9/8/16.
 */
public class LogIn extends Base{
    @Test
    public void signIn() throws InterruptedException {

        Users users = PageFactory.initElements(driver,Users.class);

        users.clickSignInAtHome();
        /*users.inputEmail("jfarsin@yahoo.com");
        users.inputPassword("password");
        users.clickSignInAtLoginPage();*/

        sleepFor(5);


    }

}
