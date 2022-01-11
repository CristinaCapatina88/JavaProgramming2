package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class REverse_ArrayList_Array {
    public static void main(String[] args) {
        int [] array= {1,2,3,4,5,6};
        int [] result = new int[array.length];//{6,5,4,3,2,1}

        int j =0;
        for (int i = array.length - 1; i >= 0; i--,j++) {
          result[j]  =array[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("_______________________________________________");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> reversedlist = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each =list.get(i);
            reversedlist.add(each);
        }

        System.out.println(reversedlist);

    }
}
