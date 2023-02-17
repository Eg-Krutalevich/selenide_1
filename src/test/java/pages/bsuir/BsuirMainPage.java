package pages.bsuir;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BsuirMainPage {

    private final SelenideElement textBoxInputLogin = $x("//input[@id=\"normal_login_login\"]");
    private final SelenideElement textBoxInputPass = $x("//input[@id=\"normal_login_password\"]");
    private final SelenideElement buttonEnter = $x("//button[@type=\"submit\"]");

    public BsuirMainPage(String url) {
        Selenide.open(url + "/login");
    }

    public void loginAs(String login, String password) {
        setLogin(login);
        setPassword(password);
        pushButton();
    }

    private void setLogin(String login) {
        textBoxInputLogin.setValue(login);
    }

    private void setPassword(String password) {
        textBoxInputPass.setValue(password);
    }

    private void pushButton() {
        buttonEnter.click();
    }


}
