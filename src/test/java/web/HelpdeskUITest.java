package web;

import elements.MainMenu;
import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AbstractPage;
import pages.CreateTicketPage;
import pages.LoginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HelpdeskUITest{

    private WebDriver driver;
    private Ticket ticket;

    @BeforeClass
    public void setup() throws IOException {
        loadProperties();
        System.getProperty("base.uri");
        setupDriver();
    }

    @Step("Загрузить конфигурационные файлы")
    private void loadProperties() throws IOException {
        // Читаем конфигурационные файлы в System.properties
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("user.properties"));
    }

    @Step("Создать экземпляр драйвера")
    private void setupDriver() {
        // Создание экземпляра драйвера
        driver = new ChromeDriver();
        // Устанавливаем размер окна браузера, как максимально возможный
        driver.manage().window().maximize();
        // Установим время ожидания для поиска элементов
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Установить созданный драйвер для поиска в веб-страницах
        AbstractPage.setDriver(driver);
    }

    @Test
    public void createTicketTest() {
        MainMenu mainMenu = new MainMenu(driver);
        CreateTicketPage createTicketPage = new CreateTicketPage();
        LoginPage loginPage = new LoginPage();
        ticket = buildNewTicket();
        driver.get(System.getProperty("site.uri"));
        mainMenu.clickOnNewTicketButton();
        createTicketPage.createTicket(ticket);
        mainMenu.clickOnLogInButton();
        loginPage.login(System.getProperty("user"), System.getProperty("password"));
        mainMenu.clickOnGoButton();
        mainMenu.setInputSearch("Summary of the problem");
        mainMenu.clickOnGoButton();
        // todo: шаги тест-кейса
    }

    private Ticket buildNewTicket() {
        Ticket ticket = new Ticket();
        ticket.setDue_date("2022-06-28 21:15:30");
        ticket.setAssigned_to("user");
        ticket.setTitle("problem");
        //ticket.setCreated("2022-06-02T13:14:55.160Z");
        //ticket.setModified("2022-06-02T13:14:55.160Z");
        ticket.setSubmitter_email("user@example.org ");
        //ticket.setStatus(1);
        //ticket.setOn_hold(true);
        ticket.setDescription("test");
        //ticket.setResolution("string");
        ticket.setPriority(2);
        //ticket.setSecret_key("14a25e73-796b-4f41-a345-7b8aaf82e30b");
        ticket.setQueue(1);
        //ticket.setKbitem(2);
        //ticket.setMerged_to(2);
        return ticket;
        // todo: заполнить поля тикета
    }

   // @AfterTest
    public void close() {
        if (driver != null) {
            // Закрываем одно текущее окно браузера
            driver.close();
            // Закрываем все открытые окна браузера, завершаем работу браузера, освобождаем ресурсы
            driver.quit();
        }
    }
}
