package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourAccounts;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 27/10/15 - 14:22.
 */
public enum YACCOUNTS_currentAccount implements IBWInterface {

    WHAT_IS_THE_SOURCE_OF_FUNDS("What is the source of funds?", "Current Account"),
    SELECT_BORROWER_TO_WHOM_THIS_APPLIES("Select borrower to whom this applies", null),
    ACCOUNT_PROVIDER("Account provider", null),
    LAST_FOUR_DIGITS_OF_ACCOUNT_NUMBER_IBAN("Last four digits of account number/iban?", null),
    ACCOUNT_BALANCE("Account balance", null),
    OVERDRAFT_LIMIT("Overdraft limit", null);

    public static final Log log = LogFactory.getLog(YACCOUNTS_currentAccount.class);

    private String getFieldName;
    private String getFieldNameValue;

    YACCOUNTS_currentAccount(String getFieldName, String getFieldNameValue){
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
     * @return ArrayList with ordered FieldNames that will be Expected/Mandatory to fill
     */
    public static ArrayList<String> getExpectedFieldNames() {
        log.debug("YACCOUNTS_currentAccount executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, WHAT_IS_THE_SOURCE_OF_FUNDS.getFieldName());
        expectedFieldNames.set(1, ACCOUNT_PROVIDER.getFieldName());
        expectedFieldNames.set(2, LAST_FOUR_DIGITS_OF_ACCOUNT_NUMBER_IBAN.getFieldName());
        expectedFieldNames.set(3, ACCOUNT_BALANCE.getFieldName());
        expectedFieldNames.set(4, OVERDRAFT_LIMIT.getFieldName());

        return expectedFieldNames;
    }

    /**
     * Is returning name of field responsible for enabling this data Collection
     * @return - String with value 'Number of Borrowers'
     */
    public static String getTriggerField(){
        return WHAT_IS_THE_SOURCE_OF_FUNDS.getFieldNameValue();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return WHAT_IS_THE_SOURCE_OF_FUNDS.getFieldNameValue();
    }


}
