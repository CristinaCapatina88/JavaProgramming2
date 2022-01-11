package day37_Inheritance.ScrumTask;

public class Developer extends Employee{//Devel IS A Employee , IS A Person
    public Developer(String name, int age, char gender, String jobTitle, int id, String companyName, double salary) {
        super(name, age, gender, jobTitle, id, companyName, salary);
    }
public  void fixBugs(){
    System.out.println(name + jobTitle+ "is crying");
}



}
