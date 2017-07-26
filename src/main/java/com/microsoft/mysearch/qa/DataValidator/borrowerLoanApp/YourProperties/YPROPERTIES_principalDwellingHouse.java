package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import com.sun.istack.internal.Nullable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 27/10/15 - 14:35.
 */
public enum YPROPERTIES_principalDwellingHouse implements IBWInterface{

    DO_YOU_HAVE_STAKE_IN_PROPERTY("Do either of you have a stake in any property?", "Yes"),
    PROPERTY_CATEGORY("Property Category", "Principal Dwelling House"),
    ADDRESS_LINE1("Address line 1", null),
    ADDRESS_LINE2("Address line 2", null),
    TOWN_CITY("Town / City", null),
    POST_CODE("Post code", null),
    COUNTRY(countryProperties, countryPropertiesValue),
    COUNTY(countyProperties, null),
    PROPERTY_TYPE("Property type", null),
    NUMBER_OF_BEDROOMS("Number of bedrooms", null),
    YEAR_PROPERTY_WAS_ACQUIRED("Year property was acquired", null),
    ORIGINAL_PURCHASE_PRICE("Original purchase price", null),
    IS_THIS_PROPERTY_MORTGAGED(isThisPropertyMortgaged, isThisPropertyMortgagedValue),
    MORTGAGE_PROVIDER(mortgageProvider, null),
    MORTGAGE_ACCOUNT_NUMBER(mortgageAccountNumber, null),
    CURRENT_BALANCE(currentBalance, null),
    MONTHLY_PAYMENT(monthlyPayment, null),
    INTEREST_ONLY("Interest only", null),
    CURRENT_INTEREST_RATE("Current interest rate", null),
    RATE_TYPE("Rate type", null),
    IS_THE_MORTGAGE_NOW_OR_IT_HAS_BEEN_IN("Is the mortgage now or has it been in …", null),
    ADD_ANOTHER_MORTGAGE_ACCOUNT(addAnotherMortgageAccount, addAnotherMortgageAccountValue),
    ANOTHER_MORTGAGE_ACCOUNT_NUMBER(mortgageAccountNumber, null),
    ANOTHER_CURRENT_BALANCE(currentBalance, null),
    ANOTHER_MONTHLY_PAYMENT(monthlyPayment, null),
    ANOTHER_INTEREST_ONLY(interestOnly, null),
    ANOTHER_CURRENT_INTEREST_RATE(currentInterestRate, null),
    ANOTHER_RATE_TYPE(rateType, null),
    ANOTHER_IS_THE_MORTGAGE_NOW_OR_IT_HAS_BEEN_IN(isTheMortgageNowOrItHasBeenIn, null),
    DO_YOU_PLAN_TO_SELL_IT("Do you plan to sell it …", null),
    ESTIMATED_VALUE_SALE_AGREED_PRICE("Estimated value/sale agreed price", null);

    public static final Log log = LogFactory.getLog(YPROPERTIES_principalDwellingHouse.class);

    private String getFieldName;
    private String getFieldNameValue;

    YPROPERTIES_principalDwellingHouse(String getFieldName, String getFieldNameValue){
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
        log.debug("YPROPERTIES_principalDwellingHouse executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, DO_YOU_HAVE_STAKE_IN_PROPERTY.getFieldName());
        expectedFieldNames.set(1, PROPERTY_CATEGORY.getFieldName());
        expectedFieldNames.set(2, ADDRESS_LINE1.getFieldName());
        expectedFieldNames.set(3, ADDRESS_LINE2.getFieldName());
        expectedFieldNames.set(4, TOWN_CITY.getFieldName());
        expectedFieldNames.set(5, POST_CODE.getFieldName());
        expectedFieldNames.set(6, COUNTRY.getFieldName());
        expectedFieldNames.set(7, PROPERTY_TYPE.getFieldName());
        expectedFieldNames.set(8, NUMBER_OF_BEDROOMS.getFieldName());
        expectedFieldNames.set(9, YEAR_PROPERTY_WAS_ACQUIRED.getFieldName());
        expectedFieldNames.set(10, ORIGINAL_PURCHASE_PRICE.getFieldName());
        expectedFieldNames.set(11, IS_THIS_PROPERTY_MORTGAGED.getFieldName());
        expectedFieldNames.set(12, DO_YOU_PLAN_TO_SELL_IT.getFieldName());
        expectedFieldNames.set(13, ESTIMATED_VALUE_SALE_AGREED_PRICE.getFieldName());

        return expectedFieldNames;
    }

    //todo - This part I am really proud on why ? Try to find out :-)
    public static ArrayList<String> getExpectedFieldNames(ArrayList<Boolean> addAnotherMortgage){
        log.debug("YPROPERTIES_principalDwellingHouse executing method getExpectedFieldNames(ArrayList<Boolean> addAnotherMortgage = '" + addAnotherMortgage + "')");

        ArrayList<String> expectedFields = getExpectedFieldNames();
        expectedFields.addAll(YPROPERTIES_subIsThisPropertyMortgagedYes.getExpectedFieldNames(addAnotherMortgage));

        return expectedFields;
    }

    public static ArrayList<String> getExpectedFieldNames(String isThisPropertyMortgagedValue, @Nullable boolean addAnotherMortgage){
        log.debug("YPROPERTIES_principalDwellingHouse executing method getExpectedFieldNames(String isThisPropertyMortgagedValue = '" + isThisPropertyMortgagedValue + "', @Nullable boolean addAnotherMortgage = '" + addAnotherMortgage + "')");

        ArrayList<String> expectedFields = getExpectedFieldNames();

        switch (isThisPropertyMortgagedValue) {
            case "Yes":
                expectedFields.addAll(YPROPERTIES_subIsThisPropertyMortgagedYes.getExpectedFieldNames(addAnotherMortgage));
                break;
            case "No, Mortgage Repaid":
                expectedFields.addAll(YPROPERTIES_subIsThisPropertyMortgagedNoMortgageRepaid.getExpectedFieldNames());
                break;
            case "No, Never Had a Mortgage":
                break;
        }
        return expectedFields;
    }
    //todo - This part I am really proud on why ? Try to find out :-) Here it ends


    /**
     * position - int with value specifying the wanted trigger point
     * @return - String with value
     */
    public static String getTriggerField(int position){
        log.debug("YPROPERTIES_principalDwellingHouse executing method getTriggerField");
        switch (position) {
            case 0:
                return DO_YOU_HAVE_STAKE_IN_PROPERTY.getFieldName();
            case 1:
                return PROPERTY_CATEGORY.getFieldName();
            case 2:
                return COUNTRY.getFieldName();
            case 3:
                return IS_THIS_PROPERTY_MORTGAGED.getFieldName();
            case 4:
                return ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldName();
        }
        log.info("available positions are : 0,1,2,3,4 but you have specified a '" + position + "' which is nonsense... so returning you the default");
        return PROPERTY_CATEGORY.getFieldName();

    }

    /**
     * position - int with value specifying the wanted trigger point
     * @return - String with value
     */
    public static String getTriggerFieldValue(int position){
        log.debug("YPROPERTIES_principalDwellingHouse executing method getTriggerFieldValue");
        switch (position) {
            case 0:
                return DO_YOU_HAVE_STAKE_IN_PROPERTY.getFieldNameValue();
            case 1:
                return PROPERTY_CATEGORY.getFieldNameValue();
            case 2:
                return COUNTRY.getFieldNameValue();
            case 3:
                return IS_THIS_PROPERTY_MORTGAGED.getFieldNameValue();
            case 4:
                return ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldNameValue();
        }
        log.info("available positions are : 0,1,2,3,4 but you have specified a '" + position + "' which is nonsense... so returning you the default");
        return PROPERTY_CATEGORY.getFieldNameValue();
    }

    /**
     * Is returning Map containing field Name (Map key) and field value (Map value) responsible for triggering of this data Collection
     * @return Map containing <"Number of Borrowers", "a single borrower">
     */
    public static Map<String, String> getTriggerMap() {
        log.debug("YPROPERTIES_principalDwellingHouse executing method getTriggerMap");

        Map<String, String> dataTrigger = new HashMap<>();

        dataTrigger.put(DO_YOU_HAVE_STAKE_IN_PROPERTY.getFieldName(), DO_YOU_HAVE_STAKE_IN_PROPERTY.getFieldNameValue());
        dataTrigger.put(PROPERTY_CATEGORY.getFieldName(), PROPERTY_CATEGORY.getFieldNameValue());
        dataTrigger.put(COUNTRY.getFieldName(), COUNTRY.getFieldNameValue());
        dataTrigger.put(IS_THIS_PROPERTY_MORTGAGED.getFieldName(), IS_THIS_PROPERTY_MORTGAGED.getFieldNameValue());
        dataTrigger.put(ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldName(), ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldNameValue());

        return dataTrigger;
    }

    /**
     * Is returning name of field responsible for enabling this data Collection
     * @return - String with value 'Number of Borrowers'
     */
    public static ArrayList<String> getTriggerFields() {
        log.debug("YPROPERTIES_principalDwellingHouse executing method getTriggerFields");

        ArrayList<String> triggerArrayList = new ArrayList<>();

        triggerArrayList.set(0, DO_YOU_HAVE_STAKE_IN_PROPERTY.getFieldName());
        triggerArrayList.set(1, PROPERTY_CATEGORY.getFieldName());
        triggerArrayList.set(2, COUNTRY.getFieldName());
        triggerArrayList.set(3, IS_THIS_PROPERTY_MORTGAGED.getFieldName());
        triggerArrayList.set(4, ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldName());

        return triggerArrayList;
    }



}
