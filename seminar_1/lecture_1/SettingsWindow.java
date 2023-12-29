package ru.geekbrains.lecture_1;

import ru.geekbrains.lecture_1.GameWindow;

import javax.swing.*;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 350;
    JButton btnStart = new JButton("НАЧАТЬ НОВУЮ ИГРУ");

    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        btnStart.addActionListener(e -> {
            GameWindow.startNewGame(0, 3, 3, 3);
            setVisible(false);
        });
        add(btnStart);
    }
}
