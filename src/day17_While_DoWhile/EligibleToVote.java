package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();//valid age 1~120

        while (!(age>=1&& age<=120)){//every time the user provides an invalid age
            System.err.println("Invalid entry re enter");
            age= scan.nextInt();
        }
        System.out.println("Are you a US Citizens?");
        String answer= scan.next();
        while( !(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry ..Are you a US Citizens?");
            answer= scan.next().toLowerCase();
        }

        if(age>=18 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

scan.close();
    }
}
