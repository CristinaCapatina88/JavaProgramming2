package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a radius number");
        int radius = scan.nextInt();
        double area = 3.14* radius*radius;
        double perimeter = 23.14 * radius;


        System.out.println("The are of the circle is: "+ area + " and the perimeter is: " + perimeter);

        scan.close();
    }
}
