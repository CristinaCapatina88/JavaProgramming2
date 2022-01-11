package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTask {
    public static void main(String[] args) {
//1. write a program that can swap the first and last elements of an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

//2. Write a program that can move all the zeros to the last indexes of ArrayList

        System.out.println("__________________________________________________________");
        ArrayList<Integer> list = new ArrayList<>();
        list .addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        int size= list.size();//size before removing the zeros
        list.removeAll(Arrays.asList(0));//removing all zeros
        System.out.println(list);

        int newsize = list.size();//size after removing
        int totalnrOFZeros= size-newsize;
        System.out.println("totalnrOFZeros = " + totalnrOFZeros);

        for (int i = 0; i <totalnrOFZeros ; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("__________________________________________________________");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1 .addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list1) {
            if(each!=0){
                result.add(each);
            }
        }
        System.out.println(result);

        for (Integer each : list1) {
            if(each==0){
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("________________________________________________________");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(chars);//add all the characters

        letters.removeIf(p -> !Character.isLetter(p) );//remore the characters that are not letters

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);//add all the characters

        digits.removeIf(p-> !Character.isDigit(p));//remore the characters that are not digits
        System.out.println("digits = " + digits);
        
ArrayList<Character> specialChar = new ArrayList<>(chars);
specialChar.removeAll(letters);
specialChar.removeAll(digits);

        System.out.println("specialChar = " + specialChar);


    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */