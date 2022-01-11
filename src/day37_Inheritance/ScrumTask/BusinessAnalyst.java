package day37_Inheritance.ScrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender,  int id, String companyName, double salary) {
        super(name, age, gender, "BA", id, companyName, salary);
    }
    public void analyze(){
        System.out.println(name+ " is analyzing the documents");

    }





}
