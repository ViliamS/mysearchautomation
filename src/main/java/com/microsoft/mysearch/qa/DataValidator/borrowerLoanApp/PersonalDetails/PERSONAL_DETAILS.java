package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viliamstrobich on 23/10/15 - 12:05.
 */
public enum PERSONAL_DETAILS implements IBWInterface {

    FIRST_NAME (                                "First name",                                   "a single borrower"), //If second value is present then this value is responsible for triggering this Collection of expected data
    LAST_NAME (                                 "Mortgage Type",                                null),
    GENDER (                                    "First Borrower Age",                           null),
    DATE_OF_BIRTH (                             "Borrowers Marital Status",                     null),
    MARITAL_STATUS (                            "Number of Dependants",                         null),
    NATIONALITY (                               subNationality,                                 subNationalityValue), //If second value is NOT present then the triggering is going to happen
    HOW_MANY_YEARS (                            howManyYears,                                   null),
    ADDRESS_LINE_1 (                            "Address Line 1",                               null),
    ADDRESS_LINE_2 (                            "Address Line 2",                               null),
    TOWN_CITY (                                 "Town / City",                                  null),
    POST_CODE_ZIP (                             "Postcode/ZIP (optional)",                      null),
    COUNTRY (                                   country,                                        countryValue), //If second value Ireland is present then this value is responsible for triggering this Collection of expected data
    COUNTY_STATE (                              countyState,                                    null),
    THIS_ACCOMMODATION_IS (                     thisAccommodationIs,                            thisAccommodationIsValue),  //If one of the values divided by '|' is present then this set it triggered
    RENT (                                      rent,                                           null),
    HAVE_YOU_LIVED_ON_THIS_ADDRESS_FOR_3Y (     haveYouLivedHereFor3Years,                      haveYouLivedHereFor3YearsValue), //If 'No' is present then this set it triggered
    PREVIOUS_ADDRESS_LINE_1 (                   previousAddressLine1,                           null),
    PREVIOUS_ADDRESS_LINE_2 (                   previousAddressLine2,                           null),
    PREVIOUS_TOWN_CITY (                        previousTownCity,                               null),
    PREVIOUS_POSTCODE_ZIP (                     previousPostCodeZip,                            null),
    PREVIOUS_COUNTRY (                          previousCountry,                                null);

    public static final Log log = LogFactory.getLog(PERSONAL_DETAILS.class);

    private String getFieldName;
    private String getFieldNameValue;



    PERSONAL_DETAILS(String getFieldName, String getFieldNameValue) {
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
    public static ArrayList<String> getExpectedFieldNames(){
        log.debug("PERSONAL_DETAILS executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, FIRST_NAME.getFieldName());
        expectedFieldNames.set(1, LAST_NAME.getFieldName());
        expectedFieldNames.set(2, GENDER.getFieldName());
        expectedFieldNames.set(3, DATE_OF_BIRTH.getFieldName());
        expectedFieldNames.set(4, MARITAL_STATUS.getFieldName());
        expectedFieldNames.set(5, NATIONALITY.getFieldName());

        expectedFieldNames.set(6, ADDRESS_LINE_1.getFieldName());
        expectedFieldNames.set(7, ADDRESS_LINE_2.getFieldName());
        expectedFieldNames.set(8, TOWN_CITY.getFieldName());
        expectedFieldNames.set(9, POST_CODE_ZIP.getFieldName());
        expectedFieldNames.set(10, COUNTRY.getFieldName());

        expectedFieldNames.set(11, THIS_ACCOMMODATION_IS.getFieldName());

        expectedFieldNames.set(12, HAVE_YOU_LIVED_ON_THIS_ADDRESS_FOR_3Y.getFieldName());

        return expectedFieldNames;
    }

    /**
     * Is returning Map containing field Name (Map key) and field value (Map value) responsible for triggering of this data Collection
     * @return Map containing <"Number of Borrowers", "a single borrower">
     */
    public static Map<String, String> getTriggerMap(){
        log.debug("PERSONAL_DETAILS executing method getTriggerMap");

        Map<String, String> dataTrigger = new HashMap<>();

        dataTrigger.put(NATIONALITY.getFieldName(),                             NATIONALITY.getFieldNameValue());
        dataTrigger.put(COUNTRY.getFieldName(),                                 COUNTRY.getFieldNameValue());
        dataTrigger.put(THIS_ACCOMMODATION_IS.getFieldName(),                   THIS_ACCOMMODATION_IS.getFieldNameValue());
        dataTrigger.put(HAVE_YOU_LIVED_ON_THIS_ADDRESS_FOR_3Y.getFieldName(),   HAVE_YOU_LIVED_ON_THIS_ADDRESS_FOR_3Y.getFieldNameValue());

        return dataTrigger;
    }

    /**
     * Is returning name of field responsible for enabling this data Collection
     * @return - String with value 'Number of Borrowers'
     */
    public static ArrayList<String> getTriggerFields(){
        log.debug("PERSONAL_DETAILS executing method getTriggerFields");

        ArrayList<String> propertiesTriggerArrayList = new ArrayList<>();

        propertiesTriggerArrayList.set(0, NATIONALITY.getFieldName());
        propertiesTriggerArrayList.set(1, COUNTRY.getFieldName());
        propertiesTriggerArrayList.set(2, THIS_ACCOMMODATION_IS.getFieldName());
        propertiesTriggerArrayList.set(3, HAVE_YOU_LIVED_ON_THIS_ADDRESS_FOR_3Y.getFieldName());

        return propertiesTriggerArrayList;
    }

}
