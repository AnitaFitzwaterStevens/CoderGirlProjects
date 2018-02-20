package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing == true) {
            out.println("Are we there yet?");
            String answer = keyboard.nextLine();
            if (answer.equals("yes")) {
                keepGoing = false;
                out.println("Yay!");
                if (answer.equals("no")) {
                    keepGoing = true;
                } else {
                    out.println("Huh? I don't understand.");


                }

            }
        }
    }
}



