package day08_IfStatement;
/*
write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */
public class swipeTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
       int a = 10;
       int b = 15;
     //---------------------
        int c = b; //15//a temporare variable that is about to be gone
        b= a;//b=10
        a = c ;


     //------------

        System.out.println("a = " + a); //15
        System.out.println("b = " +b); //10



    }
}
