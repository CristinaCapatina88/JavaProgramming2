package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String first_name = "Cristina";
        String last_name ="Capatina";
        int age =45;
        String jobTitle ="SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String full_name = first_name + " " + last_name;

        System.out.println(full_name);
//Full name of the person is___
        System.out.println("Full name of the person is " + full_name);
//___is__ years old

        System.out.println(full_name + " is " + age + " years old");
        //Fullname is JobTitle , works at + CompanyName, and Fullname' salary is Salary

        System.out.println(full_name + " is " + jobTitle +", works at " + companyName +", and " +full_name +"'s salary is " + salary);


    }


}
