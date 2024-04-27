package tests;

import base.BaseTest;
import consts.TestConst;
import pages.apple.SearchPage;
import org.junit.Assert;
import org.junit.Test;
import pages.apple.AppleMainPage;

public class AppleTest extends BaseTest {

    @Test
    public void checkHref() {
        AppleMainPage mainPage = new AppleMainPage(TestConst.URL_APPLE);
        mainPage.search(TestConst.SEARCH_STRING);

        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        Assert.assertTrue(href.contains(TestConst.EXPECTED_WORD));
    }
    @Test
    public void checkHref1() {
        AppleMainPage mainPage = new AppleMainPage(TestConst.URL_APPLE);
        mainPage.search(TestConst.SEARCH_STRING);

        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        Assert.assertTrue(href.contains(TestConst.EXPECTED_WORD));
    }


}
