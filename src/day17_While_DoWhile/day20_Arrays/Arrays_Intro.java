package day17_While_DoWhile.day20_Arrays;

import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        // create a variable that is capable to contain 5 names

     String [] mygroup=new String[5];
     mygroup[0]= "Gunray";
     mygroup[1]="Neira";
     mygroup[2]="Suat";
     mygroup[3]="Hulya";
     mygroup[4]="Mikael";


        System.out.println(Arrays.toString(mygroup));


        System.out.println("_____________________________");

        String [] days= {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println( Arrays.toString(days));

        //if user gives us
        int num=5;
        System.out.println(days[num-1]);

        System.out.println("_________Months____________________");
        String [] months ={"January","February","March","April","May","June","July","August","September","Octomber","November","December"};

        int num1=1;
        if(num1<0 ||num1>12) {
            System.err.println("Invalid number");
            System.exit(0);
        }
        for (int i = 0; i < months.length; i++) {//i reprezents the index nr of array starting from 0

            System.out.println(months[i]);
        }
        System.out.println("________________________________");

        for (int i = months.length-1; i >=0 ; i--) {// i:repr index number of array starting from last index nr
            System.out.println(months[i]);
        }
        }

    }

