package day15_ForLoop;

public class String_methods {
    public static void main(String[] args) {

       String str = "";
      boolean r= str.isEmpty();

        System.out.println(r);
        System.out.println("_____________________");

        String s1 = "Cydeo";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("___________");

        String sentence = "My favorite programming language is Java";
        boolean hasjava = sentence.toLowerCase().contains("java");// when we want to ignore the case sensitivity

        boolean sentence1 = sentence.contains("C#");
        System.out.println(sentence1);
        System.out.println(hasjava);

        System.out.println("____________________________");

        String input1 ="I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));


        System.out.println("_______________________");

        String a = "Wooden Spoon";
       boolean x= a.startsWith("Woo");
boolean y = a.endsWith("Spoon");
boolean z = a.toLowerCase().startsWith("wooden");
// in order to ignore the case sensitivity we first create the lowercase or upper case
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
