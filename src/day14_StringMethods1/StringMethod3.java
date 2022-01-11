package day14_StringMethods1;

public class StringMethod3 {
    public static void main(String[] args) {

        // create a subvalue of a string

        String word ="Cydeo School";
        //            012345...
        String brand = word.substring(0,4+1);//the index number of the begining and ending index

        System.out.println(brand);

        String str1 =word.substring(6);//if we want to create a substring till the end of the string we dont have to give the end index
        System.out.println(str1);
        System.out.println("_____________________________________");

        String word2 = "Python C# Ruby";

String s1= word2.substring(0,word2.indexOf(" "));
String s2  =word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" ")) ;
String s3 =word2.substring(word2.lastIndexOf(" ")+1);//if is the last word we dont give the last index

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
