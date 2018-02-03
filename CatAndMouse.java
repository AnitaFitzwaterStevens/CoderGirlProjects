package com.company;
import static java.lang.System.out;
import java.util.Scanner;
public class CatAndMouse

{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("You are a small, hungry field mouse.  You find yourself standing");
        out.println(" in a mouse hole in the");
        out.print("kitchen of a farm house. In  the room is a bowl of cat food");
        out.println(" that smells really tasty. A");
        out.println("young cat is sleeping on a rug in the middle of the room.");
        out.println("");
        out.print("Looking around the room, you see a wooden table with chairs,");
        out.println(" a metal floor lamp, and");
        out.println("curtains over a window. You can smell a summer breeze blowing in.");
        out.println("Where do you go? Options: chair, table, lamp, food, curtain.");

        String choice = keyboard.nextLine();
        if (choice.equals("chair")) {
            out.print("You sneak quietly to the chair and climb its rough wood.");
            out.println(" The only place you can reach");
            out.print("from here is the table, so you climb it too. Looking around");
            out.println(" from the table, you see two");
            out.print("paths. You can walk across the countertop to the open window,");
            out.println(" or you can climb down");
            out.print("the table leg to the floor.");
            out.println("");
            out.println("Where do you go? Options: window, floor.");
            String afterChair = keyboard.nextLine();
            if (afterChair.equals("window")) {
                out.print("You climb out the window and down. The tall grass");
                out.println(" hides you well. You find some tasty");
                out.print("spilled grain. By the time you get to the barn,");
                out.println(" you are well fed, and ready to take a nap");
                out.print("in the hay. There is no cat in the barn. You're");
                out.println(" a happy mouse. You win!");
            } else if (afterChair.equals("floor")) {
                    out.print("You try to climb down the table leg but it's");
                    out.println(" too slippery. Thump! You hit the floor with a");
                    out.print("bang. The cat wakes up and chases you around the");
                    out.println(" kitchen! You race back to your hole,");
                    out.println("still hungry, and hide for the rest of the day. Play again later!");
            } else {
                out.println("Oops! You didn't choose a valid option.");
            }
        } else if (choice.equals("table")) {
            out.print("You sneak quietly to the table. The legs are polished and ");
            out.println("you fall with a");
            out.print("thump when you try to climb up. The cat woke up!");
            out.println(" He chases you around the kitchen");
            out.print("and back into the mouse hole! Exhausted and hungry,");
            out.println(" you give up for the day. Play again later!");
        } else if (choice.equals("lamp")) {
            out.print("You sneak quietly over to the lamp and try to climb it.");
            out.println(" The lamp buzzes slightly under");
            out.print("your paws, and the light turns on with a click!");
            out.println(" The cat heard the lamp turn on and snaps");
            out.print("awake. He chases you around the kitchen and back");
            out.println(" into your hole! Play again later!");
        } else if (choice.equals("food")) {
            out.print("You sneak over to the cat's food dish. There's one");
            out.println(" piece of food on the floor and more");
            out.println("in the dish. You're very hungry.");
            out.println("");
            out.println("What do you eat? Options: floor, dish");
            String afterFood = keyboard.nextLine();
            if (afterFood.equals("floor")) {
                out.print("You eat a large, tasty piece of cat food that was dropped");
                out.println(" on the floor. You were very");
                out.println("quiet. The cat hasn't woken up yet.");
                out.println("");
                out.println("Where do you go next? Options: dish, curtain");
                String afterFloor = keyboard.nextLine();
                if (afterFloor.equals("dish")) {
                    out.print("The cat food rattles loudly as you climb into the cat ");
                    out.println("food dish. The cat wakes up! And");
                    out.print("he knows exactly where you are. He's on you in ");
                    out.println("an instant! You are lunch. :( We'll be");
                    out.println("sure to notify your next of kin. A tiny mouse");
                    out.println("plays the violin at your funeral.");
                } else if (afterFloor.equals ("curtain")) {
                    out.print("You quietly sneak over to the curtain. The cat ");
                    out.println("wakes up slow and groggy. You've");
                    out.print("already made it to the curtain by the time he ");
                    out.println("notices you. With a burst of well-fed");
                    out.print("strength, you race up the curtain and leap out ");
                    out.println("the open window! Behind you, you hear");
                    out.print("the thump of the cat hitting the window frame ");
                    out.println("and not making it through.");
                    out.print("You follow a grain trail to the barn and ");
                    out.println("find some warm hay to hide in for a nap. There");
                    out.println("is no cat in the barn. You're a happy mouse! You win!");
                } else {
                    out.println("Oops! You didn't choose a valid option.");
                }

            } else if (afterFood.equals("dish")){
                    out.println("");
                out.print("The cat food rattles loudly as you climb into the cat food dish. ");
                out.println("The cat wakes up! And");
                out.print("he knows exactly where you are. He's on you in an instant! ");
                out.println("You are lunch. :( We'll be");
                out.println("sure to notify your next of kin. A tiny mouse");
                out.println("plays violin at your funeral.");
            } else {
                out.println("Oops! You didn't choose a valid option.");
            }

        } else if (choice.equals("curtain")) {
            out.print("You sneak quietly across the room to the long curtains");
            out.println(" hanging by the window. The");
            out.print("curtains are an easy climb. The cat is still asleep.");
            out.println(" You smell a barn just outside.");
            out.println("");
            out.println("Where do you go? Options: down, window");
            String afterCurtain = keyboard.nextLine();
            if (afterCurtain.equals("down")) {
                out.print("As you climb back down the curtain, the cat stretches ");
                out.println("and looks around the room. He");
                out.print("notices the curtain hanging strangely and comes over ");
                out.println("to investigate. You have barely a");
                out.println("moment to race back into your hole and try again tomorrow. Play again later!");
            } else if (afterCurtain.equals("window")) {
                out.print("You smell a barn nearby with fresh grain. You climb through ");
                out.println("the window and hide in the");
                out.print("tall grass. There's spilled grain here that makes a tasty ");
                out.println("treat. By the time you reach the");
                out.print("barn, you are well fed, and find a quiet spot in the ");
                out.println("hay for a nap. There is no cat in the");
                out.println("barn. You're a happy mouse! You win!");

            } else {
                out.println("Oops! You didn't choose a valid option.");
            }

        } else {
                out.println("Oops!  You didn't choose a valid option.");
            }


        }
    }


