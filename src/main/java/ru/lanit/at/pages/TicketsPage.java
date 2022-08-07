package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница с таблицей тикетов и фильтрами
 */
@Name(value = "TicketsPage")
public class TicketsPage extends WebPage {

    @Name(value = "таблица тикетов")
    private List<SelenideElement> ticketsHref = Collections.singletonList($x("//div[@class='tickettitle']/a"));

    @Name(value = "кнопка авторизированного пользователя")
    private SelenideElement logInButton = $x("//a[@id='userDropdown']");

    @Name(value = "кнопка создания нового тикета")
    private SelenideElement newTicketButton = $x("//span[contains(text(),'New Ticket')]");

    @Name(value = "вкладка сохранения поиска")
    private SelenideElement saveQueryField = $x("//i[@class='fas fa-save']");

    @Name(value = "поле сохранения поиска")
    private SelenideElement queryName = $x("//input[@id = 'id_title']");

    @Name(value = "кнопка сохранения поиска")
    private SelenideElement saveQueryButton = $x("//input[@value='Save Query']");
}