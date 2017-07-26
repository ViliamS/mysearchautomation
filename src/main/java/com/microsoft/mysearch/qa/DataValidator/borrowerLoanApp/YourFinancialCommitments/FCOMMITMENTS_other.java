package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourFinancialCommitments;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 29/10/15 - 11:18.
 */
public enum FCOMMITMENTS_other implements IBWInterface {

    PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT("Please outline any short-term debt…", "Yes"),
    WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT("What is type of financial commitment?", "Other"),
    REPAYMENT_AMOUNT("Repayment amount", null),
    OTHER_VALUE("Other value", null),
    DESCRIPTION("Description", null);

    public static final Log log = LogFactory.getLog(FCOMMITMENTS_other.class);

    private String getFieldName;
    private String getFieldNameValue;

    FCOMMITMENTS_other(String getFieldName, String getFieldNameValue) {
        this.getFieldName = getFieldName;
        this.getFieldNameValue = getFieldNameValue;
    }

    @Override
    public String getFieldName(){
        return getFieldName;
    }

    @Override
    public String getFieldNameValue(){
        return getFieldNameValue;
    }

    public static ArrayList<String> getExpectedFieldNames(){
        log.debug("FCOMMITMENTS_other executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT.getFieldName());
        expectedFieldNames.set(1, WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldName());
        expectedFieldNames.set(2, REPAYMENT_AMOUNT.getFieldName());
        expectedFieldNames.set(3, OTHER_VALUE.getFieldName());
        expectedFieldNames.set(4, DESCRIPTION.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldNameValue();
    }

    /**
     * Is returning Map containing field Name (Map key) and field value (Map value) responsible for triggering of this data Collection
     * @return Map containing <"Number of Borrowers", "a single borrower">
     */
    public static Map<String, String> getTriggerMap(){
        log.debug("FCOMMITMENTS_other executing method getTriggerMap");

        Map<String, String> dataTrigger = new HashMap<>();

        dataTrigger.put(PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT.getFieldName(), PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT.getFieldNameValue());
        dataTrigger.put(WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldName(), WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldNameValue());

        return dataTrigger;
    }

    /**
     * Is returning name of field responsible for enabling this data Collection
     * @return - String with value 'Number of Borrowers'
     */
    public static ArrayList<String> getTriggerFields(){
        log.debug("FCOMMITMENTS_other executing method getTriggerFields");

        ArrayList<String> propertiesTriggerArrayList = new ArrayList<>();

        propertiesTriggerArrayList.set(0, PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT.getFieldName());
        propertiesTriggerArrayList.set(1, WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldName());

        return propertiesTriggerArrayList;
    }


}
