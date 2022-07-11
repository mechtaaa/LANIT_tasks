package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import static io.restassured.RestAssured.given;


/** Абстрактный класс, содержащий общие для всех тестов методы */
public abstract class BaseTest {
     @BeforeClass
    public void prepare() throws IOException  {
          System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
      //   todo: загрузить в системные переменные "base.uri" из "config.properties"
          String baseUri = System.getProperty("base.uri");
         if (baseUri == null || baseUri.isEmpty()) {
             throw new RuntimeException("В файле \"resources\"config.properties\" отсутствует значение \"base.uri\"");
         }
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://at-sandbox.workbench.lanit.ru/")
                .addHeader("Authorization", "Token " + "0979e0b6ce2e2d74f7c0ffbf4d28cdfe9dd1cb47")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        // todo: подготовить глобальные преднастройки для запросов
    }

    protected AuthToken login(){
        // todo: отправить запрос на получения токена, используя учетные данные из "config.properties"
AuthToken login = new AuthToken();
login.setUsername(System.getProperty("username"));
login.setPassword(System.getProperty("password"));
        return login;
    }

    protected Ticket buildNewTicket(Status status, int priority) {
         Ticket ticketOne = new Ticket();
        ticketOne.setDue_date("2022-06-28");
        ticketOne.setAssigned_to("admin");
        ticketOne.setTitle("problem");
        ticketOne.setCreated("2022-06-02T13:14:55.160Z");
        ticketOne.setModified("2022-06-02T13:14:55.160Z");
        ticketOne.setSubmitter_email("admin@example.org ");
        ticketOne.setStatus(status.getCode());
        ticketOne.setOn_hold(true);
        ticketOne.setDescription("test");
        ticketOne.setResolution("string");
        ticketOne.setPriority(priority);
        ticketOne.setSecret_key("14a25e73-796b-4f41-a345-7b8aaf82e30b");
        ticketOne.setQueue(1);
        ticketOne.setKbitem(1);
        ticketOne.setMerged_to(2);
        // todo: создать объект с тестовыми данными
        return ticketOne;
    }

    protected Ticket createTicket(Ticket ticket){

        // todo: отправить HTTP запрос для создания тикета
        return given()
                .body(ticket)
                .when()
                .post("/api/tickets")
                .then().statusCode(201).extract().body().as(Ticket.class);
    }
}