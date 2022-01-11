package practice12_15_2021;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

   String [] color ={"Yellow","Blue","Purple"};

        System.out.println(color.length);



        String [] color2 = new String [3];
        color2[0]="Red";
        color2[1]="Blue";
        color2[2]="Purple";

        System.out.println(color2[1]);//printing one element
        System.out.println(Arrays.toString(color2));

        System.out.println("___________________________________");
        //equals
        System.out.println(Arrays.equals(color,color2));
        //sort
        Arrays.sort(color);
        System.out.println(Arrays.toString(color));



    }
}
