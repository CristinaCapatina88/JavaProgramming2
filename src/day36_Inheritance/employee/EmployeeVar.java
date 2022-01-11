package day36_Inheritance.employee;

public class EmployeeVar {

    public String name,jobTitle,companyName;
public char gender;
public int age;
public int id;
public int salary;

    public void setInfo(String name, String jobTitle, String companyName, char gender, int age, int id, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "EmployeeVar{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println(name+ " is working");
    }
}
/*
Employee:
        name, gender, age, jobTitle, id, salary, companyName
        setInfo(), work(), toString()


    Tester

    Developer

    Driver

    Teacher
 */