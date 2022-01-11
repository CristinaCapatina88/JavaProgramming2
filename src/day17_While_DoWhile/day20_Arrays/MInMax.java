package day17_While_DoWhile.day20_Arrays;

import java.util.Scanner;

/*
 1. create an array that has the numbers 1 to 100
    2. create an array that has the numbers 100 to 1
    3. Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
 */
public class MInMax {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

         int [] numbers= new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] =scan.nextInt();//each user entered input  will be assigned to the indexes of the array numbers
        }
         int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max) {
                max= numbers[i];
            }
            if(numbers[i]<min){
                min= numbers[i];
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scan.close();
    }
}
