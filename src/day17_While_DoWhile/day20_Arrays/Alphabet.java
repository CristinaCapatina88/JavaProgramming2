package day17_While_DoWhile.day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        //26 characters in separate indexes
        char [] alphabets = new char [26];//Z`A
        /*        i    ch
        alphabet[0] = z //90
        alphabet[1] = y //89
        alphabet[2] = x //88
         */
/*
         char ch='Z';
        for (int i = 0; i < alphabets.length ; i++,ch--) {
            alphabets[i]=ch;
        }
        System.out.println(Arrays.toString(alphabets));

*/

       for( char i=0,j= 'Z'; i< alphabets.length;i++,j--){
           alphabets[i]=j;
       }
        System.out.println(Arrays.toString(alphabets));
    }
}
