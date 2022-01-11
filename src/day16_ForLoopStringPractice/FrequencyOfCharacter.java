package day16_ForLoopStringPractice;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBC";
        char ch = 'A';
        int frequency =0;


        for (int i= 0; i < str.length(); i++) {//i:index of str
          char eachChar= str.charAt(i);// eachCharacter of the str

          if(ch==eachChar){
              frequency++;// increase by 1
          }

        }

        System.out.println(frequency);


    }
}
