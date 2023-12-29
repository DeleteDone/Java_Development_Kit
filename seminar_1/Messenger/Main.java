package ru.geekbrains.seminar_2;

import ru.geekbrains.seminar_2.client.ClientWindow;
import ru.geekbrains.seminar_2.server.ServerWindow;

/**
 * Класс Main - точка входа в программу.
 * Создает окно сервера и два окна для клиентов.
 */
public class Main {
    public static void main(String[] args){
        ServerWindow serverWindow = new ServerWindow();
        new ClientWindow(serverWindow);
        new ClientWindow(serverWindow);
    }
}
