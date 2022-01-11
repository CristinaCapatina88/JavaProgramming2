package day16_ForLoopStringPractice;
/*
 Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

String str ="aabbaacc";
String result = "";
                        //or i <str.length()
        for (int i = 0; i <=str.length()-1 ; i++) {
String ch = "" + str.charAt(i);// represents each character of str

         if(!result.contains(ch)) {//if the chart is not contain in the result the character will be added
             result += ch;

         }


        }


        System.out.println(result);

    }
}
