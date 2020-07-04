package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class JobTitlePage extends PageBase {

    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(JobTitlePage.class));

    private static By Uname = By.xpath("//*[@id=\"txtUsername\"]");
    private static By pword = By.xpath("//*[@id=\"txtPassword\"]");
    private static By login = By.xpath("//*[@id=\"btnLogin\"]");
    private static By Admin = By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");

    private static By Job = By.xpath("//*[@id=\"menu_admin_Job\"]");
    private static By JobTitle = By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]");
    private static By ADD = By.xpath("//*[@id=\"btnAdd\"]");
    private static By JobTitleName = By.xpath("//*[@id=\"jobTitle_jobTitle\"]");
    private static By jobTitle_jobDescription = By.xpath("//*[@id=\"jobTitle_jobDescription\"]");
    private static By jobTitle_jobSpec = By.xpath("//*[@id=\"jobTitle_jobSpec\"]");
    private static By jobTitle_note = By.xpath("//*[@id=\"jobTitle_note\"]");
    private static By btnSave = By.xpath("//*[@id=\"btnSave\"]");
    private static By messagesuccessfadable = By.xpath("//*[@id=\"frmList_ohrmListComponent\"]/div[2]");
    private static By btnCancel = By.xpath("//*[@id=\"btnCancel\"]");
    private static By alertmess = By.xpath("//*[@id=\"frmSavejobTitle\"]/fieldset/ol/li[1]/span");


    public static boolean isJobTitlePageDisplay() {

        return getDriver().findElement(JobTitle).isDisplayed();
    }

    public static boolean isLoginAlertDisplay() {
        return getDriver().findElement(alertmess).isDisplayed();
    }


    public static String getResult() {
        return getDriver().findElement(messagesuccessfadable).getText();
    }


    public static String getAlert() {
        return getDriver().findElement(alertmess).getText();
    }


    public static void EnterUName(String name) {
        getDriver().findElement(Uname).sendKeys(name);
    }


    public static void Enterpassword(String pass) {
        getDriver().findElement(pword).sendKeys(pass);
    }

    public static void clickLogin() {
        getDriver().findElement(login).click();
    }

    public static void clickAdmin() {
        getDriver().findElement(Admin).click();
    }

    public static void clickJob() {
        getDriver().findElement(Job).click();
    }


    public static void clickJobTitle() {
        getDriver().findElement(JobTitle).click();
    }

    public static void clickAdd() {
        getDriver().findElement(ADD).click();
    }

    public static void setJobTitleName(String JobTitle_Name) {
        getDriver().findElement(JobTitleName).sendKeys(JobTitle_Name);

    }

    public static void setjobTitle_jobDescription(String Description) {
        getDriver().findElement(jobTitle_jobDescription).sendKeys(Description);
    }

    public static void setjobTitle_jobSpec(String jobspec) {
        getDriver().findElement(jobTitle_jobSpec).sendKeys(jobspec);
    }

    public static void setjobTitle_note(String note) {
        getDriver().findElement(jobTitle_note).sendKeys(note);

    }


    public static void Clickbtnsave() {
        getDriver().findElement(btnSave).click();

    }

    public static void Clickcancel() {
        getDriver().findElement(btnCancel).click();
    }

    public static String  ismessagesucessfadable() {
       return getDriver().findElement(messagesuccessfadable).getText();

    }

}