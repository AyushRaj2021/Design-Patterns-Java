package com.ashok.DesignPatterns.prototype;

/**
 * Created by ashok jung bahadur
 */


public class TermsAndConditions extends PrototypeCapableDocument {

        @Override
      public  PrototypeCapableDocument   cloneDocument()
        {
            TermsAndConditions TAndC = null;

            try
            {
                TAndC = (TermsAndConditions)super.clone();
            }

            catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

                    return TAndC;
        }


        @Override
        public String toString()
        {
            return  "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
        }
}
