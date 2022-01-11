package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in)  ;

        System.out.println("Enter your full name");
        String fullname = scan.nextLine();


        System.out.println("enter your building number");
        String buildingnumber = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name");
        String street= scan.nextLine();

        System.out.println("enter your city name");
        String city = scan.nextLine();

        System.out.println("enter your state");
        String state = scan.next();

        System.out.println("enter your zip code:");
         String zipcode = scan.next();

        scan.nextLine();

        System.out.println("enter country name");
        String country = scan.nextLine();

        scan.close();
    }
}
/*
1 Enter your full name (nextLine
2. enter your building number(next())
3. enter your street name (nextline()
4.enter your city name(nextLine
5. enter your state (next()
6. enter your zipcode(nextInt()

Display the shipping address
 */