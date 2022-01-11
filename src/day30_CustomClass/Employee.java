package day30_CustomClass;

public class Employee {

   public String name ;
    public String jobTitle;
    public char gender;
    public int id;
    public double salary;
    public boolean isfullTime;


    public void setInfo(String name, String jobTitle, char gender, int id, int salary, boolean isfullTime){
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.id = id;
        this.salary = salary;
        this.isfullTime = isfullTime;


    }

    public void work(){
        System.out.println(name+ " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", salary=" + salary +
                ", isfullTime=" + isfullTime +
                '}';
    }
}
