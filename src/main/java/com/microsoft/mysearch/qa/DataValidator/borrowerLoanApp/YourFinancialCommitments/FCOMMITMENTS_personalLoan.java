package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourFinancialCommitments;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 29/10/15 - 11:08.
 */
public enum FCOMMITMENTS_personalLoan implements IBWInterface {

    PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT("Please outline any short-term debt…", "Yes"),
    WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT("What is type of financial commitment?", "Personal Loan"),
    OUTSTANDING_AMOUNT_BALANCE("Outstanding amount (balance)", null),
    FINANCIAL_INSTITUTION("Financial institution", null),
    REPAYMENT_FREQUENCY("Repayment frequency", null),
    PURPOSE_OF_THE_LOAN("Purpose of the loan", null),
    FINAL_REPAYMENT_DATE("Final repayment date", null),
    REPAYMENT_AMOUNT("Repayment amount", null);

    public static final Log log = LogFactory.getLog(FCOMMITMENTS_personalLoan.class);

    private String getFieldName;
    private String getFieldNameValue;

    FCOMMITMENTS_personalLoan(String getFieldName, String getFieldNameValue) {
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
        log.debug("FCOMMITMENTS_personalLoan executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT.getFieldName());
        expectedFieldNames.set(1, WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldName());
        expectedFieldNames.set(2, OUTSTANDING_AMOUNT_BALANCE.getFieldName());
        expectedFieldNames.set(3, FINANCIAL_INSTITUTION.getFieldName());
        expectedFieldNames.set(4, REPAYMENT_FREQUENCY.getFieldName());
        expectedFieldNames.set(5, PURPOSE_OF_THE_LOAN.getFieldName());
        expectedFieldNames.set(6, FINAL_REPAYMENT_DATE.getFieldName());
        expectedFieldNames.set(7, REPAYMENT_AMOUNT.getFieldName());

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
        log.debug("FCOMMITMENTS_personalLoan executing method getTriggerMap");

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
        log.debug("FCOMMITMENTS_personalLoan executing method getTriggerFields");

        ArrayList<String> propertiesTriggerArrayList = new ArrayList<>();

        propertiesTriggerArrayList.set(0, PLEASE_OUTLINE_ANY_SHORT_TERM_DEBT.getFieldName());
        propertiesTriggerArrayList.set(1, WHAT_IS_TYPE_OF_FINANCIAL_COMMITMENT.getFieldName());

        return propertiesTriggerArrayList;
    }

}
