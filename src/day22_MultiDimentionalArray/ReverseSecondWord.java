package day22_MultiDimentionalArray;
/*
 Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */
import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence ="I love Java";

          String [] words = sentence.split(" ");
String reverse ="";

        for (int i =words[1].length()-1; i >=0; i--) {//this is the string we want to reverse love we want to reverse
            reverse+= words[1].charAt(i);
        }

        System.out.println(reverse);

        sentence=sentence.replaceFirst(words[1],reverse );
        words[1]= reverse;

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println("_______________________________________");
        String sentence1 = "Today is a good day to learn Java";

        String[] words1 = sentence1.split(" " );

        for (int i = 0; i<words1.length; i++){
            System.out.println(words1[i]);
        }

        }
    }

