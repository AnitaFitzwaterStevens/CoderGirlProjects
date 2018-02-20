package com.company;

public class ManyFunctions {
    /**
     * Takes two integer numbers as input and returns whichever is smaller.
     */
    public static int minimum(int a, int b)
        { if(a > b) {
            return b;
        } else {
            return a;
        }
        }

    /** Takes two integer numbers as input and returns whichever number is larger.
     *
     */
    public static int maximum(int a, int b)
    { if (a > b) {
    return a;
    } else {
        return b;
    }
    }
    /**
     * Returns true if the integer input is an odd number (1, 3, 5, 7...)
     */
    public static boolean isOddNumber(int a) {
        if (a % 2 != 0) {
            return true;
        } else {
            return false;

        }
    }
    public static boolean isEvenNumber(int a)
        { if (a % 2 == 0) {
            return true;
        } else {
            return false;

        }
        }

    /** Returns true if the letter is a vowel, or false otherwise.
     * */
public static boolean isVowel(char a)
{ if ('a'== a) {
return true;
} else if ('A' == a) {
    return true;
} else if ('e'== a) {
    return true;
} else if ('E'== a) {
    return true;
} else if ('i'== a) {
    return true;
} else if ('I'==a) {
    return true;
} else if ('o' ==a) {
    return true;
} else if ('O' ==a) {
    return true;
} else if ('u' ==a) {
    return true;
} else if ('U' ==a) {
    return true;
} else {
    return false;

}
}
public static boolean isConsonant(char a)
{ if ('a'==a) {
return false;
} else if ('A'==a) {
    return false;
} else if ('e'==a) {
    return false;
} else if ('E' ==a) {
    return false;
} else if ('i' ==a) {
    return false;
} else if ('I' ==a) {
    return false;
} else if ('o' ==a) {
    return false;
} else if ('O' ==a) {
    return false;
} else if ('u' ==a) {
    return false;
} else if ('U' ==a) {
    return false;
} else {
    return true;
}
}




    public static void main(String[] args)
        {
            System.out.println("Testing your functions.");
            int testFailures = 0;

            if (minimum(4,3) != 3) {
                System.out.println("Error 1: Minimum failed test. Expected 3, got " + minimum(4, 3));
                testFailures++;
            }
            if (minimum(4,4) != 4) {
                System.out.println("Error 2: Minimum failed test. Expected 4, got " + minimum(4, 4));
                testFailures++;
            }
            if (minimum(3,4) != 3) {
                System.out.println("Error 3: Minimum failed test. Expected 3, got " + minimum(3, 4));
                testFailures++;
            }
            if (minimum(5, 4) !=4) {
                System.out.println("Error 4: Minimum failed test. Expected 4, got " + minimum(5, 4));
                testFailures++;
            }
            if (maximum(4,3) != 4) {
                System.out.println("Error 5: Maximum failed test. Expected 4, got " + maximum(4, 3));

            }
            if (maximum(4, 4) != 4) {
                System.out.println("Error 7: Maxmimum failed test.  Expected 4, got " + maximum(4, 4));
                testFailures++;
            }
            if (maximum(-2, 10) != 10) {
                System.out.println("Error 8: Maxmimum failed test.  Expected 10, got " + maximum(-2, 10));
                testFailures++;

            }
            if (isOddNumber(0)) {
                System.out.println("Error 11: isOdd failed test.  Expected isOdd(0) to be false, but got true.");
                testFailures++;
            }
            if (!isOddNumber(5)) {
                System.out.println("Error 12: isOdd failed test.  Expected isOdd(5) to be true, but got false.");
                testFailures++;
            }
            if (isOddNumber(18)) {
                System.out.println("Error 13: isOdd failed test.  Expected isOdd(18) to be false, but got true.");
                testFailures++;
            }
            if (isEvenNumber(3)) {
                System.out.println("Error 9: isEven failed test.  Expected isEven(3) to be false, but got true.");
                testFailures++;
            }
            if (!isEvenNumber(2)) {
                System.out.println("Error 10: isEven failed test.  Expected isEven(2) to be true, but got false.");
                testFailures++;
            }

            if (!isVowel('a')) {
                System.out.println("Error 14: isVowel failed test.  Expected isVowel('a') to be true, but got false.");
                testFailures++;
            }
            if (isVowel('x')) {
                System.out.println("Error 15: isVowel failed test.  Expected isVowel('x') to be false, but got true.");
                testFailures++;
            }
            if (!isConsonant('z')) {
                System.out.println("Error 16: isConsonant failed test.  Expected isConsonant('z') to be true, but got false.");
                testFailures++;
            }
            if (isConsonant('i')) {
                System.out.println("Error 17: isCononant failed test.  Expect isConsonant('i') to be false, but got true.");
                testFailures++;
            }
            if (!isConsonant('b')) {
                System.out.println("Error 18: isConsonant failed test.  Expected isConsonant('b') to be true, but got false.");
                testFailures++;
            }
            if (!isConsonant('c')) {
                System.out.println("Error 19: isConsonant failed test.  Expected isConsonant('c') to be true, but got false.");
                testFailures++;
            }
            if (!isConsonant('d')) {
                System.out.println("Error 20: isConsonant failed test.  Expected isConsonant('d') to be true, but got false.");
                testFailures++;
            }
            if (!isConsonant('f')) {
                System.out.println("Error 21: isConsonant failed test.  Expected isConsonant('f') to be true, but got false.");
                testFailures++;
            }
            if (!isConsonant('g')) {
                System.out.println("Error 22: isConsonant failed test.  Expected isConsonant('g') to be true, but got false.");
                testFailures++;
            }
            if (!isVowel('A')) {
                System.out.println("Error 23: isVowel failed test.  Expected isVowel('A') to be true, but got false.");
                testFailures++;
            }
            if (isVowel('X')) {
                System.out.println("Error 24: isVowel failed test.  Expected isVowel('X') to be false, but got true.");
                testFailures++;
            }
            if (!isConsonant('Z')) {
                System.out.println("Error 25: isConsonant failed test.  Expected isConsonant('Z') to be true, but got false.");
                testFailures++;
            }
            if (isConsonant('I')) {
                System.out.println("Error 26: isCononant failed test.  Expect isConsonant('I') to be false, but got true.");
                testFailures++;
            }
                if (testFailures == 0) {
                System.out.println("Success! All test cases passed.");
            } else {
                System.out.println(testFailures + " tests failed. Keep trying!");
            }
            }
            }




