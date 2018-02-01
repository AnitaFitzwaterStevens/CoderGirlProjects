package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class VerseAndChorus {
 public static void chorus()
{   out.println("With a knick-knack paddywhack,");
    out.println("Give the dog a bone,");
    out.println("This old man came rolling home.");
    out.println("");
    // do stuff here

}
    public static void main(String[] args)
    {   out.println("This old man, he played one.");
        out.println("He played knick-knack on my thumb;");
        // call a function
        chorus();
        out.println("This old man, he played two.");
        out.println("He played knick-knack on my shoe;");
        chorus();
        out.println("This old man, he played three.");
        out.println("He played knick-knack on my knee;");
        chorus();
        out.println("This old man, he played four.");
        out.println("He played knick-knack on my door;");
        chorus();
        out.println("This old man, he played five.");
        out.println("He played knick-knack on my hive;");
        chorus();
        out.println("This old man, he played six.");
        out.println("He played knick-knack on my sticks;");
        chorus();
    }
}
