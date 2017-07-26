package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 23/10/15 - 16:20.
 */
public enum PERSONAL_DETAILS_subCountry implements IBWInterface {

    COUNTRY ("Country", "Ireland"), //If second value Ireland is present then this value is responsible for triggering this Collection of expected data
    COUNTY_STATE ("County/State", null);

    public static final Log log = LogFactory.getLog(PERSONAL_DETAILS_subCountry.class);

    private String getFieldName;
    private String getFieldNameValue;

    PERSONAL_DETAILS_subCountry(String getFieldName, String getFieldNameValue) {
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
        log.debug("PERSONAL_DETAILS_subCountry executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, COUNTRY.getFieldName());
        expectedFieldNames.set(1, COUNTY_STATE.getFieldName());

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
