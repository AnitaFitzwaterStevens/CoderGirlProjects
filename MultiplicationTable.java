package com.company;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables!");
        System.out.println("");
        System.out.println("");
        System.out.println("How large do you want to see them?");
        int tableSize = keyboard.nextInt();
        if (tableSize < 1 || tableSize > 20) {
            System.out.println("Sorry, your size exceeds our limits.");
            System.exit(0);
        }
        for (int alpha = 0; alpha < tableSize + 1; alpha++) {
            for(int beta = 0; beta < tableSize + 1; beta++) {
                int carrot = alpha * beta;
                System.out.println(alpha + " * " + beta + " = " + carrot);


        }
        }

        }
    }

