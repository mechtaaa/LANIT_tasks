package api;

import model.Ticket;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static model.Status.OPEN;

/** Создание и проверка тикета */
public class CreateTicketTest extends BaseTest {

     @Test
    public void createTicketTest(){
         given()
                 .body(createTicket(buildNewTicket(OPEN, 1)));

         given()
                 .body(getTicket(2718));

        // todo: создать тикет и проверить, что он находится в системе
    }

    protected Ticket getTicket(int id) {
        // todo: отправить HTTP запрос на получение тикета по его id
        return  given()
                .pathParam("id", id)
                .when()
                .get("api/tickets/{id}")
                .then().statusCode(200).extract().body().as(Ticket.class);

    }
}