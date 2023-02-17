package pages.apple;
/*
 * Главная страница сайта AppleInsider
 */

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class AppleMainPage {

    private final SelenideElement textBoxInput = $x("//input[@type=\"text\"]");

    public AppleMainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте среди статей и нажимается кнопка Enter
     *
     * @param searchString поисковая строка
     */

    public void search(String searchString) {
        textBoxInput.setValue(searchString); //передает значение поиска
        textBoxInput.sendKeys(Keys.ENTER); //ввод чего-то
    }
}
