package com.company;
import java.util.Scanner;

public class Validator {

    public static int getIntegerBetween(int lower, int upper) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        do {
            number = keyboard.nextInt();

            if (number < lower || number > upper)
            {
                System.out.println("That number is not in range.  Try again.");

            }

        } while (number < lower || number > upper);
        return number;
    }



    public static int getTensInteger(int lower, int upper) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        do {
            number = keyboard.nextInt();

            if ((number % 10 != 0) || ((number < lower) || (number > upper)))
            {
                System.out.println("Error.  Invalid number entered.  Try again.");
            }
        } while ((number % 10 != 0) || (number < lower || number > upper));
        return number;
    }


    public static void main(String[] args) {

        System.out.println("Please enter a number between 1 and 10.");
        int firstNumber = getIntegerBetween(1, 10);


        System.out.println("Please enter a number between 200 and 3000 that is a multiple of ten.");
        int secondNumber = getTensInteger(200, 3000);

        System.out.println("You entered " + firstNumber + " and " + secondNumber);
    }
}
