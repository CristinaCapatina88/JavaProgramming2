package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
        for (char i = 'A', j=0 ; i <='Z' && j< letters.length; i++,j++) {
            letters[j]=i;
        }


        System.out.println(Arrays.toString(letters));// A~Z
        System.out.println("_________________________________________________");
     /*
      1. create an array that has the numbers 1 to 100
      */
         int [] numbers = new int[100] ;

        for (int i = 1,j=0; i<=100 && j< numbers.length ; i++,j++) {
                numbers[j]=i;
        }
            System.out.println(Arrays.toString(numbers));

        System.out.println("________________________________________________");
        /*
         2. create an array that has the numbers 100 to 1
         */
        int [] numbers2 = new int[100] ;

        for (int i = 100, j=0; i >0 && j< numbers2.length ; i--, j++) {
            numbers2[j]=i;
        }
        System.out.println(Arrays.toString(numbers2));

    }
}
// char ch='A
// for(i=0; i<letters.length; i++ )
// letters[i] = ch;
//ch++;