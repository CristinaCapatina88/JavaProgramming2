package practice12_01_2021;
/*
 Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level

                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true

                       */

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
         String word = scan.nextLine();
         String result ="";

         for(int i = word.length()-1;i>=0;i--){
             result+= word.charAt(i);
         }

         boolean ispalindrome= word.equalsIgnoreCase(result);
        System.out.println(ispalindrome);
scan.close();

    }
}
