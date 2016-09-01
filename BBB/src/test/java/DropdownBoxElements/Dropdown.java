package DropdownBoxElements;

import Common.Base;

import java.util.List;

/**
 * Created by Zaqc on 8/31/2016.
 */
public class Dropdown extends Base {

 //   @Test
    public void Dropdown() throws InterruptedException {

        List<String> text = getTextFromWebElements(".//*[@id='globalSearchForm']/div[1]/a");

        //get each text from the list, then enter each text into input box.
        for (int i = 0; i < text.size(); i++) {
            typeByCss("#searchFormInput", text.get(i));
            keysInput("#searchFormInput");
            clearInput("#searchFormInput");
            sleepFor(3);
            text = getTextFromWebElements(".//*[@id='globalSearchForm']/div[1]/a");
        }
    }
}