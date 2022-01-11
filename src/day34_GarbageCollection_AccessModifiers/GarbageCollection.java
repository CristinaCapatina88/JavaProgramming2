package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day26_CustomMethodsPractice.day31_Constructors.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println( str );

        Dog dog1 =new Dog();
        dog1.name="Lucy";

        dog1= new Dog();
        dog1.name = "Max";
        System.out.println(dog1);


        String language = "Python";
        language =   "Java";
        System.out.println(language);

        System.out.println("____________________");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2=list1;
        list2.addAll(Arrays.asList(200,300,400));


        System.out.println(list1);
        System.out.println(list2);
        System.out.println("_____________________________________________");

        Student student1 = new Student("Tahir", 30, 'M', 'B',14);
        student1.grade='A';


        Student student2 = student1;
        student2.name="Ahmed";

        System.out.println(student2);
        System.out.println(student1);

        ArrayList<String> l1= new ArrayList<>();


        l1.add("Java");
        ArrayList<String> l2=l1;


    }
}
