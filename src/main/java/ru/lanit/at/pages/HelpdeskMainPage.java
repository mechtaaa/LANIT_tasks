package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главное меню (блок элементов)
 */
@Name(value = "HelpdeskMainPage")
public class HelpdeskMainPage extends WebPage {

    @Name(value = "кнопка логина")
    private SelenideElement logInButton = $x("//a[@id='userDropdown']");

    @Name(value = "кнопка создания нового тикета")
    private SelenideElement newTicketButton = $x("//span[contains(text(),'New Ticket')]");
}