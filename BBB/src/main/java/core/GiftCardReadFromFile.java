package core;

import Common.Base;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by Zaqc on 9/5/2016.
 */
public class GiftCardReadFromFile extends Base {
    DataReader dr = new DataReader();

    public String[] getMessage() throws IOException {
        String path = System.getProperty("user.dir") + "/data/GCMessage.xls";
        String[] st = dr.fileReader(path);
        return st;

    }
}
