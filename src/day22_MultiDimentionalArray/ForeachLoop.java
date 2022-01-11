package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ForeachLoop {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3} ,{4,5,6,7},{8,9,10,11,12} };

      /*  for(int[] each1Darray : arr2D){

          for(int eachElement : each1Darray) {

              System.out.println(eachElement);
          }

        }
*/

        for (int[] each1Darray : arr2D) {
            for (int eachelement : each1Darray) {
                System.out.print(eachelement);
            }
        }





    }
}
