package day12_Scanner;


import java.util.Scanner;
// or import java.util. *;  WILD IMPORT- witch will import everything from util package

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;//we assigned the scanner object to a variable in order to be reusable

        System.out.println("Enter a number between 1to 7:");//we ask the user to prov a number

        int num = scan.nextInt();// here he types the number....and if we want to reuse the result we have to assign to avariable

        String result ="";

        if(num>=1 && num<=7){

           result= (num==1)? "Monday"  :(num==2)? "Tuesday" :(num==3)? "Wednesday"
                    :(num==4)? "Thursday"  :(num==5)?"Friday"  :(num==6)? "Saturday"  : "Sunday";

        }else{
            result= "Invalid Number";
        }

        System.out.println(result);
         scan.close();
    }
}
