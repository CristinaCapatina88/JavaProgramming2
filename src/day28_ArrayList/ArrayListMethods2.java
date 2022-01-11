package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        /*

        int num =1;
      list.remove(num);//here we pass and primitive

         */
        Integer num = 200;// Integer is non primitive
     //   list.remove(num);//pass the non primitive
        System.out.println(list.remove(num));
        System.out.println("___________________________________________");
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("___________________________________________");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');//0  becouse it returns int we can assign to an integer
        int b = characters.lastIndexOf('B');//4 last time when B apeared

        System.out.println(a);
        System.out.println(b);

        System.out.println("___________________________________________");

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r3 = " + r3);
        System.out.println("r2 = " + r2);

        System.out.println("___________________________________________");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(1000);
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);//false because two diferent objects we compare
        System.out.println(list1.equals(list2));//true becouse we compare the elements

        System.out.println("___________________________________________");
list1.clear();
boolean r4 = list1.isEmpty();//false
        System.out.println(r4);

    }
}
