package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.ArrayList;

/**
 * Created by viliamstrobich on 22/10/15 - 17:05.
 */
public enum BORROWER_loanApplication_expectedSheets {

    REGISTRATION("Borrower Test Data"),
    QUOTATION ("Quotation"),
    INVITE_CO_APPLICANT ("Invite co-applicant"),
    PERSONAL_DETAILS ("Personal Details"),
    EMPLOYMENT_AND_INCOME ("Employment and Income"),
    YOUR_FINANCIAL_ASSETS ("Your Financial Assets"),
    YOUR_ACCOUNTS ("Your Accounts"),
    YOUR_PROPERTIES ("Your Properties"),
    YOUR_DEPENDENTS ("Your Dependents"),
    YOUR_FINANCIAL_COMMITMENTS ("Your Financial Commitments"),
    YOUR_FUNDING ("Your Funding");

    private String getSheetName;

    public static final Log log = LogFactory.getLog(BORROWER_loanApplication_expectedSheets.class);

    /**
     * This works as Constructor for enum declaration
     * @param getSheetName - String with content of sheetName
     */
    BORROWER_loanApplication_expectedSheets(String getSheetName) {
        this.getSheetName = getSheetName;
    }

    /**
     * It's must to have for enum inner logic it provides String value as content of DECLARATIONS ("String value"); from above. Simply DECLARATION.getSheetName() == "String value"
     * @return String getSheetName
     */
    public String getSheetName(){
        return getSheetName;
    }

    /**
     * Provides set of SheetNames that we expect to be present for Borrower Loan Application Excel Sheet
     * @return - ArrayList<String> expectedSheetNames
     */
    public static ArrayList<String> getExpectedSheetNames(){
        log.debug("BORROWER_loanApplication_expectedSheets executing method getExpectedSheetNames");
        ArrayList<String> sheetNames = new ArrayList<>();

        sheetNames.set(0, REGISTRATION.getSheetName());
        sheetNames.set(1, QUOTATION.getSheetName());
        sheetNames.set(2, INVITE_CO_APPLICANT.getSheetName());
        sheetNames.set(3, PERSONAL_DETAILS.getSheetName());
        sheetNames.set(4, EMPLOYMENT_AND_INCOME.getSheetName());
        sheetNames.set(5, YOUR_FINANCIAL_ASSETS.getSheetName());
        sheetNames.set(6, YOUR_ACCOUNTS.getSheetName());
        sheetNames.set(7, YOUR_PROPERTIES.getSheetName());
        sheetNames.set(8, YOUR_DEPENDENTS.getSheetName());
        sheetNames.set(9, YOUR_FINANCIAL_COMMITMENTS.getSheetName());
        sheetNames.set(10, YOUR_FUNDING.getSheetName());

        return sheetNames;
    }

    /**
     * Provides a checkPoint for cases where just a part of sheetName is present, because the second part is actually trigger point
     * @param sheetName - String with whole sheet Name that is going to be verified
     * @return true - if passed / false - if failed
     */
    public static boolean checkContainsSheet(String sheetName){
        log.debug("BORROWER_loanApplication_expectedSheets executing method checkContainsSheet(String sheetName = '" + sheetName + "')");
        ArrayList<String> sheetNames = getExpectedSheetNames();
        for(int i = 0; i < sheetNames.size(); i++) {
            log.debug("check round '" + i + "' verification of sheetName = '" + sheetName + "' vs. '" + sheetNames.get(i));
            if (sheetNames.get(i).contains(sheetName)){
                log.debug("Passed returning true");
                return true;
            }
        }
        log.debug("Failed returning false");
        return false;
    }


}
