package com.saiketsystems;

public class Feedback {
    public static boolean checkGuess(int guess, int secretNumber) {
        if (guess < secretNumber) {
            System.out.println("Tahmininiz çok düşük.");
            return false;
        } else if (guess > secretNumber) {
            System.out.println("Tahmininiz çok yüksek.");
            return false;
        } else {
            System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz.");
            return true;
        }
    }
}
