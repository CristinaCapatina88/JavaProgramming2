package day22_MultiDimentionalArray;

import java.util.Arrays;

/*
String [] group1 = {"Jon", "Joes","James"};
 */
public class MultidimentionalArrayIntro {
    public static void main(String[] args) {
        String [] group1 = {"Jon", "Joes","James"};
        String [] group2 = {"Jon", "Shay","James"};
        String [] group3 = {"Aron", "Joes","James"};


  String [] [] groups = new String [3][];// index :0,1,2
groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;


        System.out.println(Arrays.deepToString(groups));//to.String method is for single dimentional arrays only
        System.out.println("_______________________________________________");

        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */
//   index of elements     0 1 2    0 1 2 3   0 1  2  3  4
        int [][] arr2D = {{1,2,3} ,{4,5,6,7},{8,9,10,11,12} };
//       index of arrays :  0          1            2

        // {4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));

        //11

        System.out.println(arr2D[2][3]);
    }
}
