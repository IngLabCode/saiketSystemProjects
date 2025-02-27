package com.saiketsystems;

import java.util.Random;
import java.util.Scanner;

public class Game {
   private int secretNumber;
   private int attempts;
   private Scanner scanner;

   public Game(){
       this.secretNumber=new Random().nextInt(100)+1;
       this.attempts=0;
       this.scanner=new Scanner(System.in);
   }

   public void startGame(){
       System.out.println("Welcome to the Number Guessing Game! Guess a number between 1 and 100.");
       boolean isGuessed=false;

       while (!isGuessed){
           int guss=InputHandler.getUserInput(scanner);
           attempts++;
           isGuessed=Feedback.checkGuess(guss,secretNumber);

       }
       System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
   }
}
