package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница отдельного тикета (авторизированный пользователь)
 */
@Name(value = "TicketPage")
public class TicketPage extends WebPage {

    @Name(value = "поле dueDate")
    private SelenideElement dueDate = $x("//th[text()='Due Date']/following-sibling::td[1]");

    @Name(value = "поле title")
    private SelenideElement title = $x("//h3");

    @Name(value = "поле queue")
    private SelenideElement queue = $x("//th[contains(text(), 'Queue:')]");

    @Name(value = "поле email")
    private SelenideElement email = $x("//th[text()='Submitter E-Mail']/following-sibling::td[1]");

    @Name(value = "поле priority")
    private SelenideElement priority = $x("//th[text()='Priority']/following-sibling::td[1]");

    @Name(value = "поле description")
    private SelenideElement description = $x("//h4[text()='Description']/following-sibling::p[1]");

    @Name(value = "кнопка Attach File(s)")
    private SelenideElement attachFileButton = $x("//button[@id='ShowFileUpload']");

    @Name(value = "кнопка Browse")
    private SelenideElement browseButton = $x("//input[@type='file']");

    @Name(value = "имя прикрепленного файла")
    private SelenideElement fileName = $x("//span[@id='selectedfilename0']");

    @Name(value = "кнопка Update This Ticket")
    private SelenideElement updateThisTicketButton = $x("//button[@class='btn btn-primary float-right']");

    @Name(value = "поле Updated")
    private SelenideElement updated = $x("//h5[contains(text(), 'Updated')]");

    @Name(value = "поле поиска")
    private SelenideElement inputSearch = $x("//input[@id='search_query']");

    @Name(value = "кнопка Go")
    private SelenideElement goButton = $x("//nav//button[@type='submit']");
}

