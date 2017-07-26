package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 27/10/15 - 15:16.
 */
public enum YPROPERTIES_subAddAnotherMortgageAccount implements IBWInterface{

    ADD_ANOTHER_MORTGAGE_ACCOUNT ("ADD ANOTHER MORTGAGE ACCOUNT", "Yes"),
    MORTGAGE_PROVIDER ("Mortgage provider", null),
    MORTGAGE_ACCOUNT_NUMBER ("Mortgage account number", null),
    CURRENT_BALANCE("Current balance", null),
    MONTHLY_PAYMENT("Monthly payment", null),
    INTEREST_ONLY("Interest only", null),
    CURRENT_INTEREST_RATE("Current interest rate", null),
    RATE_TYPE("Rate type", null),
    IS_THE_MORTGAGE_NOW_OR_IT_HAS_BEEN_IN("Is the mortgage now or has it been in …", null);

    public static final Log log = LogFactory.getLog(YPROPERTIES_subAddAnotherMortgageAccount.class);

    private final String getFieldName;
    private final String getFieldNameValue;

    YPROPERTIES_subAddAnotherMortgageAccount(String getFieldName, String getFieldNameValue) {
        this.getFieldName = getFieldName;
        this.getFieldNameValue = getFieldNameValue;
    }

    @Override
    public String getFieldName() {
        return this.getFieldName;
    }

    @Override
    public String getFieldNameValue() {
        return this.getFieldNameValue;
    }

    public static ArrayList<String> getExpectedFieldNames(){
        log.debug("YPROPERTIES_subAddAnotherMortgageAccount executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldName());
        expectedFieldNames.set(1, MORTGAGE_PROVIDER.getFieldName());
        expectedFieldNames.set(2, MORTGAGE_ACCOUNT_NUMBER.getFieldName());
        expectedFieldNames.set(3, CURRENT_BALANCE.getFieldName());
        expectedFieldNames.set(4, MONTHLY_PAYMENT.getFieldName());
        expectedFieldNames.set(5, INTEREST_ONLY.getFieldName());
        expectedFieldNames.set(6, CURRENT_INTEREST_RATE.getFieldName());
        expectedFieldNames.set(7, RATE_TYPE.getFieldName());
        expectedFieldNames.set(8, IS_THE_MORTGAGE_NOW_OR_IT_HAS_BEEN_IN.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldNameValue();
    }

}
