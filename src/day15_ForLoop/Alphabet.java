package day15_ForLoop;
/*
print
A~Z
a~z
Z~A
Z~a
 */
public class Alphabet {
    public static void main(String[] args) {
     //A~Z====>65-90

       for(int i =65; i<=90; i++){//i represents 65 to 90
           System.out.print((char)i+" ");
       }
        System.out.println();

        System.out.println("_______________________________________________");

       for(char i = 'A'; i<='Z'; i++){// i represents A B C
           System.out.print(i+" ");
       }
        System.out.println();

        System.out.println("_____________________________");
       //a~z
        for(char i = 'a'; i<='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("_____________________________");
//Z~A
        for(char i = 'Z'; i>='A'; --i){// i represents A B C
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("_____________________________");

        for(char i = 'z'; i>='a'; i--){// i represents A B C
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("_____________________________");



    }
}
