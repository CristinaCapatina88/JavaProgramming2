package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("test startet");

        try{
            System.out.println(9 / 0);
            System.out.println("Try block");

        } catch (ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("Arithmetic  Exception is occured ");
        }


        System.out.println("test complited");

        System.out.println("_______________________________________");

        System.out.println("test2 startet");

        int [] numbers = {1,2,3,4,5};

        try{

            System.out.println(numbers[200]);
            System.out.println("Try block");
        }catch (IndexOutOfBoundsException e){//or RuntimeException which is the parent of all
            System.out.println("Catch block");
            System.out.println("IndexOutOfBounds Exception is occured ");
        }

        System.out.println("test complited");

        System.out.println("_______________________________________");

        System.out.println("test4 startet");
try {
    System.out.println("Cydeo".substring(2, 0));

}catch (RuntimeException e){
    e.printStackTrace();//get the report of this exception
}
        System.out.println("test 4 complited");

        System.out.println("--------------------------------------------------");


        System.out.println("Hello");


        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");


        System.out.println("------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
