package day14_StringMethods1;

public class emailDomain {
    public static void main(String[] args) {

        String email = "cristinacapat@yahoo.com";

        //domain:

        int beginningIndex= email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");
        String domain= email.substring(beginningIndex,endingIndex);

        System.out.println(domain);


        System.out.println("___________________________________");

        String str1 = "Java is fun, Java is cool, I love Java";
        //
        int beg = str1.indexOf(" J")+1;
        int end =str1.lastIndexOf(",");
        String s1 = str1.substring(0,10+1);// java is fun

        String s2 = str1.substring(beg,end);  //java is cool

        String s3 = str1.substring( str1.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
