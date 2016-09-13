package page_factory;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Asef on 9/11/2016.
 */
public class LoginWithPageFactory {
    @FindBy(how = How.CSS, using = "#gh-ug>a")
    public WebElement LoginInitial;
    @FindBy(how = How.CSS, using = "#sgnBt")
    public WebElement LoginClick;

    public void UserLoginInitial(){
        LoginInitial.click();

    }
    public void UserLoginClick(){
        LoginClick.click();

    }


}
