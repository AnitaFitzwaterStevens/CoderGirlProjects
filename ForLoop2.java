package com.company;
import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int gridWidth = keyboard.nextInt();
        for (int counter = 0; counter <gridWidth + 1; counter++) {
            System.out.print("#");

        }
    }
}
