package com.company;
import java.util.Scanner;
public class Temperatures {
    public static void main(String[] args) {
        System.out.println("Temperature Calculator");
        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        System.out.println("");
        System.out.println("The temperatures provided are:");

        for (int row = 0; row < 1; row++) {
            System.out.print("7 AM:  ");
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + ", ");
            }


        }
        for (int row = 1; row < 2; row++) {
            System.out.println();
            System.out.print("3 PM:  ");
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + ", ");
            }
        }
        for (int row= 2; row<3; row++) {
            System.out.println();
            System.out.print("7 PM:  ");
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + ", ");

            }
        }
        for (int row = 3; row < 4; row++) {
            System.out.println();
            System.out.print("3 AM:  ");
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + ", ");
            }
        }System.out.println();
        System.out.println();
        System.out.println("Based on our data, here are the average temperatures for the week.");
        System.out.println();


        System.out.print("Sun: ");
        int averageSun = ((temps[0][0] + temps[1][0] + temps [2][0] + temps [3][0])/4);
        System.out.println(averageSun);


        System.out.print("Mon: ");
        int averageMon = ((temps[0][1] + temps[1][1] + temps[2][1] + temps[3][1])/4);
        System.out.println(averageMon);

        System.out.print("Tue: ");
        int averageTue = ((temps[0][2] + temps[1][2] + temps[2][2] + temps[3][2])/4);
        System.out.println(averageTue);

        System.out.print("Wed: ");
        int averageWed = ((temps[0][3] + temps[1][3] + temps[2][3] + temps[3][3])/4);
        System.out.println(averageWed);

        System.out.print("Thur: ");
        int averageThu = ((temps[0][4] + temps[1][4] + temps[2][4] + temps[3][4])/4);
        System.out.println(averageThu);

        System.out.print("Fri: ");
        int averageFri = ((temps[0][5] + temps[1][5] + temps[2][5] + temps[3][5])/4);
        System.out.println(averageFri);

        System.out.print("Sat: ");
        int averageSat = ((temps[0][6] + temps[1][6] + temps[2][6] + temps[3][6])/4);
        System.out.println(averageSat);

        System.out.println();
        System.out.println();
        System.out.print("7 AM: ");
        int averageMorn = ((temps[0][0] + temps[0][1] + temps[0][2] + temps[0][3]+ temps[0][4] + temps[0][5] + temps[0][6])/7);
        System.out.println(averageMorn);

        System.out.print("3 PM: ");
        int averageAft = ((temps[1][0] + temps[1][1] + temps[1][2] + temps[1][3] + temps[1][4] + temps[1][5] + temps[1][6])/7);
        System.out.println(averageAft);

        System.out.print("7 PM: ");
        int averageEve = ((temps[2][0] + temps[2][1] + temps[2][2] + temps[2][3] + temps[2][4] + temps[2][5] + temps[2][6])/7);
        System.out.println(averageEve);

        System.out.print("3 AM: ");
        int averageNight = ((temps[3][0] + temps[3][1] + temps[3][2] + temps[3][3] + temps[3][4] + temps[3][5] + temps[3][6])/7);
        System.out.println(averageNight);
        System.out.println();
        System.out.println();

        System.out.println("The final average temperature for the week was: ");
        System.out.println();
        System.out.println();
        int averageTotal = ((temps[0][0] + temps[0][1] + temps[0][2] + temps[0][3] + temps[0][4] + temps[0][5]
                + temps[0][6] +  temps[1][0] + temps[1][1] + temps[1][2] + temps[1][3] + temps[1][4]
                + temps[1][5] +  temps[1][6] + temps[2][0] + temps[2][1] + temps[2][2] + temps[2][3]
                + temps[2][4] +  temps[2][5] + temps[2][6] + temps[3][0] + temps[3][1] + temps[3][2]
                + temps[3][3] +  temps[3][4] + temps[3][5] + temps[3][6])/28);
        System.out.println("Overall:  " + averageTotal);



            }

            }



