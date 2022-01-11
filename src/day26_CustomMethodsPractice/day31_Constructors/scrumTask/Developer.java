package day26_CustomMethodsPractice.day31_Constructors.scrumTask;

public class Developer {

    public String name;
    public int id;
    public String JobTitle;
    public double salary;

    public Developer(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.JobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }


}
/*
create a class called Developer
 Attributes:
 name, employeeID, JobTitle, Salary

 Add A constructor that can set all the fileds

 Actions:
 coding(), unitTesting(), fixingBug(), toString()
 */