package day14_StringMethods1;

public class StringMethod2 {
    public static void main(String[] args) {

        String str ="Java is fun, I love learning Java";

         String str2 =str.replace("Java","Python");

        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

        String email = "JonClaus@yahoo.com";
        email=email.replace("yahoo", "gmail");


        System.out.println("email = " + email);

 String sentence = "Java Java Python Python   C#   C# ";
 String sentence2 =sentence.replace("Python ", "").replace("  ","");

        System.out.println("sentence2 = " + sentence2);

  String s = "Dog Dog Dog Dog Dog"  ;
  String s1= s.replace("Dog","Cat");

        System.out.println("s1 = " + s1);

        String s2 = "C# is fun, C# is cool";
       s2= s2.replace(" C#", " Java");

        System.out.println("s2 = " + s2);

        System.out.println("__________________________________________");

        String result = "Java Java Java ";
        result= result.replaceFirst("Java","Python");
        System.out.println(result);

String result2 = "C# is fun, C3 is cool";
result2= result2.replaceFirst("C#", "Java");
        System.out.println(result2);




    }
}
