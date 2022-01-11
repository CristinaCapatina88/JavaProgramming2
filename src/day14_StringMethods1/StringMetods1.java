package day14_StringMethods1;

public class StringMetods1 {
    public static void main(String[] args) {

        String str1 = "   batch 25     ";
        str1 = str1.trim();//creates a new obj "batch 25"//trim cut the spaces only outside the characters

        System.out.println(str1);

        String str2 ="Cydeo School";

        int n1 =str2.indexOf("h");
        System.out.println(n1);

        int n2 =str2.indexOf("ool");//returns the first o of the maching character
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language";
        int n3 =str3.indexOf("amm");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("ge");
        System.out.println("n4 = " + n4);

        int nr = str3.lastIndexOf("g");//start from right to left prints the first g
        System.out.println("nr = " + nr);


        System.out.println("________________________");
        String s = "Java Nova Cava Wawa orange";

        int firstA= s.indexOf("a");//checks from last to right
        int lastA =s.lastIndexOf("a");//checks from right to left
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
       // int fourthA = s.indexOf("ava W");
        int fourthA = s.lastIndexOf("av");
        int fiftA = s.lastIndexOf("va")+1;//or "a W"
        int sixthA =s.lastIndexOf("aw");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);





    }
}
