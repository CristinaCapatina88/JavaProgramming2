package day21_ForEachLoop;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
/*
        int [] arr1 ={1,2,3,4};
        int [] arr2 = {5,6};

        int [] merge = new int[arr1.length+ arr2.length];
*/

         String [] group1 ={"Ali", "Layan","Aysenur"};
        String [] group2 ={"Maria", "Aygun", "Duygu","Suat"};

        String[] students = new String[group2.length+ group1.length];//to make sure the students array has enough capacity to combine both array

        int i =0;
        for (String each : group1) {
            students [i++] = each;
        }

        for (String each : group2) {
            students [i++] = each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("_________________________________________________");

        char ch1[] ={'A','B','C'};
        char ch2[]= {'j','k','C','g'};
        char [] chars = new char[ch1.length+ ch2.length];

        int j =0;//indexnr for hte chars
        for (char ch : ch1) {
            chars[j]=ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]=ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));
        }
    }

