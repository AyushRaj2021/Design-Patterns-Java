package com.ashok.DesignPatterns.adapter.csvadapter;

import com.ashok.DesignPatterns.adapter.formatter.CsvFormattable;
import com.ashok.DesignPatterns.adapter.TextAndLineFormatter.TextFormattable;
/**
 * Created by ashok jung bahadur
 */
public class CsvAdapterImpl implements TextFormattable {

    CsvFormattable csvFormattable;

    public CsvAdapterImpl( CsvFormattable csvFormattable)
    {
        this.csvFormattable = csvFormattable;
    }

    @Override
    public String formatText(String text)
    {
        String formattedText = csvFormattable.formatCsvText(text);
        return formattedText;
    }

}
