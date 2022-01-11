package day32_Constructor;

public class Employee {

     public String name;
     public char gender;
     public String jobTitle;
     public double salary;

     public Employee(String name){
          this.name=name;
     }

     public String toString() {
          return "Employee{" +
                  "name='" + name + '\'' +
                  ", gender=" + gender +
                  ", jobTitle='" + jobTitle + '\'' +
                  ", salary=" + salary +
                  '}';
     }

     public Employee (String name,char gender){
          this(name);//call the previous constractor to not repeate the same code
          this.gender=gender;
     }

    public Employee(String name,char gender,String jobTitle){
          this(name,gender);
          this.jobTitle=jobTitle;
    }

    public Employee(String name,char gender,String jobTitle,double salary){
          this(name,gender,jobTitle);
          this.salary=salary;
    }



}
