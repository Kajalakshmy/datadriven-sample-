package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class PayGradePage extends PageBase {

    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PayGradePage.class));



    private static By Admin = By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
    private static By Job = By.xpath("//*[@id=\"menu_admin_Job\"]");
    private  static By PayGrade = By.xpath("//*[@id=\"menu_admin_viewPayGrades\"]");
    private  static By Add =By.xpath("//*[@id=\"btnAdd\"]");
    private  static By name = By.xpath("//*[@id=\"payGrade_name\"]");
    private  static By save =By.xpath("//*[@id=\"btnSave\"]");
    private  static By cancel = By.xpath("//*[@id=\"btnCancel\"]");
    private static By  addmgs =By.xpath("//*[@id=\"payGrade\"]/div[2]/script");


    public static void clickAdmin() {
        getDriver().findElement(Admin).click();
    }

    public static void clickJob() {
        getDriver().findElement(Job).click();
    }

    public static void clickPayGrade() {
        getDriver().findElement(PayGrade).click();
    }

    public static void clickAdd() {
        getDriver().findElement(Add).click();
    }

    public static void setName(String Name) {
        getDriver().findElement(name).sendKeys(Name);

    }
    public static void Clicksave() {
        getDriver().findElement(save).click();

    }

    public static void Clickcancel() {
        getDriver().findElement(cancel).click();

    }
    public static String  isaddmsg() {
        return getDriver().findElement(addmgs).getText();
    }
}




