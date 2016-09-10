package dataSearch;

import utility.DataRead;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by PlayBoy on 9/8/16.
 */
public class ReadExternalSourceData {

    DataReader dataReader = new DataReader();

    public String [] getData() throws IOException {

        String path = System.getProperty("user.dir")+"/data/search.xls";
        String [] st = dataReader.fileReader(path);
        return st;

    }
}
