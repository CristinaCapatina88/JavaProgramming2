package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1=200;
        Integer n1 =num1;// autoboxing
        int num2 =n1;// unboxing

        System.out.println("___________________________________");

        Integer integerValue =100;

        long lonValue =integerValue;
        System.out.println("___________________________________");
        int num3 = 200;
        Integer num4 = num3;//autoboxing we use the exact wrapper class

        Byte b1 =25;// for unboxing
        byte a1=b1;
        short a2 =b1;


        Integer x=900;
        Integer y=x;


    }
}
