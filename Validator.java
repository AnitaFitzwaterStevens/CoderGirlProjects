package com.company;

import static java.lang.System.out;

import java.util.Scanner;

public class Validator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10.");
        int firstNumber = getIntegerBetween(1, 10);
        do {
            firstNumber = keyboard.nextInt();
            boolean keepGoing;
            keepGoing = true;
            if ((firstNumber < 1) || (firstNumber > 10)) {
                System.out.print("Sorry, that number isn't in range. Try again.");
                keepGoing = false;
            } else {
                System.out.println("Please enter a number between 200 and 3000 that is divisible by 10.");
                int secondNumber = getTensInteger(200, 3000);
                secondNumber = keyboard.nextInt();
                keepGoing = true;
                if ((secondNumber % 10 != 0) && ((secondNumber < 200) || (secondNumber > 3000))) {
                    System.out.println("Error. That is not a valid number.  Try again.");
                    keepGoing = true;
                } else {
                    System.out.println("You entered " + firstNumber + " and " + secondNumber);
                }
            }
        } while (!keepGoing);
        System.out.println("Thank you for using the Validator.");

    }
}











