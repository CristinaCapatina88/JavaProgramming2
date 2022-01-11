package day15_ForLoop;

import java.util.Scanner;

/*
write a prog that asks the user to enter a nr for 5 time
return the max number
 */
public class MaximumNR {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max= -2147483648;//this conditios is true at the first execution of the loop

        for (int i = 0; i < 5 ; i++) {
            System.out.println("enter a number:");
            int num= scan.nextInt();

            if(num> max){//if the user number is greater than the current max number
                max=num;
            }

        }
        System.out.println(max);
    }
}
