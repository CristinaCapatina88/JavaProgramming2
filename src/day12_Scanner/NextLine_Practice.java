package day12_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();// because Enter went to the Scanner memory after we typed age
        //we have to clear the memory after the next method ..otherwise it will not be possible tu enter
        //the full name in the input

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA");
       double gpa = input.nextDouble();

          input.nextLine();// cleaning the Scanner memory

        System.out.println("Enter your School name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullname = " + fullName);

input.close();

    }
}
/*
1 ask user to enter age (nextInt()
1 ask user to enter the full name
 */