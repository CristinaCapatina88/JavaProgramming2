package day17_While_DoWhile;

import java.util.Scanner;

public class Email_ifBreak_Statement {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


            System.out.println("enter your username:");
            String username = scan.next().toLowerCase();

            System.out.println("enter your password:");
            String password = scan.next().toLowerCase();
        for (int i = 3; i >=0; i--) {


            if (username.equals("cydeo") && password.equals("cydeo123")) {
                System.out.println("you are logged in");break;
            }else {
                while (!(username.equals("cydeo") && password.equals("cydeo123")) && i < 3) {
                    System.out.println("incorrect username or password,please re-enter:");
                    System.out.println("enter your username:");
                    username = scan.next();
                    System.out.println("enter your password:");
                    password = scan.next();

                }
            }
                System.out.println("your account is locked");
            }




        }
    }

