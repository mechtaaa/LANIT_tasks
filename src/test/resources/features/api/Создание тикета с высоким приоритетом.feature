#language:ru
@API
Функционал: Создание api запроса

#  1 - Высокий приоритет

  Сценарий: Создание тикета с высоким приоритетом

    * создать запрос
      | method | path         | body                          |
      | POST   | /api/tickets | createHighPriorityTicket.json |
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
      | ${due_date}        | == | 2022-07-28       |
      | ${assigned_to}     | == | admin            |
      | ${title}           | == | Last Test        |
      | ${submitter_email} | == | admin@example.org|
      | ${status}          | == | 1                |
      | ${priority}        | == | 3                |
      | ${queue}           | == | 2                |
      | ${kbitem}          | == | 2                |
      | ${merged_to}       | == | 2                |