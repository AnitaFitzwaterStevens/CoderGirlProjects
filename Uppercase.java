package com.company;
import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        char letters[] = {'W', 'h', 'y', ' ', 'i', 's', ' ', 'E', 'a', 's', 't', 'e', 'r', ' ', 'i', 'n', ' ', 't', 'h', 'e', ' ', 'S', 'p', 'r', 'i', 'n', 'g', '?'};
        int newList[]= new int[100];
        for (int index = 0; index < letters.length; index++) {
            int number = (int) letters[index];
            if (number > 96) {
                number = number - 32;

                newList[index] = number;
            } else {
                number = number;

                newList[index] = number;

            }

                System.out.print((char)newList[index]);
            }
            }
        }




