package practice01_12_2022.statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StatickBlock {
    public static int num;
    public static ArrayList<String> carModels;

    static {
        num=10;
        carModels=new ArrayList<>();
        carModels.addAll(Arrays.asList("Toyota","BMW","Ford","Honda"));

    }
    public StatickBlock(){
        System.out.println("no arg");
        num+=5;
    }


}
