package day37_Inheritance.ScrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender,  int id, String companyName, double salary) {
        super(name, age, gender, "Product Owner", id, companyName, salary);
    }

    public void represent(){
        System.out.println(name + " is representing the company");
    }

}
