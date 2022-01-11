package practice12_01_2021;

import java.util.Arrays;
import java.util.Scanner;

public class FibonaciArray {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("how many fibonaci nr do you want to see");
        int number= scan.nextInt();

        int [] fibo = new int [number];
        fibo[0]=0;
        fibo[1]=1;

        for(int i = 2 ; i<number; i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
            //fibo[2]=fibo[2-1]+fibo[2-2];
            //fibo[3]=fibo[2]+fibo[1];
            //fibo[4]=fibo[3]+fibo[2];
        }

        System.out.println(Arrays.toString(fibo));

    }
}
