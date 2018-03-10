package com.company;
import java.util.Scanner;
public class ASCiiPractice {
    public static void main(String[] args)
    {
        for (int line = 32; line < 256; line++) {
            System.out.println(line + "\t" + ((char) line));
        }

    }

}
