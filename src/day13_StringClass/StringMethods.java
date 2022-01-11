package day13_StringClass;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
               //index:01234

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        /*
        char tenthchar= word.charAt(9);
        System.out.println("tenthchar = " + tenthchar);
        */

        System.out.println("_______________________________________");

        String s1 = "Batch 25 is the best batch";
        
        int totalCharacters = s1.length();

        System.out.println("totalCharacters = " + totalCharacters);

        char lastchar = s1.charAt(totalCharacters-1); //s1.length()-1
        System.out.println("lastchar = " + lastchar);

        System.out.println("____________________________");

        String str = "wooden spoon";
       str= str.toUpperCase();//"WOODEN SPOON"
        System.out.println(str);

        String s = "JAVA";
       s.toUpperCase();



    }
}
