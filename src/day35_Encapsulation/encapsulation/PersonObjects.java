package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

       Person person1= new Person();
     //   person1.name="Daniel"; // private
        System.out.println(person1);
        person1.setName("Daniel");// call the method
        person1.setAge(28);// call the method

     //   System.out.println(person1.name +":"+ person1.age);// becouse is private we can't call directly

        System.out.println(person1.getName()+ " : "+ person1.getAge());

    }
}
