package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.Quotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 22/10/15 - 16:18.
 */
public enum QUOTATION_singleBorrower {

    NUMBER_OF_BORROWERS ("I want a quote for", "I want a quote for", "a single borrower"), //If second value is present then this value is responsible for triggering this Collection of expected data
    MORTGAGE_TYPE ("Mortgage Type", "We're", null),
    FIRST_BORROWER_AGE ("First Borrower Age", "I’m", null),
    SECOND_BORROWER_AGE (QUOTATION_subTwoBorrowers.SECOND_BORROWER_AGE.getFieldName(), "my partner is", null),
    BORROWERS_MARITAL_STATUS ("Borrowers Marital Status", "We're", null),
    NUMBER_OF_DEPENDANTS ("Number of Dependants", "and have", null),
    INCOME_TYPE_FIRST_BORROWER ("Income Type First Borrower", "I'm",  null),
    INCOME_AMOUNT_FIRST_BORROWER ("Income Amount First Borrower", "and I earned", null),
    INCOME_TYPE_SECOND_BORROWER (QUOTATION_subTwoBorrowers.INCOME_TYPE_SECOND_BORROWER.getFieldName(), "My partner is", null),
    INCOME_AMOUNT_SECOND_BORROWER (QUOTATION_subTwoBorrowers.INCOME_AMOUNT_SECOND_BORROWER.getFieldName(), "and they earn", null),
    OTHER_FINANCIAL_COMMITMENTS ("Other Financial Commitments", "Our personal loan repayments are", null);

    public static final Log log = LogFactory.getLog(QUOTATION_singleBorrower.class);

    private String getFieldName;
    private String getTextNextToField;
    private String getFieldNameValue;

    QUOTATION_singleBorrower(String getFieldName, String getTextNextToField, String getFieldNameValue) {
        this.getFieldName = getFieldName;
        this.getTextNextToField = getTextNextToField;
        this.getFieldNameValue = getFieldNameValue;
    }

    public String getFieldLabel(){
        return getTextNextToField;
    }

    public String getFieldName(){
        return getFieldName;
    }

    public String getFieldNameValue(){
        return getFieldNameValue;
    }

    /**
     * Is returning all expected Field Names for successful competition of Single Borrower Quotation.
     * @return ArrayList with ordered FieldNames that will be Expected/Mandatory to fill
     */
    public static ArrayList<String> getExpectedFieldNames(){
        ArrayList<String> expectedFieldNames = new ArrayList<>();
        expectedFieldNames.set(0, NUMBER_OF_BORROWERS.getFieldName());
        expectedFieldNames.set(1, MORTGAGE_TYPE.getFieldName());
        expectedFieldNames.set(2, FIRST_BORROWER_AGE.getFieldName());
        expectedFieldNames.set(4, BORROWERS_MARITAL_STATUS.getFieldName());
        expectedFieldNames.set(5, NUMBER_OF_DEPENDANTS.getFieldName());
        expectedFieldNames.set(6, INCOME_TYPE_FIRST_BORROWER.getFieldName());
        expectedFieldNames.set(7, INCOME_AMOUNT_FIRST_BORROWER.getFieldName());
        expectedFieldNames.set(10, OTHER_FINANCIAL_COMMITMENTS.getFieldName());
        return expectedFieldNames;
    }

    /**
     * Is returning name of field responsible for enabling this data Collection
     * @return - String with value 'Number of Borrowers'
     */
    public static String getTriggerField(){
        return NUMBER_OF_BORROWERS.getFieldNameValue();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return NUMBER_OF_BORROWERS.getFieldNameValue();
    }

}
