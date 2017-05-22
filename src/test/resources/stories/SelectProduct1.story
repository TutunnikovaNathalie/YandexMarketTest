Meta:

Scenario: Выбор продукта в яндекс маркете

When выбран пункт меню "Маркет"

When выбрана группа продуктов с наименованием "<groupName>"
When выбран продукт с наименованием "<productName>"
When задан параметр поиска - цена равна "<price>"
Then значения полей равны:
          |field|
          |Samsung|
          |LG|

When выполнено нажатие на кнопку Применить
Then количество элементов на странице равно "<count>"
When запомнить элемент в списке
When ввести запомненное значение в поиск
When выполнить поиск запомненного значения
Then выполнить проверку: наименование товара соответствует запомненному значению


Examples:
|groupName|productName|price|count|
|Электроника|Телевизоры|20000|12|