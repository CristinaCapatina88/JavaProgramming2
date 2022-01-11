package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a =100;
        short b = a;

        //short b = (short)a;
        // convert byte to the short and the assign to short
        int c = b;
        long d = c;
        // in the backroud smaller primitive is casted to the longer like this (long)c

        float e = d;
        double f = e;

        System.out.println("__explicit casting __--");
//casting larger primitive types to smaller primitive types
        int x = 55;
        short y = (short) x; //short does not have enought range, it need to be casted manually

        System.out.println(x + " : "+ y);

        long j = 1000000;
        short k = (short) j;
        System.out.println(j + ":" +k);

        double l = 2.5;
        float m= (float) l;
        System.out.println(l + " : "+ m);

double n = 10.8;
int s= (int) n ;

        System.out.println(n + " : "+ s);

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+ " : "+ s1);


        float f1=30.5f;
        long l1 = (long) f1;

    }
}
