package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int [] numbers ={100,200,300,400,500,600};
        numbers=removeelements(numbers,1);//create a new array {100,300,400,500,600
        System.out.println(Arrays.toString(numbers));
    }

    public static int [] removeelements(int [] array , int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }

        int[] result ={};//temp array variable
        for (int i = 0; i < array.length; i++) {//i: arrays index number
            if(i!=index){
                ArraysUtility.addElement(result,array[i]);
            }
        }

        return result;




    }


}
