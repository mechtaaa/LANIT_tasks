package api;


import model.Ticket;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static model.Status.CLOSED;
import static model.Status.OPEN;

/** Обновление тикета */
public class UpdateTicketTest extends BaseTest {

   @Test
    public void updateTicketTest() {
      Ticket ticket = createTicket(buildNewTicket(CLOSED, 1));
      updateTicketNegative(ticket);
        // todo: создать тикет со статусом Closed, затем обновить тикет и проверить сообщение об ошибке (негативный сценарий)
    }

    private void updateTicketNegative(Ticket ticket) {
      Ticket ticket1 = new Ticket();
      ticket1.setStatus(1);
      given()
              .body(ticket1)
              .pathParam("id", ticket.getId())
              .when()
              .put("/api/tickets/{id}")
              .then().statusCode(400);

        // todo: отправить HTTP запрос для обновления данных тикета и сразу же проверить статус код (должен соответствовать ошибке)
    }
}




























