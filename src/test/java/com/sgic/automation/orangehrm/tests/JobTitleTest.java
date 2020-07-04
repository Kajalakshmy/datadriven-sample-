package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.Jobtitledata;
import com.sgic.automation.orangehrm.TestData.LoginThusyData;
import com.sgic.automation.orangehrm.pages.JobTitlePage;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class JobTitleTest  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(JobTitlePage.class));

   /* @Test(priority = 1, groups = "Smoke",dataProviderClass = JobTitleData.class, dataProvider = "job", testName = "job correct")
    public void RoleTest(String Jobtitle,String descrption ,String sepcificatio,String note ) {

        softAssert = new SoftAssert();
        JobTitlePage.EnterUName("Admin");
        JobTitlePage.Enterpassword("admin123");
        JobTitlePage.clickLogin();
        JobTitlePage.clickAdmin();
        JobTitlePage.clickJob();
        JobTitlePage.clickJobTitle();
        JobTitlePage.clickAdd();
        JobTitlePage.setJobTitleName(Jobtitle);
        JobTitlePage.implicitWait(6000);
        JobTitlePage.setjobTitle_jobDescription(descrption);
        JobTitlePage.setjobTitle_jobSpec(sepcificatio);
        JobTitlePage.setjobTitle_note(note);
        JobTitlePage.Clickbtnsave();

        if(status.equals("valid") ){
            softAssert.assertTrue(DashBoardPage.isDashboardDisplayed());
            LOGGER.info("Login success");

        }

        else{
            JobTitlePage.isJobTitlePageDisplay();
            //LoginPage.getLoginAlert();
            softAssert.assertEquals(JobTitlePage.isLoginAlertDisplay(),alertmsg);
            LOGGER.info(alertmsg);
        }
    }
}*/
    @Test(priority = 1,dataProviderClass = Jobtitledata.class, dataProvider = "JobTitle", testName = "job correct")
    public void RoleTest( String jobtitle, String status, String alertmsg ) {
        JobTitlePage.EnterUName("Admin");
        JobTitlePage.Enterpassword("admin123");
        JobTitlePage.clickLogin();
        JobTitlePage.clickAdmin();
        JobTitlePage.clickJob();
        JobTitlePage.clickJobTitle();
        JobTitlePage.clickAdd();
        JobTitlePage.setJobTitleName(jobtitle);
        JobTitlePage.Clickbtnsave();
        if(status.equals("valid") ){

            LOGGER.info("Login success");


        } else{
            JobTitlePage.getAlert();
            softAssert.assertEquals(JobTitlePage.getAlert(),alertmsg);
            LOGGER.info(alertmsg);

        }
   }

    }


