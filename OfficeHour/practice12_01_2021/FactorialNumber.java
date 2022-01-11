package practice12_01_2021;

import java.util.Scanner;

/*
write a programm that can return a factorial number
ex : input 5
output: 120 (because: 5!=5*4*3*2*1=120
factorial number is the number multiplid to all numver starting with that numb till 1
 */
public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();

      int result =1;
        if(number>2){
            for(int i =number;i>=1;i--){

                result *= i;
            }
            }else{
            result=number;
        }

        System.out.println("Factorial number is "+result);
        scan.close();
        }


    }

