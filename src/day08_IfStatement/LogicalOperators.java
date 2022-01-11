package day08_IfStatement;

import java.sql.SQLOutput;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Aaron";
       int age = 18;
       String citizen ="USA";
       boolean isEligible = age>=18 && citizen == "USA";
        //                   18>=18      "USA     "USA
        //                     true          true >+====== true

        System.out.println(name + "is eligible to vote :" + isEligible);

        System.out.println("______________________");

        String name1 = "Josh";
        int creditScore = 720;
        int age2 =  23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >=21 && income>=60000 ;//both variable have to match both conditions

        System.out.println(name1+ "is eligible for loan: " + isEligible2);

        System.out.println("___________________________________");

        String name3 = "Shay";
        int age3 = 21;
        char gender ='F';

        boolean isEligible3 = age3>=18 && (gender== 'M' || gender== 'F');
        //                       21>=18     (at least one is true then is true
         //                       true

        System.out.println(name3+ "is eligible to register:" + isEligible3);

        System.out.println("______________________________");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth=="USA" || marriedToUSCitizen ==true;
      //                           false                       false

        System.out.println(name4 + "is eligible to apply " + isEligible4);

        System.out.println("______________");

int score = 55;
boolean passed = score >= 60;
boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed =  " + failed);


    }

}
