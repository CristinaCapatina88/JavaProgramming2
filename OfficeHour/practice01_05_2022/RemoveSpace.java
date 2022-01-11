package practice01_05_2022;

import java.util.Arrays;

public class RemoveSpace {

    public static void main(String[] args) {
        String input="  Hello world      I      love      Java    ";
        removeSpaces(input);
    }

public static void removeSpaces(String str){
    String result="";
    String [] strarr =str.trim().split(" ");
    //System.out.println(Arrays.toString(strarr));

    for(String each:strarr){
        if(!each.isEmpty()){
            result+=each +" ";
        }
    }
    System.out.println(result);
}

}
    /*  (RemoveSpaces)

                          Task 3 :   Write a method that can remove  all extra space from String


                                Input: "  Hello world      I      love      Java    "
                               Output: Hello world I love Java

                         */
