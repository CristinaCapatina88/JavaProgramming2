package day16_ForLoopStringPractice;

public class Frequency_Of_Word {
    public static void main(String[] args) {

       String str ="JavaJava";
       int frequency =0;
                         //or <=str.length()-4
        for (int i = 0; i <str.length()-3 ; i++) {
           String eachSubstring = str.substring(i,i+4);
           //if the index is 0 the end of the word java will be 1+4

           if(eachSubstring.equals("Java")){
               frequency++;
           }


        }

        System.out.println(frequency);
    }
}
