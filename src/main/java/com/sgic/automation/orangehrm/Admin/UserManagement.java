package com.sgic.automation.orangehrm.Admin;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class UserManagement extends PageBase {
    public SoftAssert softAssert;

    private static By username=By.id("searchSystemUser_userName");
    private static By userole=By.id("searchSystemUser_userType");
    private static By employeename=By.xpath("//*[@id=\"searchSystemUser_employeeName_empName\"]");
    private static By Status=By.id("searchSystemUser_status");

    private static By searchBtn=By.id("searchBtn");
    private static By resetBtn=By.id("resetBtn");
    private static By addBtn=By.id("btnAdd");
    private static By deleteBtn=By.id("btnDelete");

    public static void setUsername (String userName) {
        getDriver().findElement(username).sendKeys(userName);
    }

    public static void setEmployeename (String employeeName) {
        getDriver().findElement(employeename).sendKeys(employeeName);
    }

}
