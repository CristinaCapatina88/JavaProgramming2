package day37_Inheritance.ScrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, int id, String companyName, double salary) {
        super(name, age, gender, jobTitle, id, companyName, salary);
    }

    public void test(){
        System.out.println( jobTitle + " " + name + "is testing");
    }
    public void createTicket(){
        System.out.println(jobTitle + " " + name + "is creating ticket");
    }


}
