package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 27/10/15 - 15:26.
 */
public enum YPROPERTIES_subIsThisPropertyMortgagedNoMortgageRepaid implements IBWInterface {

    IS_THIS_PROPERTY_MORTGAGED ("Is this property mortgaged?", "No, Mortgage Repaid"),
    MORTGAGE_PROVIDER (mortgageProvider, null),
    YEAR_REPAID ("Year repaid", null);

    public static final Log log = LogFactory.getLog(YPROPERTIES_subIsThisPropertyMortgagedNoMortgageRepaid.class);

    private final String getFieldName;
    private final String getFieldNameValue;

    YPROPERTIES_subIsThisPropertyMortgagedNoMortgageRepaid(String getFieldName, String getFieldNameValue) {
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
        log.debug("YPROPERTIES_subIsThisPropertyMortgagedNoMortgageRepaid executing method getExpectedFieldNames");

        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, IS_THIS_PROPERTY_MORTGAGED.getFieldName());
        expectedFieldNames.set(1, MORTGAGE_PROVIDER.getFieldName());
        expectedFieldNames.set(2, YEAR_REPAID.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return IS_THIS_PROPERTY_MORTGAGED.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return IS_THIS_PROPERTY_MORTGAGED.getFieldNameValue();
    }

}
