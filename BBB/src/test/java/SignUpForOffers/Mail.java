package SignUpForOffers;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class Mail extends Base{
   @Test
    public void signUpForMail(){
        clickByXpath(".//*[@id='promoArea']/ul/li[2]/a");
        clickByXpath(".//*[@id='content']/div[5]/div[3]/div[2]/div/a");
//       typeByCss("#emailAddress","myemail@yahoo.conm");
//       typeByCss(".container_12>div>table>tbody>tr>td>div>input", "myemail@yahoo.conm");
//       typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[6]/td[2]/input", "MyFirstName");
//       typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[7]/td[2]/input","MyfamilyName" );
//       typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[8]/td[2]/input", "My Address 007");
//       typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[10]/td[2]/input" , "MyCity");
//       clickByCss(".container_12>div>table>tbody>tr>td>select");
//       clickByXPath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[11]/td[2]/select/option[9]/text()");
//       typeByXpath(".//*[@id='headerWrapper']/div[4]/div/table/tbody/tr[12]/td[2]/input","80201");
    }
}

