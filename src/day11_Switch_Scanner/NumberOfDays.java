package day11_Switch_Scanner;
/*

 */
public class NumberOfDays {
    public static void main(String[] args) {
int year =2000;
     int number = 2;

     if(number>=1&&number<=12){//number 1~12

         switch (number){
             case 2:// for february
                 if(year%4==0){//checking if is a leap year
                     System.out.println("29 days");
                 }else {
                     System.out.println("28 days");
                 }
                 break;

             case 4: case 6: case 9 :case 11://for months with 30 days
                 System.out.println("30 days");
                 break;
             default://for 1,3,5,7,8,10,12 months
                 System.out.println("31 days");
         }

     }else{
         System.out.println("Invalid");
     }



    }
}
