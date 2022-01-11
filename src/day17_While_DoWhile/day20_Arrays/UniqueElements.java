package day17_While_DoWhile.day20_Arrays;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

       String  [] words = {"Java","Java","Java","C#"};

       for (int j = 0; j < words.length; j++) {

           String element = words[j];//here we get all the elements

            int count = 0;
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {//finds the frequency of element from array
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
   if(frequency==1){
       System.out.println(element);
   }
        }




    }
}
