package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.Quotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 23/10/15 - 10:21.
 */
public enum QUOTATION_inviteCoapplicant {

    FIRST_NAME ("First name"),
    EMAIL_ADDRESS ("Mortgage Type");

    public static final Log log = LogFactory.getLog(QUOTATION_inviteCoapplicant.class);
    private String getFieldName;

    QUOTATION_inviteCoapplicant(String getFieldName) {
        this.getFieldName = getFieldName;
    }

    public String getFieldName(){
        return getFieldName;
    }

    public static ArrayList<String> getExpectedFieldNames(){
        log.debug("PERSONAL_DETAILS_subNationality executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();
        expectedFieldNames.set(0, FIRST_NAME.getFieldName());
        expectedFieldNames.set(1, EMAIL_ADDRESS.getFieldName());
        return expectedFieldNames;
    }
}
