package com.company;
import java.util.Scanner;


public class ForLoop1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int userNumber = keyboard.nextInt();
        for (int counter = 0; counter < userNumber + 1; counter++) {
            System.out.println(counter);
        }

    }
}