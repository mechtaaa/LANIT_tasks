package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница логина
 */
@Name(value = "LoginPage")
public class LoginPage extends WebPage {

    @Name(value = "поле username")
    private SelenideElement username = $x("//*[@id='username']");

    @Name(value = "поле password")
    private SelenideElement password = $x("//*[@id='password']");

    @Name(value = "кнопка login")
    private SelenideElement loginButton = $x("//*[@value='Login']");
}