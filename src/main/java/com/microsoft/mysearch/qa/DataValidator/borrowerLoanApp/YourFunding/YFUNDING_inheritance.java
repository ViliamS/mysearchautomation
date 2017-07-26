package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourFunding;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 29/10/15 - 11:20.
 */
public enum YFUNDING_inheritance implements IBWInterface {

    WHAT_IS_SOURCE_OF_FUNDS("WHAT IS THE SOURCE OF FUNDS?", "Inheritance"),
    DESCRIPTION("Description", null),
    AMOUNT("Amount", null);

    public static final Log log = LogFactory.getLog(YFUNDING_inheritance.class);

    private String getFieldName;
    private String getFieldNameValue;

    YFUNDING_inheritance(String getFieldName, String getFieldNameValue) {
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
        log.debug("YFUNDING_inheritance executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, WHAT_IS_SOURCE_OF_FUNDS.getFieldName());
        expectedFieldNames.set(1, DESCRIPTION.getFieldName());
        expectedFieldNames.set(2, AMOUNT.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return WHAT_IS_SOURCE_OF_FUNDS.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return WHAT_IS_SOURCE_OF_FUNDS.getFieldNameValue();
    }

}
