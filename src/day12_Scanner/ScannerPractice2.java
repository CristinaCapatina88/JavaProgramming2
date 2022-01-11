package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true or false");
        //boolean result = input.hasNextBoolean();//only to enter true or false
        System.out.println("Enter your name");
        String name = input.next();// reads input until a space // cant read more than one word

        System.out.println("name = " + name);

        input.close();
    }
}
