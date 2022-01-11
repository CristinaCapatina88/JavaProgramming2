package day17_While_DoWhile.day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

       int[] number = {100,500,30,40,600,80,90} ;
       int min = number[0];//comparing with every element of the array
        for (int i = 0; i < number.length; i++) {
            if(number[i]<min){//we check erery elem from the array .. which every minnr is less than the curent min nr
                min=number[i];//we assign the min number back to the variable min
            }

        }
        System.out.println(min);
    }
}
