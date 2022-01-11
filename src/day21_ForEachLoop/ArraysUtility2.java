package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

     String [] students ={"Elif", "Sinem","Cihad", "David"}   ;
      String [] earlyBirds = Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));

        int [] numbers = {1,2,3,4,5,6,7,8,9};
        numbers =Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println("__________________________________________________");

        char [] ch1 = {'A', 'B','C','D','E','F','G','H'};
        char [] ch2 = Arrays.copyOfRange(ch1,2,6);
        System.out.println(Arrays.toString(ch2));

        System.out.println("__________________________________");
int [] scores = {10,20,30,40,50,60,70,80,90,100};
int [] result = Arrays.copyOfRange(scores,3,8);//we want from 40 to 80
        System.out.println(Arrays.toString(result));



        int [] result2 = Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));


    }
}
