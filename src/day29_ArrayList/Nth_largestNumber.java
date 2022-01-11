package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
1. write a program that can return the nth largest number from an arraylist

            arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
            n = 5

            output:
                4
 */
public class Nth_largestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n=3;//we want the max third nr
        for (int i = 1; i < n; i++) {
            list.removeIf(p-> Collections.max(list)==p);
        }
 /*
        list.removeIf(p-> Collections.max(list)==p);//remove the first max nr
        list.removeIf(p-> Collections.max(list)==p);//remove the second max nr

  */
        int max = Collections.max(list);

        System.out.println(max);




    }
}
