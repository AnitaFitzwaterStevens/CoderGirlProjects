package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class AddingMachine {
    public static void main(String[] args) {
        int oldNumber = 0;
        int repeatCounter = 0;
        System.out.println("Welcome to Adding Machine!");
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing == true) {
            System.out.println("Add:");
            int newNumber = keyboard.nextInt();
            repeatCounter = repeatCounter + 1;
            if (newNumber == 0) {
                keepGoing = false;
                //need a repeat counter to get the number of numbers entered.
                //need a variable that will stand for final total
                System.out.println("Your final total is " + oldNumber + " and you entered " + (repeatCounter -1) + " numbers.");
            } else keepGoing = true;
            //This needs to add the newNumber to the oldNumber and place that in a new variable
            oldNumber = newNumber + oldNumber;


            //Then, the new variable becomes the oldNumber for the next iteration.


        }
    }
}

