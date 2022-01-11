package day19_LoopPractices;
/*
str ="aabccdeef
output :bdf
 */
public class Unique_Characters {
    public static void main(String[] args) {
       String str ="aabccdeef";
       String result= "";//bdf

        for (int j = 0; j < str.length(); j++) {

        char ch =str.charAt(j);
     int count =0;//repr the frequency of the ch

        for (int i = 0; i <str.length() ; i++) {//inner loop compares the characters the outer loop picket
            char each = str.charAt(i);//each character of the string
            if(ch==each){
                count++;
            }
        }
        if(count==1){//if the frequency is 1 , then the character is unique
            result+=ch;
        }

        }

        System.out.println(result);
    }
}
