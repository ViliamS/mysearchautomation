package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 29/10/15 - 10:51.
 */
public enum YPROPERTIES_subCountry implements IBWInterface {

    COUNTRY ("Country", "Ireland"), //If second value Ireland is present then this value is responsible for triggering this Collection of expected data
    COUNTY ("County", null);

    public static final Log log = LogFactory.getLog(YPROPERTIES_subCountry.class);

    private String getFieldName;
    private String getFieldNameValue;

    YPROPERTIES_subCountry(String getFieldName, String getFieldNameValue) {
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
        log.debug("YPROPERTIES_subCountry executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, COUNTRY.getFieldName());
        expectedFieldNames.set(1, COUNTY.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return COUNTRY.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return COUNTRY.getFieldNameValue();
    }

}
