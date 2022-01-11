package day15_ForLoop;

import java.util.Scanner;

/*
 Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
public class startsWithX {
    public static void main(String[] args) {


        System.out.println("enter a word");

        String word = new Scanner(System.in).next();

        if (word.charAt(0)=='x'){

         word=  word.replaceFirst("x","a");
        }

        System.out.println(word);
    }
}
