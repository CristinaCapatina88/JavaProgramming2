package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsOne {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();//array list object is created
       numbers.add(10);//index0
        numbers.add(20);//index1
        numbers.add(30);//index2
        numbers.add(40);//index3
        numbers.add(50);//index4

        numbers.add(2,25);//insert this element and shift the rest to the right
        numbers.add(3,45);//at index 3
        System.out.println(numbers);
        System.out.println(numbers.size());

        int lastIndex= numbers.size()-1;//return the total nr of the elements and we subs 1 to ger the last index
        System.out.println("lastIndex = " + lastIndex);

        Integer num=numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("____________________________________");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("____________________________________");

        ArrayList<String> list = new ArrayList<>();
        list .add("Java");
        list .add("Python");
        list .add("Java");
        list .add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");//replace size is not efected

        System.out.println(list);


        System.out.println("____________________________________");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Hulya");
        employees.add("Ali");

        System.out.println(employees);

        employees.remove(0);//removes the elem at index 0
        employees.remove("Hulya");//remves the objects
        //remove methos remove the first one even we have more matching elements

        System.out.println(employees);

    }
}
