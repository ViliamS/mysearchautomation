package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 27/10/15 - 15:00.
 */
public enum YPROPERTIES_subIsThisPropertyMortgagedYes implements IBWInterface{

    IS_THIS_PROPERTY_MORTGAGED ("Is this property mortgaged?", "Yes"),
    MORTGAGE_PROVIDER (mortgageProvider, null),
    MORTGAGE_ACCOUNT_NUMBER (mortgageAccountNumber, null),
    CURRENT_BALANCE(currentBalance, null),
    MONTHLY_PAYMENT(monthlyPayment, null),
    INTEREST_ONLY(interestOnly, null),
    CURRENT_INTEREST_RATE(currentInterestRate, null),
    RATE_TYPE(rateType, null),
    IS_THE_MORTGAGE_NOW_OR_HAS_BEEN_IN(isTheMortgageNowOrItHasBeenIn, null),
    ADD_ANOTHER_MORTGAGE_ACCOUNT(addAnotherMortgageAccount, addAnotherMortgageAccountValue);

    public static final Log log = LogFactory.getLog(YPROPERTIES_subIsThisPropertyMortgagedYes.class);

    private final String getFieldName;
    private final String getFieldNameValue;
    private ArrayList<String> expectedFieldNames;

    YPROPERTIES_subIsThisPropertyMortgagedYes(String getFieldName, String getFieldNameValue) {
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
        log.debug("YPROPERTIES_subIsThisPropertyMortgagedYes executing method getExpectedFieldNames");

        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, IS_THIS_PROPERTY_MORTGAGED.getFieldName());
        expectedFieldNames.set(1, MORTGAGE_PROVIDER.getFieldName());
        expectedFieldNames.set(2, MORTGAGE_ACCOUNT_NUMBER.getFieldName());
        expectedFieldNames.set(3, CURRENT_BALANCE.getFieldName());
        expectedFieldNames.set(4, MONTHLY_PAYMENT.getFieldName());
        expectedFieldNames.set(5, INTEREST_ONLY.getFieldName());
        expectedFieldNames.set(6, CURRENT_INTEREST_RATE.getFieldName());
        expectedFieldNames.set(7, RATE_TYPE.getFieldName());
        expectedFieldNames.set(8, IS_THE_MORTGAGE_NOW_OR_HAS_BEEN_IN.getFieldName());

        return expectedFieldNames;
    }

    //todo - This part I am really proud on why ? Try to find out :-)
    /**
     * Adding expected field names from enum YPROPERTIES_subAddAnotherMortgageAccount to expected fields of this enum
     * @param expectedFieldNames - ArrayList<String>
     * @return - expectedFieldNames = expectedFieldNames + YPROPERTIES_subAddAnotherMortgageAccount.expectedFieldNames
     */
    private static ArrayList<String> addAllToExpectedFieldNames(ArrayList<String> expectedFieldNames){
        log.debug("YPROPERTIES_subIsThisPropertyMortgagedYes executing method addAllToExpectedFieldNames");

        expectedFieldNames.addAll(YPROPERTIES_subAddAnotherMortgageAccount.getExpectedFieldNames());
        return expectedFieldNames;
    }

    /**
     * There is possibility to add another mortgage over and over again so we must cover unlimited depth of adding and this method does that
     * @param addAnotherMortgage - ArrayList<Boolean> addAnotherMortgage
     * @return - expectedFieldNames = expectedFieldNames + (addAnotherMortgage.size() * YPROPERTIES_subAddAnotherMortgageAccount.expectedFieldNames)
     */
    public static ArrayList<String> getExpectedFieldNames(ArrayList<Boolean> addAnotherMortgage){
        log.debug("YPROPERTIES_subIsThisPropertyMortgagedYes executing method getExpectedFieldNames(ArrayList<Boolean> addAnotherMortgage)");

        boolean addAnother = false;
        ArrayList<String> expectedFieldNames = getExpectedFieldNames();

        for (int i = 0; i < addAnotherMortgage.size(); i++){

            if((i < addAnotherMortgage.size())&&(!addAnotherMortgage.get(i))){
                break; // there is not nonsense scenario example true, false, true.  This condition ends this looping when first false is detected.
                // after not adding another mortgage account is not possible and nonsense to add another....
            } else {
                expectedFieldNames.addAll(getExpectedFieldNames(expectedFieldNames, addAnotherMortgage.get(i)));
            }
        }
        return expectedFieldNames;
    }

    /**
     * based on inputted variable it returns basic set of Expected fields [only from this enum] or if boolean is true which means add another mortgage it adds to expected fields expected fields of enum YPROPERTIES_subAddAnotherMortgageAccount
     * @param addAnotherMortgage - boolean true / false
     * @return - expectedFields to be filled
     */
    public static ArrayList<String> getExpectedFieldNames(boolean addAnotherMortgage){
        log.debug("YPROPERTIES_subIsThisPropertyMortgagedYes executing method getExpectedFieldNames(boolean addAnotherMortgage = '" + addAnotherMortgage + "')");

        ArrayList<String> expectedFieldNames = getExpectedFieldNames();
        expectedFieldNames.addAll(getExpectedFieldNames(expectedFieldNames, addAnotherMortgage));
        return expectedFieldNames;
    }

    /**
     * based on inputted variable it returns basic set of Expected fields [only from this enum] or if boolean is true which means add another mortgage it adds to expected fields expected fields of enum YPROPERTIES_subAddAnotherMortgageAccount
     * @param expectedFieldNames - ArrayList<String> expectedFieldNames
     * @param addAnotherMortgage - boolean true/false
     * @return - ArrayList<String> expectedFieldNames - enhanced or not touched based on the boolean
     */
    private static ArrayList<String> getExpectedFieldNames(ArrayList<String> expectedFieldNames, boolean addAnotherMortgage){
        log.debug("YPROPERTIES_subIsThisPropertyMortgagedYes executing method getExpectedFieldNames(ArrayList<String> expectedFieldNames, boolean addAnotherMortgage = '" + addAnotherMortgage + "')");

        if(addAnotherMortgage){
            addAllToExpectedFieldNames(expectedFieldNames);
        }
        return expectedFieldNames;
    }
    //todo - This part I am really proud on why ? Try to find out :-)  Here it ends.


    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return IS_THIS_PROPERTY_MORTGAGED.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return IS_THIS_PROPERTY_MORTGAGED.getFieldNameValue();
    }

}
