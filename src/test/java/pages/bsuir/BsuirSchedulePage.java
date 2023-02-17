package pages.bsuir;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import exceptions.TimeOut;
import org.openqa.selenium.Keys;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$x;

public class BsuirSchedulePage {
    private final SelenideElement textTeacher = $x("//input[@type=\"search\"]");
    private final SelenideElement articleTitles = $x("//div[@class=\"ScheduleTargetDetailsCard_controlsContainer__1ED6E\"]/button[@aria-label]");
    private final SelenideElement buttonExit = $x("//button[@aria-label=\"Close\"]//span[@class=\"ant-modal-close-x\"]");
    private final SelenideElement buttonWeek = $x("//label[@class=\"ant-checkbox-wrapper\"]//input[@type=\"checkbox\"]");
    private final SelenideElement buttonDownland = $x("//button[@aria-label=\"download schedule .xls\"]");

    public BsuirSchedulePage(String url) {
        Selenide.open(url + "/schedule");
    }

    public void setTeacher(String name) {
        textTeacher.setValue(name);
        textTeacher.sendKeys(Keys.ENTER);
    }

    public void showAnnounceTeacher() {
        articleTitles.click();
        exitAnnounce();
        TimeOut.threadSleep();
    }

    public void clickWeek() {
        buttonWeek.click();
    }

    public File clickDownland() {
        File file;
        try {
            file = buttonDownland.download();
        } catch (FileNotFoundException e) {
            return null;
        }
        return file;
    }


    private void exitAnnounce() {
        buttonExit.click();
    }
}
