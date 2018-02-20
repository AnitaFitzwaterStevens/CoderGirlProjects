package com.company;

public class LeapYear {

static boolean isLeapYear(int a) {
    if (a > 500 && (a < 5000)) {
        if (a % 4 == 0 && (!(a % 100 == 0))) {
            return true;
        }else if ((a % 100 == 0 && (a % 400 == 0))) {
            return true;
        } else {
            return false;
        }
        } return true;
}


public static void main(String[] args) {
        System.out.println("Testing your code!");
        int testFailures = 0;

        if (!isLeapYear(1600)) {
            System.out.println("Error!  Your code failed.  1600 was a leap year, but the test returned false.");
            testFailures++;
        }

        if (!isLeapYear(2000)) {
            System.out.println("Error! Your code failed.  2000 was a leap year, but the test returned false.");
            testFailures++;

        }
        if (!isLeapYear(2400)) {
            System.out.println("Error! Your code failed. 2400 (unless the sky falls) will be a leap year, but the test returned false.");
            testFailures++;
        }
        if (!isLeapYear(1988)) {
            System.out.println("Error! Your code failed.  1988 was a leap year, but the test returned false.");
            testFailures++;

        }
        if (!isLeapYear(1996)) {
            System.out.println("Error! Your code failed. 1996 was a leap year, but the test returned false.");
            testFailures++;
        }
        if (!isLeapYear(2004)) {
            System.out.println("Error! Your code failed. 2004 was a leap year, but the test returned false.");
            testFailures++;
        }
        if (!isLeapYear(4000)) {
            System.out.println("Error! Your code failed.  4000 (if the planet is here) will be a leap year, but the test returned false.");
            testFailures++;
        }
        if (isLeapYear(1800)) {
            System.out.println("Error! Your code failed. 1800 was not a leap year, but the test returned true.");
            testFailures++;
        }
        if (isLeapYear(1900)) {
            System.out.println("Error! Your code failed.  1900 was not a leap year, but the test returned true.");
            testFailures++;

        }
        if (isLeapYear(2200)) {
            System.out.println("Error! Your code failed. 2200 (unless the cats rise up) will not be a leap year, but the test returned true.");
            testFailures++;
        }
        if (isLeapYear(1987)) {
            System.out.println("Error! Your code failed. 1987 was not a leap year, but the test returned true.");
            testFailures++;
        }
        if (isLeapYear(1999)) {
            System.out.println("Error! Your code failed. 1999 was not a leap year, but the test returned true.");
            testFailures++;
        }
        if (isLeapYear(2006)) {
            System.out.println("Error! Your code failed. 2006 was not a leap year, but the test returned true.");
            testFailures++;
        }
        if (testFailures == 0) {
            System.out.println("Nice work! Your code passed all the tests!");
        } else {
            System.out.println("Sorry! Your code failed " + testFailures + " tests. Keep trying!");
        }

    }
}

