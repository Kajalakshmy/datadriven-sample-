package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class PayGradeData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(PayGradeData.class);

    public PayGradeData () {
        super("src\\test\\resources\\ExcelSheet\\Data.xlsx");
    }
    @DataProvider(name = "PayGradename")
    public Object[][] PayGradename() {

        int rows = getRowCount("Sheet1");
        int col = getColumnCount("Sheet1");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet1", i, j);
            }
        }
        return data;
    }

}


