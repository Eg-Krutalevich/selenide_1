package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract public class BaseTest { //общая конструкция

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome"; //указание браузера
        Configuration.driverManagerEnabled = true; //присутствует библ driverManager
        Configuration.browserSize = "1920x1080"; //разрешение экрана
        Configuration.headless = false; //для Jenkins. Jenkins - сервер
        //headless - создает виртуальный монитор и в нем запускаем хром
        //true - видим экрана, false - нет
        Configuration.reportsFolder = "D:\\upload";
        Configuration.fileDownload = FileDownloadMode.PROXY;
        Configuration.proxyEnabled = true;
    }

    //перевод всеми тестами
    @Before
    public void init() {
        setUp();
    }

    //после всех тестов
    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }


}
