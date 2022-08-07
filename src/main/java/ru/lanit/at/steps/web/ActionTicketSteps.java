package ru.lanit.at.steps.web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.*;
import ru.lanit.at.utils.selenide.DriverManager;
import ru.lanit.at.utils.web.pagecontext.PageManager;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import java.io.File;
import java.time.Duration;

import static ru.lanit.at.utils.FileUtil.searchFileInDirectory;
import static ru.lanit.at.utils.VariableUtil.replaceVars;

public class ActionTicketSteps extends AbstractWebSteps {

    public ActionTicketSteps(PageManager pageManager) {
        super(pageManager);
    }

    @Пусть("Откроем url {string}")
    public void openUrl(String url) {
        DriverManager.startDriver();
        Selenide.open(url);
    }

    @Тогда("Инициализация страницы {string}")
    @И("Переход на страницу {string}")
    public void setPage(String pageName) {
        WebPage page = getPage(pageName);
        pageManager.setCurrentPage(page);
    }

    @Тогда("Нажимаем на кнопку {string}")
    public void clickOnElement(String elementName) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement(elementName);
        element
                .shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
        LOGGER.info("клик на элемент '{}'", elementName);
    }

    @Когда("Вводим в поле {string} значение {string}")
    public void fillTheField(String field, String value) {
        value = replaceVars(value, getStorage());
        SelenideElement fieldElement = pageManager
                .getCurrentPage()
                .getElement(field);
        fieldElement
                .shouldBe(Condition.visible, Duration.ofSeconds(20))
                .setValue(value);
        LOGGER.info("в поле '{}' введено значение '{}'", field, value);
    }

    @Тогда("Выберем в поле {string} значение {string}")
    public void queueMethod(String field, String text) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement(field);
        element
                .shouldBe(Condition.visible, Duration.ofSeconds(20))
                .selectOptionContainingText(text);
        LOGGER.info("элемент '{}' содержит текст '{}'", field, text);
    }

    @Тогда("Добавим в элемент {string} файл {string}")
    public void addFile(String elementName, String fileName) {
        File file = searchFileInDirectory("src/main/resources/Test.txt", fileName);
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement(elementName);
        element
                .uploadFile(file);
        LOGGER.info("в элемент '{}' добавлен файл '{}'", elementName, fileName);
    }
}