package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.Registration;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails.PERSONAL_DETAILS_subNationality;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;


/**
 * Created by viliamstrobich on 27/10/15 - 12:13.
 */
public enum BORROWER_TEST_DATA implements IBWInterface{

    FIRST_NAME("First Name", null),
    EMAIL_ADDRESS("Email Address", null),
    PHONE_NUMBER("Phone Number", null),
    CREATE_PASSWORD("Create Password", null);

    public static final Log log = LogFactory.getLog(PERSONAL_DETAILS_subNationality.class);

    private String getFieldName;
    private String getFieldNameValue;

    BORROWER_TEST_DATA(String getFieldName, String getFieldNameValue){
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

    /**
     * Is returning all expected Field Names for successful competition of Single Borrower Quotation.
     *
     * @return ArrayList with ordered FieldNames that will be Expected/Mandatory to fill
     */
    public static ArrayList<String> getExpectedFieldNames() {
        log.debug("BORROWER_TEST_DATA executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, FIRST_NAME.getFieldName());
        expectedFieldNames.set(1, EMAIL_ADDRESS.getFieldName());
        expectedFieldNames.set(2, PHONE_NUMBER.getFieldName());
        expectedFieldNames.set(3, CREATE_PASSWORD.getFieldName());

        return expectedFieldNames;
    }

}
