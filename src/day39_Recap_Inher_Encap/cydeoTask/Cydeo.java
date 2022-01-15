package day39_Recap_Inher_Encap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
       Developer developer = new Developer("Ana",36,'F',5623,"DEV",250000);


Tester tester = new Tester("Cristina",34,'F',1588,"SDET",120000);

Teacher teacher = new Teacher("Lucia",38,'F',23,"Teacher",89000);

Student student = new Student("Luca",18,'M',568,"Economics");
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);

        developer.setAge(38);
        System.out.println(developer.getAge());

        developer.work();
        tester.work();
        teacher.work();

        developer.eat();
        developer.sleep();
        developer.drink();

    }
}
