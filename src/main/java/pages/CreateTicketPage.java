package pages;

import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static models.Dictionaries.getPriority;
import static models.Dictionaries.getQueue;

/** Страница создания тикета */
public class CreateTicketPage extends HelpdeskBasePage {
    // todo: добавить элементам локтаоры через @FindBy
    @FindBy(xpath = "//select[@id='id_queue']")
    private WebElement selectQueue;
    public void setSelectQueue(){
        selectQueue.click();
    }

    @FindBy(xpath="//input[@id='id_title']")
    private WebElement inputProblem;
    @Step("Ввести имя проблемы: {text}")
    public void setInputProblem(String text) {
        inputProblem.sendKeys(text);
    }

    @FindBy(xpath="//textarea[@name='body']")
    private WebElement inputDescription;
    @Step("Заполнить поле описание: {text}")
    public void setInputDescription(String text){
        inputDescription.sendKeys(text);
    }

    @FindBy(xpath="//select[@id='id_priority']")
    private WebElement selectPriority;
    @Step("Выбрать приоритет")
    public void setSelectPriority(){
        selectPriority.click();
    }

    @FindBy(xpath="//input[@name='due_date']")
    private WebElement inputDueDate;
    @Step("Ввести дату: {text}")
    public void setInputDueDate(String text){
        inputDueDate.sendKeys(text);
    }

    @FindBy(xpath="//input[@name='submitter_email']")
    private WebElement inputMail;
    @Step("Ввести mail: {text}")
    public void setInputMail(String text){
        inputMail.sendKeys(text);
    }

    @FindBy(xpath="//button[@type='submit']")
    private WebElement submitTicketButton;
    @Step("Нажать на кнопку создания тикета")
    public void clickOnSubmitButton() {
        submitTicketButton.click();
    }
    public void selectQueueMethod(int queue) {
        Select select = new Select(selectQueue);
        select.selectByVisibleText(getQueue(queue));
    }
    public void selectPriorityMethod(int priority) {
        Select select = new Select(selectPriority);
        select.selectByVisibleText(getPriority(priority));
    }

    public CreateTicketPage() {
        PageFactory.initElements(driver, this);
    }

    // todo: добавить остальные поля формы

    // todo: проинициализировать элементы

    @Step("Создать тикет")
    public CreateTicketPage createTicket(Ticket ticket) {
        selectQueueMethod(ticket.getQueue());
        setInputProblem(ticket.getTitle());
        setInputDescription(ticket.getDescription());
        selectPriorityMethod(ticket.getPriority());
        setInputDueDate(ticket.getDue_date());
        setInputMail(ticket.getSubmitter_email());
        clickOnSubmitButton();
        return this;
    }
}