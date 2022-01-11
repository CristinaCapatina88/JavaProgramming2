package day01_JavaIntro;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

   String str="Wooden Spoon";
   StringUtility.printEachChar(str);
        System.out.println("_________");

        String str1  ="Wooden Spoon";

       String reverse= StringUtility.reverse(str1);
        System.out.println(reverse);

        System.out.println("____________________________");

        String word ="Civic";

        boolean palindrome= StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("____________________________");

        String [] names= {"Anna","Java","Mom","Racecar"};
        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("________________________");
        String s2="aaaaaabbbbbbbbcccccdddddd";
       String nonDub= StringUtility.removeDublicates(s2);
        System.out.println("nonDub = " + nonDub);



    }
}
