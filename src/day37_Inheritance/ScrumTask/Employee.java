package day37_Inheritance.ScrumTask;

public class Employee extends Person{

public String jobTitle;
public int id;
public String companyName;
public double salary;


    public Employee(String name, int age, char gender,String jobTitle,int id,String companyName,double salary) {
        super(name, age, gender);
        this.jobTitle=jobTitle;
        this.id=id;
        this.salary=salary;
        this.companyName=companyName;

    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Employee:
        name, gender, age, jobTitle, id, salary, companyName
        work(), toString()
 */