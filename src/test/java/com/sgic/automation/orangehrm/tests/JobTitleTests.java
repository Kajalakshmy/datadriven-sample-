package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.Jobtitledata;
import com.sgic.automation.orangehrm.pages.JobTitlePage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class JobTitleTests extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(JobTitlePage.class));
    @Test(priority = 1)
    public void RoleTest( ) {
        softAssert =new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(),"Login page not display");
         LoginPage.setUserName("Admin");
        LoginPage.setPassword("admin123");
        LoginPage.clickLogin();
        softAssert.assertTrue(JobTitlePage.isJobTitlePageDisplay(),"not dashboard display ");
        JobTitlePage.clickAdmin();
        JobTitlePage.clickJob();
        JobTitlePage.clickJobTitle();
        softAssert.assertTrue(JobTitlePage.isJobTitlePageDisplay(),"not dashboard jobtitle sucessfully");
        JobTitlePage.clickAdd();
        JobTitlePage.setJobTitleName("hhhx1h");
        JobTitlePage.Clickbtnsave();
        softAssert.assertEquals(JobTitlePage.ismessagesucessfadable(), Constants.addmgs," Not show Successfully message");
        softAssert.assertTrue(JobTitlePage.isJobTitlePageDisplay(),"  sucessfully saved ");








    }
}
