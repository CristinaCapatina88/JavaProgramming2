package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age:38 years old
        byte age=38;
        // weight :160 pounds
        short weight = 160; //160is within the range of short
        // salary:100000 $
       // short salary = 100000; // 100000 is out of short'range
        int salary = 100_000;
        long asset = 3_333_333_333L; //compiler takes by default as an int we have to force it by adding L

        //tax:0.26
        float tax = 0.26F;//add F to force the compiler
        double PI = 3.14; //  the preferred one for decimal nr


        //#
        char ch1 = '#';

        System.out.println("ch1 = " + ch1);

        char ch2 =35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender ='F';
        char yesNo = 'Y';


        boolean isEmployeed = true ;
        boolean isMaried = false;
        boolean result= 100>300; //used for expression which is tru or false
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMaried = " + isMaried);
        System.out.println("result = " + result);


        String name = "Wooden Spoon";
         String  city = "McLean";
         String state ="Virginia";
         String country ="USA";
        System.out.println("name = " + name);






    }



}
