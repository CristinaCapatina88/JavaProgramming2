package day16_ForLoopStringPractice;
/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */
public class UniqueCharacters {
    public static void main(String[] args) {

String str = "aaabcccfct";
String result ="";

for(int i =0; i<=str.length()-1;i++){//i:index nr of the string (starting from 0)

    char ch =str.charAt(i);//each characters of str
    if(str.indexOf(ch)== str.lastIndexOf(ch)){//if the first and last index nr of the charact are same then the character is unique
        result+= ch;
    }
}

        System.out.println("result = " + result);







    }
}
