package org.vincent;

import org.vincent.game.GameMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameMenu.gameMenuInterface(scanner);
        scanner.close();

    }
}