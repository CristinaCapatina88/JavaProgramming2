package day13_StringClass;

import java.util.Scanner;

/*
firstName= "Wooden"
lastName ="Spoon"
 */
public class Initial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first name");
        String firstname = scan.next();

        System.out.println("enter your last name");
        String lastname = scan.next();

        char f= firstname.charAt(0);
        char l = lastname.charAt(0);

        String initial = f +"." + l;
        System.out.println("initial = " + initial);
    }
}
