package com.company;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100.  Guess what number it is!");

        int number = (int) (Math.random() * 100) + 1;
        int numberGuess;
        do {
            numberGuess = keyboard.nextInt();
            if ((numberGuess < 1) || (numberGuess > 100)) {
                System.out.println("That number is not in range.  Try again.");
            } else if (numberGuess > number) {
                System.out.println("Nope!  Too high! Try again.");

            } else if (numberGuess < number) {
                System.out.println("Nope! Too low! Try again.");

            } else if (numberGuess == number) {
                System.out.println("You guessed my number!");
                break;
            }
        } while ((number > 1) || (number < 100) || (numberGuess < number) || (numberGuess> number));

    }
}