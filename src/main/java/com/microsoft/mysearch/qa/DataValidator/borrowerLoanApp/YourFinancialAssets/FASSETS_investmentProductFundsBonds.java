package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourFinancialAssets;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 27/10/15 - 10:37.
 */
public enum FASSETS_investmentProductFundsBonds implements IBWInterface{

    DO_YOU_HAVE_ANY_ASSETS("Do You have any assets like shares, or land?", "Yes"),
    WHAT_IS_TYPE_OF_ASSET("What is type of asset?", "Investment Product Funds / Bonds"),
    CURRENT_VALUE_OF_INVESTMENTS_FUNDS("Current value of investments funds / bonds", null),
    FUNDS_BONDS_INSTITUTION("Funds / bonds institution", null),
    MATURITY_DATE("Maturity Date", null);

    public static final Log log = LogFactory.getLog(FASSETS_investmentProductFundsBonds.class);

    private String getFieldName;
    private String getFieldNameValue;

    FASSETS_investmentProductFundsBonds(String getFieldName, String getFieldNameValue){
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
        log.debug("FASSETS_investmentProductFundsBonds executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, DO_YOU_HAVE_ANY_ASSETS.getFieldName());
        expectedFieldNames.set(1, WHAT_IS_TYPE_OF_ASSET.getFieldName());
        expectedFieldNames.set(2, CURRENT_VALUE_OF_INVESTMENTS_FUNDS.getFieldName());
        expectedFieldNames.set(3, FUNDS_BONDS_INSTITUTION.getFieldName());
        expectedFieldNames.set(4, MATURITY_DATE.getFieldName());

        return expectedFieldNames;
    }

    /**
     * Is returning Map containing field Name (Map key) and field value (Map value) responsible for triggering of this data Collection
     * @return Map containing <"Number of Borrowers", "a single borrower">
     */
    public static Map<String, String> getTriggerMap() {
        log.debug("FASSETS_investmentProductFundsBonds executing method getTriggerMap");

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
        log.debug("FASSETS_investmentProductFundsBonds executing method getTriggerFields");

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
