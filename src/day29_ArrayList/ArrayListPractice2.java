package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> empliyees= new ArrayList<>();
        empliyees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aoron"));

        empliyees.retainAll(Arrays.asList("Ahmed","David"));
        System.out.println(empliyees);


        System.out.println("______________________________________________________");

        String [] names ={"Mary","rumal","Marie","ion"};

//convert array to arrayList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p-> p.charAt(0)=='M');//or p.startsWith("M")
        System.out.println(list);

        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));



    }
}
