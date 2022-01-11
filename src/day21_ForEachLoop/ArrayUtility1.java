package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility1 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        int [] scores ={95,30,59,25,};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score:" + scores[0]);
        System.out.println("Max Score:"+ scores[scores.length-1]);

        System.out.println("____________________________________________________________");

         String [] names = {"Ala","Bala","Zuhal" };

          Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("___________________________________________________");

        int[] arr1 = {1,3,2};
        int [] arr2 ={1,2,3};

        boolean r1 =Arrays.equals(arr1,arr2);
        System.out.println(r1);


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println();
        boolean r2 =Arrays.equals(arr1,arr2);
        System.out.println(r2);


        System.out.println("_________________________________________");

        char [] ch1 = {'a','c','b'};
        char [] ch2 = {'b','a','c'};

        Arrays.sort(ch1);//a,b,c
        Arrays.sort(ch2);//a,b,c

        boolean anagram= Arrays.equals(ch1 ,ch2);
        System.out.println(anagram);




    }


}
