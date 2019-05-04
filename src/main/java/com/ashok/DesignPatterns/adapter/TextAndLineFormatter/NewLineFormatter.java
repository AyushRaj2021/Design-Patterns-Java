package com.ashok.DesignPatterns.adapter.TextAndLineFormatter;

/**
 * Created by ashok jung bahadur
 */


public class NewLineFormatter implements TextFormattable {

    @Override
    public String formatText(String text)
    {
        String formattedText =text.replace(".","\n");
        return formattedText;
    }
}
