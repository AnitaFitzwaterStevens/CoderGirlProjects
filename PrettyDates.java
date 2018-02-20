package com.company;

public class PrettyDates {
    // -- add methods here to make the program work --
    // formatNumberAsTwoDigits
    public static String formatNumberAsTwoDigits(int num) {
        if (num <= 9) {
            return "0" + num;
        } else {
            return "" + num;
        }
        }

    // nameFormat
    public static String nameFormat(int month, int day, int year) {
        if (1 == (month)) {
            return "January";
        } else if (2 == (month)) {
            return "February";
        } else if (3 == (month)) {
            return "March";
        } else if (4 == (month)) {
            return "April";
        } else if (5 == (month)) {
            return "May";
        } else if (6 == (month)) {
            return "June";
        } else if (7 == (month)) {
            return "July";
        } else if (8 == (month)) {
            return "August";
        } else if (9 == (month)) {
            return "September";
        } else if (10 == (month)) {
            return "October";
        } else if (11 == (month)) {
            return "November";
        } else if (12 == (month)) {
            return "December";
        } else {
            return "";
        }

        }


        // slashFormat
        public static String slashFormat(int month, int day, int year) {
            return (formatNumberAsTwoDigits(month) + "/" + formatNumberAsTwoDigits(day) + "/" + year);
        }



        // dashFormat
        public static String dashFormat(int month, int day, int year){
            return (formatNumberAsTwoDigits(month) + "-" + formatNumberAsTwoDigits(day) + "-" + year);

        }
        // -- end of your work area --

        // don't change this code.
        public static void printDate (int year, int month, int day){
            System.out.println(nameFormat(year, month, day));
            System.out.println(slashFormat(year, month, day));
            System.out.println(dashFormat(year, month, day));
            System.out.println();
        }
        // don't change this code.
        public static void main (String[] args)
        {
            System.out.println(formatNumberAsTwoDigits(3));
            System.out.println(formatNumberAsTwoDigits(9));
            System.out.println(formatNumberAsTwoDigits(10));
            System.out.println(formatNumberAsTwoDigits(12));

            printDate (2014, 10, 4);
            printDate(2015, 1, 1);
            printDate(2013, 12, 31);
        }
    }


