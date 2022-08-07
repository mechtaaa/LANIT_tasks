#language:ru
@googleFragment
Функционал: Поиск гугл

  Сценарий: Открытие двух фрагментов - страницы google.com и виджета погоды

    * шаг № "1"
    * вызвать фрагмент "открытие страницы google"

    * на странице отсутствует текст "погода в ижевске"

    * шаг № "2"
    * вызвать фрагмент "открытие виджета"

  @googleDynamicFragment
  Сценарий: Открытие двух фрагментов - страницы google.com и виджета погоды с использованным динамического фрагмента
    * шаг № "1"
    * вызвать фрагмент "открытие страницы и ввод текста из параметра"
      | текст_для_ввода | погода в москве |

    * на странице отсутствует текст "погода в ижевске"

    * шаг № "2"
    * вызвать фрагмент "открытие виджета"