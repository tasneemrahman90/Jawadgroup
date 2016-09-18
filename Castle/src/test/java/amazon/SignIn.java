package amazon;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/16/16.
 */
public class SignIn extends AmazonResources {
    @Test
    public void test() throws InterruptedException, IOException {
        signIn();
    }
}
