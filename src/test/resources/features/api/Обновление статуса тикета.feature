#language:ru
@API
Функционал: Создание api запросов

  #  1 - статус тикета Открыт
  #  4 - статус тикета Закрыт

  Сценарий: Негативная проверка: перевод статуса тикета из "Закрыт" в "Открыт"

    # Авторизуемся и получим токен
    * создать запрос
      | method | path         | body       |
      | POST   | /api/login   | login.json |
    * добавить header
      | Accept       | application/json |
      | Content-Type | application/json |
    * отправить запрос
    * статус код 200
    * извлечь данные
      | token | $.token |
    * сравнить значения
      | ${token} | == | 44bf3e4b4fc998583e7f516de1928b7e025a5978 |

    # Создаем тикет
    * создать запрос
      | method | path          | body                         |
      | POST   | /api/tickets  | createCloseStatusTicket.json |
    * добавить header
      | Accept       | application/json |
      | Content-Type | application/json |
    * отправить запрос
    * статус код 201
    * извлечь данные
      | id              | $.id              |
      | due_date        | $.due_date        |
      | assigned_to     | $.assigned_to     |
      | title           | $.title           |
      | submitter_email | $.submitter_email |
      | status          | $.status          |
      | priority        | $.priority        |
      | queue           | $.queue           |
      | kbitem          | $.kbitem          |
      | merged_to       | $.merged_to       |
    * сравнить значения
      | ${id}              | != | null             |
      | ${due_date}        | == | 2022-07-28      |
      | ${assigned_to}     | == | admin            |
      | ${title}           | == | Last Test        |
      | ${submitter_email} | == | admin@example.org|
      | ${status}          | == | 4                |
      | ${priority}        | == | 3               |
      | ${queue}           | == | 2                |
      | ${kbitem}          | == | 2                |
      | ${merged_to}       | == | 2                |

    # Обновим статус тикета
    * создать запрос
      | method  | path                | body               |
      | PATCH   | /api/tickets/${id}  | setOpenStatus.json |
    * добавить header
      | Accept        | application/json |
      | Content-Type  | application/json |
      | Authorization | Token ${token}   |
    * отправить запрос
    * статус код 422
    * извлечь данные
      | status | $.status |
    * сравнить значения
      | ${status} | == | 1 |

