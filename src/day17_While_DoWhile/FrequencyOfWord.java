package day17_While_DoWhile;

import java.sql.SQLOutput;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str ="Java Java Python Python";

        int frequency=0;

       while (str.contains("Java")){
           str= str.replaceFirst("Java","");
           frequency++;
       }
        System.out.println(frequency);

        System.out.println("________________________________");

        String sentence = "cat Cat cat cat ";
        sentence=sentence.toLowerCase();

        int count =0;
        while (sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat","");
            count++;
        }

        System.out.println(count);


        System.out.println("___________________________________");
        String s = "java java java phyton phyton";
        int countjava =0;
        int countPhyton=0;

        while (s.contains("java")||s.contains("phyton")){

            if(s.contains("java")){
                s=s.replaceFirst("java","");//we remove java then count
                countjava++;
            }
            if(s.contains("phyton")){
                s=s.replaceFirst("phyton","");
                countPhyton++;
            }
        }

        System.out.println("countjava = " + countjava);
        System.out.println("countPhyton = " + countPhyton);

    }
}
