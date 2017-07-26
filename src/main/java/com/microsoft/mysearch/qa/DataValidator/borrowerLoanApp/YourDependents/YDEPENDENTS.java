package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourDependents;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 27/10/15 - 14:36.
 */
public enum YDEPENDENTS implements IBWInterface {

    DO_EITHER_OF_YOU_HAVE_ANY_OTHER_DEPENDENTS("Do either of You have any other Dependents?", "Yes"),
    DATE_OF_BIRTH("Date of birth", null);

    public static final Log log = LogFactory.getLog(YDEPENDENTS.class);

    private String getFieldName;
    private String getFieldNameValue;

    YDEPENDENTS(String getFieldName, String getFieldNameValue) {
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
        log.debug("YDEPENDENTS executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, DO_EITHER_OF_YOU_HAVE_ANY_OTHER_DEPENDENTS.getFieldName());
        expectedFieldNames.set(1, DATE_OF_BIRTH.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return DO_EITHER_OF_YOU_HAVE_ANY_OTHER_DEPENDENTS.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return DO_EITHER_OF_YOU_HAVE_ANY_OTHER_DEPENDENTS.getFieldNameValue();
    }



}
