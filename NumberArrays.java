package com.company;

public class NumberArrays {

    public static void main(String[] args) {
        int weekOne[] = new int[8];
        weekOne[0] = 65;
        weekOne[1] = 68;
        weekOne[2] = 72;
        weekOne[3] = 83;
        weekOne[4] = 73;
        weekOne[5] = 66;
        weekOne[6] = 85;

        int weekTwo[] = new int[8];
        weekTwo[0] = 86;
        weekTwo[1] = 87;
        weekTwo[2] = 85;
        weekTwo[3] = 78;
        weekTwo[4] = 79;
        weekTwo[5] = 78;
        weekTwo[6] = 80;

        System.out.println("Week 1 High Temperatures");
        for (int highs = 0; highs < 6; highs++) {
            System.out.print(weekOne[highs] + ", ");

        }
        System.out.println("");
        System.out.println("");

        System.out.println("Week 2 High Temperatures");
        for (int highs = 0; highs < 6; highs++) {
            System.out.print(weekTwo[highs] + ", ");

        }
        System.out.println("");
        System.out.println("");

        //calculate the average for week one
        int sum = 0;
        for (int total = 0; total < weekOne.length; total++) {
            sum += weekOne[total];
        }
        float average = sum / (float) weekOne.length;
        System.out.println("The average daily high temperature for week 1 is " + average + ".");

        int sum2 = 0;
        for (int total = 0; total < weekTwo.length; total++) {
            sum2 += weekTwo[total];
        }
        float averageTwo = sum2 / (float) weekTwo.length;
        System.out.println("The average daily high temperature for week 2 is " + averageTwo + ".");

//Create code to find highest temp in each week, see where in the array it falls, and label the day of the week for that position.

        int highTemp1 = weekOne[0];
        for (int max = 1; max < weekOne.length; max++) {
            if (weekOne[max] > highTemp1) {
                highTemp1 = weekOne[max];
            }
        }
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("");

            System.out.println("The highest temperature in week 1 was " + highTemp1 + " on " + dayOfWeek[6] + ".");


            int highTemp2 = weekTwo[0];
            for (int max = 1; max < weekTwo.length; max++) {
                if (weekTwo[max] > highTemp2) {
                    highTemp2 = weekTwo[max];
                }
            }
            System.out.println("");
            System.out.println("The highest temperature in week 2 was " + highTemp2 + " on " + dayOfWeek[1] + ".");


        }
    }


