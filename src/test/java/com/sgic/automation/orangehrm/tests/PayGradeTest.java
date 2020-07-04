package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.LoginThusyData;
import com.sgic.automation.orangehrm.TestData.PayGradeData;
import com.sgic.automation.orangehrm.pages.JobTitlePage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PayGradePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class PayGradeTest  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGradePage.class));

    @Test(priority = 1, dataProviderClass = PayGradeData.class , dataProvider = "PayGradename" )

    public void RoleTest( String name){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(),"Login page not display");

        PayGradePage.clickAdmin();
        PayGradePage.clickJob();
        PayGradePage.clickPayGrade();
        PayGradePage.clickAdd();
        PayGradePage.setName(name);
        PayGradePage.Clicksave();
        softAssert.assertEquals(PayGradePage.isaddmsg(), Constants.addmgs," Not show Successfully message");


    }
}
