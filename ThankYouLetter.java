package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class ThankYouLetter {


    public static void main(String[] args) {
        System.out.println("---Thank You Letters---");

        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing == true) {
            System.out.println("What is the donor's first name?");
            String firstName = keyboard.nextLine();
            if (firstName.equals("quit")) {
                keepGoing = false;
            } else {
                keepGoing = true;
                System.out.println("What is the donor's last name?");
                String lastName = keyboard.nextLine();
                System.out.println("What is the donation amount?");
                String donationAmount = keyboard.nextLine();
                System.out.println("Dear " + firstName + " " + lastName + ",");
                System.out.println("");
                System.out.print("Thank you for your donation! We rely on donors ");
                System.out.println("like you to keep our");
                System.out.print("organization effective, and you came through for ");
                System.out.println("us. Your donation of $" + donationAmount);
                System.out.print("will help our efforts to make a difference ");
                System.out.println("in the world.");
                System.out.println("");
                System.out.print("As you may know, we are a registered non-profit ");
                System.out.println("organization, so your");
                System.out.print("donation is tax deductible. You may use this ");
                System.out.println("letter as a receipt for tax");
                System.out.println("purposes.");
                System.out.println("");
                System.out.println("Thank you again for your support!");
                System.out.println("");
                System.out.println("Sincerely,");
                System.out.println("Paula Jones");
                System.out.println("YourCharity.org");
            }

        }
    }
}

