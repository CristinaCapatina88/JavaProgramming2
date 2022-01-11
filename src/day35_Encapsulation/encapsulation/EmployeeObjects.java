package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Lucia", 'L',2,85000);

        System.out.println(employee1);
        employee1.setAge(32);
        employee1.setGender('F');

        employee1.setSalary(employee1.getSalary()+15000);

        System.out.println(employee1);





    }
}
