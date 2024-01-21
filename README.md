﻿# Java_Development_Kit
## Урок 1. Графические интерфейсы
1.	Выполнить все задания семинара, если они не были решены, без ограничений по времени;
2.	Собрать графический интерфейс проекта месседжера (скриншоты можно посмотреть в материалах к уроку)
3.	Отправлять сообщения из текстового поля сообщения в лог по нажатию кнопки или по нажатию клавиши Enter на поле ввода сообщения;
4.	Продублировать импровизированный лог (историю) чата в файле;
5.	При запуске клиента чата заполнять поле истории из файла, если он существует. Обратите внимание, что чаще всего история сообщений хранится на сервере и заполнение истории чата лучше делать при соединении с сервером, а не при открытии окна клиента.

## Урок 2. Программные интерфейсы
Переписать клиент-серверное приложение из первой домашки с учетом знаний о интерфейсах. Разделить классы на отдельные классы: "мозг", "визуальная часть", "репозиторий", 
(возможны еще классы по желанию, их мы обсуждали на семинаре). Для связи между классами использовать интерфейсы в соответствии с пятым принципом солид. Можно работать со своим проектом, 
который вы сдавали в первой домашке, а можно работать с моим проектом (ссылка в материалах к уроку)

[ссылка на вариант дз первого урока](https://github.com/Liberate520/jdk_server_lesson1)

[ссылка на проект с лекции](https://github.com/Liberate520/animation_test)

[ссылка на проект с урока](https://github.com/Liberate520/jdk_server_lesson2)

## Урок 3. Обобщенное программирование
- Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа (но необязательно разного между собой), над которыми должна быть произведена операция. 
- Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
- Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода toString(), возвращающее строковое представление пары.
  
## Урок 4. Коллекции
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
- Табельный номер
- Номер телефона
- Имя
- Стаж

1. Добавить метод, который ищет сотрудника по стажу (может быть список)
2. Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
3. Добавить метод, который ищет сотрудника по табельному номеру
4. Добавить метод добавление нового сотрудника в справочник

## Урок 5. Многопоточность
1. Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти.
2. Вилки лежат на столе между каждой парой ближайших философов.
3. Каждый философ может либо есть, либо размышлять.
4. Философ может есть только тогда, когда держит две вилки — взятую справа и слева.
5. Философ не может есть два раза подряд, не прервавшись на размышления (можно не учитывать)

Описать в виде кода такую ситуацию. Каждый философ должен поесть три раза   
