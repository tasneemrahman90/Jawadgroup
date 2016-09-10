
package data;
import utility.DataReader;

import java.io.IOException;

import utility.DataRead;
import utility.DataReader;

import java.io.IOException;


public class Search {

    DataReader dataReader = new DataReader();

    public String [] getData() throws IOException {

        String path = System.getProperty("user.dir")+"/data/user.xls";
        String [] st = dataReader.fileReader(path);
        return st;

    }
}
