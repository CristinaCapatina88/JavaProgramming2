package day09_IfStatements;
/*
Create a class called MinNumber,
Write a program that can print the minimum number between two numbers,
if both are equal then print Equal
            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */
public class MinNumber {
    public static void main(String[] args) {

     int n1= 100;
     int n2 = 200;

     boolean n1isMin = n1<n2 ; //first condition
        boolean n2isMin = n2<n1 ;//second condition
        boolean equal = n1==n2;

        if (n1isMin){
            System.out.println(n1 +" is the minimum number");
        }
     if(n2isMin){
         System.out.println(n2+ " is the minimum number");
     }

     if (equal){
         System.out.println(n1 +"and" + n2 +" are the minimum number");
     }
    }
}
