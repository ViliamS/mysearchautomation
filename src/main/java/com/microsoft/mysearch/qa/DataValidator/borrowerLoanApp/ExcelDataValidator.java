package com.microsoft.mysearch.qa.DataValidator.borrowerLoanApp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by viliamstrobich on 22/10/15 - 15:00.
 */
public class ExcelDataValidator{

    public static final Log log = LogFactory.getLog(ExcelDataValidator.class);
    private static Map<Integer, String> sheetNames;
    private static ArrayList<String> expectedSheetNames = BORROWER_loanApplication_expectedSheets.getExpectedSheetNames();


    /**
     * Example filePath : "/Library/Abakus/abakus_automation/qa_automation/Abakus/src/test/resources/ExcelDataFiles/Borrower_UI_Automation.xls"
     * @param filePath - String containing path to an Excel Data Template
     * @throws IOException
     */
    public ExcelDataValidator(String filePath) throws IOException {
        log.debug("ExcelDataValidator constructor");

        /**
         * todo this is hack to make it working without ACMExcel
         */
        BORROWER_loanApplication_expectedSheets.values();
        int i = 0;
        for (String value:BORROWER_loanApplication_expectedSheets.getExpectedSheetNames()){
            ExcelDataValidator.sheetNames.put(i, value);
            i = i++;
        }
    }

    /**
     * Get Borrower Loan Application Expected Sheet Names
     * @return - ArrayList<String> with ordered sheetNames
     */
    public static ArrayList<String> getBwLoanAppExpectedSheetNames(){
        log.debug("ExcelDataValidator executing method getBwLoanAppExpectedSheetNames : returning a '" + expectedSheetNames + "'");
        return expectedSheetNames;
    }


    /**
     *  This check should be optional because we want to have
     * @return true / false depending on validation result
     */
    public static Boolean doBWLoanAppSheetValidation(){
        log.debug("ExcelDataValidator executing method doSheetValidation");
        String sheetName, expectedSheetName;

        for(int i = 0; i < sheetNames.size(); i++){
            expectedSheetName = expectedSheetNames.get(i);
            sheetName = sheetNames.get(i);
            log.debug("Checking if contains part of Name in template storage BORROWER_loanApplication_expectedSheets for : '" + sheetName + "'");
            log.debug(" OR Expecting exact presence of '" + expectedSheetName + "' against provided sheet : '" + sheetName + "'");

            if(!sheetName.equalsIgnoreCase(expectedSheetName) || !BORROWER_loanApplication_expectedSheets.checkContainsSheet(sheetName)) {
                log.debug("Condition failed triggering failure!");
                return false;
            }
        }
        log.debug("Condition Passed triggering return true!");
        return true;
    }



}
