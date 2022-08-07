package ru.lanit.at.steps.web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Когда;
import ru.lanit.at.actions.WebChecks;
import ru.lanit.at.utils.selenide.command.Commands;
import ru.lanit.at.utils.web.pagecontext.PageManager;

import java.time.Duration;

public class CheckTicketSteps extends AbstractWebSteps {

    public CheckTicketSteps(PageManager pageManager) {
        super(pageManager);
    }

    @Когда("На странице есть элемент {string}")
    public void elementAppearOnThePage(String elementName) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement(elementName);
        WebChecks.elementVisibleOnPage(element, null);
        LOGGER.info("на странице '{}' имеется элемент '{}'", pageManager.getCurrentPage().name(), elementName);
    }

    @Когда("Проверим что элемент {string} содержит текст {string}")
    public void elementContainsText(String elementName, String text) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement(elementName);
        element.execute(Commands.checkSoft(Condition.text(text), Duration.ofSeconds(10)));
        LOGGER.info("элемент '{}' содержит текст '{}'", elementName, text);
    }
}