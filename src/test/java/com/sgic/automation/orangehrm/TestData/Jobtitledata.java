package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;


public class Jobtitledata extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(Jobtitledata.class);

    public Jobtitledata() {
        super("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
    }
    @DataProvider(name = "JobTitle")
    public Object[][] JobTitle() {

        int rows = getRowCount("Add");
        int col = getColumnCount("Add");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Add", i, j);
            }
        }
        return data;
    }

}
