package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

int [] arr1 ={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);
        System.out.println("___________________");

        double[] arr2 ={1.5,2.5,3.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("___________________");

        char [] arr3 ={'A','B','C'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("___________________");

        String [] arr4 = {"Ana","Jora","Lora"};
        ArraysUtility.printEachElement(arr4);
        System.out.println("___________________");

        int [] n1={1,2,3,4,5,};
        int max1 = ArraysUtility.maxElement(n1);
        System.out.println("max1 = " + max1);

            System.out.println("___________________");

            int [] a1 ={1,2,3,4,5,6};
            boolean r1=ArraysUtility.contains(a1,5);
            System.out.println("r1 = " + r1);

    }
}
