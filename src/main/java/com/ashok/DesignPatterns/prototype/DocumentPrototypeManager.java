package com.ashok.DesignPatterns.prototype;

/**
 * Created by ashok jung bahadur
 */


public class DocumentPrototypeManager {


    private  static java.util.Map<String,PrototypeCapableDocument> prototypes = new java.util.HashMap<String, PrototypeCapableDocument>();



    static {
        TermsAndConditions tAndC = new TermsAndConditions();
        tAndC.setVendorName("Patrick Smith");

        /*Retrieve Terms and Conditions from database/network call/disk I/O here*/
        tAndC.setContent("Please read and accept the terms and conditions...");
        prototypes.put("tandc", tAndC);

        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Andrew Clark");
        authorizedSignatory.setDesignation("Operation Head");

        NonDisclosureAgreement nda = new NonDisclosureAgreement();
        nda.setVendorName("Patrick Smith");

        /*Retrieve Non Disclosure Agreement from database/network call/disk I/O here*/
        nda.setContent("Please read and accept the NDA...");
        nda.setAuthorizedSignatory(authorizedSignatory);
        prototypes.put("nda", nda);
    }

    public static PrototypeCapableDocument getClonedDocument(final String type)
    {
        PrototypeCapableDocument clonedDocument = null;
        try
        {
            PrototypeCapableDocument document = prototypes.get(type);
            clonedDocument = document.cloneDocument();
        }
        catch (CloneNotSupportedException e)
        {
             e.printStackTrace();
        }

        return clonedDocument;
    }
}
