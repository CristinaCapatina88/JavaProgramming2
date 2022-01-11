package practice12_29_2021;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
      String [] scrum1 ={"Ion","Timur","Olea"};
      String [] scrum2 ={"Vica","Vanea","Oleg","Jilili"};
        String [] scrum3 ={"Tolea","Zina"};

        String [][] scrumteams= {scrum1,scrum2,scrum3};

        System.out.println(Arrays.deepToString(scrumteams));

        System.out.println(scrumteams[1][1]);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        for(String[] eachScrum:scrumteams){
            System.out.println(Arrays.toString(eachScrum));
        }

        System.out.println("______________________________________");

        for (String[] eachscrum : scrumteams) {
            for (String eachname : eachscrum) {
                System.out.print(eachname+" ");
            }

        }


    }
}
