package day17_While_DoWhile.day20_Arrays;

public class MaxNr_ofArray {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,};

        int max = numbers[0];//assuming that the first elem is the max
      int min = numbers[3];
        for (int i = 0; i < numbers.length; i++) {

           if(numbers[i]>max) {// if there is an elem that is greader than the curent number
               max = numbers[i];// assigning greater number to variable max
           }
               if(numbers[i]<min){
                   min= numbers[i];
               }
           }

        System.out.println(max);
        System.out.println(min);
        }




    }

