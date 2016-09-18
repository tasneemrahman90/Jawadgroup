package amazon;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/16/16.
 */
public class Orders extends AmazonResources {
    @Test
    public void orders() throws InterruptedException, NullPointerException, IOException {
       //No need to initialize PageFactory here, since the methods that we are calling already initialize them
        signIn();
        clickOrder();
        sleepFor(2);
    }
}
