package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
       int length = scan.nextInt();//user will give the nr



if(length<=0) {
    System.out.println("invalid entry");
    System.exit(0);
}
    int[] numbers = new int[length];//under lenght stays yhe input user provided
    for (int i = 0; i <length ; i++) {//numbers of execution depends of the length of the array
        System.out.println("Enter a number");
       numbers[i] =scan.nextInt();
    }
    System.out.println(Arrays.toString(numbers));
    scan.close();
}
    }

