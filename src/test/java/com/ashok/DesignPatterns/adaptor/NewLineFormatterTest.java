package com.ashok.DesignPatterns.adaptor;

import com.ashok.DesignPatterns.adapter.TextAndLineFormatter.NewLineFormatter;
import com.ashok.DesignPatterns.adapter.TextAndLineFormatter.TextFormattable;
import com.ashok.DesignPatterns.adapter.formatter.CsvFormattable;
import com.ashok.DesignPatterns.adapter.formatter.CsvFormatter;
import com.ashok.DesignPatterns.adapter.csvadapter.CsvAdapterImpl;
import org.junit.Test;

/**
 * Created by ashok jung bahadur
 */


public class NewLineFormatterTest {


    @Test
    public void testFormatText() throws  Exception
    {
        String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter=new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);

        CsvFormattable csvFormatter=new CsvFormatter();
        TextFormattable csvAdapter=new CsvAdapterImpl(csvFormatter);
        String resultCsvString=csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }
}
