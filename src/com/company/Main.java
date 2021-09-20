package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("запускаем игру");
        JFrame window = new JFrame("TicTacToe");// наше главное окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// добавил кнопку Х закрываюшая окно
        window.setSize(400, 400); // размер окна
        window.setLayout(new BorderLayout()); // менедже компоновки
        window.setLocationRelativeTo(null); // окно по центру
        window.setVisible(true); // видимость экрана
        TicTacToe game = new TicTacToe();
        window.add(game);
        System.out.println("конец");
    }

}
