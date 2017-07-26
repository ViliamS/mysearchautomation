package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.EmploymentAndIncome;

import com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp.IBWInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

/**
 * Created by viliamstrobich on 29/10/15 - 11:25.
 */
public enum EMPANDINCOME_other implements IBWInterface {

    CATEGORY("Category", "Other"),
    OCCUPATION("Occupation", null),
    BUSINESS_NAME("Business name", null),
    EMPLOYMENT_TYPE("Employment Type", "Permanent"),
    START_DATE("Start Date", null),
    END_DATE("End Date", null),
    CURRENTLY("Currently", null),
    GROSS_SALARY("Gross Salary", null),
    REGULAR_OVERTIME("Regular Overtime", null),
    REGULAR_GUARANTEED_BONUS("Regular Guaranteed Bonus", null),
    GUARANTEED_COMMISSION("Guaranteed Commission", null);

    public static final Log log = LogFactory.getLog(EMPANDINCOME_other.class);

    private String getFieldName;
    private String getFieldNameValue;

    EMPANDINCOME_other(String getFieldName, String getFieldNameValue){
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
        log.debug("EMPANDINCOME_other executing method getExpectedFieldNames");
        ArrayList<String> expectedFieldNames = new ArrayList<>();

        expectedFieldNames.set(0, CATEGORY.getFieldName());
        expectedFieldNames.set(1, OCCUPATION.getFieldName());
        expectedFieldNames.set(2, BUSINESS_NAME.getFieldName());
        expectedFieldNames.set(3, EMPLOYMENT_TYPE.getFieldName());
        expectedFieldNames.set(4, START_DATE.getFieldName());
        expectedFieldNames.set(5, END_DATE.getFieldName());
        expectedFieldNames.set(6, CURRENTLY.getFieldName());
        expectedFieldNames.set(7, GROSS_SALARY.getFieldName());
        expectedFieldNames.set(8, REGULAR_OVERTIME.getFieldName());
        expectedFieldNames.set(9, REGULAR_GUARANTEED_BONUS.getFieldName());
        expectedFieldNames.set(10, GUARANTEED_COMMISSION.getFieldName());

        return expectedFieldNames;
    }

    /**
     * @return - String with value
     */
    public static String getTriggerField(){
        return CATEGORY.getFieldName();
    }

    /**
     * @return - String with value
     */
    public static String getTriggerFieldValue(){
        return CATEGORY.getFieldNameValue();
    }

}
