package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница создания тикета
 */
@Name(value = "CreateTicketPage")
public class CreateTicketPage extends WebPage {

    @Name(value = "поле Queue")
    private SelenideElement selectQueue = $x("//select[@id='id_queue']");

    @Name(value = "поле Problem")
    private SelenideElement inputProblem = $x("//input[@id='id_title']");

    @Name(value = "поле Description")
    private SelenideElement inputDescription = $x("//textarea[@id='id_body']");

    @Name(value = "поле Priority")
    private SelenideElement selectPriority = $x("//select[@id='id_priority']");

    @Name(value = "поле DueDate")
    private SelenideElement inputDueDate = $x("//input[@id='id_due_date']");

    @Name(value = "кнопка Submit Ticket")
    private SelenideElement submitTicketButton = $x("//button[@class='btn btn-primary btn-lg btn-block']");
}