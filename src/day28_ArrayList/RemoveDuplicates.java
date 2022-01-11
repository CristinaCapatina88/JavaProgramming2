package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer>   list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();//{10,20,30}expected
        for (Integer each : list) {    //     OR
            if(result.contains(each)){//if(!result.contains(each))
                continue;             //result.add(each);
            }
           result.add(each);
        }
        System.out.println(result);

    }
}
