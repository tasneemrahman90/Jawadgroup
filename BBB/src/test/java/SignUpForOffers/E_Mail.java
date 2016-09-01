package SignUpForOffers;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class E_Mail extends Base{


        @Test
        public void signUpForMail() {
            clickByXpath(".//*[@id='promoArea']/ul/li[2]/a");

            clickByXpath(" .//*[@id='content']/div[5]/div[1]/div[2]/div/a");

//            typeByCss("#emailAddress", "myemail@yahoo.conm");
//            typeByCss(".container_12>div>table>tbody>tr>td>input", "08401");
//            clickByCss(".container_12>div>table>tbody>tr>td>div>input");
        }

}

