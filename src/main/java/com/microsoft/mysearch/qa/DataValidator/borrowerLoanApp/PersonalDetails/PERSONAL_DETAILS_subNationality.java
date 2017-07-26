package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 23/10/15 - 12:44.
 */
public enum PERSONAL_DETAILS_subNationality implements IBWInterface{

    NATIONALITY ("Nationality", "Irish"), //If second value is NOT present then this value is responsible for triggering this Collection of expected data
    HOW_MANY_YEARS ("How many years have you been resident in the Republic of Ireland?", null);

    public static final Log log = LogFactory.getLog(PERSONAL_DETAILS_subNationality.class);

    private String getFieldName;
    private String getFieldNameValue;

    PERSONAL_DETAILS_subNationality(String getFieldName, String getFieldNameValue) {
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
        log.debug("PERSONAL_DETAILS_subNationality executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();
        expectedFieldNames.set(0, NATIONALITY.getFieldName());
        expectedFieldNames.set(1, HOW_MANY_YEARS.getFieldName());
        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return NATIONALITY.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return NATIONALITY.getFieldNameValue();
    }

}
