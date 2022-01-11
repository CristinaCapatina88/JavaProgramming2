package day07_Operators;

import java.sql.SQLOutput;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -25;

        System.out.println(num1 < 0);// false
        System.out.println(num2 <0);//true

        int a =5;
        ++a; //pre increment increases the value by 1 immediatly


        System.out.println(a);

--a;// pre decrement decreases  the value by 1

        System.out.println(a);


        int b =100;
        System.out.println(++b); //101

        int c =100;
        System.out.println(c++);// post increment :100, first it passes the current value
        System.out.println(c); //101 , now it posted the value +1

        System.out.println("-----------------");

        int x = 200;
        System.out.println(--x);//199 (pre decrement)it decreases the value by 1

        int y = 200;
        System.out.println(y--);//post decrement: it has two steps , it passes the corect value 200
        System.out.println(y);// now it will post 199

int z =45;
        System.out.println(++z);//46 z= 46
        System.out.println(z++);//46 z=47
        System.out.println(z);//47

        int q = 30;

        System.out.println(--q);// pre decrement q=29
        System.out.println(q--);// post decrement 29 but eventualy decreases by 1q=28
        System.out.println(q);// 28




    }
}
