package com.ashok.DesignPatterns.prototype;

import org.junit.Test;

import static com.ashok.DesignPatterns.prototype.DocumentPrototypeManager.getClonedDocument;
import static org.junit.Assert.*;

/**
 * Created by ashok jung bahadur
 */


public class DocumentPrototypeManagerTest {

    @Test
    public void testGetClonedDocument() throws Exception {
        PrototypeCapableDocument clonedTAndC = getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);

    }
}
