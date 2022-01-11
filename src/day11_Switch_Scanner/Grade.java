package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char cr ='F';
        String result ="";

           switch (cr){

               case 'A':
                 result  ="Excellent";
       break;
               case'B':
                   result="Great Job";
                   break;
               case 'C':
                   result="Good";
                   break;
               case'D':
                   result="Passed";
                   break;
               case'F':
                   System.out.println("Failed");
                   break;
               default:
                   System.out.println("invalid");
           }
        System.out.println(result);

    }
}
