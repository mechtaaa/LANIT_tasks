package pages;


import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


import javax.imageio.ImageIO;
import java.io.File;

import static models.Dictionaries.getPriority;
import static models.Dictionaries.getQueue;

/** Страница создания тикета */
public class CreateTicketPage extends HelpdeskBasePage {
    // todo: добавить элементам локтаоры через @FindBy
    @FindBy(xpath = "//select[@id='id_queue']")
    private WebElement selectQueue;
    @Step("Ввести очередь")
    public void setSelectQueue(){
        selectQueue.click();
        getScreenShot("setSelectQueue");
    }

    @FindBy(xpath="//input[@id='id_title']")
    private WebElement inputProblem;
    @Step("Ввести имя проблемы: {text}")
    public void setInputProblem(String text) {
        inputProblem.sendKeys(text);
        getScreenShot("setInputProblem");
    }

    @FindBy(xpath="//textarea[@name='body']")
    private WebElement inputDescription;
    @Step("Заполнить поле описание: {text}")
    public void setInputDescription(String text){
        inputDescription.sendKeys(text);
        getScreenShot("setInputDescription");
    }

    @FindBy(xpath="//select[@id='id_priority']")
    private WebElement selectPriority;
    @Step("Выбрать приоритет")
    public void setSelectPriority(){
        selectPriority.click();
        getScreenShot("setSelectPriority");
    }

    @FindBy(xpath="//input[@name='due_date']")
    private WebElement inputDueDate;
    @Step("Ввести дату: {text}")
    public void setInputDueDate(String text){
        inputDueDate.sendKeys(text);
        getScreenShot("setInputDueDate");
    }

    @FindBy(xpath="//input[@name='submitter_email']")
    private WebElement inputMail;
    @Step("Ввести mail: {text}")
    public void setInputMail(String text){
        inputMail.sendKeys(text);
        getScreenShot("setInputMail");
    }

    @FindBy(xpath="//button[@type='submit']")
    private WebElement submitTicketButton;
    @Step("Нажать на кнопку создания тикета")
    public void clickOnSubmitButton() {
        submitTicketButton.click();
        getScreenShot("clickOnSubmitButton");
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
        getScreenShot("createTicket");
        return this;
    }
}