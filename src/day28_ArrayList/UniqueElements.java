package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Puthon");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        ArrayList<String> unique = new ArrayList<>();

        for(String each:list){
            if(list.indexOf(each)==list.lastIndexOf(each)){
                //checks first time when apear and last time when apear
                //if the first time is the same as last time it is unique
                unique.add(each);
                //than it is adiing to the unique ArrayList
            }
        }

        System.out.println(unique);


    }
}
