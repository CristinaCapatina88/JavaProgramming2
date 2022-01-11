package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

       int num= Integer.parseInt(str);//returns int
        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2="10.5";
        double num1 = Double.parseDouble(str2);
        System.out.println(num1);

        System.out.println("_______________________________________________");

       int max= Integer.MAX_VALUE;// same we can do for long byte  Byte.MAX_VALUE;
        int min =Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);


       String s1="true";//if we have "maybe" by default will take as false

  boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("________________________________________________");

        String s2  ="123";
       Integer x= Integer.valueOf(s2);//Integer
        int y= Integer.valueOf(s2);//unboxing
        System.out.println(x);

        String s3  ="1.5";
           double z= Double.valueOf(s3);//in the backround is an unboxing
        System.out.println(z);

        System.out.println("________________________________________________");

       //isDigit()
        char ch1= '!';

    boolean r2 =Character.isDigit(ch1);//returns true of false
        System.out.println(r2);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);

      // special char as ! @ # $
        boolean r4 = !Character.isLetterOrDigit(ch1);
        System.out.println(r4);

         //upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //upperCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println("_______________________________________");

        String s = "ab1cde2frg3tdd5";

        int sum =0;
        //am facut s.toCharArray.for

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+= Integer.parseInt(each+"");
            }
        }

        System.out.println("sum = " + sum);

    }
}
