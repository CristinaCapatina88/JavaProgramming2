package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String [] countries ={"Japan","Korea","Turkey","Canada","United States"};

// converting array to arraylist:
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
   list.removeIf(p -> p.length()>=10);

   //converting arrayList back to array
      countries=  list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));




    }
}
