package day07_Operators;

import java.sql.SQLOutput;

public class ShortHandOperators {
    public static void main(String[] args) {
       //assignment: =
       int number =100;
       System.out.println("number " + number);//100

        number = 200;// we apdated the value to the data number// we dont change the variable just change the value
        System.out.println("number " + number);// takes last value assignet to numb

        String word = "Java Programming";
        System.out.println("word= "+ word);

        word ="Wooden Spoon";
        System.out.println("word =" + word);

        System.out.println("number " + number);

//       Addition assignment

        int x =100;
        System.out.println("x=" +x);

       // x = x+200;
        x+=200;
        System.out.println("x=" +x);

        String str = "Wooden";
        str+=" Spoon";
        System.out.println("str = " + str);

        double num1=2.5;
        System.out.println("num1 = " + num1);//2.5

        num1+=5.5;
        System.out.println("num1 = " + num1);//8.0


double availableBalance = 1000.50;
// deposit 300$
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("_____________");

        //withdrawing 500$ from availablebalance

        availableBalance -=500;// 1300.5-500 =availbalance
        System.out.println("availableBalance = " + availableBalance);

//withdrawing 200$ then depositing 400$
        availableBalance-=200;//aailable balan 600.5
        availableBalance+= 400;// becomes 1000.5
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("____________");
        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.000001;
        doge *= 100000000;
        System.out.println("doge = " + doge);
        
        System.out.println("_____________________");
        // division 
        
        double num2 = 25000.0;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("_______________");
        
        //remainder assignment 
        
        double num3 =100;
        
        num3 %=3;
        System.out.println("num3 = " + num3);
        
        int amount =127;// cents 
        
        int quarters = 127/25;
        int cents = 127%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        
   int y = 300;
   y %=16;
        System.out.println("y = " + y);

      int balance =3500;
      //insurance fee $153
        
        balance %= 153;
        System.out.println("balance = " + balance);
        

    }
}
