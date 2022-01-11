package day04_Variables;
/*
 Create a class named EmployeeInfo. declare the following variables:
                1. name (String)
                2. age (int)
                3. gender (char)
                4. company (String)
                5. jobTitle (String)
                6. yearsOfExperience (double)
                7. salary (int)
                8. isFullTime (boolean)
                9. isMarried (boolean)
                10. employeeId (String)
                11. SSN (String)
 */
public class EmployeeInfo {

    public static void main(String[] args) {
        String name = "Jora" ;
        int age = 35;
        char gender = 'F';
         String company = "Amazon";
         String jobtitle ="driver";
         double yearsOfExperience = 2.5;
         int salary =25000;
         boolean isFullTime = false;
         boolean isMarried = true;
         String emploeeId ="DR010203";
         String ssn ="124-58-256";
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobtitle = " + jobtitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("emploeeId = " + emploeeId);
        System.out.println("ssn = " + ssn);


    }
}
