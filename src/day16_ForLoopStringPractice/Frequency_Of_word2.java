package day16_ForLoopStringPractice;

public class Frequency_Of_word2 {
    public static void main(String[] args) {

        String str ="Cat cat CAt cat Dog Dog";
        int frequency =0;
        for (int i = 0; i <=str.length()-3 ; i++) {//add = and -total nr of the word
            String eachSub = str.substring(i,i+3);//add the total numbers of the word

            if(eachSub.equalsIgnoreCase("Cat")){
                frequency++;
            }


        }
        System.out.println(frequency);
    }
}
