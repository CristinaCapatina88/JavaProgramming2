package practice12_15_2021;

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any word.");
        String word = scan.nextLine();
        System.out.println("Enter any positive number.");
   int num = scan.nextInt();

   int count=0;
   String output="";

   while(count<num){
       output+= word;
       count++;
   }
   //      OR
     //   for (int i = 0; i < num; i++) {
     //       output+= word;
     //   }
        System.out.println(output);

    }
}
/*
                     (StringTimes)
                    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

                     input String : Hi  ,  input int : 2

                     output: HiHi
                  */