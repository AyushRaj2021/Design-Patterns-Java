package com.ashok.DesignPatterns.prototype;

/**
 * Created by ashok jung bahadur
 */


public class NonDisclosureAgreement extends  PrototypeCapableDocument {

    private  AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory()
    {
      return  authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory)
    {
        this.authorizedSignatory = this.authorizedSignatory;
    }

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        NonDisclosureAgreement nda;
        nda = (NonDisclosureAgreement) super.clone();
        AuthorizedSignatory cloneAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(cloneAuthorizedSignatory);
        return nda;
    }

    @Override
    public String toString() {
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
    }
}
