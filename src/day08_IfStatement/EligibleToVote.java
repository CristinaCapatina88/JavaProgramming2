package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
       String name = "Josh";
       int age = 38;
       String citizen = "USA";
       boolean isEligible = age >=21 && citizen =="USA";
       // eligible
        if(isEligible){//if boolean statement is true the if statement is going to be printed
            System.out.println("eligible");
        }

        //not eligible
        if(!isEligible){//if the condition is false the if statement is not executed
            System.out.println("not eligible");

        }
    }
}
