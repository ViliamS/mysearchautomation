package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 23/10/15 - 16:27.
 */
public enum PERSONAL_DETAILS_subAccommodation implements IBWInterface {

    THIS_ACCOMMODATION_IS ("Country", "Rented on contract|Rented from family/friends|Other"), //If one of the values divided by '|' is present then this set it triggered
    RENT ("Rent", null);

    public static final Log log = LogFactory.getLog(PERSONAL_DETAILS_subAccommodation.class);

    private String getFieldName;
    private String getFieldNameValue;

    PERSONAL_DETAILS_subAccommodation(String getFieldName, String getFieldNameValue) {
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
        log.debug("PERSONAL_DETAILS_subAccommodation executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, THIS_ACCOMMODATION_IS.getFieldName());
        expectedFieldNames.set(1, RENT.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return THIS_ACCOMMODATION_IS.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return THIS_ACCOMMODATION_IS.getFieldNameValue();
    }

}
