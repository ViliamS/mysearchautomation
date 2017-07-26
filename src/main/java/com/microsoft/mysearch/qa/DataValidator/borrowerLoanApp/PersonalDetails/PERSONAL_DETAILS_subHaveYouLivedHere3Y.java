package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 23/10/15 - 16:39.
 */
public enum PERSONAL_DETAILS_subHaveYouLivedHere3Y implements IBWInterface {

    HAVE_YOU_LIVED_HERE_3_Y ("Have You lived on this address for the last 3 years?", "No"), //If 'No' is present then this set it triggered
    PREVIOUS_ADDRESS_LINE_1 ("Address Line 1", null),
    PREVIOUS_ADDRESS_LINE_2 ("Address Line 2", null),
    PREVIOUS_TOWN_CITY ("Town/City", null),
    PREVIOUS_POSTCODE_ZIP ("Postcode/ZIP (optional)", null),
    PREVIOUS_COUNTRY ("Country", null);

    public static final Log log = LogFactory.getLog(PERSONAL_DETAILS_subHaveYouLivedHere3Y.class);

    private String getFieldName;
    private String getFieldNameValue;

    PERSONAL_DETAILS_subHaveYouLivedHere3Y(String getFieldName, String getFieldNameValue) {
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
        log.debug("PERSONAL_DETAILS_subHaveYouLivedHere3Y executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, HAVE_YOU_LIVED_HERE_3_Y.getFieldName());
        expectedFieldNames.set(1, PREVIOUS_ADDRESS_LINE_1.getFieldName());
        expectedFieldNames.set(2, PREVIOUS_ADDRESS_LINE_2.getFieldName());
        expectedFieldNames.set(3, PREVIOUS_TOWN_CITY.getFieldName());
        expectedFieldNames.set(4, PREVIOUS_POSTCODE_ZIP.getFieldName());
        expectedFieldNames.set(5, PREVIOUS_COUNTRY.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return HAVE_YOU_LIVED_HERE_3_Y.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return HAVE_YOU_LIVED_HERE_3_Y.getFieldNameValue();
    }

}
