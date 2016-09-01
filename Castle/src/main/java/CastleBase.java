import Common.Base;

/**
 * Created by PlayBoy on 8/30/16.
 */
public class CastleBase extends Base {
    public void navigateTo(String url){
        driver.navigate().to(url);
    }
}
