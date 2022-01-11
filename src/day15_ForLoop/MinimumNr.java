package day15_ForLoop;

import java.util.Scanner;

/*
write a prog that asks the user to enter a nr for 5 time
return the min number
 */
public class MinimumNr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min= 2147483647;//the max nr we can assign ...so any nr the use will enter will be less than this one

        for (int i = 10; i <15 ; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if(num<min){
                min=num;
            }
        }
        System.out.println("min = " + min);
    }
}
