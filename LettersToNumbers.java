package com.company;
import java.util.Scanner;
public class LettersToNumbers {
    public static void main(String[] args)
    {
        int numbers[]= {89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33};
        for (int index = 0; index < numbers.length; index++) {
            char letter = (char) numbers[index];
            System.out.print(letter);
        }
        System.out.println("");
        char letters[] = {'C', 'r', 'o', 'w', ' ', 'f', 'l', 'i', 'e', 's', ' ', 'a', 't', ' ', 'd', 'a', 'w', 'n' };
        for (int index = 0; index<letters.length; index++) {
            int number = (int) letters[index];
            System.out.print(number + ",");

        }



    }
}
