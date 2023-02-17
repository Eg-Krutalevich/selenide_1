package pages.bsuir;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BsuirAccountPage {
    private final SelenideElement buttonSchedule = $x("//div[@class=\"Sidebar_navigationItemsContainer__3IgK9 Sidebar_navigationItemsContainer_color\"]//a[1]");

    public BsuirAccountPage(String url) {
        Selenide.open(url + "/personal-account/profile");
    }

    public void clickSchedule() {
        buttonSchedule.click();
    }
}
