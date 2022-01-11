package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str ="Java";
char ch [] = str.toCharArray();

        System.out.println(Arrays.toString(ch));


        for( char each: ch){
            System.out.println(each);

        }


        System.out.println("________________________________________________");

        String sentence = "Wooden Spoon";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("________________________________________________");

        String email = "WoodenSpoon@cydeo.com";
         String [] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        String s ="Today is nice day. Today is Monday. ";
        String [] sentence1 = s.split("\\. ");
        System.out.println(Arrays.toString(sentence1));
    }
}
