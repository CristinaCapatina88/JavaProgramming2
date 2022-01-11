package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //username : "Cydeo
        //password: "Cydeo123"


        //while(invalid&& has atemps)

        Scanner scan =new Scanner(System.in);

        System.out.println("enter your username:");
        String username = scan.next();



        System.out.println("enter your password:");
        String password = scan.next();



        if (username.equals("cydeo") && password.equals("cydeo123") ) {
            System.out.println("you are logged in");
        }else{
            int attemps=3;
            while(!(username.equals("cydeo") && password.equals("cydeo123") )&& attemps>0){//while the credential are invalids and has attempts
                System.out.println("incorrect username or password,please re-enter");
                System.out.println("enter your username:");
                 username = scan.next();

                System.out.println("enter your password:");
                password= scan.next();

                attemps--;
            }

            if (username.equals("cydeo") && password.equals("cydeo123") ) {
                System.out.println("you are logged in");
            }else{
                System.out.println("your acc is locked");
            }
        }
scan.close();

        }

    }

