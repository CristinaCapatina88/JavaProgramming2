package day17_While_DoWhile;

public class RemoveDouplicates {
    public static void main(String[] args) {

        String str = "AABBCC";
        String result ="";


        for (int i = 0; i <str.length() ; i++) {
           char ch =  str.charAt(i) ;
         if(result.contains(""+ch)) {//if the result already contains the character
             // i added ""+ to switch char to string becouse contains comand accepts only
             //string
             continue;//skips
         }
         result += ch;

        }
        System.out.println(result);


    }
}
