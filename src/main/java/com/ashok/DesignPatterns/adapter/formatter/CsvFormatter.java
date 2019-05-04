package com.ashok.DesignPatterns.adapter.formatter;

/**
 * Created by ashok jung bahadur
 */


public class CsvFormatter implements CsvFormattable {

    @Override
    public  String formatCsvText(String text)
    {

        String formattedText = text.replace(".",",");
        return formattedText;
    }
}
