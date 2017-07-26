package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.Quotation;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 23/10/15 - 10:50.
 */
public enum QUOTATION_subTwoBorrowers implements IBWInterface {

    SECOND_BORROWER_AGE ("Second Borrower Age", null),
    INCOME_TYPE_SECOND_BORROWER ("Income Type Second Borrower", null),
    INCOME_AMOUNT_SECOND_BORROWER ("Income Amount Second Borrower", null);

    public static final Log log = LogFactory.getLog(QUOTATION_singleBorrower.class);

    private final String getFieldName;
    private final String getFieldNameValue;

    QUOTATION_subTwoBorrowers(String getFieldName, String getFieldNameValue) {
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
        log.debug("QUOTATION_subTwoBorrowers executing method getExpectedFieldNames");

        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, SECOND_BORROWER_AGE.getFieldName());
        expectedFieldNames.set(1, INCOME_TYPE_SECOND_BORROWER.getFieldName());
        expectedFieldNames.set(2, INCOME_AMOUNT_SECOND_BORROWER.getFieldName());

        return expectedFieldNames;
    }


}
