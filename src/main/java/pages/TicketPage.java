package pages;

import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static models.Dictionaries.getPriority;
import static models.Dictionaries.getQueue;

/** Страница отдельного тикета (авторизированный пользователь) */
public class TicketPage extends HelpdeskBasePage {

    /* Верстка страницы может измениться, поэтому для таблиц вместо индексов строк и столбцов лучше использовать
       более универсальные локаторы, например поиск по тексту + parent, following-sibling и другие.

       Текст тоже может измениться, но в этом случае элемент не будет найден и тест упадет,
       а ошибку можно будет легко локализовать и исправить.
       В случае изменений ячеек таблицы, локатор будет продолжать работать, но будет указывать на другой элемент,
       поведение теста при этом изменится непредсказуемым образом и ошибку будет сложно найти. */
    private WebElement dueDate = driver.findElement(By.xpath("//th[text()='Due Date']/following-sibling::td[1]"));

    // todo: проинициализировать элементы через driver.findElement
    private WebElement title = driver.findElement(By.xpath("//th[h3]"));
    private WebElement queue = driver.findElement(By.xpath("//th[contains(text(), 'Queue:')]"));
    private WebElement email = driver.findElement(By.xpath("//th[text()='Submitter E-Mail']/following-sibling::td[1]"));
    private WebElement priority = driver.findElement(By.xpath("//th[text()='Priority']/following-sibling::td[1]"));
    private WebElement description = driver.findElement(By.xpath("//h4[text()='Description']/following-sibling::p[1]"));


    @Step("Проверить значение полей на странице тикета")
    public void checkTicket(Ticket ticket) {
        Assert.assertTrue(title.getText().contains(ticket.getTitle()), "Имя тикета не соответствует");
        Assert.assertTrue(dueDate.getText().contains("July 28, 2022, 9:15 a.m."), "Дата тикета не соответствует");
        Assert.assertTrue(queue.getText().contains(getQueue(ticket.getQueue())), "Имя очереди не соответствует");
        Assert.assertTrue(email.getText().contains(ticket.getSubmitter_email()), "e-mail Не соответствует");
        Assert.assertTrue(priority.getText().contains(getPriority(ticket.getPriority())), "Приоритет не соответствует");
        Assert.assertTrue(description.getText().contains(ticket.getDescription()), "Имя тикета не соответствует");


        // todo: добавить реализацию метода
    }
}