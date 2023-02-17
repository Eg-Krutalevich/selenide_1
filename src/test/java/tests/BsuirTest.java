package tests;

import base.BaseTest;
import consts.TestConst;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.bsuir.BsuirAccountPage;
import pages.bsuir.BsuirMainPage;
import pages.bsuir.BsuirSchedulePage;

import java.io.File;

public class BsuirTest extends BaseTest {

    @Test
    public void checkTeacher() {
        BsuirMainPage mainPage = new BsuirMainPage(TestConst.URL_BSUIR);
        mainPage.loginAs(TestConst.INPUT_LOGIN, TestConst.INPUT_PASSWORD);

        BsuirAccountPage account = new BsuirAccountPage(TestConst.URL_BSUIR);
        account.clickSchedule();

        BsuirSchedulePage schedule = new BsuirSchedulePage(TestConst.URL_BSUIR);
        schedule.setTeacher(TestConst.SEARCH_NAME);
        schedule.showAnnounceTeacher();

        schedule.clickWeek();

        File file = schedule.clickDownland();
        Assert.assertTrue(file.canExecute());
        Assert.assertTrue(file.exists());

    }

}
