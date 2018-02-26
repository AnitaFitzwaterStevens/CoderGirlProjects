package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class CountToThirty {
    public static void main(String[] args) {
boolean keepGoing;
        int numberCount = 0;

        while (keepGoing = true) {
            numberCount = numberCount + 1;
            if (((numberCount >= 1) && numberCount<= 30)) {
                System.out.println(numberCount);
                keepGoing = true;

            } else if (numberCount == 31) {
                break;




            }
        }
    }
}
