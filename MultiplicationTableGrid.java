package com.company;
import java.util.Scanner;

public class MultiplicationTableGrid {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables!");
        System.out.println("");
        System.out.println("");
        System.out.println("What is the maximum number for your table?");
        int tableSize = keyboard.nextInt();
        while (tableSize > 20 || tableSize < 1) {
            System.out.println("Please enter a number between 1 -20.");
            tableSize = keyboard.nextInt();

        }
        System.out.print("\t");

        for (int columnCounter = 0; columnCounter < tableSize + 1; columnCounter++) {
            System.out.print(columnCounter + "\t");

        }
        System.out.println("");

        for (int columns = 0; columns <= tableSize; columns++) {
                System.out.print(columns + "\t");
                for (int rows = 0; rows <= tableSize; rows++) {
                    System.out.print(columns * rows + "\t");
                }

                System.out.println();
            }

        }
    }

