package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number=100;

        boolean evenNumber = number%2==0;
        boolean oddnumber =!evenNumber ;

        if(evenNumber){//for even numbers
            System.out.println(number +"is even number");

        }
if (oddnumber){//not even numbers

    System.out.println(number +"is odd number");
}
        System.out.println("_________________----------__");

     int n =200;

       //positive
        if(n > 0){
            System.out.println(n +"is positive");
        }

        //negative
        if(n< 0){

            System.out.println(n +"is negative");
        }


        //zero

if (n == 0){

    System.out.println(n+ "is zero");
}

       /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
        */
    }
}
