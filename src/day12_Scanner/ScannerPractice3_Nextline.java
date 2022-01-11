package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_Nextline {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");

        String fullname = input.nextLine();//reads everything until you press enter

        System.out.println("Enter your Programming Language");
String programming = input.nextLine();

        System.out.println("Enter your age");
        int age= input.nextInt();//24enter ...the enter key will remain in the scanner memory
        // and it will be assigned to the next comand

        input.nextLine();//will take the enter from the Scanner memory

        System.out.println("Enter your school name");
        String schoolname= input.nextLine();//everytime we use nextLine and in fromt we used
        // another method we have to clean the scanner memory by using input.nextLine()

        System.out.println("fullname = " + fullname);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolname = " + schoolname);

        input.close();
    }
}
