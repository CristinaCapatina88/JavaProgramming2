package day06_PrimitiveTypeCastings;
/*
+:Addition
-:Substraction
*:Multiplication
/:Division
   in math 10/4 =2.5

  in java 10/4=2 (its returning int )
          10.0/4 =2.5
  integer / integer  = integer
  decimal / integer = decimal
  integer / decimal =decimal
  decimal /decimal = decimal

%:Remainder
 */
public class Arithmetricoperators {
    public static void main(String[] args) {
        System.out.println(10 + 20);//30
        System.out.println(100-50);//subtraction
        System.out.println(10*6);//60 multiplication

        System.out.println(100/3); //if both are int we get int 33
        System.out.println(10.0/4);//if we want a decimal result we shout give to one of them a decimal
        System.out.println(10d/4); //add character D or d to give decimal result

        int  a = 100;
        double b = a/6;
        System.out.println(b);

        double c = a/6.0; //if we want exact nr
        double c1 = (double) a/6; //another way to do it
        System.out.println(c);
        System.out.println(c1);


    }

}
