package com.saiketsystems;

import java.util.Scanner;

public class InputHandler {
    public static int getUserInput(Scanner scanner) {
        int guess = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Tahmininizi girin: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
                scanner.next();
            }
        }
        return guess;
    }
}
