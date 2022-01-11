package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

  String str ="aaabcccdeeef";
  String [] arr =str.split("");//convert to array
        ArrayList<String> list =new ArrayList<>(Arrays.asList(arr));//convesrt to arrayList

        System.out.println(list);

        String unique ="";

        for (String each : list) {
          int frequency=  Collections.frequency(list,each);
          if (frequency==1){
              unique+=each;
          }
        }
        System.out.println("unique = " + unique);
    }
}
