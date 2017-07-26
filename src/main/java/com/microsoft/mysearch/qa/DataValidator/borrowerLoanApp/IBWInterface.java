package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp;


import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails.PERSONAL_DETAILS_subAccommodation;
import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails.PERSONAL_DETAILS_subCountry;
import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails.PERSONAL_DETAILS_subHaveYouLivedHere3Y;
import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.PersonalDetails.PERSONAL_DETAILS_subNationality;
import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties.YPROPERTIES_subAddAnotherMortgageAccount;
import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties.YPROPERTIES_subCountry;
import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.YourProperties.YPROPERTIES_subIsThisPropertyMortgagedYes;

/**
 * Created by viliamstrobich on 23/10/15 - 11:45.
 */
public interface IBWInterface {

    String subNationality = PERSONAL_DETAILS_subNationality.NATIONALITY.getFieldName();
    String subNationalityValue = PERSONAL_DETAILS_subNationality.NATIONALITY.getFieldNameValue();
    String howManyYears = PERSONAL_DETAILS_subNationality.HOW_MANY_YEARS.getFieldName();
    String country = PERSONAL_DETAILS_subCountry.COUNTRY.getFieldName();
    String countryValue = PERSONAL_DETAILS_subCountry.COUNTRY.getFieldNameValue();
    String countyState = PERSONAL_DETAILS_subCountry.COUNTY_STATE.getFieldName();
    String thisAccommodationIsValue = PERSONAL_DETAILS_subAccommodation.THIS_ACCOMMODATION_IS.getFieldNameValue();
    String thisAccommodationIs = PERSONAL_DETAILS_subAccommodation.THIS_ACCOMMODATION_IS.getFieldName();
    String rent = PERSONAL_DETAILS_subAccommodation.RENT.getFieldName();
    String haveYouLivedHereFor3Years = PERSONAL_DETAILS_subHaveYouLivedHere3Y.HAVE_YOU_LIVED_HERE_3_Y.getFieldName();
    String haveYouLivedHereFor3YearsValue = PERSONAL_DETAILS_subHaveYouLivedHere3Y.HAVE_YOU_LIVED_HERE_3_Y.getFieldNameValue();
    String previousAddressLine1 = PERSONAL_DETAILS_subHaveYouLivedHere3Y.PREVIOUS_ADDRESS_LINE_1.getFieldName();
    String previousAddressLine2 = PERSONAL_DETAILS_subHaveYouLivedHere3Y.PREVIOUS_ADDRESS_LINE_2.getFieldName();
    String previousTownCity = PERSONAL_DETAILS_subHaveYouLivedHere3Y.PREVIOUS_TOWN_CITY.getFieldName();
    String previousPostCodeZip = PERSONAL_DETAILS_subHaveYouLivedHere3Y.PREVIOUS_POSTCODE_ZIP.getFieldName();
    String previousCountry = PERSONAL_DETAILS_subHaveYouLivedHere3Y.PREVIOUS_COUNTRY.getFieldName();

    String isThisPropertyMortgaged = YPROPERTIES_subIsThisPropertyMortgagedYes.IS_THIS_PROPERTY_MORTGAGED.getFieldName();
    String isThisPropertyMortgagedValue = YPROPERTIES_subIsThisPropertyMortgagedYes.IS_THIS_PROPERTY_MORTGAGED.getFieldNameValue();
    String mortgageProvider = YPROPERTIES_subAddAnotherMortgageAccount.MORTGAGE_PROVIDER.getFieldName();
    String mortgageAccountNumber = YPROPERTIES_subAddAnotherMortgageAccount.MORTGAGE_ACCOUNT_NUMBER.getFieldName();
    String currentBalance = YPROPERTIES_subAddAnotherMortgageAccount.CURRENT_BALANCE.getFieldName();
    String monthlyPayment = YPROPERTIES_subIsThisPropertyMortgagedYes.MONTHLY_PAYMENT.getFieldName();
    String interestOnly = YPROPERTIES_subAddAnotherMortgageAccount.INTEREST_ONLY.getFieldName();
    String currentInterestRate = YPROPERTIES_subAddAnotherMortgageAccount.CURRENT_INTEREST_RATE.getFieldName();
    String rateType = YPROPERTIES_subAddAnotherMortgageAccount.RATE_TYPE.getFieldName();
    String isTheMortgageNowOrItHasBeenIn = YPROPERTIES_subAddAnotherMortgageAccount.IS_THE_MORTGAGE_NOW_OR_IT_HAS_BEEN_IN.getFieldName();

    String addAnotherMortgageAccount = YPROPERTIES_subAddAnotherMortgageAccount.ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldName();
    String addAnotherMortgageAccountValue = YPROPERTIES_subAddAnotherMortgageAccount.ADD_ANOTHER_MORTGAGE_ACCOUNT.getFieldNameValue();

    String countryProperties = YPROPERTIES_subCountry.COUNTRY.getFieldName();
    String countryPropertiesValue = YPROPERTIES_subCountry.COUNTRY.getFieldNameValue();
    String countyProperties = YPROPERTIES_subCountry.COUNTY.getFieldName();



    String getFieldName();

    String getFieldNameValue();

}
