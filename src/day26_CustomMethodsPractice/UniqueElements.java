package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7,2,4,6};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));
    }


   // returns the unique elem of the array as a new array
    public static int [] uniqueElements(int [] array){
        int [] result = {};//new int[0]...this variable is temp

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the elem is unique
                result=ArraysUtility.addElement(result,each);//we have to assign back for result to have the elem
            }
        }
        return result;
    }

    // returns the unique elem of the array as a new array
    public static double [] uniqueElements(double [] array){
       double [] result = {};//new int[0]...this variable is temp

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the elem is unique
                result=ArraysUtility.addElement(result,each);//we have to assign back for result to have the elem
            }
        }
        return result;
    }


    // returns the unique elem of the array as a new array
    public static char [] uniqueElements(char [] array){
        char[] result = {};//new int[0]...this variable is temp

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the elem is unique
                result=ArraysUtility.addElement(result,each);//we have to assign back for result to have the elem
            }
        }
        return result;
    }

    // returns the unique elem of the array as a new array
    public static String [] uniqueElements(String [] array){
        String[] result = {};//new int[0]...this variable is temp

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){//if the frequency is one the elem is unique
                result=ArraysUtility.addElement(result,each);//we have to assign back for result to have the elem
            }
        }
        return result;
    }


}
