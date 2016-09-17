package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.DataRead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PlayBoy on 9/16/16.
 */
public class AllLinks extends AmazonResources {
    @Test
    public void getAllLinks() throws InterruptedException, IOException {
        navigateTo("www.google.com");
        DataRead dr = new DataRead(SuiteExcelFile);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        ArrayList<String> clickers = new ArrayList<String>();
        int i = 0;
        int j = 1;
        int size = links.size();
        //System.out.println("TOTAL NUMBER OF LINKS ON THE WEBPAGE:################################## " + size);
        for (WebElement ele : links) {
            System.out.println(ele.getAttribute("href"));
            clickers.add(i, ele.getAttribute("href"));
            clickers.add(i, ele.getText());
            j++;
            dr.setCellData(SheetName, "Link", j, ele.getAttribute("href"));

        }
    }
}


//    public void getAllLinks() throws InterruptedException, IOException {
//        DataRead dr = new DataRead(SuiteExcelFile);
//        navigateTo("www.google.com");
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        ArrayList<String> clickers = new ArrayList<String>();
//        int i =0;
//        int k=1;
//        int size = links.size();
//        System.out.println("TOTAL NUMBER OF LINKS ON THE WEBPAGE:################################## "+size);
//        for(WebElement ele:links){
//            System.out.println(ele.getAttribute("href"));
//            clickers.add(i,ele.getAttribute("href"));
//            i++;
//            k++;
//            dr.setCellData("Search","Link",k,ele.getAttribute("href"));
//        }
//
////      for(int j=0; j<clickers.size();j++) {
////          navigateTo(clickers.get(j));
////          sleepFor(2);
////      }
//
//    }
//}
