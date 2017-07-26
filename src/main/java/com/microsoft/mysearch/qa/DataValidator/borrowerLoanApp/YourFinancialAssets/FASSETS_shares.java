package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourFinancialAssets;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 27/10/15 - 13:30.
 */
public enum FASSETS_shares implements IBWInterface{

    DO_YOU_HAVE_ANY_ASSETS("Do You have any assets like shares, or land?", "Yes"),
    WHAT_IS_TYPE_OF_ASSET("What is type of asset?", "Shares"),
    COMPANY_IN_WHICH_SHARES_HELD("Company in which shares held", null),
    CURRENT_VALUE_OF_SHARES("Share options exercise date", null);

    public static final Log log = LogFactory.getLog(FASSETS_shares.class);

    private String getFieldName;
    private String getFieldNameValue;

    FASSETS_shares(String getFieldName, String getFieldNameValue){
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
        log.debug("FASSETS_shares executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, DO_YOU_HAVE_ANY_ASSETS.getFieldName());
        expectedFieldNames.set(1, WHAT_IS_TYPE_OF_ASSET.getFieldName());
        expectedFieldNames.set(2, COMPANY_IN_WHICH_SHARES_HELD.getFieldName());
        expectedFieldNames.set(3, CURRENT_VALUE_OF_SHARES.getFieldName());

        return expectedFieldNames;
    }

    /**
     * Is returning Map containing field Name (Map key) and field value (Map value) responsible for triggering of this data Collection
     * @return Map containing <"Number of Borrowers", "a single borrower">
     */
    public static Map<String, String> getTriggerMap() {
        log.debug("FASSETS_shares executing method getTriggerMap");
        Map<String, String> dataTrigger = new HashMap<>();

        dataTrigger.put(DO_YOU_HAVE_ANY_ASSETS.getFieldName(), DO_YOU_HAVE_ANY_ASSETS.getFieldNameValue());
        dataTrigger.put(WHAT_IS_TYPE_OF_ASSET.getFieldName(), WHAT_IS_TYPE_OF_ASSET.getFieldNameValue());

        return dataTrigger;
    }

    /**
     * Is returning name of field responsible for enabling this data Collection
     * @return - String with value 'Number of Borrowers'
     */
    public static ArrayList<String> getTriggerFields() {
        log.debug("FASSETS_shares executing method getTriggerFields");

        ArrayList<String> triggerArrayList = new ArrayList<>();

        triggerArrayList.set(0, DO_YOU_HAVE_ANY_ASSETS.getFieldName());
        triggerArrayList.set(1, WHAT_IS_TYPE_OF_ASSET.getFieldName());

        return triggerArrayList;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return WHAT_IS_TYPE_OF_ASSET.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return WHAT_IS_TYPE_OF_ASSET.getFieldNameValue();
    }


}
