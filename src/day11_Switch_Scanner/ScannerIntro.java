package day11_Switch_Scanner;

import java.util.Scanner;//shortcut== type Scan under main method

public class ScannerIntro {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");//this peint statement should be before line 11
      int num1 =input.nextInt();

        System.out.println("enter a decimal");

      double num2=input.nextDouble();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + num1*num2);

input.close();// closes the scanner ,after this line we cannot use the scanner

    }

}
