package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
int [] arr ={1,1,1,2,2,2,3,3,3,4,4,4};
        arr =removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

        String [] str={"mar","mar","par","cires"};
        str=removeDuplicates(str);
        System.out.println(Arrays.toString(str));
    }

    // removes the duplicates from the giving array, returns a new array
    public static int[] removeDuplicates(int [] array){
        int [] result = {};//temp value
        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicates from the giving array, returns a new array
    public static double[] removeDuplicates(double [] array){
        double [] result = {};//temp value
        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicates from the giving array, returns a new array
    public static char[] removeDuplicates( char [] array){
        char [] result = {};//temp value
        for ( char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicates from the giving array, returns a new array
    public static String[] removeDuplicates( String [] array){
        String [] result = {};//temp value
        for ( String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
