import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 9/1/16.
 */
public class SearchBestBuy extends CastleBase {
    @Test
    public void search() throws InterruptedException {
        typeByCssNEnter("#gh-search-input","laptop");
        sleepFor(3);
    }
}
