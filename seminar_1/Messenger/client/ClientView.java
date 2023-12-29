package ru.geekbrains.seminar_2.client;

/**
 * Интерфейс ClientView объявляет методы showMessage и disconnectFromServer, реализуемые в классе ClientWindow.
 * Обеспечивает связь между классами Client и ClientWindow.
 */
public interface ClientView {
    void showMessage(String message);

    void disconnectFromServer();
}
